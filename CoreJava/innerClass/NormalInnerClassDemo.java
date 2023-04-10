package innerClass;

class IndianDefence {
	
	public IndianDefence() {
		
		System.out.println("Indian Defence... BY Bipin Rawat");
	}
	
	class Army {
		void attack() {
			System.out.println("URI attack");
		}
	}
	
	class Navy {
		void attack() {
			System.out.println("Gazi attack");
		}
	}
	
	class AirForce {
		void attack() {
			System.out.println("Balakot attack");
		}
	}
	
}


public class NormalInnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IndianDefence obj = new IndianDefence();
//		obj.attack();
	
//		Army a = new Army();
//		a.attack();
		
//		IndianDefence.Army obj = new Army();
		
		IndianDefence.Army army = obj.new Army();
		army.attack();
	}

}
