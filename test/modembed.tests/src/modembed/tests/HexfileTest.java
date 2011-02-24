package modembed.tests;

import hexfile.AddressType;
import hexfile.Entry;
import hexfile.HexFile;
import hexfile.HexfileFactory;
import hu.cubussapiens.modembed.hexfile.persistence.HexFileResource;
import hu.cubussapiens.modembed.pic.device.tranformation.DeviceTranformationPlugin;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import junit.framework.Assert;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Ignore;
import org.junit.Test;

public class HexfileTest {

	private void printE(EObject eobject, int d){
		StringBuffer bf = new StringBuffer();
		for(int i=0;i<d;i++)
			bf.append("\t");
		bf.append(eobject.toString());
		
		System.out.println(bf.toString());
		for(EObject e : eobject.eContents()){
			printE(e,d+1);
		}
	}
	
	@Test
	public void readInstructionSet() throws Exception{
		IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject("test");
		if (!p.exists()){
			p.create(new NullProgressMonitor());
		}
		p.close(new NullProgressMonitor());
		p.open(new NullProgressMonitor());
		p.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		
		IFile f = p.getFile("pic18.instructionset");
		Assert.assertTrue(f.exists());
		
		URI furi = URI.createPlatformResourceURI(f.getFullPath().toString(), true);
		
		ResourceSet rs = new ResourceSetImpl();
		
		Resource res = rs.createResource(furi);
		res.load(null);
		
		for(EObject o : res.getContents()){
			printE(o,0);
		}
	}
	
	@Test
	@Ignore
	public void transformAll()throws Throwable{
		IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject("test");
		if (!p.exists()){
			p.create(new NullProgressMonitor());
		}
		p.close(new NullProgressMonitor());
		p.open(new NullProgressMonitor());
		p.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		
		IFile pluginxml = p.getFile("plugin.xml");
		StringBuffer sb = new StringBuffer();
		
		sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
				"<?eclipse version=\"3.4\"?>\n" +
				"<plugin>\n" +
				"\t<extension point=\"hu.gb.embedded.pic.definitions\">\n");
		IFolder dev;
		IFolder pic;
		Map<String, String> d;
		Map<String, String> folders = new HashMap<String, String>();
		
		folders.put("dev_p10", "pic10");
		folders.put("dev_p12", "pic12");
		folders.put("dev_p16", "pic16");
		folders.put("dev_p18", "pic18");
		
		for(String key : folders.keySet()){
			dev = p.getFolder(key);
			pic = p.getFolder(folders.get(key));
		
			d = DeviceTranformationPlugin.getDefault().transformAllDevices(dev, pic);
		
			for(String k : d.keySet()){
				sb.append("\t\t<cputype model=\"");
				sb.append(pic.getName());
				sb.append("/");sb.append(k);sb.append("\" typename=\"");
				sb.append(d.get(k));sb.append("\"></cputype>\n");
			}
		}
		
		sb.append("\t</extension>\n");
		sb.append("</plugin>");
		
		if (pluginxml.exists()){
			pluginxml.setContents(new ByteArrayInputStream(sb.toString().getBytes()), 0, new NullProgressMonitor());
		}else{
			pluginxml.create(new ByteArrayInputStream(sb.toString().getBytes()), true, new NullProgressMonitor());
		}
	}
	
	@Test
	@Ignore
	public void testDevFile() throws Throwable{
		IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject("test");
		if (!p.exists()){
			p.create(new NullProgressMonitor());
		}
		p.close(new NullProgressMonitor());
		p.open(new NullProgressMonitor());
		p.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		
		IFile f = p.getFile("PIC16F690.dev");
		Assert.assertTrue(f.exists());
		
		URI furi = URI.createPlatformResourceURI(f.getFullPath().toString(), true);
		
		ResourceSet rs = new ResourceSetImpl();
		
		Resource res = rs.createResource(furi);
		res.load(null);
		
		for(EObject o : res.getContents()){
			printE(o,0);
		}
		
		IFile tfile = p.getFile("PIC16F690.pic");
		URI turi = URI.createPlatformResourceURI(tfile.getFullPath().toString(), true);
		
		IStatus s = DeviceTranformationPlugin.getDefault().transformDeviceDescription(furi, turi);
		System.out.println("Result: "+s.toString());
		if (s.getException() != null)
			throw s.getException();
		Assert.assertTrue(s.isOK());
	}
	
	@Test
	@Ignore
	public void createHexFile() throws CoreException, IOException{
		IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject("test");
		if (!p.exists()){
			p.create(new NullProgressMonitor());
		}
		p.open(new NullProgressMonitor());
		
		IFile f = p.getFile("test.hex");
		if (f.exists()){
			f.delete(true, new NullProgressMonitor());
		}
		
		URI furi = URI.createPlatformResourceURI(f.getFullPath().toString(), true);
		
		ResourceSet rs = new ResourceSetImpl();
		
		Resource res = rs.createResource(furi);
		
		HexFile hf = HexfileFactory.eINSTANCE.createHexFile();
		hf.setAddressType(AddressType.SINGLE);
		
		Entry entry = HexfileFactory.eINSTANCE.createEntry();
		entry.setAddress(0x0034);
		entry.setBlocksize(16);
		
		byte[] data = new byte[256];
		for(int i = 0;i<data.length;i++){
			data[i] = HexFileResource.intToByte(i);
		}
		
		entry.setData(data);
		
		hf.getEntries().add(entry);
		res.getContents().add(hf);
		
		res.save(null);
		
		Assert.assertTrue(f.exists());
		
		ResourceSet rs2 = new ResourceSetImpl();
		Resource res2 = rs2.createResource(furi);
		
		res2.load(null);
		
		Assert.assertTrue(res2.getErrors().isEmpty());
		
		EList<EObject> contents = res2.getContents();
		
		Assert.assertTrue(contents.size() == 1);
		EObject o = contents.get(0);
		Assert.assertTrue(o instanceof HexFile);
		
		HexFile hf2 = (HexFile)o;
		
		Assert.assertTrue(hf.getEntries().size() == 1);
		
		Entry e2 = hf2.getEntries().get(0);
		
		boolean eqs =  (data.length == e2.getData().length);
		
		System.out.println(data.length +" == "+e2.getData().length);
		
		if (eqs){
			for(int i = 0;i<data.length;i++) if (eqs){
				if (data[i] != e2.getData()[i]){
					System.out.println("Fails at "+i);
					eqs = false;
				}
			}
		}
		
		Assert.assertTrue(eqs);
		
	}
	
}
