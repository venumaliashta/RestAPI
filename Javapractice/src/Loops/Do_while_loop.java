package Loops;

public class Do_while_loop {

	public static void main(String[] args) {
		
		int no= 1 ; 
		
		do {
			
			if(no==40) {continue;}

			System.out.println(no);
			no++;
		}while(no<=100);
	}
}
