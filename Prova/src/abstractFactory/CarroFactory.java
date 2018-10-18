package abstractFactory;

public interface CarroFactory {
	
	Sedan criaSedan(String nome);
	Popular criaPopular(String nome);
}
