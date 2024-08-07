/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.biblioteca.service;

/**
 *
 * @author anacl
 */
public class CadastroAluno {
    
    private int matricula;
    private String cpfAluno;
    private String nomeAluno;
    private String curso;
    private String email;
    private String senha;
    private int telefone; 

    // Default constructor
    public CadastroAluno() {
    }

    public CadastroAluno(int matricula, String cpfAluno, String nomeAluno, String curso, String email, String senha, int telefone) {
        this.matricula = matricula;
        this.cpfAluno = cpfAluno;
        this.nomeAluno = nomeAluno;
        this.curso = curso;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCpfAluno() {
        return cpfAluno;
    }

    public void setCpfAluno(String cpfAluno) {
        this.cpfAluno = cpfAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
