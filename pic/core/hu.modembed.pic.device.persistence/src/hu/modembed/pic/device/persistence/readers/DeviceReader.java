/**
 * 
 */
package hu.modembed.pic.device.persistence.readers;

import hu.modembed.pic.device.persistence.readers.basic.EClassReader;
import hu.modembed.pic.device.persistence.readers.basic.FieldReader;
import hu.modembed.pic.device.persistence.readers.basic.FloatReader;
import hu.modembed.pic.device.persistence.readers.basic.IntReader;
import hu.modembed.pic.device.persistence.readers.config.CfgBitsReader;
import hu.modembed.pic.device.persistence.readers.config.ChecksumReader;
import hu.modembed.pic.device.persistence.readers.config.FieldElementReader;
import hu.modembed.pic.device.persistence.readers.config.IllegalReader;
import hu.modembed.pic.device.persistence.readers.config.SettingReader;
import hu.modembed.pic.device.persistence.tokens.Parser;

import java.util.List;

import microchip.Device;
import microchip.device.DeviceFactory;
import microchip.device.Vdd;
import microchip.device.Vpp;
import microchip.device.config.CfgBits;
import microchip.device.config.Checksum;
import microchip.device.config.ConfigFactory;
import microchip.device.config.Field;
import microchip.device.config.Illegal;
import microchip.device.config.Setting;
import microchip.device.memory.Bit;
import microchip.device.memory.Breakpoints;
import microchip.device.memory.DevID;
import microchip.device.memory.Latches;
import microchip.device.memory.MemRegion;
import microchip.device.memory.MemoryFactory;
import microchip.device.memory.MirrorRegs;
import microchip.device.memory.Programming;
import microchip.device.memory.Reset;
import microchip.device.memory.SFR;
import microchip.device.memory.Stimulus;
import microchip.device.memory.UnusedRegs;
import microchip.device.memory.Wait;


/**
 * @author balazs.grill
 *
 */
public class DeviceReader extends AbstractModelReader<Device> {

	public DeviceReader(Device model) {
		super(model);
	}

	private static <T> T getLast(List<T> list){
		if (!list.isEmpty()){
			return list.get(list.size()-1);
		}
		return null;
	}
	
	private boolean lastisnmmr = false;
	
	/* (non-Javadoc)
	 * @see hu.gb.embedded.pic.device.persistence.tokens.ITokenHandler#handleToken(java.lang.String, hu.gb.embedded.pic.device.persistence.tokens.Parser)
	 */
	@Override
	public void handleToken(String token, Parser parser) {
		if ("format".equalsIgnoreCase(token)){
			parser.push(new FieldReader(new FloatReader() {			
				@Override
				protected void handleFloat(float value) {
					model.setFormat(Float.toString(value));	
				}
			}));
			return;
		}

		if ("NumBanks".equalsIgnoreCase(token)){
			parser.push(new FieldReader(new IntReader() {			
				@Override
				protected void handleInt(int value) {
					model.setNumBanks(value);	
				}
			}));
			return;
		}
		
		if ("UnusedBankMask".equalsIgnoreCase(token)){
			parser.push(new FieldReader(new IntReader() {			
				@Override
				protected void handleInt(int value) {
					model.setUnusedBankMask(value);	
				}
			}));
			return;
		}
		
		if ("AccessBankSplitOffset".equalsIgnoreCase(token)){
			parser.push(new FieldReader(new IntReader() {			
				@Override
				protected void handleInt(int value) {
					model.setAccessBankSplitOffset(value);	
				}
			}));
			return;
		}
		
		if ("HasNMMR".equalsIgnoreCase(token)){
			parser.push(new FieldReader(new IntReader() {			
				@Override
				protected void handleInt(int value) {
					
				}
			}));
			return;
		}
		
		if ("NumHWBP".equalsIgnoreCase(token)){
			parser.push(new FieldReader(new IntReader() {			
				@Override
				protected void handleInt(int value) {
					model.setNumHWBP(value);	
				}
			}));
			return;
		}
		
		if ("format".equalsIgnoreCase(token)){
			parser.push(new FieldReader(new FloatReader() {			
				@Override
				protected void handleFloat(float value) {
					model.setFormat(Float.toString(value));	
				}
			}));
			return;
		}
		
		if ("vdd".equalsIgnoreCase(token)){
			Vdd vdd = DeviceFactory.eINSTANCE.createVdd();
			model.setVdd(vdd);
			parser.push(new VddReader(vdd));
			return;
		}
		
		if ("vpp".equalsIgnoreCase(token)){
			Vpp vpp = DeviceFactory.eINSTANCE.createVpp();
			model.setVpp(vpp);
			parser.push(new VppReader(vpp));
			return;
		}
		
		if ("cfgbits".equalsIgnoreCase(token)){
			CfgBits bits = ConfigFactory.eINSTANCE.createCfgBits();
			model.getCfgbits().add(bits);
			parser.push(new CfgBitsReader(bits));
			return;
		}
		
		if ("illegal".equalsIgnoreCase(token)){
			Illegal illegal = ConfigFactory.eINSTANCE.createIllegal();
			getLast(model.getCfgbits()).getIllegals().add(illegal);
			parser.push(new IllegalReader(illegal));
			return;
		}
		
		if ("field".equalsIgnoreCase(token)){
			Field field = ConfigFactory.eINSTANCE.createField();
			getLast(model.getCfgbits()).getFields().add(field);
			parser.push(new FieldElementReader(field));
			return;
		}
		
		if ("setting".equalsIgnoreCase(token)){
			Setting setting = ConfigFactory.eINSTANCE.createSetting();
			getLast(getLast(model.getCfgbits()).getFields()).getSettings().add(setting);
			parser.push(new SettingReader(setting));
			return;
		}
		
		if ("checksum".equalsIgnoreCase(token)){
			Checksum checksum = ConfigFactory.eINSTANCE.createChecksum();
			getLast(getLast(getLast(model.getCfgbits()).getFields()).getSettings()).setChecksum(checksum);
			parser.push(new ChecksumReader(checksum));
			return;
		}
		
		if ("pgming".equalsIgnoreCase(token)){
			Programming pg = MemoryFactory.eINSTANCE.createProgramming();
			model.setPgming(pg);
			parser.push(new EClassReader(pg));
			return;
		}
		
		if ("wait".equalsIgnoreCase(token)){
			Wait wait = MemoryFactory.eINSTANCE.createWait();
			model.getPgming().setWait(wait);
			parser.push(new EClassReader(wait));
			return;
		}
		
		if ("latches".equalsIgnoreCase(token)){
			Latches l = MemoryFactory.eINSTANCE.createLatches();
			model.getPgming().setLatches(l);
			parser.push(new EClassReader(l));
			return;
		}
		
		if ("pgmmem".equalsIgnoreCase(token)){
			MemRegion mr = MemoryFactory.eINSTANCE.createMemRegion();
			model.setPgmmem(mr);
			parser.push(new MemRegionReader(mr));
			return;
		}
		
		if ("userid".equalsIgnoreCase(token)){
			MemRegion mr = MemoryFactory.eINSTANCE.createMemRegion();
			model.setUserid(mr);
			parser.push(new MemRegionReader(mr));
			return;
		}
		
		if ("testmem".equalsIgnoreCase(token)){
			MemRegion mr = MemoryFactory.eINSTANCE.createMemRegion();
			model.setTestmem(mr);
			parser.push(new MemRegionReader(mr));
			return;
		}
		
		if ("devid".equalsIgnoreCase(token)){
			DevID mr = MemoryFactory.eINSTANCE.createDevID();
			model.setDevid(mr);
			parser.push(new DevIdRegionReader(mr));
			return;
		}
		
		if ("cfgmem".equalsIgnoreCase(token)){
			MemRegion mr = MemoryFactory.eINSTANCE.createMemRegion();
			model.setCfgmem(mr);
			parser.push(new MemRegionReader(mr));
			return;
		}
		
		if ("eedata".equalsIgnoreCase(token)){
			MemRegion mr = MemoryFactory.eINSTANCE.createMemRegion();
			model.setEedata(mr);
			parser.push(new MemRegionReader(mr));
			return;
		}
		
		if ("bkbgvectmem".equalsIgnoreCase(token)){
			MemRegion mr = MemoryFactory.eINSTANCE.createMemRegion();
			model.setBkbgvectmem(mr);
			parser.push(new MemRegionReader(mr));
			return;
		}
		
		if ("sfr".equalsIgnoreCase(token)){
			SFR sfr = MemoryFactory.eINSTANCE.createSFR();
			model.getSfrs().add(sfr);
			lastisnmmr = false;
			parser.push(new EClassReader(sfr));
			return;
		}
		
		if ("nmmr".equalsIgnoreCase(token)){
			SFR sfr = MemoryFactory.eINSTANCE.createSFR();
			model.getNmmrs().add(sfr);
			lastisnmmr = true;
			parser.push(new EClassReader(sfr));
			return;
		}
		
		if ("reset".equalsIgnoreCase(token)){
			Reset r = MemoryFactory.eINSTANCE.createReset();
			getLast(model.getSfrs()).setReset(r);
			parser.push(new EClassReader(r));
			return;
		}
		
		if ("bit".equalsIgnoreCase(token)){
			Bit b = MemoryFactory.eINSTANCE.createBit();
			if (lastisnmmr){
				getLast(model.getNmmrs()).getBits().add(b);
			}else{
				getLast(model.getSfrs()).getBits().add(b);
			}
			parser.push(new EClassReader(b));
			return;
		}
		
		if ("qbit".equalsIgnoreCase(token)){
			Bit b = MemoryFactory.eINSTANCE.createQBit();
			if (lastisnmmr){
				getLast(model.getNmmrs()).getBits().add(b);
			}else{
				getLast(model.getSfrs()).getBits().add(b);
			}
			parser.push(new EClassReader(b));
			return;
		}
		
		if ("stimulus".equalsIgnoreCase(token)){
			Stimulus s = MemoryFactory.eINSTANCE.createStimulus();
			getLast(model.getSfrs()).setStimulus(s);
			parser.push(new EClassReader(s));
			return;
		}
		
		if ("MirrorRegs".equalsIgnoreCase(token)){
			MirrorRegs mr = MemoryFactory.eINSTANCE.createMirrorRegs();
			model.getMirrors().add(mr);
			parser.push(new MirroredRegsReader(mr));
			return;
		}
		
		if ("UnusedRegs".equalsIgnoreCase(token)){
			UnusedRegs ur = MemoryFactory.eINSTANCE.createUnusedRegs();
			model.getUnused().add(ur);
			parser.push(new UnusedRegsReader(ur));
			return;
		}
		
		if ("breakpoints".equalsIgnoreCase(token)){
			Breakpoints bp = MemoryFactory.eINSTANCE.createBreakpoints();
			model.setBreakpoints(bp);
			parser.push(new EClassReader(bp));
			return;
		}
		
		/*
		 * Throw back unknown token
		 */
		parser.throwBack(token);
	}

}
