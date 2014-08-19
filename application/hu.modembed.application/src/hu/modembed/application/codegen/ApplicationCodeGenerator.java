/**
 * 
 */
package hu.modembed.application.codegen;

import hu.modembed.application.codegen.impl.ImplementationEmitterProvider;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;

import application.ApplicationModule;
import application.ApplicationModuleImplementation;
import application.CodeBasedImplementation;
import application.CompositeModuleImplementation;
import application.InterfaceImplementationMapping;
import application.SourceFile;

/**
 * @author balazs.grill
 *
 */
public class ApplicationCodeGenerator {

	private final File outputDirectory;
	private final Set<ApplicationModuleImplementation> generated = new HashSet<ApplicationModuleImplementation>();
	
	/**
	 * 
	 */
	public ApplicationCodeGenerator(File outputDirectory) {
		this.outputDirectory = outputDirectory;
	}
	
	public void generate(ApplicationModuleImplementation module){
		if(!generated.contains(module)){
			generated.add(module);
			
			File dir = new File(outputDirectory, module.getName());
			dir.mkdirs();
			
			StringBuilder impl = new StringBuilder();
			StringBuilder header = new StringBuilder();
			StringBuilder make = new StringBuilder();
			
			generate(module, impl, header, make);
			
			String ext = "";
			if (module instanceof CodeBasedImplementation){
				ext = ".gen";
			}
			save(dir, "src/"+module.getName()+".c"+ext, impl);
			save(dir, "include/"+module.getName()+".h", header);
			save(dir, "Makefile", make);
		}
	}
	
	private static void save(File dir, String file, StringBuilder buffer){
		File d = dir;
		String[] segments = file.split("/");
		for(int i=0;i<segments.length-1;i++){
			String s = segments[i];
			if (!s.isEmpty()){
				d = new File(d, s);
			}
		}
		d.mkdirs();
		File result = new File(d, segments[segments.length-1]);
		
		try(OutputStream out = new FileOutputStream(result)){
			out.write(buffer.toString().getBytes(StandardCharsets.UTF_8));
			out.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static String last_segment(String path){
		int i = path.lastIndexOf('/');
		if (i > 0){
			return path.substring(i+1);
		}
		return path;
	}
	
	private static String remove_ext(String fn){
		int i = fn.lastIndexOf('.');
		if (i > 0){
			return fn.substring(0, i);
		}
		return fn;
	}
	
	private void compile_rule(StringBuilder make, String srcname, String...includes){
		String name = remove_ext(last_segment(srcname));
		String OBJ = "$(OUTPUT_DIR)/"+name+".$(OBJ_EXT)";
		make.append(OBJ);make.append(" : "); make.append(srcname);make.append("\n");
		make.append("\t$(CC) $(CC_OPTS) -o ");make.append(OBJ);
		make.append(" ");
		
		for(String inc : includes){
			make.append("-I");make.append(inc);
			make.append(" ");
		}
		
		make.append(srcname);
	}
	
	private void generate(ApplicationModuleImplementation module, StringBuilder impl, StringBuilder header, StringBuilder make){
		InterfaceMappingsManager imman = new InterfaceMappingsManager();
		
		if (module instanceof CompositeModuleImplementation){
			for(InterfaceImplementationMapping mapping : ((CompositeModuleImplementation) module).getMappings()){
				imman.addMapping(mapping);
			}
		}
		
		String name = module.getName();
		impl.append("#include <");impl.append(name);impl.append(".h>\n");
		
		if (module instanceof CompositeModuleImplementation){
			for(ApplicationModule sm : ((CompositeModuleImplementation) module).getSubModules()){
				impl.append("#include <");impl.append(sm.getImplementation().getName());impl.append(".h>\n");
			}
		}
		
		String NAME = name.toUpperCase();
		header.append("#ifndef ");header.append(NAME);header.append("\n");
		header.append("#define ");header.append(NAME);header.append("\n");
		header.append("#include <mtypes.h>\n");
		
		compile_rule(make, name+"/src/"+name+".c", name+"/include/");
		
		List<InterfaceInstance> atomicInterfaces = new LinkedList<InterfaceInstance>();
		InterfaceInstance moduleInterface = new InterfaceInstance(Collections.singletonList(module));
		
		Queue<InterfaceInstance> queue = new LinkedList<InterfaceInstance>();
		queue.add(moduleInterface);
		while(!queue.isEmpty()){
			InterfaceInstance current = queue.poll();
			if (current.isAtomic()){
				atomicInterfaces.add(current);
			}else{
				queue.addAll(current.children());
			}
		}
		
		if (module instanceof CodeBasedImplementation){
			 for(SourceFile sf : ((CodeBasedImplementation) module).getAdditionalSources()){
				 List<String> ipaths = sf.getIncludePaths();
				 compile_rule(make, sf.getPath(), ipaths.toArray(new String[ipaths.size()]));
			 }
		}
		
		for(InterfaceInstance ii : atomicInterfaces){
			InterfaceImplementationEmitter<?> emitter = ImplementationEmitterProvider.getEmitter(ii.type());
			
			if (emitter != null){
				header.append("\n/*");
				header.append("\n * ");header.append(ii.isImplemented() ? "Implemented" : "Expected");header.append(" interface: ");header.append(ii);
				header.append("\n */\n");
				emitter.emitDeclaration(ii, header);
				if (ii.isImplemented()){
					emitter.emitImplementation(ii, header, impl, imman.getDelegation(ii));
				}
			}
	
		}
		
		if (module instanceof CompositeModuleImplementation){
			for(Entry<InterfaceInstance, List<InterfaceInstance>> entry : imman.getMappings().entrySet()){
				InterfaceInstance key = entry.getKey();
				
				InterfaceImplementationEmitter<?> emitter = ImplementationEmitterProvider.getEmitter(key.type());
				if(emitter != null){
					emitter.emitImplementation(key, header, impl, entry.getValue());
				}
	
			}
		}
		
		header.append("#endif /*");header.append(NAME);header.append("/*\n");
	}

}
