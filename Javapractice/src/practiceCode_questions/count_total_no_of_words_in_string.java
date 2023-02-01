package practiceCode_questions;

public class count_total_no_of_words_in_string {
	
	public static void main(String[] args) {
		
	String str = "prakash dhondiram mali";
	
	String[] str1 = str.split(" ");
		
	for(int i=0 ; i<=str1.length-1 ; i++) {
		
		System.out.println(str1[i]);
	}
		
	System.out.println(str1.length);
	}
}
