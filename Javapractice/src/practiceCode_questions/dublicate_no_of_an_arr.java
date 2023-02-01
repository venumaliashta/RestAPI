package practiceCode_questions;

public class dublicate_no_of_an_arr {

	public static void main(String[] args) {
		
		int arr[] = {2,3,4,5,6,43,2};
		
		for(int i=0 ;i<=arr.length-1 ; i++) {
			
			for(int j=i+1 ; j<=arr.length-1 ;j++) {
				
				if(arr[i] == arr[j]) {
					
					System.out.println(arr[i]);
					
				}
			}
		}
		
		
		
		
		
		
	}
}
