package CollectionMap;
import java.util.*;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer,String> ht = new Hashtable();
		
		//output will be in sequence of elements from higher to lower index of hashtable
		//default bucket size of hashtable is 11
		
		ht.put(15, "sandy");//4
		ht.put(8, "ayush");//8
		ht.put(2, "surja");//2
		ht.put(10, "omkar");//10
		ht.put(14, "avya");//3
		ht.put(11, "suyog");//0
		ht.put(25, "XYZ");//3
		
		System.out.println(ht);
	}

}
