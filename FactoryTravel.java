
	class FactoryTravel extends AbstractFactory {

		public Color getCol(String s) {
			return null;
		}

		public Travel getCountry(String s) {
		
			if(s==null)
				return null;

			if(s.equalsIgnoreCase("RUSSIA"))
				return new Russia();
			else if(s.equalsIgnoreCase("CALIFORNIA"))
				return new California();
			else if(s.equalsIgnoreCase("JAPAN"))
				return new Japan();
			else
				return null;
		}
	}
