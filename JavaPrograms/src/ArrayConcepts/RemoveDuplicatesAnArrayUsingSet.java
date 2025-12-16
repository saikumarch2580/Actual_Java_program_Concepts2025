package ArrayConcepts;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesAnArrayUsingSet {

	public static void main(String[] args) {
		
		int[] array = {5, 2, 9, 1, 6, 2, 5}; 
		
		int len = array.length;
		
		Set<Integer> set = new HashSet<>();
		
		for(int i=0;  i<len; i++) {
			
			set.add(array[i]);
		}
 
		System.out.println(set);
	}

}
