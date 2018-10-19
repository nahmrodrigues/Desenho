package questao06;

public class MonstroAgua extends Monstro {

	public MonstroAgua(String nome, double potenciaDano) {
		super(nome, potenciaDano);
	}
	
	public void ataca() {
		double potencia = getDano() + getDano()*3;
		System.out.println(getNome() + " atacando com potência " + potencia);
	}

}
