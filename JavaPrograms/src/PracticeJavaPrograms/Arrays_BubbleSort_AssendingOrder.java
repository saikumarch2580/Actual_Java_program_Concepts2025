package PracticeJavaPrograms;

public class Arrays_BubbleSort_AssendingOrder {

	public static void main(String[] args) {
		
		int arr[] = {36, 19, 29, 12, 5};
		
		int len = arr.length;
		int temp = 0;
		
		for(int i=0; i<len; i++) {
			
			for(int j=0; j<len-1; j++ ) {
				
				if(arr[j]> arr[j+1]) {
					
				temp =	arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
					
					
				}
				
				
			}
			
		}
           for(int i=0; i<len; i++) {
        	
        	System.out.println(arr[i]+ " ");
        }
	}

}
