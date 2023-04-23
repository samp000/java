package CollectionQueue;
import java.util.*;

public class LinkedListQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<Integer> queue = new LinkedList();
		
		queue.add(10);
		queue.add(50);
		queue.add(11);
		queue.add(12);
		queue.add(1);
		queue.add(19);
		
		System.out.println(queue);
		
		
		queue.offer(1);
		System.out.println(queue);
		
		System.out.println(queue.getFirst());
		System.out.println(queue.getLast());
		System.out.println(queue.peekFirst());
		System.out.println(queue.peekLast());
		System.out.println(queue.removeFirstOccurrence(1));
		System.out.println(queue);
	}

}
