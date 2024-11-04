package com.dani;

public class Autor {

    private String nome;
    private String email;
    private String nacionalidade;

    public Autor(String titulo, String email, String nacionalidade) {
        this.nome = titulo;
        this.email = email;
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
            return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String info() {
        return String.format("-------------------------------------------\nAutor: " + "%s\nEmail: %s\nNacionalide: %s", nome, email, nacionalidade);
    }

}
