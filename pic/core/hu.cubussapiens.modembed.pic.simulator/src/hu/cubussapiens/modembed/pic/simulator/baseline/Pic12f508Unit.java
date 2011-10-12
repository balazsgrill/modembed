/**
 * 
 */
package hu.cubussapiens.modembed.pic.simulator.baseline;

import hexfile.HexFile;
import hu.cubussapiens.modembed.pic.simulator.IDIOPin;
import hu.cubussapiens.modembed.pic.simulator.IMemory;
import hu.cubussapiens.modembed.pic.simulator.IUnit;
import hu.cubussapiens.modembed.pic.simulator.generic.PicDeviceProgramContext;
import hu.cubussapiens.modembed.pic.simulator.generic.ram.HexFileMemorySegment;
import hu.cubussapiens.modembed.pic.simulator.generic.ram.SimpleRAM;

/**
 * @author balazs.grill
 *
 */
public class Pic12f508Unit implements IUnit{

	private final PicBaselineCore core = new PicBaselineCore();
	
	private IMemory progmem = null;
	
	private PicDeviceProgramContext context;

	private PortPeripheral ioPort = null;
	
	private long pc = 0;
	
	@Override
	public void loadProgram(HexFile hexfile) {
		context = new PicDeviceProgramContext();
		progmem = new HexFileMemorySegment(hexfile, 2, 0, 512);
		core.setProgramMem(progmem);
		ioPort = new PortPeripheral();
		context.addPeripheral(ioPort);
		core.setIoPort(ioPort);
		context.addPeripheral(new SimpleRAM(0x07, 25));
	}

	@Override
	public void reset() {
		if (progmem == null) return;
		pc = 0;
	}

	@Override
	public void step() {
		if (progmem == null) return;
		pc = core.execute(pc, context);
	}

	@Override
	public long getProgramCounter() {
		return pc;
	}

	@Override
	public IDIOPin[] getIOPins() {
		if (ioPort != null){
			return ioPort.getPins();
		}
		return new IDIOPin[0];
	} 
	
}
