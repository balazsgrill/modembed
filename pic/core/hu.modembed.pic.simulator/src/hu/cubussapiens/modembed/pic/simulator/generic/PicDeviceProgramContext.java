/**
 * 
 */
package hu.cubussapiens.modembed.pic.simulator.generic;

import hu.cubussapiens.modembed.pic.simulator.IMemory;
import hu.cubussapiens.modembed.pic.simulator.IPeripheral;
import hu.cubussapiens.modembed.pic.simulator.IProgramContext;
import hu.cubussapiens.modembed.pic.simulator.baseline.IRegisters;
import hu.cubussapiens.modembed.pic.simulator.generic.ram.MappedRAM;

/**
 * @author balazs.grill
 *
 */
public class PicDeviceProgramContext implements IProgramContext, IRegisters{

	private final MappedRAM ram = new MappedRAM();
	
	private long w = 0;
	
	@Override
	public IMemory getRAM() {
		return ram;
	}

	@Override
	public long getRegisterValue(int reg) {
		switch (reg) {
		case W:
			return w;
		}
		return 0;
	}

	@Override
	public void setRegisterValue(int reg, long v) {
		switch (reg) {
		case W:
			w = v;
			break;
		}
	}

	public void addPeripheral(IPeripheral peripheral){
		peripheral.register(this);
	}

	@Override
	public void mapMemorySegment(IMemory segment, int addr, int size) {
		ram.addSegment(segment, addr, size);
	}
	
}
