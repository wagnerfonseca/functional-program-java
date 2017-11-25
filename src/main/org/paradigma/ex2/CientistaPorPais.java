package org.paradigma.ex2;

import java.util.*;

public class CientistaPorPais {

	public static void main(String[] args) {
		List<Cientista> cientistas =
				Arrays.asList(
						new Cientista("Alan Turing", 1912, "Reino Unido", "M", "Maquina de turing"),
						new Cientista("Linus Pauling", 1901, "Estados Unidos", "M", "Quimica Quantica e Vitamina C"),
						new Cientista("Blaise Pascal", 1623, "França", "M","Desenvolveu a calculadora mecânica"),
						new Cientista("Ada Lovelace", 1813, "Reino Unido", "F", "Primeira Linguagem de programação"),
						new Cientista("Charles Babbage", 1791, "Reino Unido", "M", "Primeiro computador mecânico"),
						new Cientista("John von Neumann", 1903, "Hungria", "M", "Primeiro programa armazenado em memória"),
						new Cientista("Grace Hopper", 1906, "Estados Unidos", "F", "Desenvolveu o primeiro compilador"),
						new Cientista("Andrew Stuart Tanenbaum", 1944, "Estados Unidos","M","Inventor do MINIX"),
						new Cientista("Ken Thompson",1943,"Estados Unidos","M","inventor do Unix e da codificação de caracteres UTF-8"),
						new Cientista("Nikola Tesla", 1856, "Austria","M", "Eletro magnetismo e corrente alternada")
				);

	}

}
