package StringPrograms;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesCharactersInAStringTwoSpecial {

	public static void main(String[] args) {
		
		String str = "I am working in Autorox as a senior developer";
		
		int len = str.length();
		
		char[] st= str.toCharArray();
		
		String temp = "";
		
		for(int i =0; i<len; i++) {
			
			boolean duplicate = false;
			
			if(str.charAt(i)==' ') {
				
				continue;
			}
			
			for(int j=i+1; j<len; j++) {
				
				
				if(str.charAt(i)==str.charAt(j)) {
					
					duplicate = true;
					
					break;
				}
				
				
			}
			
			if(duplicate && temp.indexOf(str.charAt(i))==-1) {
				
					temp= temp+str.charAt(i);
				
			}
			
			}
		System.out.println(temp);
		}
		
	}


