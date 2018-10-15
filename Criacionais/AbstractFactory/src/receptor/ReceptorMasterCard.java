package receptor;

public class ReceptorMasterCard implements Receptor {

	@Override
	public String recebe() {
		System.out.println("Recebendo mensagem da Master Card.") ;
		String mensagem = "Mensagem da Master Card" ;
		return mensagem ;
	}

}
