package main;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import leituraarq3.Leituraarq3;
import java.util.ArrayList;

public class fila {

    public static void main(String[] args) {
        ArrayList<Regpro> lista = new ArrayList<>();
        int elementos = 3;
        int contador = 0;
        lista = Leituraarq3.lerarquivos();
        Queue fila = new LinkedList();

        for (Regpro arquivos : lista) {
            fila.add(arquivos);
        }

        for (Regpro arquivos : lista) {
            fila.poll();
            contador++;
            if (contador == elementos) {
                break;
            }
        }

        for (Regpro arquivos : lista) {
            Regpro pasta = (Regpro) fila.peek();

            if (pasta != null) {
                System.out.println("Código: " + pasta.getCodigo());
                System.out.println("Descrição: " + pasta.getDescricao());
                System.out.println("Preço: " + pasta.getPreco());
                System.out.println("Quantidade: " + pasta.getQtd());
                System.out.println("Categoria: " + pasta.getCategoria());
                System.out.println("");
                fila.poll();
            }
        }

    }
}
// Alunos:
// Everson Padilha Ferreira - 01608356
// Pedro Guilherme Monteiro Wanderley - 01607163
// Elisa Tayná da Silva - 01607103
// Luiz Antônio Fonseca 01569641