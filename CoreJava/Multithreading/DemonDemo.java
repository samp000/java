package Multithreading;



//Demonstration to set User thread as Daemon Thread

class MyThread7 extends Thread {

	public void run() {
	
		for(int i=1;i<=500;i++) {
			try{
				sleep(1000);
				
			}catch(InterruptedException ie){}
			System.out.println(Thread.currentThread().getName());
		}
	}
} 

public class DemonDemo {

	public static void main(String args[]) {
	
		MyThread7 mt1 = new MyThread7();
		MyThread7 mt2 = new MyThread7();
		MyThread7 mt3 = new MyThread7();


		mt1.setDaemon(true);

		mt1.start();
		mt2.start();
		mt3.start();
	}
}
