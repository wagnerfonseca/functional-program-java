package org.paradigma.ex3.regra;

import org.paradigma.ex3.Cliente;

public class RegraSalario extends CadeiaRegras {

	public RegraSalario() {
		super(null);		
	}
	
	public RegraSalario(Regra proximaRegra) {
		super(proximaRegra);		
	}

	@Override
	public boolean aplicar(Cliente cliente) {
		if (cliente.getSalario() > 2000.0) {
			return aplicarProximaRegra(cliente);
		}
		return false;
	}

}
