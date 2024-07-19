/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controle.acesso.model;

/**
 *
 * @author mariana
 */
public class Livro {
    
    //private static final long serialVersionUID =1L;
    private Integer idLivro;
    private String titulo;
    private String autor;
    private String editora;
    private String sinopse;
    private String idioma;
    private Integer dataPublic;
    private Integer numPag;
    private Integer quantExemplares;
    private String pdfDispo;
    
    
    public Livro () {
    }
    
    public Livro (Integer idLivro) {
        this.idLivro = idLivro;
    }
    
    public Integer getIdLivro() {
        return idLivro;
    }
    
    public void setIdLivro (Integer idLivro) {
        this.idLivro = idLivro;
    }
    
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo (String titulo) {
        this.titulo = titulo;
    }
    
    
    public String getAutor() {
        return autor;
    }
    public void setAutor (String autor) {
        this.autor = autor;
    }

    
    public String getEditora() {
        return editora;
    }
    public void setEditora (String editora) {
        this.editora = editora;
    }
    
    
    public String getSinopse() {
        return sinopse;
    }
    public void setSinopse (String sinopse) {
        this.sinopse = sinopse;
    }
    
    
    public String getIdioma() {
        return idioma;
    }
    public void setIdioma (String idioma) {
        this.idioma = idioma;
    }
    
    
    public Integer getDataPublic() {
        return dataPublic;
    }
    public void setDataPublic (Integer dataPublic) {
        this.dataPublic = dataPublic;
    }

    
    public Integer getNumPag() {
        return numPag;
    }
    public void setNumPag (Integer numPag) {
        this.numPag = numPag;
    }
    
    
    public Integer getQuantExemplares() {
        return quantExemplares;
    }
    public void setQuantExemplares (Integer quantExemplares) {
        this.quantExemplares = quantExemplares;
    }
    
    
    public String getPdfDispo() {
        return pdfDispo;
    }
    public void setpdfDispo (String pdfDispo) {
        this.pdfDispo = pdfDispo;
    }

    public static void main(String[] args){
    
    }
    
}


