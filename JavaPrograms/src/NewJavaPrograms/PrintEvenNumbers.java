package NewJavaPrograms;

public class PrintEvenNumbers {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		int j=0;
		
		int len = arr.length;
		
		for(int i=0; i<100; i++) {
			
			if(arr[i]%2==0) {
				
			arr[j]=	arr[i];
			
			j++;
			
			}

		}
		
		for(int k=0; k<j; k++) {
			
			System.out.println(arr[k]);
		}
	
	}

}
