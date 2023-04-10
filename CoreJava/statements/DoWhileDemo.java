package statements;

import java.util.Scanner;

public class DoWhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int val;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		do {
		
			System.out.println("Enter ip:");
			
			val = sc.nextInt();
			System.out.println("You entered: "+val);
		}while(val != 100);
	
	
		sc.close();
		
		System.out.println("Program closed");
	}
	


}