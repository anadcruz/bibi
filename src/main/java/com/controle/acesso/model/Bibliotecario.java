/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controle.acesso.model;

/**
 *
 * @author anacl
 */
public class Bibliotecario {
    private String nome;
    private int id;
    private String email;
    private int idade;
    private int senha;
    
    public String getNome(){
    return nome;
}
    public void setNome(String newNome){
    nome = newNome;
    }
    
    public int getIdade(){
    return idade;
    }

    public void setIdade(int newIdade){
    this.idade=newIdade;
    }
    
     public int getSenha(){
    return senha;
    }

    public void setSenha(int newSenha){
    this.senha=newSenha;
    }
    
    public int getid(){
    return id;
}

    public void setid(int newid){
    this.id=newid;
}
    public String getemail(){
    return email;
}
    public void setemail(String newemail){
    nome = newemail;
    }
}
