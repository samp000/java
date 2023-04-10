package classNObject;


class Demo {
	
	int x = 10;
	
	public void getX()  {
		System.out.println("X:"+x);
	}
	
}

public class PassingClassObj {

	public PassingClassObj(Demo obj) {
		obj.getX();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo d = new Demo();
		PassingClassObj obj = new PassingClassObj(d);

		
	}

}
