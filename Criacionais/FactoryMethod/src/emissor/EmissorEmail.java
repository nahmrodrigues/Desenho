package emissor;

public class EmissorEmail implements Emissor{
	
	@Override
	public void envia(String mensagem) {
		System.out.println("Enviando por E-mail a mensagem: ");
		System.out.println(mensagem);
	}

}
