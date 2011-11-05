/**
 * 
 */
package hu.modembed.pic.device.persistence.tokens;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;

/**
 * @author balazs.grill
 *
 */
public class TokenProvider implements Iterator<String>{

	private final BufferedReader reader;
	
	private String line = null;
	
	private boolean end = false;
	
	private String token = null;
	
	private int linenum = 0;
	
	public TokenProvider(BufferedReader reader){
		this.reader = reader;
		doReadNextToken();
	}
	
	private String cutOneToken(){
		if (!"".equals(line)){
			if (line.startsWith("(")) return "(";
			if (line.startsWith(")")) return ")";
			if (line.startsWith("=")) return "=";
			if (line.startsWith("-")) return "-";
			
			if (line.startsWith("\'")){
				String r = "\'";
				for(int i = 1;i<line.length();i++){
					char c = line.charAt(i); 
					r += c;
					if (c == '\'') return r;
				}
				throw new IllegalArgumentException("Unclosed string literal at line "+linenum);
			}
			
			if (line.startsWith("\"")){
				String r = "\"";
				for(int i = 1;i<line.length();i++){
					char c = line.charAt(i); 
					r += c;
					if (c == '\"') return r;
				}
				throw new IllegalArgumentException("Unclosed string literal at line "+linenum);
			}
			
			char c = line.charAt(0);
			int i = 0;
			String s = "";
			while(isValidTokenChar(c)){
				s += c;
				i++;
				c = (i < line.length()) ? line.charAt(i) : 0;
			}
			if (!"".equals(s)) return s;
		}
		return null;
	}
	
	private boolean isValidTokenChar(char c){
		return Character.isLetterOrDigit(c) || ('.' == c) || ('_' == c);
	}
	
	private void doReadNextToken(){
		if (!end){
			token = null;
			while(token == null && !end){
				if (line == null || "".equals(line)){
					try {
						line = reader.readLine();
						linenum++;
						//System.out.println("Line "+linenum);
						if (line != null){
							/*
							 * cut out comments
							 */
							int c = line.indexOf('#');
							if (c != -1){
								line = line.substring(0, c);
							}
						}
					} catch (IOException e) {
						line = null;
					}
				}
				if (line == null){
					end = true;
				}else{
					line = line.trim();
					
					token = cutOneToken();
					if (token != null){
						line = line.substring(token.length());
					} else {
						if (line.length() != 0){
							throw new IllegalArgumentException("Invalid token at line "+linenum+" near \""+line+"\"");
						}
					}
					
				}
			}
		}
	}

	@Override
	public boolean hasNext() {
		return !end;
	}

	@Override
	public String next() {
		if (end) return null;
		String t = token;
		doReadNextToken();
		return t;
	}

	@Override
	public void remove() {
	}
	
	
	
}
