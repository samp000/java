package CollectionMap;
import java.util.*;

class Employee {
	
	int id;
	String name;

	Employee(int id,String name) {
		this.id=id;
		this.name=name;
	}
}

public class HashMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,Employee> hm = new HashMap();
		
		hm.put(1, new Employee(101,"Sandesh"));
		hm.put(2, new Employee(501,"Ayush"));
		hm.put(3, new Employee(201,"Omkar"));
		hm.put(4, new Employee(301,"Suraj"));
		hm.put(5, new Employee(111,"Suyog"));
		hm.put(6, new Employee(401,"Avishkar"));
	
		System.out.println(hm);
		
		Set<Map.Entry<Integer, Employee>> entry = hm.entrySet();
		Iterator<Map.Entry<Integer, Employee>> itr = entry.iterator();
		
		while(itr.hasNext()) {
			
			Map.Entry<Integer, Employee> en = itr.next();
			
			System.out.println(en.getKey()+" = (id: "+en.getValue().id + ", name: "+en.getValue().name+") ");
		}
	}

}
