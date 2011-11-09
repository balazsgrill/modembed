/**
 * 
 */
package hu.modembed.pic.simulator.generic;

import hu.modembed.pic.simulator.IMemory;
import hu.modembed.pic.simulator.IPeripheral;
import hu.modembed.pic.simulator.IProgramContext;
import hu.modembed.pic.simulator.generic.ram.MappedRAM;

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
