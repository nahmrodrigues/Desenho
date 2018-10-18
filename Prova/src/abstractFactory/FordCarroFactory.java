package abstractFactory;

public class FordCarroFactory implements CarroFactory {

	public Sedan criaSedan(String nome) {
		Sedan sedan = new SedanFord(nome);
		System.out.println("Criando um Ford " + sedan.getNome());
		return sedan;
	}
	
	public Popular criaPopular(String nome) {
		Popular popular = new PopularFord(nome);
		System.out.println("Criando um Ford " + popular.getNome());
		return popular;
	}
}
