package PracticeJavaPrograms;

public class String_CountTheWordsInAstring {

	public static void main(String[] args) {
		String str = "It is a good day as it is end of the month";
		
	int len = str.length();
	
	int count =0;
	
	String[] split = str.split(" ");
	
	for(int i=0; i<split.length; i++) {
		
		count++;
	}
     System.out.println(count);
	}

}
