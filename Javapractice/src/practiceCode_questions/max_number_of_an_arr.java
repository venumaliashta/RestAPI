package practiceCode_questions;

public class max_number_of_an_arr {

	public static void main(String[] args) {
		
		int arr[] = {2,3,5,9,2,1};
	
	    int max = arr[0];
	    
	    for(int i=0 ; i<=arr.length-1 ; i++) {
	    	
	    	if(arr[i]>max) {
	    		
	    		max =arr[i];
	    	}
	    }
	    
	    System.out.println(max);
	    
	}
}
