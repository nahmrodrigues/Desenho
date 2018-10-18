package abstractFactory;

public class FiatCarroFactory implements CarroFactory {
	
	public Sedan criaSedan(String nome) {
		Sedan sedan = new SedanFiat(nome);
		System.out.println("Criando um Fiat " + sedan.getNome());
		return sedan;
	}
	
	public Popular criaPopular(String nome) {
		Popular popular = new PopularFiat(nome);
		System.out.println("Criando um Fiat " + popular.getNome());
		return popular;
		
	}

}
