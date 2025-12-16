package ArrayConcepts;

public class FrequencyOfElementsInArray2 {
	
	public static void main(String[] args) {
	
	int arr[] = {2, 44, 5, 35, 35, 44, 33, 25,44};
	
	int len = arr.length;
	
	int[] verified = new int[arr.length];
	
	for(int i=0; i<len; i++) {
		
		int count =1;
		
		if(verified[i]==1) {
			
			continue;
		}
		
		for(int j=i+1; j<len; j++) {
			
			if(arr[i]==arr[j]) {
				
				count++;
				
				verified[j]=1;
			}
			
			
		}
		
		System.out.println("Frequency of " + arr[i] + " = " + count);
	}
			
	}
}
