package com.libraryLoan;

import java.time.LocalDate;

public class Livro {
    Integer idLivro;
    String titulo;
    Autor autor;
    Boolean disponivel;
    LocalDate dataCadastro;
    LocalDate dataAtualicacao;

    public Livro(Integer idLivro, String titulo, Boolean disponivel) {
        this.idLivro = idLivro;
        this.titulo = titulo;
        this.disponivel = disponivel;
        this.dataCadastro = LocalDate.now();
    }

    public Integer getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(Integer idLivro) {
        this.idLivro = idLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDate getDataAtualicacao() {
        return dataAtualicacao;
    }

    public void setDataAtualicacao(LocalDate dataAtualicacao) {
        this.dataAtualicacao = dataAtualicacao;
    }

}
