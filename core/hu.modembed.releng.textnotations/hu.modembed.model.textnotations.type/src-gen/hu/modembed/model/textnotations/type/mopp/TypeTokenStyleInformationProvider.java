/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.type.mopp;

public class TypeTokenStyleInformationProvider {
	
	public static String TASK_ITEM_TOKEN_NAME = "TASK_ITEM";
	
	public hu.modembed.model.textnotations.type.ITypeTokenStyle getDefaultTokenStyle(String tokenName) {
		if ("type".equals(tokenName)) {
			return new hu.modembed.model.textnotations.type.mopp.TypeTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("unsigned".equals(tokenName)) {
			return new hu.modembed.model.textnotations.type.mopp.TypeTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ML_COMMENT".equals(tokenName)) {
			return new hu.modembed.model.textnotations.type.mopp.TypeTokenStyle(new int[] {0x3F, 0x80, 0x5D}, null, false, false, false, false);
		}
		if ("TASK_ITEM".equals(tokenName)) {
			return new hu.modembed.model.textnotations.type.mopp.TypeTokenStyle(new int[] {0x7F, 0x9F, 0xBF}, null, true, false, false, false);
		}
		return null;
	}
	
}
