package PracticeJavaPrograms;

public class CountEvenOddInArray {

	public static void main(String[] args) {
	
		int arr[] = {3, 5, 7, 32, 75, 245, 43, 12};
		
		int len = arr.length;
		int even =0;
		int odd =0;
		
		for(int i=0; i<len; i++) {
			
			if(arr[i]%2==0) {
				
			even=arr[i];
			
		//	System.out.println("even numbers are : "+even);
			} else {
				odd = arr[i];
		   System.out.println("odd numbers are :"+odd);
			}
			
		}

	}

}
