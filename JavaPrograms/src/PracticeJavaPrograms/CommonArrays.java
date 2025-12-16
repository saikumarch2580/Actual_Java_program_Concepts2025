package PracticeJavaPrograms;

public class CommonArrays {

	public static void main(String[] args) {
		
		int[] arr = {2,3,5,35,64,26,77};
		 
		 int[] arr2 = {4,5,64,34,60,56,77,42};
		 
		 int arr3 =0;
		 
		 int len1 = arr.length;
		 int len2 = arr2.length;
		 
		 for(int i=0; i<len1; i++) {
			 
		 for(int j=0; j<len2; j++) {
			 
			 if(arr[i]==arr2[j]) {
				 
				arr3 = arr[i];
				 System.out.println(arr3);
						 }
		 }
		 
		
		 }
		
	}

}
