package practiceCode_questions;

public class palindromstring {

	public static void main(String[] args) {
		
		String str = "wellcome";
		
		String rev = "";
		
		for(int i=str.length()-1 ; i>=0 ; i--) {
			
		    rev=rev+str.charAt(i);
		}if(str.equals(rev)) {
			System.out.println("this is the palindrom string");
		}else {
			System.out.println("this is not a palindrom string ");
		}
		
	}
}
