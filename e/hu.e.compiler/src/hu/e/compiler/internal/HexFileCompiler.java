/**
 * 
 */
package hu.e.compiler.internal;

import hexfile.AddressType;
import hexfile.Entry;
import hexfile.HexFile;
import hexfile.HexfileFactory;
import hu.e.compiler.ECompiler;
import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.linking.ProgramListLinker;
import hu.e.compiler.internal.model.ISymbolManager;
import hu.e.compiler.internal.model.symbols.ILiteralSymbol;
import hu.e.compiler.internal.symbols.RootSymbolManager;
import hu.e.compiler.list.ProgramList;
import hu.e.parser.eSyntax.BinarySection;
import hu.e.parser.eSyntax.ConstantBinarySection;
import hu.e.parser.eSyntax.DataTypeDef;
import hu.e.parser.eSyntax.FunctionBinarySection;
import hu.e.parser.eSyntax.FunctionMemory;
import hu.e.parser.eSyntax.LinkedBinary;
import hu.e.parser.eSyntax.ReferenceBinarySection;
import hu.e.parser.eSyntax.TypeDef;
import hu.e.parser.eSyntax.XExpression;
import hu.modembed.hexfile.persistence.HexFileResource;

import java.util.Arrays;
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
					byte[] data = new byte[0];
					for(XExpression x : c.getData()){
						ILiteralSymbol s = (ILiteralSymbol)sm.resolve(x);
						TypeDef td = s.getType();
						if (td instanceof DataTypeDef){
							int bits = ((DataTypeDef) td).getBits();
							int bytes = (bits/2) + ((bits%8==0)?0:1) ;
							int v = s.getValue();
							for (int i=0;i<bytes;i++){
								int b = v%256;
								v = v/256;
								data = Arrays.copyOf(data, data.length+1);
								data[data.length-1] = HexFileResource.intToByte(b);
							}
						}
						
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
					FunctionBinarySection functionBs = (FunctionBinarySection)bs;
					int start = ((ILiteralSymbol)sm.resolve(bs.getStart())).getValue();
					Entry entry = HexfileFactory.eINSTANCE.createEntry();
					entry.setAddress(start);
					FunctionCompiler fc = new FunctionCompiler(functionBs);
					ProgramList plist = fc.compile(sm); 
					lists.add(plist);
					
					MemoryManager memman = new MemoryManager();
					for(FunctionMemory fm : functionBs.getMems()){
						memman.addSegment(ECompiler.convertLiteral(fm.getStart()), ECompiler.convertLiteral(fm.getEnd()));
					}
					
					ProgramListLinker linker = new ProgramListLinker(plist);
					
					int startAddr = ECompiler.convertLiteral(((FunctionBinarySection) bs).getStartAddr());
					
					entry.setData(linker.link(memman, startAddr));
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
