package Multithreading;

class MyThread4 implements Runnable {
	
	static int num = 5;
	
	String TName = null;
	
	public void run() {
		for(int i=0;i<10;i++) {
	
			try {
				Thread.currentThread().sleep(500);
			} catch (InterruptedException e) {
			
			}
			
			System.out.println(Thread.currentThread().getName());
			
		}
	}
	
}

public class Demo4 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		MyThread4 mt1 = new MyThread4();
		Thread t1 = new Thread(mt1);	

		t1.start();
		for(int i=1;i<=5;i++)
			System.out.println(Thread.currentThread().getName());

		
		//t3.start();
			
	}

}
