/**
 * 
 */
package hu.modembed.pic.tools.generator;

import hu.modembed.pic.tools.generator.template.PICLibraryTemplate;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

/**
 * @author balazs.grill
 *
 */
public class LibraryGenerator {

	public LibraryGenerator(IFile file) throws SAXException, IOException, ParserConfigurationException, CoreException {
		System.out.println("Generating for "+file);
		
		Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().
				parse(file.getContents());
		
		Node pic = doc.getElementsByTagName("edc:PIC").item(0);
		String name = pic.getAttributes().getNamedItem("edc:name").getNodeValue();
		
		PICLibraryTemplate template = new PICLibraryTemplate();
		String s = template.generate(pic);
		
		IFile target = file.getParent().getFile(new Path(name+".e"));
		InputStream content = new ByteArrayInputStream(s.getBytes());
		if (target.exists()){
			target.setContents(content, IResource.FORCE, new NullProgressMonitor());
		}else{
			target.create(content, true, new NullProgressMonitor());
		}
		
		
	}
	
}
