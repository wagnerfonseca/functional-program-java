package org.paradigma.colecoes;

import java.util.*;
import java.util.function.Predicate;

public class ColecoesEListas {

	public static void main(String[] args) {	

		List<String> pessoas = 
				Arrays.asList("Antonio", "Luis", "Joao", "Maria", "Pedro", "Angelica", "Juliana", "Andressa", "Marcelo", "Sergio", "Michele", "Jose", "Suzana", "Matheus", "Tiago", "Daiane", "Daniel", "Monise", "Welisson", "Priscila");
		
		
		List<String> programadores = Arrays.asList("Estagiario", "Meninin", "Adriano", "Wagner", "Jaba", "Dadonas", "Matheus", "Yuri", "Guilherme", "Molina");
			
		//pessoas.forEach(System.out::println);		
		/*final List<String> pessoasComM = new ArrayList<>();		
		for (String nome:pessoas) {
			if(nome.startsWith("M"))
				pessoasComM.add(nome);
		}		
		for (String nome1:pessoasComM) {
			System.out.println(nome1);
		}*/
		
		Predicate<String> contarComM = nome -> nome.startsWith("M");
		
		
		System.out.println(String.format("Foram encontrados %d nomes.", 
				pessoas.stream()
					.filter(contarComM)
					.count()
				));
		
		System.out.println(String.format("Foram encontrados %d nomes.", 
				programadores.stream()
					.filter(contarComM)
					.count()
				));

	}

}
