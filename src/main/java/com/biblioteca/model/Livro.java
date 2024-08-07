/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.biblioteca.model;

/**
 *
 * @author anacl
 */
public class Livro {
    
    public int idLivro;
    public String titulo;
    private String autor;
    private String editora;
    private String edicao;
    private String sinopse;
    private String idioma;
    private int dataPublic;
    private int numPag;
    private int quantExemplares;
    private boolean pdfDispo;
  
    // Getters e Setters
    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getDataPublic() {
        return dataPublic;
    }

    public void setDataPublic(int dataPublic) {
        this.dataPublic = dataPublic;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public int getQuantExemplares() {
        return quantExemplares;
    }

    public void setQuantExemplares(int quantExemplares) {
        this.quantExemplares = quantExemplares;
    }

    public boolean isPdfDispo() {
        return pdfDispo;
    }

    public void setPdfDispo(boolean pdfDispo) {
        this.pdfDispo = pdfDispo;
    }
}