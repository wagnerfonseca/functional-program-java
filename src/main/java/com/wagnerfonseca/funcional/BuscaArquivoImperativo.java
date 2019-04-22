package com.wagnerfonseca.funcional;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class BuscaArquivoImperativo {

	public static void main(String[] args) throws Exception {
		String palavra = "SILVA";
		String arquivo = "nomes.txt";
			
		long contador = 0;
		List<String> linhas = Files.readAllLines(Paths.get(arquivo));
		
		for (String linha: linhas) {
			if (linha.contains(palavra))
				contador++;
		}
		
		System.out.printf("A palavra [%s] ocorreu %d vezes\n", palavra, contador);
		
		/*try (BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivo))){ //try-with-resources pode ser utilizados quando as classe implementam java.io.Closeable. e quando o objeto pode ser fecado no final do programa
			
			long contador = 0;
			String linha = null;
			
			while ((linha = bufferedReader.readLine()) != null ) {
				if (linha.contains(palavra))
					contador++;
			}
			
			
		}*/
	}

}
