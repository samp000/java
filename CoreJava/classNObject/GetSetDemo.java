package classNObject;


class Person1 {
	
	String name;
	int age;
	
	int birtYear(int currYear)  {
		
		return (currYear - age);

	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	String getname() {
		
		return this.name;
	}
	
	int getAge() {
		
		return this.age;
	}
	
	
	
}

public class GetSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person1 p1 = new Person1();
		
		//calling setters
		p1.setName("Sandesh");
		p1.setAge(21);
		
		
		//passed current year
		int year = 	p1.birtYear(2023);
		
		System.out.println("Birth age of person:"+year);
	}

}
