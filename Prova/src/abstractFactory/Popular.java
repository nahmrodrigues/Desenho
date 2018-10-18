package abstractFactory;

public abstract class Popular {
	private String nome;
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void passeia() {
		System.out.println("O carro popular " + getNome() + " está passeando.");
	}
}
