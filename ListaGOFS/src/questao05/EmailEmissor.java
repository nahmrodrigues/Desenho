package questao05;

public class EmailEmissor implements ContaObserver {
	
	public void enviaEmail(String email) {
		System.out.println("Email enviado para " + email);
	}

}
