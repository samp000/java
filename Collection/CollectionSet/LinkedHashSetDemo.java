package CollectionSet;
import java.util.*;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);
		
		
		//insertion order is preserved in linkedHashSet
		LinkedHashSet<Integer> hs = new LinkedHashSet();
		
		System.out.println("Enter 5 elements in hashset:");
		
		for(int i=0;i<=4;i++)
			hs.add(sc.nextInt());
		
		System.out.println(hs);
		
		Iterator itr = hs.iterator();
		
		System.out.println("-----------------------------------------");
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
