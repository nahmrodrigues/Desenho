package questao05;

public class TestaContaObserver {
	
	public static void main(String[] args) {
		
		Conta conta = new ContaJogador("nataliamrq@gmail.com", "1234");
		
		conta.login("nataliamrq@gmail.com", "1234");
		conta.logout();
	}

}
