package com.libraryLoan;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public Biblioteca() {
        Autor autorPadrao = new Autor(1, "J.K. Rowling", LocalDate.of(1965, 7, 31));
        autores.add(autorPadrao);

        livros.add(new Livro(1, "Harry Potter e a Pedra Filosofal", autorPadrao));
        livros.add(new Livro(2, "Harry Potter e a Camara Secreta", autorPadrao));
        livros.add(new Livro(3, "Harry Potter e o Calice de Fogo", autorPadrao));
    }

    public void adicionarAutor(Autor autor) {
        this.autores.add(autor);
    }

    public void adicionarLivro(Livro novoLivro) {
        this.livros.add(novoLivro);
    }

    public void listarLivrosDisponiveis() {
        boolean temLivro = false;
        System.out.println("\nLivros disponiveis para emprestimo:");
        for (Livro l : livros) {
            if (l.isDisponivel()) {
                System.out.println(l.getIdLivro() + " - " + l.getTitulo() + " (Autor: " + l.getAutor().getNome() + ")");
                temLivro = true;
            }
        }
        if (!temLivro) {
            System.out.println("No momento nao temos livros disponiveis para emprestimo");
        }
    }

    public void emprestarLivro(int idEscolhido, String nomeCliente) {
        boolean encontrado = false;

        for (Livro livro : livros) {
            if (livro.getIdLivro() == idEscolhido) {
                encontrado = true;

                if (livro.isDisponivel()) {
                    livro.setDisponivel(false);
                    int idEmprestimo = emprestimos.size() + 1;
                    Emprestimo novoEmprestimo = new Emprestimo(idEmprestimo, livro, nomeCliente);
                    emprestimos.add(novoEmprestimo);
                    System.out.println("Voce pegou emprestado: " + livro.getTitulo() + ", boa leitura!");
                } else {
                    System.out.println("Desculpe, o livro '" + livro.getTitulo() + "' ja esta emprestado.");
                }
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Erro: Não encontramos nenhum livro com o ID " + idEscolhido);
        }
    }
}