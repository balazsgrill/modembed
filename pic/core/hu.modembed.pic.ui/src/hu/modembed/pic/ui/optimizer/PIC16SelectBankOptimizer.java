/**
 * 
 */
package hu.modembed.pic.ui.optimizer;

import hu.e.compiler.list.AnnotationStep;
import hu.e.compiler.list.InstructionStep;
import hu.e.compiler.list.LabelStep;
import hu.e.compiler.list.ProgramStep;
import hu.e.compiler.optimizer.IFlatProgramOptimizer;
import hu.e.compiler.optimizer.IOptimizerContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author balazs.grill
 *
 */
public class PIC16SelectBankOptimizer implements IFlatProgramOptimizer {

	private final static String ANNOTATION = "pic16.bankselect.bankSelectOptimization";
	
	@Override
	public List<ProgramStep> optimize(IOptimizerContext context,
			List<ProgramStep> steps) {
		List<ProgramStep> ss = new ArrayList<ProgramStep>();
		System.out.println("Input "+steps.size()+" long");
		
		boolean checkNext = false;
		Integer currentBank = null;
		
		for(ProgramStep ps : steps){
			if (ps instanceof AnnotationStep){
				String key = ((AnnotationStep) ps).getKey();
				if (ANNOTATION.equals(key)){
					checkNext = true;
				}
			}else if (checkNext){

				if (ps instanceof InstructionStep){
					long data = context.getInstructionValue((InstructionStep)ps);
					if (data == -1){
						ss.add(ps);
					}else{
						//Bank select operation
						//<b000000001:9 f:5>
						//check if this is a SELECTB
						if ((data & 0xFE0) == 0x20){
							int bank = (int) (data & 0x1F);
							if ((currentBank == null) || (bank != currentBank)){
								ss.add(ps);
							}else{
								System.out.println(currentBank+" is already selected");
							}
							currentBank = bank;
						}else{
							ss.add(ps);
						}
					}
				}else{
					ss.add(ps);
				}

			}else{
				if (ps instanceof LabelStep){
					currentBank = null;
				}
				ss.add(ps);
			}
		}
		
		System.out.println("Output "+ss.size()+" long");
		return ss;
	}


}
