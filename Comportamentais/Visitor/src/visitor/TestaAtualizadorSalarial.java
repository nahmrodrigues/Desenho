package visitor;

import java.util.List;
import java.util.ArrayList;

public class TestaAtualizadorSalarial {
	
	public static void main(String[] args) {
		List<Departamento> lista = new ArrayList<Departamento>();
		Departamento departamento = new Departamento("Departamento 1");
		
		Gerente gerente = new Gerente("Gerente 1", 1500, "1234");
		Telefonista telefonista = new Telefonista("Telefonista", 1000, 2);
		
		departamento.getFuncionarios().add(gerente);
		departamento.getFuncionarios().add(telefonista);
		
		lista.add(departamento);
		
		Departamento departamento2 = new Departamento("Departamento 2");
		
		Gerente gerente2 = new Gerente("Gerente 2", 1800, "1234");
		Gerente gerente3 = new Gerente("Gerente 3", 1800, "1234");
		Telefonista telefonista2 = new Telefonista("Telefonista 2", 1200, 1);
		
		departamento.getFuncionarios().add(gerente2);
		departamento.getFuncionarios().add(gerente3);
		departamento.getFuncionarios().add(telefonista2);
		
		lista.add(departamento2);
		
		AtualizadorFuncionario atualizador = new AtualizadorSalarial();
		
		for(Departamento d : lista) {
			d.aceita(atualizador);
		}
		
		for(Departamento d : lista) {
			for(Funcionario f : d.getFuncionarios()) {
				System.out.println("Nome: " + f.getNome() + " - Salário: " + f.getSalario());
			}
		}
	}

}
