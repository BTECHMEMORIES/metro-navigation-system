package dsa.project.utility;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Lodash {

	public String toLodash(String rawStr) {
		
		List<Character> chrs = new ArrayList<>(Arrays.asList(' ',',','.','-','_'));
		
		String convertedStr = "";
		
		char rawCharArr[] = rawStr.toCharArray();
		
		boolean spFlag = false;
		
		for(char strChar : rawCharArr) {
		
			if(chrs.contains(strChar)) {
				if (spFlag) {
					convertedStr += "-";
					spFlag = false;
					continue;
				}
				else {
					continue;
				}
			}
			
			else {
				
				spFlag = true;
				convertedStr += Character.toString((Character.toLowerCase(strChar)));
			}
		}
		
		if(convertedStr.charAt(convertedStr.length() -1) == '-') {
			
			convertedStr = convertedStr.substring(0, convertedStr.length() - 1);
		}
		
		return convertedStr;
		
	}
	
	public String toNormal(String str) {
		
		String normalStr = "";
		
		boolean fFlag = true;
		
		for(char chr : str.toCharArray()) {
			
			if(fFlag) {
				normalStr += Character.toString((Character.toUpperCase(chr)));
				fFlag = false;
			}
			else if(chr == '-') {
				normalStr += " ";
				fFlag = true;
			}
			else {
				normalStr += Character.toString(chr);
			}
		}
		
		return normalStr;
		
	}
	
}
