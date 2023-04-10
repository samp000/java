

	//creating object of class by calling apropriate methods on object of AbstractFactory Class(indirectly)

	class FactoryColor extends AbstractFactory {
	
		public Color getCol(String s){
			
			if(s==null)
				return null;

			if(s.equalsIgnoreCase("RED"))
				return new Red();		
			else if(s.equalsIgnoreCase("GREEN"))
				return new Green();
			else if(s.equalsIgnoreCase("BLUE"))
				return new Blue();
			else 
				return null;
		}

		public Travel getCountry(String s) {
		
			return null;
		}
	}
