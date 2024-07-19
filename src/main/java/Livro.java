/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ;

/**
 *
 * @author mariana
 */
public class Livro {
    private int idLivro;
    private String titulo;
    private String autor;
    private String editora;
    private String edicao;
    private String sinopse;
    private String idioma;
    private int dataPublic;
    private int numPag;
    private int quantExemplares;
    private booleano pdfDispo;
    
    
    public Livro () {
    }
    
    public Livro (Integer idLivro) {
        this.idLivro = idLivro;
    }
    
    public int getIdLivro() {
        return idLivro;
    }
    
    public void setIdLivro (int idLivro) {
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
    
    
    public int getDataPublic() {
        return dataPublic;
    }
    public void setDataPublic (int dataPublic) {
        this.dataPublic = dataPublic;
    }

    
    public int getNumPag() {
        return numPag;
    }
    public void setNumPag (int numPag) {
        this.numPag = numPag;
    }
    
    
    public int getQuantExemplares() {
        return quantExemplares;
    }
    public void setQuantExemplares (int quantExemplares) {
        this.quantExemplares = quantExemplares;
    }
    
    
    public String getPdfDispo() {
        return pdfDispo;
    }
    public void setPdfDispo (String pdfDispo) {
        this.pdfDispo = pdfDispo;
    }
    
}

