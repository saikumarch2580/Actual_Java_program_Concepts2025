package PracticeJavaPrograms;

public class AverageArray {

	public static void main(String[] args) {

		int array[] = {2,32,234,21,190,76};
		
		int len = array.length;
		int sum = 0;
		double avg = 0.00;
		int count = 0;
		
		for(int i=0; i<len; i++) {
			
			count ++;
		sum = sum+array[i];
		
		
		
		
		}
		System.out.println(sum);
		System.out.println("count is "+ count);
		
		
		avg = sum/count;
		System.out.println(avg);
		
		

	}

}
