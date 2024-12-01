// Alunos:
// Everson Padilha Ferreira - 01608356
// Pedro Guilherme Monteiro Wanderley - 01607163
// Elisa Tayná da Silva - 01607103
// Luiz Antônio Fonseca 01569641

package main;

import main.fila;
import main.GravarProd;
import main.pilha;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("### MENU ###");
            System.out.println("1. Chamar Gravador");
            System.out.println("2. Chamar Fila");
            System.out.println("3. Chamar Pilha");
            System.out.println("0. Sair do programa");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.println("Chamando Gravador...");
                    GravarProd.main(args);
                    break;
                case 2:
                    System.out.println("Chamando FIla...");
                    fila.main(args);
                    break;
                case 3:
                    System.out.println("Chamando Pilha...");
                    pilha.main(args);
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Escolha novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
