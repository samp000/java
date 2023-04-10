package innerClass;

class TripPlan {
	
	void place() {
		System.out.println("Goa");
	}
}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TripPlan obj = new TripPlan() {
			
			void place() {
				System.out.println("Alibag");
			}
			
		};
		
		obj.place();
		
	}

}
