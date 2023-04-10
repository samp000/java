package Abstraction;


class A {
	
	void fun() {
		System.out.println("This is Parent method\n");
	}
	
}

abstract class B extends A {
	abstract void fun();
}

class C extends B {
	
	void fun() {
		
		System.out.println("This is Grandchild method");
		
	}
}

public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
