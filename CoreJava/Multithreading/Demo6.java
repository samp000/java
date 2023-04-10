package Multithreading;

class MyThread6 implements Runnable {
	
	static int num = 5;
	
	String TName = null;
	
	
	
	public void run() {
		
		for(int i=0;i<10;i++) {
	
			try {
				Thread.currentThread();
				Thread.sleep(10);
				Thread.yield();
			} catch (InterruptedException e) {
			
			}
			
			System.out.println(Thread.currentThread());
			
		}
	}
	
}

public class Demo6 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		MyThread6 mt1 = new MyThread6();
		Thread t1 = new Thread(mt1);	

		t1.start();
		
		
	

		for(int i=1;i<=5;i++)
			System.out.println(Thread.currentThread());

		
		
		//t3.start();
			
	}

}

