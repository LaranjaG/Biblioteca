/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biblioteca.gabrielneto;

import java.util.ArrayList;

/**
 *
 * @author 0479
 */
public class Biblioteca {
    
    
    private String nome;
    private String endereco;
    private ArrayList <Publicacoes> publicacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Publicacoes> getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(ArrayList<Publicacoes> publicacao) {
        this.publicacao = publicacao;
    }

    public Biblioteca(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.publicacao = new ArrayList<>();
    }
    
    
    
    
    
    
    
}
