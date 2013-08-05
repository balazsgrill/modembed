/**
 * 
 */
package hu.modembed.ui.databinding.impl;

import org.eclipse.core.databinding.observable.list.AbstractObservableList;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

/**
 * @author balazs.grill
 *
 */
public class ResourceSetResourcesList extends AbstractObservableList {

	private final ResourceSetListener listener = new ResourceSetListener(){

		@Override
		public NotificationFilter getFilter() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Command transactionAboutToCommit(ResourceSetChangeEvent event)
				throws RollbackException {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void resourceSetChanged(ResourceSetChangeEvent event) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean isAggregatePrecommitListener() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isPrecommitOnly() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isPostcommitOnly() {
			// TODO Auto-generated method stub
			return false;
		}
		
	};
	
	public ResourceSetResourcesList(TransactionalEditingDomain editingDomain) {
		editingDomain.addResourceSetListener(listener);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.databinding.observable.list.IObservableList#getElementType()
	 */
	@Override
	public Object getElementType() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.databinding.observable.list.AbstractObservableList#doGetSize()
	 */
	@Override
	protected int doGetSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.util.AbstractList#get(int)
	 */
	@Override
	public Object get(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
