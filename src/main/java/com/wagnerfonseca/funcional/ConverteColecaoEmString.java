package com.wagnerfonseca.funcional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConverteColecaoEmString {

	public static void main(String[] args) {
		List<String> pessoas = 
				Arrays.asList("Antonio", "Luis", "Joao", "Maria", "Pedro", "Angelica", "Juliana", "Andressa", "Marcelo", "Sergio", "Michele", "Jose", "Suzana", "Matheus", "Tiago", "Daiane", "Daniel", "Monise", "Welisson", "Priscila");
		
		System.out.println(String.join(",", pessoas));
		
		String result = pessoas.stream().collect(Collectors.joining(" - "));
		System.out.println(result);

	}

}
