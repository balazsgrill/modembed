/**
 * 
 */
package hu.modembed.pic.simulator.generic;



/**
 * @author balazs.grill
 *
 */
public abstract class AbstractOperation implements IOperation {

	protected final String mask;
	
	/**
	 * 
	 */
	public AbstractOperation(String mask) {
		this.mask = mask;
	}

	protected long extract(long op, char c){
		long v = 0;
		long b = 1; 
		long j = 1;
		for(int i=mask.length()-1;i>=0;i--){
			if (c == mask.charAt(i)){
				if ((op&b) != 0) v += j;
				j = j*2;
			}
			b = b*2;
		}
		return v;
	}
	
	/* (non-Javadoc)
	 * @see hu.modembed.pic.simulator.generic.IOperation#check(long)
	 */
	@Override
	public boolean check(long op) {
		long b = 1;
		for(int i=mask.length()-1;i>=0;i--){
			if ('1' == mask.charAt(i)){
				if ((op&b) == 0) return false;
			}else
			if ('0' == mask.charAt(i)){
				if ((op&b) != 0) return false;
			}
			b = b*2;
		}
		return true;
	}

}
