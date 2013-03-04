/**
 * 
 */
package hu.modembed.test;

import org.eclipse.core.runtime.IStatus;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;

/**
 * @author balazs.grill
 *
 */
public class StatusMatcher extends BaseMatcher<IStatus> {

	public static final StatusMatcher instance = new StatusMatcher();
	
	/* (non-Javadoc)
	 * @see org.hamcrest.Matcher#matches(java.lang.Object)
	 */
	@Override
	public boolean matches(Object item) {
		if (item instanceof IStatus){
			return ((IStatus) item).isOK();
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see org.hamcrest.SelfDescribing#describeTo(org.hamcrest.Description)
	 */
	@Override
	public void describeTo(Description description) {
	

	}

}
