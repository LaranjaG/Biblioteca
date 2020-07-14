/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Para o
empréstimo é necessário saber a data de início do empréstimo e definir a data de retorno do
livro. A data de retorno definitiva é definida no ato de entrega do livro, quando também é
calculada a multa.
*/
package com.biblioteca.gabrielneto;


/**
 *
 * @author 0479
 */
public class Emprestimo {
    private String dataEmprestimo;
    private String dataPrevisao;
    private String dataDevolucao;
    private double multa;
    private int renovar;

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataPrevisao() {
        return dataPrevisao;
    }

    public void setDataPrevisao(String dataPrevisao) {
        this.dataPrevisao = dataPrevisao;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public void setRenovar(int renovar) {
        this.renovar = renovar;
    }
    
    
    

    
    
    
    
    
    
}
