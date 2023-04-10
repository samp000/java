package ExceptionsHandling;

class MyException extends Exception {
	
	String msg = null;
	
	MyException(String msg) {
		this.msg = msg;
	}
	
	public String toString() {
		return msg;
	}
}


public class CustomizedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			
			throw new MyException("Customized Exception");
			
		} catch (MyException e) {
			System.out.println("In catch");
			System.out.println(e.toString());
		}
		
	}

}
