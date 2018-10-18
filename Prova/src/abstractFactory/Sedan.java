package abstractFactory;

public abstract class Sedan {
	private String nome;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void viaja() {
		System.out.println("O carro sedan " + getNome() + " está viajando com muita bagagem no porta-malas.");
	}
}
