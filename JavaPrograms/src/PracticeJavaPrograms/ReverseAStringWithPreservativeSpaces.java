package PracticeJavaPrograms;

public class ReverseAStringWithPreservativeSpaces {

	public static void main(String[] args) {

		String str = "My name is sairam";
		
	    int len =  str.length();
	    
	   char[] rev =  str.toCharArray();
	   
	   char[] store = new char[str.length()];
	   
	   for(int i=0; i<len; i++) {
		   
		   if(rev[i]==' ') {
			   
			   store[i]= rev[i];
		   }
	   }
      
	   int j = str.length()-1;
	   
	   for(int i=0; i<len; i++) {
		   
		   if(rev[i]!=' ') {
			   
		   }
		   
		   store[j]= rev[i];
		   
		   j--;
	   } 
	   
     System.out.println(store);
	}

}
