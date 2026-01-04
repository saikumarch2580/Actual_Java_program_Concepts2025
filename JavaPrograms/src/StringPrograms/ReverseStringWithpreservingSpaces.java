package StringPrograms;

public class ReverseStringWithpreservingSpaces {

	
		
		    public static void main(String[] args) {
		        String input = "a b";
		        char[] inputArray = input.toCharArray();  // Convert to char array
		        char[] result = new char[inputArray.length];  // Final result

		        // Step 1: Mark all spaces in the result
		        for (int i = 0; i < inputArray.length; i++) {
		            if (inputArray[i] == ' ') {
		                result[i] = ' ';
		            }
		        }

		        // Step 2: Place letters in reverse, skipping spaces in result
		        int j = inputArray.length - 1;  // Start from end

		        for (int i = 0; i < inputArray.length; i++) {
		            if (inputArray[i] != ' ') {
		            	//Means process only letters not spaces. 
		                // Move j left if we hit a space in result
		                while (result[j] == ' ') {
		                    j--;
		                }

		                // Place the letter in reverse
		                result[j] = inputArray[i];
		                j--;
		            }
		        }

		        // Step 3: Convert to string and print
		        System.out.println("Input:  \"" + input + "\"");
		        System.out.println("Output: \"" + new String(result) + "\"");
		    }
		

	}

/*
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

 */

