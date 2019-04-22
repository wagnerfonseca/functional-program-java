package com.wagnerfonseca.funcional;

import static java.util.Comparator.comparing;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.wagnerfonseca.model.Cliente;

public class FiltraDoisCampos {

	public static void main(String[] args) {
		List<Cliente> clientes = 
				Arrays.asList(
					new Cliente("Ana", "São Paulo", "SP", 32),
					new Cliente("Julia", "Ceara", "CE", 26),
					new Cliente("João", "Joao Pessoa", "PB", 47),
					new Cliente("Alan", "Araraquara", "SP", 59),
					new Cliente("Carlos", "Salvador", "BA", 77),
					new Cliente("Mirian", "Curitiba", "PR", 23),					
					new Cliente("Nikola", "Campo Grande", "MS", 17),
					new Cliente("Luis", "Londrina", "PR", 87),
					new Cliente("Tania", "Curitiba", "PR", 31),
					new Cliente("Roberto", "Uberlandia", "MG", 36),
					new Cliente("Mario", "Brasilia", "DF", 35),
					new Cliente("Helena", "Anápolis", "DF",17),
					new Cliente("Marta", "Ribeirão Preto", "SP", 18),
					new Cliente("Andréia", "Recife", "PE", 18),
					new Cliente("Matusalem", "Ji-Paraná", "RO", 97),
					new Cliente("Julio", "São Paulo", "SP", 23),
					new Cliente("Pedro", "Recife", "PE", 16),
					new Cliente("Francine", "Joinville", "SC", 19),
					new Cliente("Rosangela", "Joao Pessoa", "PB", 33),					
					new Cliente("Marcos", "Limeira", "SP", 45),					
					new Cliente("Berenice", "Cuiaba", "MT", 27)
				);
		
		System.out.println(clientes.size());
		
		Predicate<Cliente> porNomeComM = cli -> cli.getNome().startsWith("M");
		Predicate<Cliente> porEstadoSP = cli -> cli.getEstado().equals("SP");
		
		// ordenar por nome e estado
		Function<Cliente, String> porNome = cliente -> cliente.getNome();
		Function<Cliente, String> porEstado = cliente -> cliente.getEstado();		
		
		List<Cliente> temp = clientes.stream()
			.filter(porNomeComM.and(porEstadoSP).negate())			
			.collect(Collectors.toList());
		
		System.out.println(temp.stream().count());
		
		temp.stream().sorted(comparing(porEstado).thenComparing(porNome)).forEach(System.out::println);

	}

}
