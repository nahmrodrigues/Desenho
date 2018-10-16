package visitor;

public class AtualizadorSalarial implements AtualizadorFuncionario {
	
	public void atualiza(Gerente g) {
		g.setSalario(g.getSalario() * 1.43);
	}
	
	public void atualiza(Telefonista t) {
		t.setSalario(t.getSalario() * 1.27);		
	}
}
