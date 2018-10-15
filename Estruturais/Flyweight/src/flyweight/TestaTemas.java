package flyweight;

public class TestaTemas {
	
	public static void main(String[] args) {
		Apresentacao a = new Apresentacao();
		a.adicionaSlide(new Slide(TemaFlyweightFactory.getTema(TemaFlyweightFactory.HASH), 
				"Structural Pattern Flyweight",
				"Entendendo o padrão Flyweight.\n"));
		
		a.imprime();
	}

}
