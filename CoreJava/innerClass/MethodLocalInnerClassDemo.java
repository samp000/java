package innerClass;

class Admission {
	
	Admission(String f) {
		
		if(f == "Medical")
			NEET();
		else if(f == "Engg")
			JEE();
	}
	
	void NEET() {
		
		 class Gov {
			void colg() {
				System.out.println("AIIMS");
			}
		}
		
		class Private {
			
			void colg() {
				System.out.println("BHARATI");
			}
		}
		
		new Gov().colg();
	}
	
	void JEE() {
		
		class Gov {
			
			void colg() {
				System.out.println("COEP");
			}
		}
		
		class Private {
			void colg() {
				System.out.println("PICT");
			}
		}
		
		new Private().colg();
		
	}
	
}

public class MethodLocalInnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Admission obj = new Admission("Engg");
		
	}

}
