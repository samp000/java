package CollectionMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		LinkedHashMap<Integer,String> hm = new LinkedHashMap();
		
		hm.put(1, "Sandesh");
		hm.put(2, "Ayush");
		hm.put(3, "Omkar");
		hm.put(4, "Suraj");
		hm.put(5, "Suyog");
		hm.put(6, "Avishkar");
		hm.put(-10, "Omkar");
		hm.put(-199, "Omkar");
		hm.put(3, "SMarathe");
	
		System.out.println(hm);
		
		Set<Map.Entry<Integer,String>> entry  = hm.entrySet();
		Iterator<Map.Entry<Integer, String>> itr = entry.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<Integer, String> actualEntry = itr.next();
			System.out.println(actualEntry.getKey()+" "+actualEntry.getValue());
		}

		
	}

}
