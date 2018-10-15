package observer;

public class Corretora implements AcaoObserver {
	private String nome;
	
	public Corretora(String nome) {
		this.nome = nome;
	}
	
	public void notificaAlteracao(Acao acao) {
		System.out.println("Corretora " + this.nome + " sendo notificada");
		System.out.println("A ação " + acao.getCodigo()
		+ " teve seu valor alterado para " + acao.getValor());
	}

}
