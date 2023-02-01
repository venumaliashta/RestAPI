package practiceCode_questions;

import java.util.Arrays;

public class Sort_the_arr {

	public static void main(String[] args) {
		  
	    int no[] = {2,3,5,8,1,0,2,6,1};
	    Arrays.sort(no);
	    
	   for(int i=0 ; i<=no.length-1 ; i++) {
		   System.out.println(no[i]);
	   }
	}
}
