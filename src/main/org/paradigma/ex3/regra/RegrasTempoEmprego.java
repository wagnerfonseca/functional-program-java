package org.paradigma.ex3.regra;

import org.paradigma.ex3.Cliente;

public class RegrasTempoEmprego extends CadeiaRegras {

	public RegrasTempoEmprego() {
		super(null);
	}
	
	public RegrasTempoEmprego(Regra proximaRegra) {
		super(proximaRegra);
	}

	@Override
	public boolean aplicar(Cliente cliente) {
		if (cliente.getTempoEmpregado() > 0)
			return aplicarProximaRegra(cliente);
		return false;
	}

}
