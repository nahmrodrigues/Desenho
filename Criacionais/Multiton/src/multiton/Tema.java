package multiton;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class Tema {
	private String nome;
	private Color corDeFundo;
	private Color corDaFonte;
	
	private static Map<String, Tema> temas = new HashMap<String, Tema>();
	
	public static final String SKY = "Sky";
	public static final String FIRE = "Fire";
	
	static {
		Tema tema1 = new Tema();
		tema1.setNome(Tema.SKY);
		tema1.setCorDeFundo(Color.BLUE);
		tema1.setCorDaFonte(Color.BLACK);
		
		Tema tema2 = new Tema();
		tema2.setNome(Tema.FIRE);
		tema2.setCorDeFundo(Color.RED);
		tema2.setCorDaFonte(Color.WHITE);
		
		temas.put(tema1.getNome(), tema1);
		temas.put(tema2.getNome(), tema2);
	}
	
	private Tema() {
	}
	
	public static Tema getInstance(String nomeDoTema) {
		return Tema.temas.get(nomeDoTema);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Color getCorDeFundo() {
		return corDeFundo;
	}
	
	public void setCorDeFundo(Color corDeFundo) {
		this.corDeFundo = corDeFundo;
	}
	
	public Color getCorDaFonte() {
		return corDaFonte;
	}
	
	public void setCorDaFonte(Color corDaFonte) {
		this.corDaFonte = corDaFonte;
	}

}
