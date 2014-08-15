/**
 * 
 */
package hu.modembed.application.codegen;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import application.ApplicationInterface;
import application.ApplicationInterfaceType;
import application.ApplicationModuleImplementation;
import application.Argument;
import application.BufferInterfaceType;
import application.CallableInterfaceType;
import application.CodeBasedImplementation;
import application.CompositeInterfaceType;
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
			
			save(dir, "src/"+module.getName()+".c.gen", impl);
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
			return fn.substring(0, i-1);
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
	
	private static String signature(List<? extends ApplicationInterface> appIf){
		ApplicationInterface leaf = appIf.get(appIf.size()-1);
		ApplicationInterfaceType type = leaf.getType();
		
		StringBuilder APIName = new StringBuilder();
		boolean first = true;
		for(ApplicationInterface ai : appIf){
			if (first) {
				first = false;
			}else{
				APIName.append("_");
			}
			APIName.append(ai.getName());
		}
		
		if (type instanceof CallableInterfaceType){
			StringBuilder sb = new StringBuilder();
			sb.append("void ");
			sb.append(APIName.toString());
			sb.append("(");
			first = true;
			for(Argument arg : ((CallableInterfaceType) type).getArguments()){
				if (first){
					first = false;
				}else{
					sb.append(", ");
				}
				sb.append(arg.getType().getName());
				if (arg.isOutput()){
					sb.append("*");
				}
				sb.append(" ");
				sb.append(arg.getName());
			}
			sb.append(")");
			return sb.toString();
		}
		
		if (type instanceof BufferInterfaceType){
			return ((BufferInterfaceType) type).getType().getName()+" "+APIName.toString();
		}
		
		return APIName.toString();
	}
	
	private void generate_interface(List<? extends ApplicationInterface> appIf, boolean isImplemented, StringBuilder impl, StringBuilder header){
		
		ApplicationInterface leaf = appIf.get(appIf.size()-1);
		ApplicationInterfaceType type = leaf.getType();
		
		
		if (isImplemented){
			if (type instanceof CallableInterfaceType){
				header.append("\nextern ");
				header.append(signature(appIf));
				header.append(";\n");

				impl.append("\n");
				impl.append(signature(appIf));
				impl.append("{\n");
				/* TODO add mapping implementation */
				impl.append("}\n");
			}
			if (type instanceof BufferInterfaceType){
				header.append("\nextern ");
				header.append(signature(appIf));
				header.append(";\n");

				impl.append("\n");impl.append(signature(appIf));impl.append(";\n");
			}
		}else{
			impl.append("/*\n");
			impl.append(" *");impl.append(signature(appIf));
			impl.append("\n */\n");
		}
		if (type instanceof CompositeInterfaceType){
			for(ApplicationInterface eif : ((CompositeInterfaceType) type).getExpects()){
				List<ApplicationInterface> list = new ArrayList<ApplicationInterface>(appIf.size()+1);
				list.addAll(appIf);
				list.add(eif);
				generate_interface(list, !isImplemented, impl, header);
			}
			for(ApplicationInterface iif : ((CompositeInterfaceType) type).getExpects()){
				List<ApplicationInterface> list = new ArrayList<ApplicationInterface>(appIf.size()+1);
				list.addAll(appIf);
				list.add(iif);
				generate_interface(list, isImplemented, impl, header);
			}
		}
		
	}
	
	private void generate(ApplicationModuleImplementation module, StringBuilder impl, StringBuilder header, StringBuilder make){
		String name = module.getName();
		impl.append("#include <");impl.append(name);impl.append(".h>\n");
		
		String NAME = name.toUpperCase();
		header.append("#ifndef ");header.append(NAME);header.append("\n");
		header.append("#define ");header.append(NAME);header.append("\n");
		
		compile_rule(make, name+"/src/"+name+".c", name+"/include/");
		
		generate_interface(Collections.singletonList(module), true, impl, header);
		
		if (module instanceof CodeBasedImplementation){
			 for(SourceFile sf : ((CodeBasedImplementation) module).getAdditionalSources()){
				 List<String> ipaths = sf.getIncludePaths();
				 compile_rule(make, sf.getPath(), ipaths.toArray(new String[ipaths.size()]));
			 }
		}
		
		header.append("#endif /*");header.append(NAME);header.append("/*\n");
	}
	
	

}
