package inputs;

import java.util.Scanner;
import java.io.*;

public class InputDemo {

	public static void main(String[] args){
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter integer:");
		int val = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter string:");
		String line = sc.nextLine();
		
		System.out.println(val+"\n"+line);
		
		sc.close();
		
	}

}