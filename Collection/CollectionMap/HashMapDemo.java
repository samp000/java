package CollectionMap;
import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hm = new HashMap();
		
		hm.put(1, "Sandesh");
		
		System.out.println(hm.get(1).hashCode());
		
		hm.put(2, "Ayush");
		hm.put(3, "Omkar");
		hm.put(4, "Suraj");
		hm.put(5, "Suyog");
		hm.put(6, "Avishkar");
		hm.put(-10, "Omkar");
		hm.put(1, "Sandy");
		
		System.out.println(hm.get(1).hashCode());
	
		System.out.println(hm);
		
		Set<Map.Entry<Integer,String>> entry  = hm.entrySet();
		Iterator<Map.Entry<Integer, String>> itr = entry.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<Integer, String> actualEntry = itr.next();
			System.out.println(actualEntry.getKey()+" "+actualEntry.getValue());
		}
	}

}
