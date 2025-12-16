package PracticeJavaPrograms;

import java.util.HashSet;
import java.util.Set;

public class DuplicateValuesInArray_Collections {

	public static void main(String[] args) {
		
		int arr[] = { 34, 33, 33, 42, 43, 44, 34, 33, 44, 43, 23 };

		int len = arr.length;
		
		Set<Integer> set = new HashSet<>();

		for(int i=0; i<len; i++) {
			
		set.add(arr[i]);
			
		}
      
		System.out.println(set);
		
		
	}
	
	

}
