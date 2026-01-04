package PracticeJavaPrograms;

public class DuplicatesCharactersInAString {

	public static void main(String[] args) {
		
		String st = "I am working in Autorox as a senior developer";
		
		int len = st.length();
		
		char[] str = st.toCharArray();
		
		String temp = "";
		
		
		for(int i=0; i<len; i++) {
       
			if(st.charAt(i)==' ') {
				
				continue;
			}
			
			for(int j=i+1; j<len; j++) {
				
				if(st.charAt(i)==st.charAt(j)) {
				
				if(temp.indexOf(st.charAt(i))==-1) {
					
					//why ==-1?
					//indexof is a method of Sting. Lets take "Apple"
					//Apple.indexof(1); it will return p. Because p is exists in apple.
				    //if the character doesn't exist, it will return -1.
				    //Ex: Apple.indexof(z) then the output is -1. 
					
					temp = temp+st.charAt(i);
				}
			
				break;
				}
			}
		}
		
		System.out.println(temp);

	}

}
