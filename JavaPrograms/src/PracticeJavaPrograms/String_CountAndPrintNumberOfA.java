package PracticeJavaPrograms;

public class String_CountAndPrintNumberOfA {

	public static void main(String[] args) {
		
		String s = "My name is sairam";
		
	    int len  = s.length();
	    
	    int count =0;
	    
	  char[] eachChar =  s.toCharArray();
	    
	    for(int i=0; i<len; i++) {
	    	
	    	if(eachChar[i]== 'a') {
	    		
	    		count++;
	    	}
	    }
        System.out.println(count);
	}

}
