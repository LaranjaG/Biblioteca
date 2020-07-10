/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biblioteca.gabrielneto;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author 0479
 */
public class Artigos extends Publicacoes{
    
    private String resumo;

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public Artigos(String resumo, String datadepublicacao, String titulo) {
        super(datadepublicacao, titulo);
        this.resumo = resumo;
    }
    

    
       
}
