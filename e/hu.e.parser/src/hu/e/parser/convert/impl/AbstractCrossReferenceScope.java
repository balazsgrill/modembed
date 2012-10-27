package hu.e.parser.convert.impl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import hu.e.parser.convert.ICrossReferenceScope;

public abstract class AbstractCrossReferenceScope implements ICrossReferenceScope {

	protected final List<CrossReferenceEntry> entries = new ArrayList<CrossReferenceEntry>();
	
	@Override
	public void addCrossReference(EObject referer, EReference reference,
			String id) {
		this.entries.add(new CrossReferenceEntry(referer, reference, id));
	}

	protected abstract List<EObject> resolve(String id);
	
	@Override
	public void resolveReferences() {
		List<CrossReferenceEntry> failedEntries = new LinkedList<CrossReferenceEntry>();
		for(CrossReferenceEntry entry : entries){
			List<EObject> rs = filter(resolve(entry.id), entry.reference.getEReferenceType());
			if (rs.isEmpty()){
				//throw new RuntimeException("Cannot resolve "+entry.id);
				failedEntries.add(entry);
			}else{
				//if (rs.size() > 1) throw new RuntimeException(entry.id+" is ambivalent!");
				entry.referer.eSet(entry.reference, rs.get(0));
			}
		}
		entries.clear();
		entries.addAll(failedEntries);
	}
	
	private List<EObject> filter(List<EObject> ls, EClass ec){
		List<EObject> result = new ArrayList<EObject>(ls.size());
		for(EObject eo : ls){
			if (ec.isInstance(eo)) result.add(eo);
		}
		return result;
	}
	
}
