package ExceptionsHandling;

import java.util.Scanner;
import java.io.*;

public class Demo {

void fun() {
	
	
}
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

//		//arithmetic exception
//		System.out.println("in fun:"+5/0);		
//		
//		//null pointer exception
//		Demo d = null;
//		d.fun();
//		
//		//ArrayIndexOutOfBounds exception
//		int[] arr = new int[10];
//		arr[11] = 15;
		
//		//InputMismatchException (enter string data insted of integer) 
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter int:");
//		int a = sc.nextInt();
		
//		//NumberFormatException (enter string data insted of integer) 
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter int:");
//		int a = Integer.parseInt(br.readLine());
		
		//ClassCastException
		Object o = new String("sandy");
		Integer s = (Integer)o;
	}

}
