package Multithreading;


class MyThread3 implements Runnable {
	
	public void run() {
		
		System.out.println(Thread.currentThread().getName());
		
	}
}

public class Demo3 {

//
//	To create thread we definately need to call constructor of Thread class 
//	and to start thread need to call start method
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			MyThread3 obj = new MyThread3();
			Thread t = new Thread(obj);
			t.start();
			
			System.out.println(Thread.currentThread().getName());
	}

}
