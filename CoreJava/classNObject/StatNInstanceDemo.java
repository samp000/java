package classNObject;

class Thing {
	
	public static final int L_Number = 123456;
	
	public String name;
	public static String description;
	
	public void meth1() {
		System.out.println(description);
		System.out.println(name);
	}
	
	//static method cannot access instance variable
	public static void meth2() {
		System.out.println(description);
		//System.out.println(name);
	}
}

public class StatNInstanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thing.description = "This is description";
		
		Thing t1 = new Thing();
		Thing t2 = new Thing();
		
		t1.name = "Sandy";
		t2.name = "Ayush";
		
		System.out.println(t1.name+" "+t1.description);
		System.out.println(t2.name+" "+t2.description);
		
		t1.meth1();
		Thing.meth2();
		
		
		System.out.println(t1.L_Number);
		System.out.println(t2.L_Number);
	}

}
