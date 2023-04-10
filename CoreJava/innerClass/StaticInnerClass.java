package innerClass;


class Hospital {
	
	static class Doc {
		
		void servAt() {
			System.out.println("Working At Hospital");
		}
	}
}

public class StaticInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Hospital.Doc obj = new Hospital.Doc();
			obj.servAt();
	}

}
