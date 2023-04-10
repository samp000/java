package Interface;

interface Player {
	void info();
}



public class InterfaceDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Player obj = new Player() {
			
			public void info() {
				
				System.out.println("This is anonymous method of inner class");
			}
		};
		
		obj.info();
		
	}

}
