package Loops;

public class Continue {

	public static void main(String[] args) {
		
		/*
		for(int i=1 ; i<=10 ; i++) {
				
			if(i==5) {
				
				continue;
			}
			System.out.println(i);
		}
		*/
		
		int no = 1;
		while(no < 10) {
			
			System.out.println(no);		
			if(no == 5) {
				continue;
				
				
			}
		
			no++;
		}
		
		
		
		
	}
}
