package PracticeJavaPrograms;

public class String_Vowels {

	public static void main(String[] args) {
		
		String str = "I am working in Autorox as a senior developer";
        
		
		int len = str.length();
		int vowels =0;
		int contents=0;
		
		
		for(int i =0; i<len; i++) {
			
			if(str.charAt(i)==' ') {
				
				continue;
			}
			
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
			
			vowels++;
			
		} else {
			
			contents++;
		}
		
			
		

	}
		System.out.println("vowels are :" + vowels);
		System.out.println("contents are : " +contents);
	}
}
