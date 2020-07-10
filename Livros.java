/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*Para os livros é
relevante armazenar seu título, sua data de publicação, as outras publicações que ele referencia,
seus autores, o número da edição, o nome da editora e o seu ISBN.*/

package com.biblioteca.gabrielneto;

/**
 *
 * @author 0479
 */
public class Livros extends Publicacoes{
    
    private String resumo;
    private int numeroEdicao; 
    private String nomeEditora;
    private String  isbn;

    public int getNumeroEdicao() {
        return numeroEdicao;
    }

    public void setNumeroEdicao(int numeroEdicao) {
        this.numeroEdicao = numeroEdicao;
    }

    public String getNomeEditora() {
        return nomeEditora;
    }

    public void setNomeEditora(String nomeEditora) {
        this.nomeEditora = nomeEditora;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    
    

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public Livros(String resumo, int numeroEdicao, String nomeEditora, String isbn, String datadepublicacao, String titulo) {
        super(datadepublicacao, titulo);
        this.resumo = resumo;
        this.numeroEdicao = numeroEdicao;
        this.nomeEditora = nomeEditora;
        this.isbn = isbn;
    }

    
    
    
    
}
