package basic;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte bt = 10;
		short a = 32539;
		int b = 10;
		long c = 200;
		double d = 10.5d;
		float f = 100.5f;
		
		System.out.println(bt);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(f);
		
		System.out.println("------------------------");
		
		int x = 5;
		int ans = ++x + ++x + ++x;		//expression is evaluated one by one then value at that instance is assigned.
		
		
		System.out.println(x+"\n"+ans);
		
	}

}