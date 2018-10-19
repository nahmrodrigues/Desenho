package questao04;

public class ContaFactory {
	
	public static final String BR = "BR";
	public static final String USA = "USA";

	public Conta criaConta(String pais) {
		
		if(pais.equals(BR)) {
			return new ContaBr();
		}
		else if(pais.equals(USA)) {
			return new ContaUSA();
		}
		else {
			return null;
		}
	}

}
