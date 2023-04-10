package Multithreading;


class MyThread8 extends Thread {
	
	public MyThread8(ThreadGroup tg , String name) {
		super(tg,name);
	}
	
	public void run() {
		System.out.println(Thread.currentThread());
	}
	
}

public class ThreadGroupDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadGroup tg = new ThreadGroup("Parent 1");
		
		MyThread8 mt1 = new MyThread8(tg,"one");
		MyThread8 mt2 = new MyThread8(tg,"two");
		MyThread8 mt3 = new MyThread8(tg,"three");

		mt1.start();
		mt2.start();
		mt3.start();
	}
}
