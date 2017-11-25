package org.paradigma.ex4;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) throws IOException {
		Path arquivo = Paths.get("linguagens.csv");
		
		List<LinguagemProgramacao> linguagens =
				Files.lines(arquivo)
					.map(linha -> linha.split(";"))
					.map(arr -> new LinguagemProgramacao(arr[0], arr[1], arr[2], Integer.parseInt(arr[3])) )
					.filter( l -> l.getAnoCriacao() == 1995)
					.collect(Collectors.toList())					
				;
		
		linguagens.forEach(System.out::println);
		

	}

}
