package PracticeJavaPrograms;

public class FindLargestAndSmallestInAnArray {

	public static void main(String[] args) {
		
		int[] array = {5, 2, 9, 1, 6, 3};
		
		int len = array.length;
		
		int largestNumber =array[0];
		int SmallestNumber = array[0]; 
		
		for(int i=0; i<len; i++) {
			
			if(array[i]>largestNumber) {
				
				largestNumber= array[i];
			} else {
				
				if(array[i]<SmallestNumber) {
					
					SmallestNumber= array[i];
				
			}
		}
            
	}
		 System.out.println("largestNumber is :"+ largestNumber);
         System.out.println("SmallestNumber is : " + SmallestNumber);
}
}
