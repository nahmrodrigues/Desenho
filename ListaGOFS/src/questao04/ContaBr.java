package questao04;

public class ContaBr extends Conta {
	
	public void confirmaCadastro(String usuario) {
		System.out.println("Conta do usuário " + usuario + " criada com sucesso.");
		cadastrado = true;
	}
}
