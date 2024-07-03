/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mariana
 */
public class Livro implements Serializable{
    
    private static final long serialVersionUID =1L;
    private Integer idLivro;
    private String titulo;
    private String autor;
    private String editota;
    private Integer numPag;
    
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
}
