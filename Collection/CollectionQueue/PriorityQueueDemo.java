package CollectionQueue;
import java.util.*;


public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Integer> pq = new PriorityQueue();
		
		pq.add(10);
		pq.add(1);
		pq.add(2);
		pq.add(11);
		pq.add(110);
		pq.add(99);
		
		System.out.println(pq.peek());
		
		System.out.println(pq);
		
	}

}
