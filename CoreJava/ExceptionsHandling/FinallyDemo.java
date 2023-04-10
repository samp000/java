package ExceptionsHandling;

public class FinallyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Start");
		try {
			
			System.out.println(5/0);
			
			
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}finally {
			
			System.out.println("Finally block");
		}
		
		
		System.out.println("End");
	}


}
