/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biblioteca.service;

import com.biblioteca.model.Livro; 
import javax.swing.JOptionPane;


/**
 *
 * @author mariana
 */
public class ControleCadastroLivro {
    static Livro[] vetor = new Livro [25];
    static int i = 0;
    
    
    public void cadastrar (Livro biblio) {
    
            if (i < 25) {
            vetor [i] = biblio;
            System.out.println ("Livro Cadatrado com Sucesso!" + vetor [i].titulo + vetor [i].idLivro);
            i++;
            
            } else {
            JOptionPane.showMessageDialog (null, "Não há mais espaço para cadatrar novo livro.");
            
            }
    }
    public Livro [] retornaVetor (){
    return vetor;
        
    }
    
}
