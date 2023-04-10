package Multithreading;


class MyThread extends Thread {
	
	public void run() {
			
		System.out.println("Thread Name: "+Thread.currentThread().getName());
		
		for(int i=0;i<10;i++)
			System.out.println("sandy");
	}
	
	
}

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		t1.start();
		t2.start();
		
		System.out.println("Thread Name: "+Thread.currentThread().getName());
		
		for(int i=0;i<10;i++)
			System.out.println("Marathe");
		
	}

}
