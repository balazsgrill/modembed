/**
 * 
 */
package hu.modembed.hexfile.persistence;

import hexfile.AddressType;
import hexfile.Entry;
import hexfile.HexFile;
import hexfile.HexfileFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

/**
 * @author balazs.grill
 *
 */
public class HexFileResource extends ResourceImpl {
	
	public static String byteToHex(int v){
		int l = v % 16;
		int h = (v / 16)%16;
		return Integer.toHexString(h)+Integer.toHexString(l);
	}
	
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
	
	public static int readFirstDataFromLine(String line){
		String v = line.substring(0, 2);
		return Integer.parseInt(v, 16);
	}
	
	/**
	 * 
	 */
	public HexFileResource() {
	}

	/**
	 * @param uri
	 */
	public HexFileResource(URI uri) {
		super(uri);
	}

	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options)
			throws IOException {
		
		BufferedReader r = new BufferedReader(new InputStreamReader(inputStream));
		String line = null;
		int linenum = 0;
		
		HexFile hf = HexfileFactory.eINSTANCE.createHexFile();
		hf.setAddressType(AddressType.SINGLE);
		this.getContents().clear();
		this.getContents().add(hf);
		
		Entry entry = null;
		int lastAddr = -1;
		int baseaddr = 0;
		
		while(null != (line = r.readLine())){
			line = line.trim();
			linenum++;
			int column = 1;
			
			if (line.startsWith(":")){
				try{
					line = line.substring(1);
					int length = readFirstDataFromLine(line);
					line = line.substring(2);
					int addrh = readFirstDataFromLine(line);
					line = line.substring(2);
					int addrl = readFirstDataFromLine(line);
					line = line.substring(2);
					int type = readFirstDataFromLine(line);
					line = line.substring(2);
				
					switch(type){
					case 0: //data
						byte[] data = new byte[length];
						for(int i = 0;i<length;i++){
							int d = readFirstDataFromLine(line);
							line = line.substring(2);
							data[i] = intToByte(d);
						}
						
						/*
						 * TODO FIXME read and check checksum 
						 */
						//int checksum = readFirstDataFromLine(line);
						
						int address = baseaddr + addrh*256 + addrl;
						if (entry == null || (lastAddr != address)){
							entry = HexfileFactory.eINSTANCE.createEntry();
							entry.setAddress(address);
							entry.setBlocksize(length);
							entry.setData(data);
							hf.getEntries().add(entry);
							lastAddr = address+length;
						}else{
							entry.setBlocksize(Math.max(entry.getBlocksize(), length));
							byte[] olddata = entry.getData();
							byte[] newdata = new byte[olddata.length+length];
							
							System.arraycopy(olddata, 0, newdata, 0, olddata.length);
							System.arraycopy(data, 0, newdata, olddata.length, length);
							entry.setData(newdata);
							lastAddr = address+length;
						}
						
					break;
					case 1: //end
						break;
					case 4: // upper 16 bit of address
					{
						hf.setAddressType(AddressType.EXTENDED_LINEAR);
						int highaddr = readFirstDataFromLine(line);
						line = line.substring(2);
						int lowaddr = readFirstDataFromLine(line);
						line = line.substring(2);
						baseaddr = (highaddr*256 + lowaddr)<<16;
					}
						break;
					default:
						getErrors().add(new InvalidFieldTypeDiagnostic(linenum, type));
						break;
					}
					
					
					
				}
				catch(NumberFormatException e){
					getErrors().add(new InvalidDataDiagnostic(linenum, column));
				}
				catch(IndexOutOfBoundsException e){
					getErrors().add(new InvalidNumberOfDataDiagnostic(linenum, column));
				}
				
			}else{
				if (!"".equals(line)){
					getErrors().add(new InvalidLineDiagnostic(linenum));
				}
			}
			
		}
	}
	
	@Override
	protected void doSave(OutputStream outputStream, Map<?, ?> options)
			throws IOException {
		
		StringBuffer out = new StringBuffer();
		
		for(EObject eo : getContents()){
			
			if (eo instanceof HexFile){
				HexFile f = (HexFile)eo;
				
				int address = 0;
				
				
				for(Entry entry : f.getEntries()){					
					int crc = 0;

					/*
					 * Address resolution
					 */
					switch(f.getAddressType()){
					
					case EXTENDED_SEGMENT:
						
						break;
					case EXTENDED_LINEAR:
						/*
						 * Upper 16 bits of address
						 */
						int upperaddress = (entry.getAddress()&0xFFFF0000) >> 16;
						address = entry.getAddress();
						out.append(":02000004");
						out.append(byteToHex(upperaddress/256));
						out.append(byteToHex(upperaddress%256));
						crc = 255 - ((2+4+ (upperaddress/256) + upperaddress%256)%256) + 1;
						crc = crc%256;
						out.append(byteToHex(crc));
						out.append(System.getProperty("line.separator"));
						break;
						
					case SINGLE:
						address = entry.getAddress();
						break;
					}
					
					/*
					 * print out data 
					 */
					byte[] data = entry.getData();
					int i = 0;
					int counter = 0;
					int num = Math.min(255, entry.getBlocksize());
					while(i<data.length){
						if (counter == 0){
							out.append(":");
							counter = Math.min(num, data.length-i);
							out.append(byteToHex(counter));
							out.append(byteToHex((address&0xFFFF)/256));
							out.append(byteToHex((address&0xFFFF)%256));
							out.append("00");
							crc = (counter + (address/256) + (address%256))%256;
							address += counter;
						}
						
						out.append(byteToHex(byteToInt(data[i])));
						crc = (crc + byteToInt(data[i]))%256;
						i++;
						counter--;
						
						if (counter == 0){
							crc = 255 - crc+1;
							out.append(byteToHex(crc));
							out.append(System.getProperty("line.separator"));
						}
					}
					
				}
			}
			
		}
		out.append(":00000001FF"+System.getProperty("line.separator"));
		
		PrintWriter w = new PrintWriter(outputStream);
		w.print(out.toString().toUpperCase());
		w.close();
		
	}
	
}
