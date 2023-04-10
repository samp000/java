

	//creating AbstractFactory class obj by calling  method
	
	class FactoryProducer {

		public static AbstractFactory getFactory(String choice) {
		
			if(choice.equalsIgnoreCase("TRAVEL"))
				return new FactoryTravel();
		
			else if(choice.equalsIgnoreCase("COLOR"))
				return new FactoryColor();

			return null;
		}
	}
