package StringPrograms;

public class I_Love_Java_Programming_Reverse_Programming {

	public static void main(String[] args) {
		
		String str = "I Love Java Programming";
		
		int len= str.length();
		
		String[] split = str.split(" ");
		
		String temp =" ";
		
			for(int i=0; i<split.length; i++) {
			
			if(i==split.length-1) {
				
				//why split.length-1?
				// Ex: My name is sai. the index is 3. Length is 4. 
				// Formula is Last index = length - 1 means 4-1 = 3
				
				
				for(int j=split[i].length()-1; j>=0; j--) {
					
					temp=temp+split[i].charAt(j);
					//i = 3   → "Programming"
					//j = 10  → last character
					//split[i].charAt(j); means last word(i) of character(j) storing in the temp.
					//Means the Programming of g is storing in the temp first.
				}
				temp =temp+" ";
			} else
			temp= temp+split[i]+ " ";
		}
		
		System.out.println(temp);
	}

}
