package comunicador;

import emissor.Emissor;
import receptor.Receptor;

public interface ComunicadorFactory {
	Emissor createEmissor();
	Receptor createReceptor();

}
