package com.wagnerfonseca.funcional;

import java.util.function.Predicate;

import com.wagnerfonseca.regras.Cliente;

public class VerificaRegrasFuncional {
	
	
	
	public static void avaliar(Cliente cliente, Predicate<Cliente> regra) {			
		String resultado = regra.test(cliente) ? "aceito" : "recusado";
		System.out.println("Resultado: " + resultado);
	}

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Zé Ninguem", 2357.10, 2, false, true);
		
		  
		
		Predicate<Cliente> regraSalario = cli -> cli.getSalario() > 2000.0;
		Predicate<Cliente> regraTempoEmprego = cli -> cli.getTempoEmpregado() > 0;
		Predicate<Cliente> regraPagamentoAtraso = cli -> !cli.temPagamentosAtraso();
		Predicate<Cliente> regraSPC = cli -> !cli.temRestricoesSPC();
		
		
		avaliar(cliente, regraSalario);
		avaliar(cliente, regraSPC.and(regraSalario));
		avaliar(cliente, regraSPC.and(regraSalario).and(regraTempoEmprego));
		avaliar(cliente, regraSPC.and(regraPagamentoAtraso).and(regraTempoEmprego).and(regraSalario));

	}

}
