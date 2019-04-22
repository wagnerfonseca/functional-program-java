package com.wagnerfonseca.regras;


public class RegraPagamentoAtraso extends CadeiaRegras {

	public RegraPagamentoAtraso() {
		super(null);
	}
	
	public RegraPagamentoAtraso(Regra proximaRegra) {
		super(proximaRegra);
	}

	@Override
	public boolean aplicar(Cliente cliente) {
		// se não possui nenhuma restricao por atraso passa para a proxima regra
		if (!cliente.temPagamentosAtraso()) {
			return aplicarProximaRegra(cliente);
		}
		return false;
	}

}
