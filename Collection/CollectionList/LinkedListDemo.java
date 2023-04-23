package CollectionList;
import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> al = new LinkedList();
		
		al.add(100);
		al.add(201);
		al.add(13);
		al.add(55);
		al.add(-100);

		Iterator itr = al.iterator();
		
		while(itr.hasNext()) {
		
			System.out.println(itr.next());
		}
		
		System.out.println("--------------------------------");
		
		System.out.println(al.element());
		System.out.println(al.peek());
		System.out.println(al.getFirst());
		System.out.println(al.getLast());
		System.out.println(al.indexOf(201));
		System.out.println("removed:"+al.poll());		//first element removed
		System.out.println(al.getFirst());
		al.push(100);
		System.out.println(al);
		
	}

}
