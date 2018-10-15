package comunicador;

import emissor.Emissor;
import receptor.Receptor;

public class TestaVisaComunicadorFactory {
	
	public static void main(String[] args) {
		ComunicadorFactory comunicadorFactory = new VisaComunicadorFactory();
		
		String transacao = "Valor = 560; Senha = 123";
		Emissor emissor = comunicadorFactory.createEmissor();
		emissor.envia(transacao);
		
		Receptor receptor = comunicadorFactory.createReceptor();
		System.out.println(receptor.recebe());
	}

}
