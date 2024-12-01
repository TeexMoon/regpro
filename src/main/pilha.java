package main;

import leituraarq3.Leituraarq3;
import java.util.Stack;
import java.util.ArrayList;

public class pilha {

    public static void main(String[] args) {
        ArrayList<Regpro> lista = new ArrayList<>();
        int elementos = 3;
        int contador = 0;
        lista = Leituraarq3.lerarquivos();
        Stack<Regpro> pilha = new Stack<>();

        for (Regpro arquivos : lista) {
            pilha.push(arquivos);
        }
        for (Regpro arquivos : lista) {
            pilha.pop();
            contador++;

            if (contador == elementos) {
                break;
            }
        }
        while (!pilha.isEmpty()) {
            Regpro pasta = pilha.pop();
            System.out.println("Código: " + pasta.getCodigo());
            System.out.println("Descrição: " + pasta.getDescricao());
            System.out.println("Preço: " + pasta.getPreco());
            System.out.println("Quantidade: " + pasta.getQtd());
            System.out.println("Categoria: " + pasta.getCategoria());
            System.out.println("");
        }
    }
}

// Alunos:
// Everson Padilha Ferreira - 01608356
// Pedro Guilherme Monteiro Wanderley - 01607163
// Elisa Tayná da Silva - 01607103
// Luiz Antônio Fonseca 01569641