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
    
    private static final long serialVersionUID =1L;
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
    
    
    public String get.Titulo() {
        return titulo;
    }
    public void set.Titulo (string titulo) {
        this.titulo = titulo;
    }
    
    
    public String get.Autor() {
        return autor;
    }
    public void set.Autor (string autor) {
        this.autor = autor;
    }

    
    public String get.Editora() {
        return editora;
    }
    public void set.Editora (string editora) {
        this.editora = editora;
    }
    
    
    public String get.Sinopse() {
        return sinopse;
    }
    public void set.Sinopse (string sinopse) {
        this.sinopse = sinopse;
    }
    
    
    public String get.Idioma() {
        return idioma;
    }
    public void set.Idioma (string idioma) {
        this.idioma = idioma;
    }
    
    
    public Integer get.DataPublic() {
        return dataPublic;
    }
    public void set.DataPublic (Integer dataPublic) {
        this.dataPublic = dataPublic;
    }

    
    public Integer get.NumPag() {
        return numPag;
    }
    public void set.NumPag (Integer numPag) {
        this.numPag = numPag;
    }
    
    
    public Integer get.QuantExemplares() {
        return quantExemplares;
    }
    public void set.QuantExemplares (Integer quantExemplares) {
        this.quantExemplares = quantExemplares;
    }
    
    
    public String get.PdfDispo() {
        return pdfDispo;
    }
    public void set.PdfDispo (string pdfDispo) {
        this.pdfDispo = pdfDispo;
    }

    public static void main(String[] args){
    
    }
    
}


