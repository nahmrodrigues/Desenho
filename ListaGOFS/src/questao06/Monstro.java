package questao06;

public abstract class Monstro {

	private String nome;
	private double potenciaDano;
	
	public Monstro(String nome, double potenciaDano) {
		this.nome = nome;
		this.potenciaDano = potenciaDano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getDano() {
		return potenciaDano;
	}
	
	public void setDano(double potenciaDano) {
		this.potenciaDano = potenciaDano;
	}
	
	public abstract void ataca();
}
