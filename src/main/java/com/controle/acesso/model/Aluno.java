/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controle.acesso.model.Usuario;

/**
 *
 * @author anacl
 */
public class Aluno {
    
    private String nome;
    private int id;
    private int senha;
    
    private String email;
    
    public String getNome(){
    return nome;
}
    public void setNome(String newNome){
    nome = newNome;
    }
    
    
     public int getId(){
    return id;
    }

    public void setId(int newId){
    this.id=newId;
    }
    
     public int getSenha(){
    return senha;
    }

    public void setSenha(int newSenha){
    this.senha=newSenha;
    }
    
     public String getEmail(){
    return email;
    }

    public void setEmail(String newEmail){
    this.email=newEmail;
    }
            
}
