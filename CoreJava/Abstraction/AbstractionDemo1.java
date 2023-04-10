package Abstraction;

abstract class Mastani {
	
	Mastani() {
		System.out.println("Constructor of Mastani");
	}
	
	void taste() {
		System.out.println("Taste is very nice...");
	}
	
	abstract void quantity();
}

class SujataMastani extends Mastani{
	
	 SujataMastani() {
		System.out.println("Constructor of SujataMastani");
	}
	
	
	void quantity() {
		System.out.println("Much");
	}
	
}

public class AbstractionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SujataMastani obj = new SujataMastani();
		obj.taste();
		obj.quantity();
	}

}
