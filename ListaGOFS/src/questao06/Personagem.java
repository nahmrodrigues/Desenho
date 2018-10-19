package questao06;

public class Personagem {
	
	private String nome;
	private String poder;
	private Monstro inimigo;
	
	public Personagem(String nome, String poder, Monstro inimigo) {
		this.nome = nome;
		this.poder = poder;
		this.inimigo = inimigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getPoder() {
		return poder;
	}
	
	public void setPoder(String poder) {
		this.poder = poder;
	}
	
	public Monstro getInimigo() {
		return inimigo;
	}
	
	public void setInimigo(Monstro inimigo) {
		this.inimigo = inimigo;
	}
	
	public void recebeAtaque() {
		this.inimigo.ataca();
		usaPoder();
	}
	
	public void usaPoder() {
		System.out.println(nome + " está usando seu poder de " + poder + " para deter o inimigo.");
	}

}
