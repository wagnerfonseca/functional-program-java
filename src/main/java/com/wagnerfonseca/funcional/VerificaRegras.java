package com.wagnerfonseca.funcional;

import com.wagnerfonseca.regras.Cliente;
import com.wagnerfonseca.regras.Regra;
import com.wagnerfonseca.regras.RegraPagamentoAtraso;
import com.wagnerfonseca.regras.RegraSPC;
import com.wagnerfonseca.regras.RegraSalario;
import com.wagnerfonseca.regras.RegrasTempoEmprego;

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
