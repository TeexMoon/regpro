package main;

import main.Regpro;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import leituraarq3.Leituraarq3;
import java.util.ArrayList;

public class GravarProd {

    public static void main(String[] args) {
        // Alunos:
        // Everson Padilha Ferreira - 01608356
        // Pedro Guilherme Monteiro Wanderley - 01607163
        // Elisa Tayná da Silva - 01607103
        // Luiz Antônio Fonseca 01569641

        ArrayList<Regpro> listaDeProdutos = Leituraarq3.lerarquivos();

        for (Regpro produto : listaDeProdutos) {
            System.out.println("Código: " + produto.getCodigo());
            System.out.println("Descrição: " + produto.getDescricao());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println("Quantidade: " + produto.getQtd());
            System.out.println("Categoria: " + produto.getCategoria());
            System.out.println();
        }
    }

}
