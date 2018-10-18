package templateMethod;

public class ItalianHoagie extends Hoagie{

	String[] meatUsed = {"Salami", "Pepperoni", "Capicola Ham"};
	String[] cheeseUsed = {"Provolone"};
	String[] vegUsed = {"Lettuce", "Tomatoes"};
	String[] condUsed = {"Oil", "Vinegar"};
	
	@Override
	void addMeat() {
		System.out.println("\nAdding the meat: ");
		
		for(String meat : meatUsed) {
			System.out.print(meat + " ");
		}
	}

	@Override
	void addCheese() {
		System.out.println("\nAdding the cheese: ");
		
		for(String cheese : cheeseUsed) {
			System.out.print(cheese + " ");
		}
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
