/**
 * 
 */
package hu.e.compiler.internal;

import hu.e.compiler.internal.model.ISymbolManager;
import hu.e.compiler.internal.model.symbols.ILiteralSymbol;
import hu.e.parser.eSyntax.ArrayTypeDef;
import hu.e.parser.eSyntax.DataTypeDef;
import hu.e.parser.eSyntax.StructTypeDef;
import hu.e.parser.eSyntax.StructTypeDefMember;
import hu.e.parser.eSyntax.Type;
import hu.e.parser.eSyntax.TypeDef;

import java.util.ArrayList;
import java.util.List;

/**
 * @author balazs.grill
 *
 */
public class MemoryManager{

	private final int memwidth;
	
	private final List<MemorySegment> segments = new ArrayList<MemorySegment>();
	
	public MemoryManager(int memwidth) {
		this.memwidth = memwidth;
	}
	
	public void addSegment(int start, int end){
		segments.add(new MemorySegment(start, end));
	}
	
	public int allocate(int varsize){
		for(MemorySegment ms : segments){
			int addr = ms.allocate(varsize);
			if (addr != -1) return addr;
		}
		return -1;
	}
	
	public void release(int addr){
		for(MemorySegment ms : segments){
			if (addr >= ms.getStart() && addr < ms.getStart()+ms.getSize()){
				ms.release(addr);
			}
		}
	}
	
	public int getSize(ISymbolManager sm, Type type){
		if (type == null) return 0;
		TypeDef td = type.getDef();
		if (td instanceof DataTypeDef){
			boolean full = ((((DataTypeDef) td).getBits()%memwidth) == 0);
			return (((DataTypeDef) td).getBits()/memwidth) + (full?0:1);
		}
		if (td instanceof ArrayTypeDef){
			Type baseType = ((ArrayTypeDef) td).getType();
			int baseSize = getSize(sm, baseType);
			ILiteralSymbol length = (ILiteralSymbol)sm.resolve(((ArrayTypeDef)td).getLength());
			return baseSize*length.getValue();
		}
		if (td instanceof StructTypeDef){
			int size = 0;
			for(StructTypeDefMember m : ((StructTypeDef) td).getMembers()){
				size+=getSize(sm,m.getType());
			}
			return size;
		}
		return 0;
	}
	
}
