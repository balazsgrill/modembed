/**
 * 
 */
package hu.e.compiler.internal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.util.EcoreUtil;

import hexfile.AddressType;
import hexfile.Entry;
import hexfile.HexFile;
import hexfile.HexfileFactory;
import hu.cubussapiens.modembed.hexfile.persistence.HexFileResource;
import hu.e.compiler.internal.model.IProgramStep;
import hu.e.compiler.internal.model.ISymbolManager;
import hu.e.compiler.internal.model.symbols.ILiteralSymbol;
import hu.e.compiler.internal.symbols.RootSymbolManager;
import hu.e.parser.eSyntax.BinarySection;
import hu.e.parser.eSyntax.ConstantBinarySection;
import hu.e.parser.eSyntax.FunctionBinarySection;
import hu.e.parser.eSyntax.LinkedBinary;
import hu.e.parser.eSyntax.ReferenceBinarySection;
import hu.e.parser.eSyntax.XExpression;

/**
 * @author balazs.grill
 *
 */
public class HexFileCompiler {

	private final LinkedBinary lb;
	
	public HexFileCompiler(LinkedBinary lb) {
		this.lb = lb;
	}

	private final Map<FunctionBinarySection, List<IProgramStep>> steps = new HashMap<FunctionBinarySection, List<IProgramStep>>();
	
	public Map<FunctionBinarySection, List<IProgramStep>> getSteps() {
		return steps;
	}
	
	public HexFile create(){
		ISymbolManager sm = new RootSymbolManager();
		
		HexFile result = HexfileFactory.eINSTANCE.createHexFile();
		result.setAddressType(AddressType.EXTENDED_LINEAR);
		for(BinarySection bs : lb.getSections()){
			
			if (bs instanceof ConstantBinarySection){
				int start = ((ILiteralSymbol)sm.resolve(bs.getStart())).getValue();
				Entry entry = HexfileFactory.eINSTANCE.createEntry();
				entry.setAddress(start);
				ConstantBinarySection c = (ConstantBinarySection)bs;
				byte[] data = new byte[c.getData().size()];
				int i = 0;
				for(XExpression x : c.getData()){
					ILiteralSymbol s = (ILiteralSymbol)sm.resolve(x);
					data[i] = HexFileResource.intToByte(s.getValue());
					i++;
				}
				entry.setData(data);
				result.getEntries().add(entry);
			}
			if (bs instanceof FunctionBinarySection){
				int start = ((ILiteralSymbol)sm.resolve(bs.getStart())).getValue();
				Entry entry = HexfileFactory.eINSTANCE.createEntry();
				entry.setAddress(start);
				FunctionCompiler fc = new FunctionCompiler((FunctionBinarySection)bs);
				entry.setData(fc.compile(sm));
				result.getEntries().add(entry);
				this.steps.put((FunctionBinarySection)bs, fc.getSteps());
			}
			if (bs instanceof ReferenceBinarySection){
				int start = ((ILiteralSymbol)sm.resolve(bs.getStart())).getValue();
				LinkedBinary included = ((ReferenceBinarySection) bs).getInc();
				HexFileCompiler includedcompiler = new HexFileCompiler(included);
				HexFile includedhexfile = includedcompiler.create();
				for(Entry e: includedhexfile.getEntries()){
					Entry entry = EcoreUtil.copy(e);
					entry.setAddress(entry.getAddress()+start);
					result.getEntries().add(entry);
				}
				this.steps.putAll(includedcompiler.steps);
			}
			
		}
		return result;
	}
	
}