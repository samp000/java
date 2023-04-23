package CollectionQueue;
import java.util.*;
import java.util.concurrent.*;

public class BlockingQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				BlockingQueue<Integer> queue = new PriorityBlockingQueue(6);
				
				queue.add(10);
				queue.add(50);
				queue.add(11);
				queue.add(12);
				queue.add(1);
				
				System.out.println(queue);
				
				queue.add(100);		
				
				System.out.println(queue);
				
				queue.add(111); //queue limit is full
			}
	}