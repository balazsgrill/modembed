/**
 * 
 */
package hu.e.compiler.internal.linking;

import hu.e.parser.eSyntax.Library;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author balazs.grill
 *
 */
public class CodePlatform {

	private final ComponentLinker linker;
	private final Collection<Library> usedlibs;
	
	public CodePlatform(ComponentLinker linker, Collection<Library> usedlibs) {
		this.linker = linker;
		this.usedlibs = usedlibs;
	}
	
	private OperationFinder opfinder = null;
	
	public OperationFinder getOperationFinder(){
		if (opfinder == null){
			List<Library> libs = new ArrayList<Library>(usedlibs.size());
			for(Library l : usedlibs){
				Library u = linker.getLibToUse(l);
				if (u == null){
					//throw new ECompilerException(l, "This library is used but not included for linking: "+l.getName());
					u = l;
				}
				if (!libs.contains(u)){
					libs.add(u);
				}
			}
			opfinder = new OperationFinder(libs);
		}
		return opfinder;
	}
	
}
