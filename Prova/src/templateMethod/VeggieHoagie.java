package templateMethod;

public class VeggieHoagie extends Hoagie {
	
	String[] vegUsed = {"Lettuce", "Tomatoes"};
	String[] condUsed = {"Oil", "Vinegar"};
	
	boolean customerWantsMeat() {
		return false;
	}
	
	boolean customerWantsCheese() {
		return false;
	}
	
	@Override
	void addMeat() {
	}

	@Override
	void addCheese() {
	}

	@Override
	void addVegetables() {
		System.out.println("\nAdding the vegetables: ");
		
		for(String veg : vegUsed) {
			System.out.print(veg + " ");
		}	
	}

	@Override
	void addCondiments() {
		System.out.println("\nAdding the condiments: ");
		
		for(String cond : condUsed) {
			System.out.print(cond + " ");
		}
	}
	
}
