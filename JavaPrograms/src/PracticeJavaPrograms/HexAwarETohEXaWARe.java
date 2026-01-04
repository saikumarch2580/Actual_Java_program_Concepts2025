package PracticeJavaPrograms;

public class HexAwarETohEXaWARe {

	public static void main(String[] args) {
		
		String str = "HexAwarE";
		
		int len = str.length();
		
		char[] sr =  str.toCharArray();
		
		String newsr ="";
		
		for(int i=0; i<len; i++) {
			
			char ch = sr[i];
			
			if(Character.isUpperCase(ch)) {
				
				newsr= newsr+Character.toLowerCase(ch);
			} else {
				
				newsr= newsr+Character.toUpperCase(ch);
				
			}
			
		}
      System.out.println(newsr);
	}

}
