package adapter;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ControleDePontoNovo {
	
	public void registra(Funcionario f, boolean entrada) {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
		String format = simpleDateFormat.format(calendar.getTime());
		
		if(entrada == true) {
			System.out.println("Entrada: " + f.getNome() + " às " + format);
		}
		else {
			System.out.println("Saída: " + f.getNome() + " às " + format);
		}
	}

}
