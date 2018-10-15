package director;

import builder.BoletoBuilder;
import builder.BBBoletoBuilder;
import product.Boleto;

public class TestaGeradorDeBoleto {
	public static void main(String[] args) {
		BoletoBuilder boletoBuilder = new BBBoletoBuilder();
		GeradorDeBoleto geradorDeBoleto = new GeradorDeBoleto(boletoBuilder);
		Boleto boleto = geradorDeBoleto.geraBoleto();
		System.out.println(boleto);
	}

}
