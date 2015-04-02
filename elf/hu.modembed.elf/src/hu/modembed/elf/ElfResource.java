/**
 * 
 */
package hu.modembed.elf;

import hu.modembed.elf.internal.Header;
import hu.modembed.elf.internal.SectionEntry;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

import elf.ELF;
import elf.ElfFactory;

/**
 * @author balazs.grill
 *
 */
public class ElfResource extends ResourceImpl {
	
	public ElfResource() {
		super();
	}
	
	public ElfResource(URI uri) {
		super(uri);
	}
	
	/**
	 * Size of identifiaction bytes 
	 */
	private static final int EI_NIDENT = 16;
	
	public static int byteToInt(byte b){
		if (b < 0)
			return 256+b;
		else
			return (int)b;
	}
	
	public static byte intToByte(int b){
		int n = b & 0xFF;
		if (n < 128) 
			return (byte)n;
		else
			return (byte)(n - 256);
	}
	
	public static int extractWord(byte[] data, int index, boolean isMSB){
		int result = 0;
		for(int i=0;i<4;i++){
			int j = index + (!isMSB ? i : 3-i);
			result += byteToInt(data[j]) << (8*i);
		}
		return result;
	}
	
	public static short extractHalf(byte[] data, int index, boolean isMSB){
		if (!isMSB){
			return (short)( byteToInt(data[index]) + (byteToInt(data[index+1]) << 8) );
		}else{
			return (short)( byteToInt(data[index+1]) + (byteToInt(data[index]) << 8) );
		}
	}
	
	protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException{
		byte[] data = new byte[inputStream.available()];
		try{
			inputStream.read(data);
		}finally{
			inputStream.close();
		}
		
		
		
		try {
			getContents().clear();
			getContents().add(parse(data));
		} catch (Exception e) {
			/**
			 * TODO add diagnostics instead
			 */
			throw new RuntimeException(e);
		}
	}

	/**
	 * 
	 * Parse the binary representation of the ELF file.
	 * 
	 * TODO specific exceptions
	 * 
	 * @param data
	 * @throws Exception
	 */
	private ELF parse(byte[] data) throws Exception{
		/* Check magic bytes */
		if (!(data[0] == 0x7f && data[1] == 'E' && data[2] == 'L' && data[3] == 'F')) throw new Exception("Invalid Magic bytes. This is not an ELF file");
		
		Header header = new Header(data, EI_NIDENT);
		
		ELF elf = ElfFactory.eINSTANCE.createELF();
		
		/*
		 * Parse sections
		 */
		for(int i=0;i<header.e_shnum;i++){
			int sectionStart = header.e_shoff+(i*header.e_shentsize);
			
			SectionEntry sectionEntry = new SectionEntry(header, data, sectionStart);
			header.sections.add(sectionEntry);
		}
		
		for(SectionEntry se : header.sections){
			System.out.println(se.sh_type +": " + se.getName() +"("+se.sh_size+")");
		}
		
		return elf;
	}
	
	
}
