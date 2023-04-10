package polymorphism;

//overloading example

class Demo1 {
	
	void m1(int x) {
		System.out.println(x);
	}
}

class Demo2 extends Demo1 {
	
	void m1(int x,float y) {
		System.out.println(x+" "+y);
	}
	
//	void m1(float x) {
//		System.out.println(x);
//	}
	
	void m1(int ...args) {
		
		System.out.println(args.length);
	}
	
}

public class PolyDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo2 obj = new Demo2();
		//obj.m1(200.5f);		automatic pramotion happens lower to higher not higher to lower
		obj.m1(10,10);
		obj.m1(10,200,400,300);
	}

}
