package ExceptionsHandling;

import java.util.*;

class InvalidAgeException extends Exception {
	
	public InvalidAgeException(String msg) {
		
		super(msg);
	}
}


public class CustomizedException1 {

	static void checkAge(int age) throws InvalidAgeException {	
		if(age<18)
			throw new InvalidAgeException("under aged are not permited");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter age:");
			int age = sc.nextInt();
			
			try {
				
				checkAge(age);
				
			}catch(InvalidAgeException e) {
				
				System.out.println(e.toString());
			}
			
	}

}
