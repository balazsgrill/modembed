package hu.modembed.elf.internal;

import hu.modembed.elf.ElfResource;

import java.util.ArrayList;
import java.util.List;

public class Header{
	
	public final boolean is64;
	public final boolean isMSB;
	public final int version;
	
	public final short e_type;
	public final short e_machine;
	public final int e_version;
	public final int e_entry;
	public final int e_phoff;
	public final int e_shoff;
	public final int e_flags;
	public final short e_ehsize;
	public final short e_phentsize;
	public final short e_phnum;
	public final short e_shentsize;
	public final short e_shnum;
	public final short e_shstrndx;
	
	public final byte[] data;
	public final List<SectionEntry> sections;
	
	public Header(byte[] data, int index) throws Exception {
		this.data = data;
		byte eclass = data[4];
		switch(eclass){
		case 1:
			is64 = false;
			break;
		case 2:
			is64 = true;
			break;
		default:
			throw new Exception("Invalid ELF Class: "+eclass);
		}
		
		byte encoding = data[5];
		switch(encoding){
		case 1:
			isMSB = false;
			break;
		case 2:
			isMSB = true;
			break;
		default:
			throw new Exception("Invalid encoding: "+encoding);
		}
		
		version = ElfResource.byteToInt(data[6]);
		if (version != 1){
			throw new Exception("Unsupported ELF version: "+version);
		}
		
		e_type = ElfResource.extractHalf(data, index, isMSB);
		index += 2;
		
		e_machine = ElfResource.extractHalf(data, index, isMSB);
		index += 2;
		
		e_version = ElfResource.extractWord(data, index, isMSB);
		index += 4;
		
		e_entry = ElfResource.extractWord(data, index, isMSB);
		index += 4;
		
		e_phoff = ElfResource.extractWord(data, index, isMSB);
		index += 4;
		
		e_shoff = ElfResource.extractWord(data, index, isMSB);
		index += 4;
		
		e_flags = ElfResource.extractWord(data, index, isMSB);
		index += 4;
		
		e_ehsize = ElfResource.extractHalf(data, index, isMSB);
		index += 2;
		
		e_phentsize = ElfResource.extractHalf(data, index, isMSB);
		index += 2;
		
		e_phnum = ElfResource.extractHalf(data, index, isMSB);
		index += 2;
		
		e_shentsize = ElfResource.extractHalf(data, index, isMSB);
		index += 2;
		
		e_shnum = ElfResource.extractHalf(data, index, isMSB);
		index += 2;
		
		e_shstrndx = ElfResource.extractHalf(data, index, isMSB);
		index += 2;
		
		sections = new ArrayList<>(e_shnum);
	}
	
	public String extractString(int stringTable, int index){
		SectionEntry sectionEntry = sections.get(stringTable);
		if (sectionEntry.sh_type == SectionEntry.SHT_STRTAB){
			int i = sectionEntry.sh_offset + index;
			String str = "";
			while(data[i] != 0){
				int ascii = ElfResource.byteToInt(data[i]);
				char[] chars = Character.toChars(ascii);
				str += String.valueOf(chars);
				i++;
			}
			return str;
		}else{
			return null;
		}
	}
}