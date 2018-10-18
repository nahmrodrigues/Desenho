package decorator;

public class Mozzarela extends ToppingDecorator {

	public Mozzarela(Pizza pizza) {
		super(pizza);
		
		System.out.println("Adding Dough");
		System.out.println("Adding Mozzarela");
	}
	
	public String getDescription() {
		return pizza.getDescription() + ", Mozzarella";
	}
	
	public double getCost() {
		return pizza.getCost() + 2.00;
	}
}
