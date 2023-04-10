package Interface;

//How to write function body in interface

interface P {
	
	default void fun() {
		System.out.println("function in parent");
	}
	
	static void fun1() {
		System.out.println("function in child");
	}
	
	int x = 10;			//bydefault it is public static final 
}

class C implements P {
	
	int x = 20;
	
}

public class interfaceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			P obj = new C();
			obj.fun();
//			obj.fun1();			gives error
			P.fun1();  			//works
			
			System.out.println(obj.x);
	}

}
