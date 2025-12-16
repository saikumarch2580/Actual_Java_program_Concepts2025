package PracticeJavaPrograms;

public class RemoveAnArrayLatest {

	public static void main(String[] args) {
		
		int[] arr = {2,42,43,55,53};
		
		int remove = 43;
		
		int[] newarr = new int[arr.length-1];
	//Why arr.length-1? Because you are removing 1 element. 
	//So when you create a new array with same lenth(newarr). 
    //Makesure you have to decrease one element. 
	//If you want to decrease 2 elements you have to mention arr.length-2 )	
	
		int j=0;
		
		int len = arr.length;
		
		for(int i=0; i<len; i++) {
			
			if(arr[i]!=remove) {
				
				newarr[j]=	arr[i];
				j++;
				
	//We are storing multiple elements in newarr[j]. If you do not provide j++, one element only will store and every element will replace the old element
    //j tracks the index of the new array. After inserting an element, j++ moves to the next free position so values don’t overwrite each other.				
			}
		}
		
       for(int i=0; i<newarr.length; i++) {
    	   
    	   System.out.println(newarr[i]);
    	   
       }
	}

}
