package emissor;

public class EmissorCreator {
	public static final int VISA = 0;
	public static final int MASTERCARD = 1;
	
	public Emissor create(int tipoEmissor) {
		
		if(tipoEmissor == EmissorCreator.VISA) {
			return new EmissorVisa();
		}
		else if (tipoEmissor == EmissorCreator.MASTERCARD) {
			return new EmissorMasterCard();
		}
		else {
			throw new IllegalArgumentException("Tipo de emissor não suportado");
		}
	}

}
