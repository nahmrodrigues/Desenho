package visitor;

public class Gerente extends Funcionario {
	private String senha;
	
	public Gerente(String nome, double salario, String senha) {
		super(nome, salario);
		this.senha = senha;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void aceita(AtualizadorFuncionario atualizador) {
		atualizador.atualiza(this);
	}

}
