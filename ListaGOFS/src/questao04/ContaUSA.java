package questao04;

public class ContaUSA extends Conta {
	
	public void confirmaCadastro(String usuario) {
		System.out.println(usuario + " user account created successfully!");
		cadastrado = true;
	}

}
