package product;

import java.util.Calendar;
import java.text.SimpleDateFormat;

public class BBBoleto implements Boleto {
	private String sacado;
	private String cedente;
	private double valor;
	private Calendar vencimento;
	private int nossoNumero;
	
	public BBBoleto(String sacado, String cedente, double valor, Calendar vencimento,
			int nossoNumero) {
		this.sacado = sacado;
		this.cedente = cedente;
		this.valor = valor;
		this.vencimento = vencimento;
		this.nossoNumero = nossoNumero;	
	}
	
	public String getSacado() {
		return this.sacado;
	}
	
	public String getCedente() {
		return this.cedente;
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public Calendar getVencimento() {
		return this.vencimento;
	}
	
	public int getNossoNumero() {
		return this.nossoNumero;
	}
	
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Boleto BB\n");
		
		stringBuilder.append("Sacado: " + this.sacado + "\n");
		
		stringBuilder.append("Cedente: " + this.cedente + "\n");
		
		stringBuilder.append("Valor: " + this.valor + "\n");
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String format = simpleDateFormat.format(this.vencimento.getTime());
		stringBuilder.append("Vencimento: " + format + "\n");
		
		stringBuilder.append("Nosso Número: " + this.nossoNumero + "\n");
		
		return stringBuilder.toString();
	}
	

}
