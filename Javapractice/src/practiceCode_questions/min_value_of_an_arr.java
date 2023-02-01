package practiceCode_questions;

public class min_value_of_an_arr {
public static void main(String[] args) {
	
	int arr[] = {2,5,1,7,2,9,4,2};
	
	int min = arr[0];
	
	for(int i=0 ; i<=arr.length-1 ; i++) {
		
		if(arr[i]<min) {
			
			min=arr[i];
		}
	}
	
	System.out.println(min);
	
}
}
