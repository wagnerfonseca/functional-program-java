package org.paradigma.ex3;

import org.paradigma.ex3.regra.Regra;
import org.paradigma.ex3.regra.RegraPagamentoAtraso;
import org.paradigma.ex3.regra.RegraSPC;
import org.paradigma.ex3.regra.RegraSalario;
import org.paradigma.ex3.regra.RegrasTempoEmprego;

public class VerificaRegras {
	
	public static void avaliar(Cliente cliente, Regra regra) {
		String resultado = regra.aplicar(cliente) ? "aceito" : "recusado";
		System.out.println("Resultado: " + resultado);
	}

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Zé Ninguem", 2357.10, 2, false, true);
		
		avaliar(cliente, new RegraSalario(new RegraSPC()));
		
		avaliar(cliente, new RegraSalario(new RegrasTempoEmprego(new RegraSPC())));
		
		avaliar(cliente, 
				new RegraSalario(
						new RegrasTempoEmprego(
								new RegraSPC(
										new RegraPagamentoAtraso()
										))));

	}

}
