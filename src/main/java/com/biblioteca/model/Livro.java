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
    
    private final String titulo;
    private final int idLivro;
    private String nome;
    public String getTitulo;
    public String getidLivro;
    

    public Livro(String titulo, int idLivro) {
        this.titulo = titulo;
        this.idLivro = idLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getIdLivro() {
        return idLivro;
    }
}

   
