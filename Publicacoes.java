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
public abstract class Publicacoes {
    
    private String datadepublicacao;
    private String titulo;
    private ArrayList<String> referencia ;
    private ArrayList<Autores> autores;   
    
    

    public String getDatadepublicacao() {
        return datadepublicacao;
    }

    public void setDatadepublicacao(String datadepublicacao) {
        this.datadepublicacao = datadepublicacao;
    }
   

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<String> getReferencia() {
        return referencia;
    }

    public void setReferencia(ArrayList<String> referencia) {
        this.referencia = referencia;
    }

    public ArrayList<Autores> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autores> autores) {
        this.autores = autores;
    }

    public Publicacoes(String datadepublicacao, String titulo) {
        this.datadepublicacao = datadepublicacao;
        this.titulo = titulo;
        this.autores = new ArrayList <>();
        this.referencia = new ArrayList <>();
    }

    
    
    public void addReferencia( String referencia){
        this.referencia.add(referencia);
    }
    
    public void addAutores( Autores autores){
        this.autores.add(autores);
    }
    
   
    
    
}
