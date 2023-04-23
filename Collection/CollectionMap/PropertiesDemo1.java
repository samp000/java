import java.util.*;
import java.io.*;

class PropertiesDemo {

	public static void main(String[] args)throws Exception {

		Properties p = System.getProperties();//get system propertie		
		System.out.println(p);

		Set set = p.entrySet();

		Iterator itr = set.iterator();

		while(itr.hasNext()) {
		
			Map.Entry entry = (Map.Entry)itr.next();
			System.out.println(entry.getKey()+" = "+entry.getValue());
		}

	}

}

