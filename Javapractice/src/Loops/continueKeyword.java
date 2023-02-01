package Loops;

public class continueKeyword {

	public static void main(String[] args) {
		
		int no= 1;
		
		while(no<100) {
			
			if(no==4) {continue;};
			
			System.out.println(no);
			no++;		
		}
	}
}
