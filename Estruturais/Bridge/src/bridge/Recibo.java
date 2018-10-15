package bridge;

public class Recibo implements Documento {
	private String emissor;
	private String favorecido;
	private double valor;
	private GeradorDeArquivo geradorDeArquivo;
	
	public Recibo(String emissor, String favorecido, double valor, GeradorDeArquivo geradorDeArquivo) {
		this.emissor = emissor;
		this.favorecido = favorecido;
		this.valor = valor;
		this.geradorDeArquivo = geradorDeArquivo;
	}
	
	@Override
	public void geraArquivo() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Recibo: \n");
		buffer.append("Empresa: " + this.emissor + "\n");
		buffer.append("Cliente: " + this.favorecido + "\n");
		buffer.append("Valor: " + this.valor + "\n");
		this.geradorDeArquivo.gera(buffer.toString());
	}

}
