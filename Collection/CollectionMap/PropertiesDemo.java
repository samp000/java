import java.util.*;
import java.io.*;

class PropertiesDemo {

	public static void main(String[] args)throws Exception {

		FileReader fr = new FileReader("prop.properties");
		Properties p = new Properties();
		p.load(fr);
		
		System.out.println(p.getProperty("1"));

	}

}

