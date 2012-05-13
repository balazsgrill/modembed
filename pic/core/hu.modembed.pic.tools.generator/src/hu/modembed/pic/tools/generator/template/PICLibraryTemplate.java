package hu.modembed.pic.tools.generator.template;

import org.w3c.dom.*;
import hu.e.compiler.*;

public class PICLibraryTemplate
{
  protected static String nl;
  public static synchronized PICLibraryTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    PICLibraryTemplate result = new PICLibraryTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "/*" + NL + " * Library for ";
  protected final String TEXT_2 = NL + " * ";
  protected final String TEXT_3 = NL + " * Architecture: ";
  protected final String TEXT_4 = NL + " */" + NL + "library microchip.";
  protected final String TEXT_5 = "{" + NL + "" + NL + "\tuse e.platform;";
  protected final String TEXT_6 = NL + "\tuse microchip.pic16.enchanced;";
  protected final String TEXT_7 = NL + "\tuse microchip.pic16;";
  protected final String TEXT_8 = NL + NL + "/*************************" + NL + " * Configuration" + NL + " ************************/" + NL + " ";
  protected final String TEXT_9 = NL + NL + "\tconst codeaddr configStartAddress = ";
  protected final String TEXT_10 = NL + "\t/*" + NL + "\t * Field: ";
  protected final String TEXT_11 = NL + "\t * ";
  protected final String TEXT_12 = NL + "\t */";
  protected final String TEXT_13 = NL + "\t\t/* ";
  protected final String TEXT_14 = " */" + NL + "\t\tconst uint8 ";
  protected final String TEXT_15 = "_";
  protected final String TEXT_16 = "_";
  protected final String TEXT_17 = " = ";
  protected final String TEXT_18 = ";";
  protected final String TEXT_19 = NL + NL + "/********************" + NL + " * Special function registers" + NL + " ********************/" + NL;
  protected final String TEXT_20 = NL + NL + "/*" + NL + " * ";
  protected final String TEXT_21 = NL + " * ";
  protected final String TEXT_22 = NL + " */" + NL + "reg ";
  protected final String TEXT_23 = " ";
  protected final String TEXT_24 = " : 0x";
  protected final String TEXT_25 = "; ";
  protected final String TEXT_26 = NL + "}";
  protected final String TEXT_27 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     org.w3c.dom.Element pic = (org.w3c.dom.Element)argument; 
     String arch = pic.getAttribute("edc:arch");
    stringBuffer.append(TEXT_1);
    stringBuffer.append(pic.getAttribute("edc:name"));
    stringBuffer.append(TEXT_2);
    stringBuffer.append(pic.getAttribute("edc:desc"));
    stringBuffer.append(TEXT_3);
    stringBuffer.append(arch);
    stringBuffer.append(TEXT_4);
    stringBuffer.append(pic.getAttribute("edc:name"));
    stringBuffer.append(TEXT_5);
    	if(arch.startsWith("16E")){ 
    stringBuffer.append(TEXT_6);
     	}else
    	if(arch.startsWith("16")){ 
    stringBuffer.append(TEXT_7);
     	}else{}
    stringBuffer.append(TEXT_8);
     
	Element program = (Element)pic.getElementsByTagName("edc:ProgramSpace").item(0);
	Element config  = (Element)pic.getElementsByTagName("edc:ConfigFuseSector").item(0);

    stringBuffer.append(TEXT_9);
    stringBuffer.append(config.getAttribute("edc:beginaddr"));
    
	NodeList DCRDefs = config.getElementsByTagName("edc:DCRDef");
	for(int i=0;i<DCRDefs.getLength();i++){
		Element DCRDef = (Element)DCRDefs.item(i);
		String cname = DCRDef.getAttribute("edc:cname");
		NodeList DCRModes = ((Element)DCRDef.getElementsByTagName("edc:DCRModeList").item(0)).getElementsByTagName("edc:DCRMode");
		for(int j=0;j<DCRModes.getLength();j++){
			Element DCRMode = (Element)DCRModes.item(j);
			NodeList DCRFieldDefs = DCRMode.getElementsByTagName("edc:DCRFieldDef");
			int field_offset = 0;
			for(int l=0;l<DCRFieldDefs.getLength();l++){
				Element DCRFieldDef = (Element)DCRFieldDefs.item(l);
				String fieldname = DCRFieldDef.getAttribute("edc:cname");
				String widthText = DCRFieldDef.getAttribute("edc:nzwidth");
				int width = 0;
				if (widthText.startsWith("0x")){
					width = Integer.parseInt(widthText.substring(2).trim(),16);
				}else{
					width = Integer.parseInt(widthText.trim());
				}

    stringBuffer.append(TEXT_10);
    stringBuffer.append(fieldname);
    stringBuffer.append(TEXT_11);
    stringBuffer.append(DCRFieldDef.getAttribute("edc:desc"));
    stringBuffer.append(TEXT_12);
    
				NodeList DCRFieldSemantics = DCRFieldDef.getElementsByTagName("edc:DCRFieldSemantic");
				for(int k=0;k<DCRFieldSemantics.getLength();k++){
					Element DCRFieldSemantic = (Element)DCRFieldSemantics.item(k);
					String value = DCRFieldSemantic.getAttribute("edc:when");
					if (value.contains("== ")){
						int q = value.lastIndexOf(' ');
						value = value.substring(q+1);
					}
					value = value + "*"+(1<<field_offset);

    stringBuffer.append(TEXT_13);
    stringBuffer.append(DCRFieldSemantic.getAttribute("edc:desc"));
    stringBuffer.append(TEXT_14);
    stringBuffer.append(cname);
    stringBuffer.append(TEXT_15);
    stringBuffer.append(fieldname);
    stringBuffer.append(TEXT_16);
    stringBuffer.append(DCRFieldSemantic.getAttribute("edc:cname"));
    stringBuffer.append(TEXT_17);
    stringBuffer.append(value);
    stringBuffer.append(TEXT_18);
    
				}
				field_offset += width;
			}
		}
	}

    stringBuffer.append(TEXT_19);
    
	Element dataspace = (Element)pic.getElementsByTagName("edc:DataSpace").item(0);
	Element regardlessOfMode = (Element)dataspace.getElementsByTagName("edc:RegardlessOfMode").item(0);
	
	NodeList SFRDataSectors = regardlessOfMode.getElementsByTagName("edc:SFRDataSector");
	for(int i=0;i<SFRDataSectors.getLength();i++){
		Element SFRDataSector = (Element)SFRDataSectors.item(i);
		String beginAddrText = SFRDataSector.getAttribute("edc:beginaddr");
		int beginAddr = ECompiler.convertLiteral(beginAddrText);
		NodeList elements = SFRDataSector.getChildNodes();
		for (int j=0;j<elements.getLength();j++) if (elements.item(j) instanceof Element){
			Element item = (Element)elements.item(j);
			String name = item.getNodeName();
			if ("edc:SFRDef".equals(name) || "edc:JoinedSFRDef".equals(name)){
				int size = ECompiler.convertLiteral(item.getAttribute("edc:nzwidth"));
				size = size/8;
				String type = (size==2) ? "uint16" :"uint8";

    stringBuffer.append(TEXT_20);
    stringBuffer.append(item.getAttribute("edc:name"));
    stringBuffer.append(TEXT_21);
    stringBuffer.append(item.getAttribute("edc:desc"));
    stringBuffer.append(TEXT_22);
    stringBuffer.append(type);
    stringBuffer.append(TEXT_23);
    stringBuffer.append(item.getAttribute("edc:cname"));
    stringBuffer.append(TEXT_24);
    stringBuffer.append(Integer.toHexString(beginAddr));
    stringBuffer.append(TEXT_25);
    
				beginAddr += size;
			}
			if ("edc:AdjustPoint".equals(name)){
				int size = ECompiler.convertLiteral(item.getAttribute("edc:offset"));
				beginAddr += size;
			}
			if ("edc:Mirror".equals(name)){
				int size = ECompiler.convertLiteral(item.getAttribute("edc:nzsize"));
				beginAddr += size;
			}
		}
	}

    stringBuffer.append(TEXT_26);
    stringBuffer.append(TEXT_27);
    return stringBuffer.toString();
  }
}
