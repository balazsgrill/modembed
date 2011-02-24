/**
 * 
 */
package hu.cubussapiens.modembed.pic.device.persistence;

import hu.cubussapiens.modembed.pic.device.persistence.readers.DeviceReader;
import hu.cubussapiens.modembed.pic.device.persistence.tokens.Parser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;

import microchip.Device;
import microchip.MicrochipFactory;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

/**
 * @author balazs.grill
 *
 */
public class DeviceFileResource extends ResourceImpl {

	public DeviceFileResource(URI uri) {
		super(uri);
	}
	

	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options)
			throws IOException {
		
		InputStreamReader r = new InputStreamReader(inputStream);
		BufferedReader reader = new BufferedReader(r);
		
		Device device = MicrochipFactory.eINSTANCE.createDevice();
		
		Parser parser = new Parser(new DeviceReader(device), reader);
		parser.parse();
		
		inputStream.close();
		
		getContents().clear();
		getContents().add(device);
	}
	
}
