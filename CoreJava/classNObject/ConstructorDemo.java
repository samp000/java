package classNObject;

class Machine {
	
	 Machine() {
		 this("Machine 2");
		System.out.println("Constructor 1 running"); 
	 }
	 
	 Machine(String mch) {
		 this("Machine3",10);
		 System.out.println("Constructor 2 running");
		 System.out.println(mch);
	 }
	 
	 Machine(String mch,int code) {
		 System.out.println("Constructor 3 running");
		 System.out.println("Machine name:"+mch+" Code:"+code);	 
	 }
	 
	 private int cd;
	 
}

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Machine m1 = new Machine();
//		
//		Machine m2 = new Machine("machine 2");
//		Machine m3 = new Machine("Machine 3",100);
//		

	}

}
