

	//using abstract factory methods

	class AbstractFactoryDemo {
	
		public static void main(String args[]) {
		
			AbstractFactory af = FactoryProducer.getFactory("Color");
			Color c = af.getCol("red");
			c.fill();
		}
	}
