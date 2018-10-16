package visitor;

public class Telefonista extends Funcionario {
	private int ramal;
	
	public Telefonista(String nome, double salario, int ramal) {
		super(nome, salario);
		this.ramal = ramal;
	}
	
	public int getRamal() {
		return ramal;
	}
	
	public void aceita(AtualizadorFuncionario atualizador) {
		atualizador.atualiza(this);
	}

}
