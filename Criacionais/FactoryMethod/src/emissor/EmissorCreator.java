package emissor;

public class EmissorCreator {
	public static final int SMS = 0;
	public static final int EMAIL = 1;
	public static final int JMS = 2;
	
	public Emissor create(int tipoEmissor) {
		
		if(tipoEmissor == EmissorCreator.SMS) {
			return new EmissorSMS();
		}
		else if(tipoEmissor == EmissorCreator.EMAIL) {
			return new EmissorEmail();
		}
		else if(tipoEmissor == EmissorCreator.JMS) {
			return new EmissorJMS();
		}
		else {
			throw new IllegalArgumentException("Tipo de emissor não suportado");
		}
	}

}
