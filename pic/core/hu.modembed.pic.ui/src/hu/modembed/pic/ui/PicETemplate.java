package hu.modembed.pic.ui;

import java.util.*;
import microchip.*;
import microchip.device.*;
import microchip.device.config.*;
import microchip.device.memory.*;

public class PicETemplate
{
  protected static String nl;
  public static synchronized PicETemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    PicETemplate result = new PicETemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "namespace microchip.";
  protected final String TEXT_2 = ";" + NL + "" + NL + "import e.types;" + NL + "" + NL + "/*" + NL + " * Special function registers" + NL + " */";
  protected final String TEXT_3 = NL + "reg uint8 ";
  protected final String TEXT_4 = " : 0x";
  protected final String TEXT_5 = ";";
  protected final String TEXT_6 = NL + NL + "/*" + NL + " * Configuration " + NL + " */" + NL + "const uint32 CONFIG_ADDRESS = 0x";
  protected final String TEXT_7 = ";" + NL + " ";
  protected final String TEXT_8 = NL;
  protected final String TEXT_9 = NL + "\t/*" + NL + "\t * <b>";
  protected final String TEXT_10 = "</b> " + NL + "\t * ";
  protected final String TEXT_11 = " " + NL + "\t * ";
  protected final String TEXT_12 = " " + NL + "\t */" + NL + "\tconst uint8 ";
  protected final String TEXT_13 = "_";
  protected final String TEXT_14 = "_";
  protected final String TEXT_15 = " = 0x";
  protected final String TEXT_16 = ";";
  protected final String TEXT_17 = NL + NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     Device device = (Device)argument; 
    stringBuffer.append(TEXT_1);
    stringBuffer.append(device.getName());
    stringBuffer.append(TEXT_2);
    for(SFR sfr : device.getSfrs()){
    stringBuffer.append(TEXT_3);
    stringBuffer.append(sfr.getKey());
    stringBuffer.append(TEXT_4);
    stringBuffer.append(Integer.toHexString(sfr.getAddr()));
    stringBuffer.append(TEXT_5);
    }
    stringBuffer.append(TEXT_6);
    stringBuffer.append(Integer.toHexString(device.getCfgmem().getStart()));
    stringBuffer.append(TEXT_7);
    for(CfgBits cfgbits : device.getCfgbits()){
    for(Field field : cfgbits.getFields()){
    stringBuffer.append(TEXT_8);
    for(Setting s : field.getSettings()){
    stringBuffer.append(TEXT_9);
    stringBuffer.append(cfgbits.getKey());
    stringBuffer.append(TEXT_10);
    stringBuffer.append(field.getDesc());
    stringBuffer.append(TEXT_11);
    stringBuffer.append(s.getDesc());
    stringBuffer.append(TEXT_12);
    stringBuffer.append(cfgbits.getKey());
    stringBuffer.append(TEXT_13);
    stringBuffer.append(field.getKey());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(PicUIPlugin.IDzeString(s.getDesc()));
    stringBuffer.append(TEXT_15);
    stringBuffer.append(Integer.toHexString(s.getValue()));
    stringBuffer.append(TEXT_16);
    }
    stringBuffer.append(TEXT_17);
    }
    }
    return stringBuffer.toString();
  }
}
