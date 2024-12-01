package leituraarq3;

import main.Regpro;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Leituraarq3 {

	public static ArrayList<Regpro> lerarquivos() {

		String caminhoArquivo = "Produto.txt";
		ArrayList<Regpro> listaDeProdutos = new ArrayList<>();
		int codigo = 0;
		String nome;
		String valors;
		double valor = 0;
		int qtd = 0;
		int categoria = 0;

		try {

			File arquivo = new File(caminhoArquivo);

			Scanner leitor = new Scanner(arquivo);
			Scanner leia = new Scanner(System.in);

			while (leitor.hasNextLine()) {
				String linha = leitor.nextLine();
				codigo = Integer.parseInt(linha.substring(0, 2));
				nome = linha.substring(3, 34);
				valors = linha.substring(36, 41);
				valor = Double.parseDouble(valors);
				valor = valor / 100;
				qtd = Integer.parseInt(linha.substring(43, 45));
				categoria = Integer.parseInt(linha.substring(46, 47));
				System.out.println(codigo + " - " + nome + " - " + valor);
				Regpro reg = new Regpro(codigo, nome, valor, qtd, categoria);
				listaDeProdutos.add(reg);

			}
			leitor.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado: " + caminhoArquivo);
		}
		return listaDeProdutos;

	}
}