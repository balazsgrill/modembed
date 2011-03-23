package hu.cubussapiens.modembed.modularasm.compiler.internal.namespaces;

import hu.cubussapiens.modembed.modularasm.compiler.CompilerException;
import hu.cubussapiens.modembed.modularasm.compiler.internal.MethodDescriptor;
import hu.cubussapiens.modembed.modularasm.compiler.internal.symbols.ISymbol;

import java.util.List;

public abstract class Namespace {

	public abstract Namespace getSubnamespace(String s);
	
	public Namespace resolveNamespace(List<String> qid) throws CompilerException{
		Namespace ns = this;
		for(String s : qid){
			ns = getSubnamespace(s);
			if (ns == null)
				throw new CompilerException("Could not resolve namespace: "+toString(qid));
		}
		return ns;
	}
	
	public abstract ISymbol getSymbol(String name) throws CompilerException;
	
	public abstract MethodDescriptor getMethod(String name) throws CompilerException;
	
	public ISymbol resolveSymbol(List<String> qid) throws CompilerException{
		Namespace ns = null;
		if (qid.size() == 1){
			ns = this;
		}else{
			ns = resolveNamespace(qid.subList(0, qid.size()-1));
		}
		
		String last = qid.get(qid.size()-1);
		return ns.getSymbol(last);
	}
	
	public MethodDescriptor resolveMethod(List<String> qid) throws CompilerException{
		Namespace ns = null;
		if (qid.size() == 1){
			ns = this;
		}else{
			ns = resolveNamespace(qid.subList(0, qid.size()-1));
		}
		
		String last = qid.get(qid.size()-1);
		return ns.getMethod(last);
	}
	
	private String toString(List<String> qid){
		StringBuffer sb = new StringBuffer();
		boolean first = true;
		for(String s : qid){
			if (first){
				first = false;
			}else{
				sb.append(".");
			}
			sb.append(s);
		}
		return sb.toString();
	}
	
}
