package com.wagnerfonseca.funcional;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class FiltraEConta {

	private static Map<List<String>,Integer> testes = new HashMap<>();
	
	
	public static void main(String[] args) {
		
		List<String> pessoas = 
				Arrays.asList("Antonio", "Luis", "Joao", "Maria", "Pedro", "Angelica", "Juliana", "Andressa", "Marcelo", "Sergio", "Michele", "Jose", "Suzana", "Matheus", "Tiago", "Daiane", "Daniel", "Monise", "Welisson", "Priscila");
		
		testes.put(pessoas, 5); // Verifica a quantidade de pessoas que começam com a letra M
		
		Predicate<String> contarComM = nome -> nome.startsWith("M");
		
		for(List<String> in: testes.keySet()){
			System.out.print(String.format("%s\nÉ esperado: %d pessoas com a letra M", in, testes.get(in)));
			
		
			long count = pessoas.stream()
					.filter(contarComM)
					.count();
			
			
			System.out.println(String.format(" - Resultado é %b", count == testes.get(in).intValue()));
		}
		

	}

}
