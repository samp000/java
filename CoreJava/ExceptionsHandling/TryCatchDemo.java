package ExceptionsHandling;

public class TryCatchDemo {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[10];
		
		System.out.println("Start");
		try {
			
			System.out.println(arr[100]/0);
			
			
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception ");
		} catch (Exception e) {
			System.out.println(" Exception");
		}
		
		System.out.println("End");
	}

}
