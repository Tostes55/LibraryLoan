package com.libraryLoan;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros =  new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public Biblioteca() {
        Livro l1 = new Livro(1, "Harry Potter e a Pedra Filosofal", true);
        Livro l2 = new Livro(2, "Harry Potter e a Camara Secreta", true);
        Livro l3 = new Livro(3, "Harry Potter e o Calice de Fogo", true);


        livros.add(l1);
        livros.add(l2);
        livros.add(l3);
    }
}
