package practiceCode_questions;

public class rev_string {

	public static void main(String[] args) {
		
		String str = "javaprogram";
		
		for(int i=str.length()-1 ; i>=0 ; i--) {
			
			System.out.println(str.charAt(i));
		}
	}
}
