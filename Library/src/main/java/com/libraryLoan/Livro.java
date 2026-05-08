package com.libraryLoan;

import java.time.LocalDate;

public class Livro {
    private Integer idLivro;
    private String titulo;
    private Autor autor;
    private Boolean disponivel;
    private LocalDate dataCadastro;
    private LocalDate dataAtualicacao;

    public Livro(Integer idLivro, String titulo, Autor autor) {
        this.idLivro = idLivro;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
        this.dataCadastro = LocalDate.now();
        this.dataAtualicacao = LocalDate.now();
    }

    public Integer getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(Integer idLivro) {
        this.idLivro = idLivro;
        this.dataAtualicacao = LocalDate.now();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
        this.dataAtualicacao = LocalDate.now();
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
        this.dataAtualicacao = LocalDate.now();
    }

    public Boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
        this.dataAtualicacao = LocalDate.now();
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public LocalDate getDataAtualicacao() {
        return dataAtualicacao;
    }

    public void setDataAtualicacao(LocalDate dataAtualicacao) {
        this.dataAtualicacao = dataAtualicacao;
    }
}