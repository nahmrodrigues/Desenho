package questao05;

public class ContaJogador implements Conta {
	
	private String email;
	private String senha;
	private boolean logado = false;
	
	private ContaObserver emailEmissor = new EmailEmissor();
	
	public ContaJogador(String email, String senha) {
		this.email = email;
		this.senha = senha;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public void login(String email, String senha) {
		if(email.equals(this.email) && senha.equals(this.senha)) {
			System.out.println("Jogador logado no sistema!");
			this.logado = true;
			notifica();
		}
		else {
			System.out.println("Não foi possível fazer o login.");
		}
	}

	@Override
	public void logout() {
		System.out.println("Jogador saiu do sistema.");
		logado = false;
	}

	@Override
	public void notifica() {
		emailEmissor.enviaEmail(email);
	}

}
