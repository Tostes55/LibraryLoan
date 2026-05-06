package com.libraryLoan;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        Scanner input = new Scanner(System.in);

        System.out.println("Bem vindo ao Lybrary Loan, seu sistema para gerenciamento de livros");
        System.out.println("Deseja ver a lista de livros disponiveis? (sim/nao)");
        String escolha = input.next().trim().toLowerCase();

        switch (escolha) {
            case "sim", "s" -> {
                System.out.println(biblioteca);

        }
        case "nao" -> {
            System.out.println("Saindo do Sistemta");

        };


        }

        System.out.println("Livros disponiveis para emprestimos:");

        HashMap<Integer, String> books = new HashMap<>();
        books.put(1, "Harry Potter e a Pedra Filosofal");
        books.put(2, "Harry Potter e a Camara Secreta");
        books.put(3, "Harry Potter e o Calice de Fogo");

        books.forEach((id, nome) -> System.out.println(id + " - " + nome));

        Scanner imput = new Scanner(System.in);
        System.out.println("\nQual ID do livro deseja pegar emprestado?");

        if (imput.hasNextInt()) {
            int escolha = imput.nextInt();

            if (books.containsKey(escolha)) {
                String livroRemovido = books.get(escolha);
                books.remove(escolha);
                System.out.println("Você escolheu: " + livroRemovido);
            } else {
                System.out.println("Erro: ID " + escolha + " não encontrado.");
            }
        } else {
            System.out.println("Por favor, digite apenas números.");
        }

        System.out.println("\nLista atualizada de livros disponiveis:");
        if (books.isEmpty()) {
            System.out.println("Nenhum livro disponível no momento.");
        } else {
            books.forEach((id, nome) -> System.out.println(id + " - " + nome));
        }

        imput.close();
    }
}