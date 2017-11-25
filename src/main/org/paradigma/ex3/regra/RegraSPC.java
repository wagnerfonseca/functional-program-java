package org.paradigma.ex3.regra;

import org.paradigma.ex3.Cliente;

public class RegraSPC extends CadeiaRegras {
	
	public RegraSPC() {
		super(null);
	}

	public RegraSPC(Regra proximaRegra) {
		super(proximaRegra);
	}

	@Override
	public boolean aplicar(Cliente cliente) {
		if (!cliente.isRestricoesSPC())
			return aplicarProximaRegra(cliente);
		return false;
	}

}
