/**
 * 
 */
package hu.modembed.utils.disassembler.detectors;

import hu.modembed.hexfile.persistence.HexFileResource;
import hu.modembed.model.modembed.core.instructionset.Instruction;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author balazs.grill
 *
 */
public abstract class DisassemblerDecisionTree {
	
	public static DisassemblerDecisionTree create(List<InstructionPattern> instructions, int maxbits){
		if (instructions.isEmpty()) return new NullLeaf();
		if (instructions.size() == 1){
			return new Leaf(instructions.get(0));
		}
		try{
			return new BitDesicisionNode(instructions, maxbits);
		}catch(RuntimeException e){
			System.err.println(e.getMessage());
			System.err.println("Falling back to linear search.");
			return new LinearDecisionNode(instructions);
		}
	}
	
	private static final class LinearDecisionNode extends DisassemblerDecisionTree{

		private final List<InstructionPattern> patterns;
		
		public LinearDecisionNode(List<InstructionPattern> patterns) {
			this.patterns = new ArrayList<InstructionPattern>(patterns);
		}
		
		@Override
		protected Instruction getNextInstruction(byte[] data, int index) {
			for(InstructionPattern pattern : patterns){
				if (pattern.check(data, index)) return pattern.instruction;
			}
			return null;
		}
		
	}
	
	private static final class BitDesicisionNode extends DisassemblerDecisionTree{

		private final int offset;
		private final int mask;
		
		private final DisassemblerDecisionTree trueBranch;
		private final DisassemblerDecisionTree falseBranch;
		
		public BitDesicisionNode(List<InstructionPattern> patterns, int maxbits) {
			List<InstructionPattern> bestTrueList = null;
			List<InstructionPattern> bestFalseList = null;
			int bestScore = Integer.MAX_VALUE;
			int bestcheckbit = -1;

			for(int i=maxbits-1;i>=0;i--) if (bestScore > 0)/* Cut if found possible best */{
				boolean good = true;
				List<InstructionPattern> trueList = new LinkedList<InstructionPattern>();
				List<InstructionPattern> falseList = new LinkedList<InstructionPattern>();

				for(InstructionPattern p : patterns) if (good){
					Boolean b = p.getDecisionBit(i);
					if (b == null){
						good = false;
					}else{
						(b ? trueList : falseList).add(p);
					}
				}
				
				if (good){
					int score = Math.abs(trueList.size()-falseList.size());
					if (score < bestScore){
						bestTrueList = trueList;
						bestFalseList = falseList;
						bestScore = score;
						bestcheckbit = i;
					}
				}
			}
			
			if (bestTrueList == null || bestFalseList == null || bestTrueList.isEmpty() || bestFalseList.isEmpty()){
				StringBuilder sb = new StringBuilder();
				for(InstructionPattern p : patterns){
					sb.append(p.toString());sb.append("\n");
				}
				throw new RuntimeException("Could not distinguish the following instructions:\n"+sb.toString());
			}
			
			trueBranch = create(bestTrueList, maxbits);
			falseBranch = create(bestFalseList, maxbits);
			this.offset = bestcheckbit/8;
			this.mask = 1<<(bestcheckbit%8);
		}
		
		@Override
		protected Instruction getNextInstruction(byte[] data, int index) {
			if (data.length > index+offset){
				int bytevalue = HexFileResource.byteToInt(data[index+offset]);
				if ((bytevalue & mask) != 0){
					return trueBranch.getNextInstruction(data, index);
				}else{
					return falseBranch.getNextInstruction(data, index);
				}
			}
			return null;
		}
		
	}
	
	private static final class Leaf extends DisassemblerDecisionTree{
		
		private final Instruction instruction;
		
		public Leaf(InstructionPattern pattern) {
			this.instruction = pattern.instruction;
		}

		@Override
		protected Instruction getNextInstruction(byte[] data, int index) {
			return instruction;
		}
		
	}
	
	private static final class NullLeaf extends DisassemblerDecisionTree{

		@Override
		protected Instruction getNextInstruction(byte[] data, int index) {
			return null;
		}
		
	}
	
	protected abstract Instruction getNextInstruction(byte[] data, int index);
	
}
