package questao04;

public class TestaContaFactory {
	
	public static void main(String[] args) {
		String br = "BR";
		String usa = "USA";
		
		ContaFactory factory = new ContaFactory();
		
		Conta contabr = factory.criaConta(br);
		contabr.cadastra("nahmrodrigues", "1234");
		contabr.cadastra("nahmrodrigues", "1234");
		
		Conta contausa = factory.criaConta(usa);
		contausa.cadastra("nahmrodrigues", "1234");
		contausa.cadastra("nahmrodrigues", "1234");		
	}

}
