package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThreadPool implements Runnable {
	
	public void run() {
		
		System.out.println(Thread.currentThread()+" start task");
		System.out.println(Thread.currentThread()+" end task");
	}
}


public class ThreadPoolDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			ExecutorService es = Executors.newFixedThreadPool(10);
		
			for(int i=0;i<=30;i++) {
				
				MyThreadPool mt = new MyThreadPool();
				es.execute(mt);
			}
		
			es.shutdown();
	}

}
