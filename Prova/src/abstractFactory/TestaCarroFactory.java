package abstractFactory;

public class TestaCarroFactory {

	public static void main(String[] args) {
		
		CarroFactory fiatFactory = new FiatCarroFactory();
		
		Sedan siena = fiatFactory.criaSedan("Siena");
		Popular palio = fiatFactory.criaPopular("Pálio");
		
		siena.viaja();
		palio.passeia();
		
		CarroFactory fordFactory = new FordCarroFactory();
		
		Sedan fiestaSedan = fordFactory.criaSedan("Fiesta Sedan");
		Popular fiesta = fordFactory.criaPopular("Fiesta");
		
		fiestaSedan.viaja();
		fiesta.passeia();
	
	}
	
}
