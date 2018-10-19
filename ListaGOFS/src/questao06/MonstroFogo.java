package questao06;

public class MonstroFogo extends Monstro {
	
	public MonstroFogo(String nome, double potenciaDano) {
		super(nome, potenciaDano);
	}
	
	public void ataca() {
		double potencia = getDano() + getDano()*0.5;
		System.out.println(getNome() + " atacando com potência " + potencia);
	}

}
