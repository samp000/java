package CollectionList;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al = new ArrayList();
		
		al.add(100);
		al.add(201);
		al.add(13);
		al.add(55);
		al.add(-100);

//		Iterator it = al.iterator();
//		
//		while(it.hasNext()) {
//			
//			System.out.println(it.next());
//		
//			if(it.hasNext())
//				it.next();
//		}
		
		ListIterator litr = al.listIterator();
		while(litr.hasNext()) {
			
			Integer ele = (Integer)litr.next();
			System.out.println(ele);
		}
		
		litr = null;
		System.gc();
		
		al.sort(null);
		
		System.out.println("---------------------------------------------");
		
		litr = al.listIterator();
		while(litr.hasNext()) {
			
			Integer ele = (Integer)litr.next();
			System.out.println(ele);
		}
		
	}

}
