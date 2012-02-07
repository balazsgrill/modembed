/**
 * 
 */
package hu.e.compiler.internal;

import hexfile.AddressType;
import hexfile.Entry;
import hexfile.HexFile;
import hexfile.HexfileFactory;
import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.model.ISymbolManager;
import hu.e.compiler.internal.model.symbols.ILiteralSymbol;
import hu.e.compiler.internal.symbols.RootSymbolManager;
import hu.e.compiler.list.ProgramList;
import hu.e.parser.eSyntax.BinarySection;
import hu.e.parser.eSyntax.ConstantBinarySection;
import hu.e.parser.eSyntax.FunctionBinarySection;
import hu.e.parser.eSyntax.LinkedBinary;
import hu.e.parser.eSyntax.ReferenceBinarySection;
import hu.e.parser.eSyntax.XExpression;
import hu.modembed.hexfile.persistence.HexFileResource;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * @author balazs.grill
 *
 */
public class HexFileCompiler {

	private final LinkedBinary lb;
	
	public HexFileCompiler(LinkedBinary lb) {
		this.lb = lb;
	}
	
	private final Set<ProgramList> lists = new HashSet<ProgramList>();
	
	public Set<ProgramList> getLists() {
		return lists;
	}
	
	public HexFile create(){
		ISymbolManager sm = new RootSymbolManager();
		
		HexFile result = HexfileFactory.eINSTANCE.createHexFile();
		result.setAddressType(AddressType.EXTENDED_LINEAR);
		for(BinarySection bs : lb.getSections()){
			if (bs instanceof ConstantBinarySection){
				try{
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
				}catch(ECompilerException e){
					//TODO: handle this exception
					e.printStackTrace();
				}
			}
			if (bs instanceof FunctionBinarySection){
				try{
					int start = ((ILiteralSymbol)sm.resolve(bs.getStart())).getValue();
					Entry entry = HexfileFactory.eINSTANCE.createEntry();
					entry.setAddress(start);
					FunctionCompiler fc = new FunctionCompiler((FunctionBinarySection)bs);
					lists.add(fc.compile(sm));
					
					entry.setData(new byte[0]);
					result.getEntries().add(entry);
					
				}catch(ECompilerException e){
					//this.steps.put((FunctionBinarySection)bs, Collections.singletonList(CompilationErrorEntry.create(e)));
				}
			}
			if (bs instanceof ReferenceBinarySection){
				try{
					int start = ((ILiteralSymbol)sm.resolve(bs.getStart())).getValue();
					LinkedBinary included = ((ReferenceBinarySection) bs).getInc();
					HexFileCompiler includedcompiler = new HexFileCompiler(included);
					HexFile includedhexfile = includedcompiler.create();
					for(Entry e: includedhexfile.getEntries()){
						Entry entry = EcoreUtil.copy(e);
						entry.setAddress(entry.getAddress()+start);
						result.getEntries().add(entry);
					}
					//this.steps.putAll(includedcompiler.steps);
				}catch(ECompilerException e){
					//TODO: handle this exception
					e.printStackTrace();
				}
			}
		}
		return result;
	}
	
}
