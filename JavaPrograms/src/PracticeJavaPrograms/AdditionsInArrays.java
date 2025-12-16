package PracticeJavaPrograms;

public class AdditionsInArrays {

	public static void main(String[] args) {

		int num[] = {1,3,4,6,7,8,50};
		
		int sum = 0;
		
		int len = num.length;
		
		for(int i=0; i<len; i++) {
			
		sum = sum+num[i];
		}
		
		System.out.println(sum);
	}
		
	}


