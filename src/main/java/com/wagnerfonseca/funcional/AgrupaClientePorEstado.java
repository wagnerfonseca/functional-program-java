package com.wagnerfonseca.funcional;

import java.util.*;
import java.util.stream.Collectors;

import com.wagnerfonseca.model.Cliente;


public class AgrupaClientePorEstado {
	
	public static Map<String, List<Cliente>> agrupaPorEstado(List<Cliente> clientes) {
		
		return clientes.stream()
				.collect(Collectors.groupingBy(Cliente::getEstado));
				 
		
		/*Map<String, List<Cliente>> porEstado = new HashMap<>();
		
		// Percorrer minha lista de 
		for(Cliente c: clientes) {
			String estado =  c.getEstado();
			
			// Crio mais uma nova coleção para adicionar os clientes por estado		
			List<Cliente> clienteEstados = porEstado.get(estado);
						
			if (clienteEstados == null) {
				clienteEstados = new ArrayList<>();
				porEstado.put(estado, clienteEstados);
			}
			
			clienteEstados.add(c);
		}
		
		return porEstado;*/
	}

	public static void main(String[] args) {
		List<Cliente> clientes = 
				Arrays.asList(
					new Cliente("Ana", "São Paulo", "SP", 32),
					new Cliente("Julia", "Ceara", "CE", 26),
					new Cliente("João", "Joao Pessoa", "PB", 47),
					new Cliente("Alan", "Araraquara", "SP", 59),
					new Cliente("Mirian", "Curitiba", "PR", 23),					
					new Cliente("Nikola", "Campo Grande", "MS", 17),
					new Cliente("Luis", "Londrina", "PR", 87),
					new Cliente("Mario", "Brasilia", "DF", 35),
					new Cliente("Marta", "Ribeirão Preto", "SP", 18),
					new Cliente("Andréia", "Recife", "PE", 18),
					new Cliente("Pedro", "Recife", "PE", 16),
					new Cliente("Rosangela", "Joao Pessoa", "PB", 33)					
				);
		
		// Crio um Map (lista chave/valor) onde minha chave é o ESTADO
		Map<String, List<Cliente>> clientesPorEstado = agrupaPorEstado(clientes);
		
		for (String estado: clientesPorEstado.keySet())
			System.out.println(estado + ": " + clientesPorEstado.get(estado));
		
	}

}
