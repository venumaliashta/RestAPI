package practiceCode_questions;

public class palindrom_number {

	public static void main(String[] args) {
		
		int no =100;
		
	        String strno = Integer.toString(no); 
	        
	        
	        String rev = "";
	                
	        for(int i=strno.length()-1 ; i>=0 ; i--) {
	        	
	        	rev=rev+strno.charAt(i);
	        }if(rev.equals(strno)) {
	        	System.out.println("the no is palindrom number");
	        }else {
	        	System.out.println("the no is not a palindrom number");
	        }
	        
	}
}
