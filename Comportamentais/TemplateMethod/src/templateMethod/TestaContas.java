package templateMethod;

public class TestaContas {
	
	public static void main(String[] args) {
		Conta contaCorrente = new ContaCorrente();
		Conta contaPoupanca = new ContaPoupanca();
		
		contaCorrente.deposita(100);
		contaCorrente.saca(10);
		
		contaPoupanca.deposita(100);
		contaPoupanca.saca(10);
		
		System.out.println("Sald da CC: " + contaCorrente.getSaldo());
		System.out.println("Saldo da CP: " + contaPoupanca.getSaldo());
	}

}
