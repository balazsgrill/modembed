package hu.modembed.elf.internal;

import hu.modembed.elf.ElfResource;

public class SectionEntry {

	public static final int SHT_NULL = 0;
	public static final int SHT_PROGBITS = 1;
	public static final int SHT_SYMTAB = 2;
	public static final int SHT_STRTAB = 3;
	public static final int SHT_RELA = 4;
	public static final int SHT_HASH = 5;
	public static final int SHT_DYNAMIC = 6;
	public static final int SHT_NOTE = 7;
	public static final int SHT_NOBITS = 8;
	public static final int SHT_REL = 9;
	public static final int SHT_SHLIB = 10;
	public static final int SHT_DYNSYM = 11;
	public static final int SHT_LOPROC = 0x70000000;
	public static final int SHT_HIPROC = 0x7fffffff;
	public static final int SHT_LOUSER = 0x80000000;
	public static final int SHT_HIUSER = 0xffffffff;
	
	public final Header header;
	public final int sh_name;
	public final int sh_type;
	public final int sh_flags;
	public final int sh_addr;
	public final int sh_offset;
	public final int sh_size;
	public final int sh_link;
	public final int sh_info;
	public final int sh_addralign;
	public final int sh_entsize;
	
	public SectionEntry(Header header, byte[] data, int start) {
		this.header = header;
		int index = start;
		
		sh_name = ElfResource.extractWord(data, index, header.isMSB);
		index += 4;
		
		sh_type = ElfResource.extractWord(data, index, header.isMSB);
		index += 4;
		
		sh_flags = ElfResource.extractWord(data, index, header.isMSB);
		index += 4;
		
		sh_addr = ElfResource.extractWord(data, index, header.isMSB);
		index += 4;
		
		sh_offset = ElfResource.extractWord(data, index, header.isMSB);
		index += 4;
		
		sh_size = ElfResource.extractWord(data, index, header.isMSB);
		index += 4;
		
		sh_link = ElfResource.extractWord(data, index, header.isMSB);
		index += 4;
		
		sh_info = ElfResource.extractWord(data, index, header.isMSB);
		index += 4;
		
		sh_addralign = ElfResource.extractWord(data, index, header.isMSB);
		index += 4;
		
		sh_entsize = ElfResource.extractWord(data, index, header.isMSB);
		index += 4;
	}
	
	public String getName(){
		return header.extractString(header.e_shstrndx, sh_name);
	}
	
}
