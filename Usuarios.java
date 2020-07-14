/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
São informações relevantes do usuário: Nome, telefone, email e cpf.
*/
package com.biblioteca.gabrielneto;

import java.util.ArrayList;

/**
 *
 * @author 0479
 */
public abstract class Usuarios {
    
    private String nome;
    private String telefone;
    private String email;
    private int cpf; 
    private ArrayList<Emprestimo> emprestimo ;

    public ArrayList<Emprestimo> getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(ArrayList<Emprestimo> emprestimo) {
        this.emprestimo = emprestimo;
    }
    
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public Usuarios(String nome, String telefone, String email, int cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.emprestimo = new ArrayList <>();
    }

    public Usuarios(String nome) {
        this.nome = nome;
    }
    
    
    
        public void addEmprestimo( Emprestimo emprestimo){
        this.emprestimo.add(emprestimo);
    }
    
    
    
}
