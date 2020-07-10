/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Para as teses é relevante
armazenar seu título, sua data de publicação, as outras publicações que ela faz referência, o
autor da tese, o número de páginas, resumo, data da defesa e a instituição na qual a tese foi
defendida.
*/
package com.biblioteca.gabrielneto;

/**
 *
 * @author 0479
 */
public class Teses extends Publicacoes{
    
    private int nrPaginas;
    private String resumo;
    private String dataDefesa;
    private String instituicaoDefesa;

    public int getNrPaginas() {
        return nrPaginas;
    }

    public void setNrPaginas(int nrPaginas) {
        this.nrPaginas = nrPaginas;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getDataDefesa() {
        return dataDefesa;
    }

    public void setDataDefesa(String dataDefesa) {
        this.dataDefesa = dataDefesa;
    }

    public String getInstituicaoDefesa() {
        return instituicaoDefesa;
    }

    public void setInstituicaoDefesa(String instituicaoDefesa) {
        this.instituicaoDefesa = instituicaoDefesa;
    }

    public Teses(int nrPaginas, String resumo, String dataDefesa, String instituicaoDefesa, String datadepublicacao, String titulo) {
        super(datadepublicacao, titulo);
        this.nrPaginas = nrPaginas;
        this.resumo = resumo;
        this.dataDefesa = dataDefesa;
        this.instituicaoDefesa = instituicaoDefesa;
    }
    
    
    
    
    
}
