package Oops;

interface interface_{
	
	public void a();
}
 class demo1 implements interface_ {

	@Override
	public void a() {
			System.out.println("implements interface");
	}
	
}
public class Interface {

	public static void main(String[] args) {
		
	demo1 d = new demo1();
	d.a();
	
	}
}
