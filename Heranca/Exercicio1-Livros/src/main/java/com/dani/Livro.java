package com.dani;

public class Livro {

    private String titulo;
    private Autor autor;
    private String genero;
    private int edicao;

    public Livro(String titulo, Autor autor, String genero, int edicao) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.edicao = edicao;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public void info(){
        System.out.println("-------------------------------------------");
        System.out.println("Titulo: " + titulo);
        System.out.println(autor.info());
        System.out.println("Genero: " + genero);
        System.out.println("Edição: " + edicao);
    }
}
