/**
 * 
 */
package hu.modembed.disassembler;

import hu.modembed.hexfile.persistence.HexFileResource;

import org.eclipse.emf.ecore.resource.Resource.Diagnostic;

/**
 * @author balazs.grill
 *
 */
public class ByteParsingError implements Diagnostic {

	private final byte data;
	private final long address;
	
	private static String printByte(byte b){
		int d = HexFileResource.byteToInt(b);
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		for(int i=7;i>=0;i--){
			int j = 1<<i;
			if ((d & j) != 0) sb.append("1");
			else sb.append("0");
		}
		sb.append("> (0x");
		sb.append(Integer.toHexString(d));
		sb.append(")");
		return sb.toString();
	}
	
	/**
	 * 
	 */
	public ByteParsingError(byte data, long address) {
		this.data = data;
		this.address = address;
	}

	public byte getData() {
		return data;
	}
	
	public long getAddress() {
		return address;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.Resource.Diagnostic#getMessage()
	 */
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Could not parse data at 0x"+Long.toHexString(address)+": "+printByte(data);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.Resource.Diagnostic#getLocation()
	 */
	@Override
	public String getLocation() {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.Resource.Diagnostic#getLine()
	 */
	@Override
	public int getLine() {
		return 0;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.Resource.Diagnostic#getColumn()
	 */
	@Override
	public int getColumn() {
		return 0;
	}

}
