package bridge;

public class TestaRecibo {
	public static void main(String[] args) {
		GeradorDeArquivo geradorDeArquivoTXT = new GeradorDeArquivoTXT();
		Recibo recibo = new Recibo("k19 Treinamentos", "Marcelo Martins", 1000, 
				geradorDeArquivoTXT);
		recibo.geraArquivo();
	}

}
