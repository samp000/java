package CollectionSet;

import java.util.*;

class Empl implements Comparable<Empl>{
	
	int id;
	String name;
	
	Empl(int id,String name) {
		this.id = id;
		this.name = name;
	}
	

	public int compareTo(Empl o) {
		return (int)(o.id - id);
	}
	
}

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if we are passing a class which does not extends Comparable then we have to implement Comparable and write a comparable method 
		TreeSet<Empl> hs = new TreeSet();
	
		hs.add(new Empl(10,"sandy"));
		hs.add(new Empl(1,"ayush"));
		hs.add(new Empl(5,"avya"));
		hs.add(new Empl(7,"omkar"));
		hs.add(new Empl(2,"surja"));
		hs.add(new Empl(3,"suyog"));
		
	
		
		
		Iterator itr = hs.iterator();
		
		while(itr.hasNext()) {
			
			Empl obj = (Empl)itr.next();
			
			System.out.println(obj.id+" "+obj.name);
		}
		
	}

}
