package templateMethod;

public class SandwichSculptor {
	
	public static void main(String[] args) {
		
		Hoagie cust12Hoagie = new ItalianHoagie();
		Hoagie cust13Hoagie = new VeggieHoagie();
		
		cust12Hoagie.makeSandwich();
		cust13Hoagie.makeSandwich();
	}

}
