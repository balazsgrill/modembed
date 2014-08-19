package hu.modembed.application.codegen;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import application.ApplicationInterface;
import application.ApplicationInterfaceType;
import application.ApplicationPackage;
import application.CompositeInterfacePart;
import application.CompositeInterfaceType;
import application.InterfaceOfModule;

public class InterfaceInstance{
		public final List<ApplicationInterface> interfaces;
		
		public InterfaceInstance(List<? extends ApplicationInterface> interfaces) {
			this.interfaces = new ArrayList<ApplicationInterface>(interfaces);
		}
		
		public InterfaceInstance(InterfaceOfModule iref){
			this.interfaces = InterfaceMappingsManager.toList(iref);
		}
		
		private InterfaceInstance(InterfaceInstance parent, CompositeInterfacePart child){
			interfaces = new ArrayList<ApplicationInterface>(parent.interfaces.size()+1);
			interfaces.addAll(parent.interfaces);
			interfaces.add(child);
		}
		
		public boolean isImplemented(){
			boolean result = true;
			
			for(ApplicationInterface i : interfaces){
				if (i instanceof CompositeInterfacePart){
					if (ApplicationPackage.eINSTANCE.getCompositeInterfaceType_Expects().equals(i.eContainmentFeature())){
						result = !result;
					}
				}
			}
			
			return result;
		}
		
		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			boolean first = true;
			for(ApplicationInterface i : interfaces){
				if (first){
					first = false;
				}else{
					sb.append("/");
				}
				sb.append(i.getName());
			}
			return sb.toString();
		}
		
		/**
		 * Check if this interface is the same or a generalization of the given interface instance
		 * @param pattern
		 * @return
		 */
		public boolean matches(List<? extends ApplicationInterface> pattern){
			if (pattern.size() < interfaces.size()) return false;
			for(int i=0;i<interfaces.size();i++){
				if (!interfaces.get(i).equals(pattern.get(i))) return false;
			}
			
			return true;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (obj instanceof InterfaceInstance){
				InterfaceInstance other = (InterfaceInstance)obj;
				if (other.interfaces.size() != interfaces.size()) return false;
				for(int i=0;i<interfaces.size();i++){
					if (!interfaces.get(i).equals(other.interfaces.get(i))) return false;
				}
				return true;
			}
			return false;
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(interfaces.toArray());
		}
		
		public ApplicationInterface leaf(){
			return interfaces.get(interfaces.size()-1);
		}
		
		public ApplicationInterfaceType type(){
			return leaf().getType();
		}
		
		public boolean isAtomic(){
			return !(type() instanceof CompositeInterfaceType);
		}
		
		public List<InterfaceInstance> children(){
			List<InterfaceInstance> result = new LinkedList<InterfaceInstance>();
			
			ApplicationInterfaceType type = type();
			if (type instanceof CompositeInterfaceType){
				for(CompositeInterfacePart e : ((CompositeInterfaceType) type).getExpects()){
					result.add(new InterfaceInstance(this, e));
				}
				for(CompositeInterfacePart e : ((CompositeInterfaceType) type).getImplements()){
					result.add(new InterfaceInstance(this, e));
				}
			}
			
			return result;
		}
	}