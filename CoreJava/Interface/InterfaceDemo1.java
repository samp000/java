package Interface;


interface RBI {
	void loanRate();
	void loanType();
}

class SBI implements RBI {
	
	public void loanRate() {
				System.out.println("8.65");
	}
	
	public void loanType() {
		System.out.println("Home Loan");
	}
	
}

public class InterfaceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SBI obj = new SBI();
		obj.loanRate();
		obj.loanType();		
	}
}
