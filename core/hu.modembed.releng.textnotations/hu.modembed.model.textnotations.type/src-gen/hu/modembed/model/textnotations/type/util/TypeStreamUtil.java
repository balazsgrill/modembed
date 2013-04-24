/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.type.util;


public class TypeStreamUtil {
	
	private final static int IO_BUFFER_SIZE = 4 * 1024;
	
	public static void copy(java.io.InputStream in, java.io.OutputStream out) throws java.io.IOException {
		byte[] b = new byte[IO_BUFFER_SIZE];
		int read;
		while ((read = in.read(b)) != -1) {
			out.write(b, 0, read);
		}
		out.flush();
	}
	
	public static String getContent(java.io.InputStream inputStream) throws java.io.IOException {
		java.io.InputStreamReader reader = new java.io.InputStreamReader(inputStream);
		return getContent(reader);
	}
	
	public static String getContent(java.io.InputStream inputStream, String charset) throws java.io.IOException {
		java.io.InputStreamReader reader = new java.io.InputStreamReader(inputStream, charset);
		return getContent(reader);
	}
	
	public static String getContent(java.io.InputStreamReader reader) throws java.io.IOException {
		StringBuffer content = new StringBuffer();
		int next = -1;
		while ((next = reader.read()) >= 0) {
			content.append((char) next);
		}
		return content.toString();
	}
	
}
