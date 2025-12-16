package PracticeJavaPrograms;

public class FrequencyOfElementsInAnArray {
	

	

	    public static void main(String[] args) {

	        int[] arr = {2, 44, 5, 35, 25, 33, 44, 35};

	        int[] visited = new int[arr.length];

	        for (int i = 0; i < arr.length; i++) {

	            // If element is already counted, skip it
	            if (visited[i] == 1) {
	                continue;
	            }

	            int count = 1; // arr[i] itself is already counted

	            for (int j = i + 1; j < arr.length; j++) {

	                if (arr[i] == arr[j]) {
	                    count++;        // Count duplicates
	                    visited[j] = 1; // Mark as already counted
	                }
	            }

	            System.out.println("Frequency of " + arr[i] + " = " + count);
	        }
	    }
	}


