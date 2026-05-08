package com.libraryLoan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner input = new Scanner(System.in);

        System.out.println("Bem vindo ao Lybrary Loan!");
        System.out.println("Deseja ver a lista de livros? (s/n)");
        String escolha = input.next().trim().toLowerCase();

        while (escolha.startsWith("s")) {
            biblioteca.listarLivrosDisponiveis();

            System.out.println("\nQual ID do livro deseja pegar?");
            if (input.hasNextInt()) {
                int id = input.nextInt();
                input.nextLine();

                System.out.println("Digite o nome do cliente:");
                String nomeCliente = input.nextLine();

                biblioteca.emprestarLivro(id, nomeCliente);
            } else {
                System.out.println("Por favor, digite um número valido.");
                input.next();
            }

            System.out.println("\nDeseja pegar outro livro emprestado? (s/n)");
            escolha = input.next().trim().toLowerCase();
        }

        System.out.println("Volte Sempre, Saindo do sistema...");
        input.close();
    }
}