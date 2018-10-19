package questao04;

public abstract class Conta {
	
	private String usuario;
	private String senha;
	
	public boolean cadastrado = false;
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	private void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void cadastra(String usuario, String senha) {
		
		if(cadastrado == false) {
			setUsuario(usuario);
			setSenha(senha);
			confirmaCadastro(usuario);
		}
		else {
			System.out.println("Conta já cadastrada.");
		}
	}
	
	public abstract void confirmaCadastro(String usuario);
}
