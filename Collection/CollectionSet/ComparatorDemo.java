package CollectionSet;
import java.util.*;

class Emp {
	
	int id;
	String name;
	
	Emp(int id,String name){
		this.id=id;
		this.name=name;
	}
	
}

class SortById implements Comparator<Emp>{
	
	public int compare(Emp obj1,Emp obj2) {	
		return (obj1.id-obj2.id);
	}
}

class SortByName implements Comparator<Emp>{
	
	public int compare(Emp obj1,Emp obj2) {
		return obj1.name.compareTo(obj2.name);
	}
}



public class ComparatorDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
		
		List<Emp> l = new ArrayList();
		
		l.add(new Emp(10,"sandy"));
		l.add(new Emp(1,"ayush"));
		l.add(new Emp(5,"avya"));
		l.add(new Emp(9,"suyog"));
		l.add(new Emp(7,"omkar"));
		l.add(new Emp(2,"surja"));
		l.add(new Emp(3,"suyog"));
	
		ListIterator itr = l.listIterator();
		while(itr.hasNext()) {
			Emp obj = (Emp)itr.next();			
			System.out.println(obj.id+" "+obj.name);
		}
		itr = null;
		System.gc();
		
		Collections.sort(l,new SortByName());

		System.out.println("---------------------------------------------------");
		
		itr = l.listIterator();
		while(itr.hasNext()) {
			Emp obj = (Emp)itr.next();			
			System.out.println(obj.id+" "+obj.name);
		}
	}

}
