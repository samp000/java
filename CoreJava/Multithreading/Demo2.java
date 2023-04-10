package Multithreading;


class NewThread extends Thread {
	
	public void run(){
		System.out.println("Thread Name: "+Thread.currentThread().getName());
	}	
}

class MyThread2 extends Thread {
	
	public void run() {
		System.out.println("Thread Name: "+Thread.currentThread().getName());
		NewThread t = new NewThread();
		t.start();
	}
	
}

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread2 t = new MyThread2();
		t.start();
	}

}
