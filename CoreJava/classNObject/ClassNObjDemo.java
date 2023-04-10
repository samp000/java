package classNObject;


 class Person {
	
	 String name;
	 int age;
	 
	void speak() {
		
		System.out.println("I am "+name+" and i am "+age+" years old");
	} 
	
}

public class ClassNObjDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person();	//object creation
		p1.name = "Sandesh";
		p1.age = 20;
		
		Person p2 = new Person();	//object creation
		p2.name = "Ayush";
		p2.age = 21;
		
		p1.speak();
		
		System.out.println(p1.name +"  "+p1.age);
		System.out.println(p2.name +"  "+p2.age);
	}

}
