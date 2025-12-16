package PracticeJavaPrograms;

public class NonRepeatedNumbersInArray {

	public static void main(String[] args) {
		//given [ 1,1,2,2,3,4,5,5,6,6],
		//Output – [3,4]
		
		int[] arr = {1,1,2,2,3,4,5,5,6,6};
		
		int len = arr.length;
		
		for(int i=0; i<len; i++) {
			
			int count =0;  
			for(int j=0; j<len; j++) {
				
				if(arr[i]==arr[j]) {
					
					count++;
					
				}
				
				
			}
			if(count==1) {
			// count ==1 means if one character repeated only one time	
				System.out.println(arr[i]);
			}
		}

	}

}
