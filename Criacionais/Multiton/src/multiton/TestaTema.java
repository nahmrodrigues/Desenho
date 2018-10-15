package multiton;

public class TestaTema {
	
	public static void main(String[] args) {
		Tema temaFire = Tema.getInstance(Tema.FIRE);
		System.out.println("Tema " + temaFire.getNome());
		System.out.println("Cor da Fonte: " + temaFire.getCorDaFonte());
		System.out.println("Cor de Fundo: " + temaFire.getCorDeFundo());
		
		Tema temaFire2 = Tema.getInstance(Tema.FIRE);
		System.out.println("---------------");
		System.out.println("Comparando as referências... ");
		System.out.println(temaFire == temaFire2);
	}

}
