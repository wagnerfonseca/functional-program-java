package com.wagnerfonseca.regras;

public abstract class CadeiaRegras implements Regra {
	
	/*
	 * Lista de regras
	 * */
	
	private Regra proxima;
	
	public CadeiaRegras(Regra proximaRegra) {
		proxima = proximaRegra;
	}
	
	protected boolean aplicarProximaRegra(Cliente cliente) {
		if (proxima == null) {
			return true;
		}
		return proxima.aplicar(cliente);
	}

}
