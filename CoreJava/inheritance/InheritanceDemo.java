package inheritance;

class Parent  {
	
	 int ground;
	
	Parent(int g) {
		this.ground = g;
	}
	
	void property() {
		System.out.println("I have "+ground +" acres of ground");
	}
	
	final int a = 100;
	
	 static void fun() {
		
		System.out.println("FUN");
	} 
}

class Child extends Parent{
	
	Child(int g) {
		super(g);
	}
	
}


public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child obj = new Child(100);
		obj.property();
		obj.fun();
	}

}
