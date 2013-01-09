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
  protected final String TEXT_5 = ";" + NL + "" + NL + "\tuse e.platform;" + NL + "" + NL + "/********************" + NL + " * Special function registers" + NL + " ********************/" + NL;
  protected final String TEXT_6 = NL + NL + "/*" + NL + " * ";
  protected final String TEXT_7 = NL + " * ";
  protected final String TEXT_8 = NL + " */" + NL + "reg ";
  protected final String TEXT_9 = " ";
  protected final String TEXT_10 = " : 0x";
  protected final String TEXT_11 = "; ";
  protected final String TEXT_12 = NL;
  protected final String TEXT_13 = NL;

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

    stringBuffer.append(TEXT_6);
    stringBuffer.append(item.getAttribute("edc:name"));
    stringBuffer.append(TEXT_7);
    stringBuffer.append(item.getAttribute("edc:desc"));
    stringBuffer.append(TEXT_8);
    stringBuffer.append(type);
    stringBuffer.append(TEXT_9);
    stringBuffer.append(item.getAttribute("edc:cname"));
    stringBuffer.append(TEXT_10);
    stringBuffer.append(Integer.toHexString(beginAddr));
    stringBuffer.append(TEXT_11);
    
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

    stringBuffer.append(TEXT_12);
    stringBuffer.append(TEXT_13);
    return stringBuffer.toString();
  }
}
