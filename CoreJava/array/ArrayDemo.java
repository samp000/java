package array;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[10];
		int[] arr1 = {10,20,30};
		
		for(int i=0;i<arr1.length;i++) {
			
			System.out.println(arr1[i] );
			
		}
		
		int[] arr2 = new int[10];
		
		Arrays.fill(arr2,10);
		
		for(int i=0;i<arr2.length;i++)
			System.out.println(arr2[i]);
	}

}