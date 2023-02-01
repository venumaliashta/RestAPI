package Oops;
                                 // abstraction demo using abstract class
abstract class Bike{
	abstract void run();

}
class Honda extends Bike{
	@Override
	void run() {
	
		System.out.println("bike is running");
	}
	
}
public class AbstractDemo {

	public static void main(String[] args) {
		Honda honda = new Honda();
		honda.run();
	}
	
}
