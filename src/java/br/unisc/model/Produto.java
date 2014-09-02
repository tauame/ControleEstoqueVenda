/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.unisc.model;

/**
 *
 * @author Usuario
 */
public class Produto {
    
    private int cod_prod;
    private String nome;
    private String cod_barras;
    private String fabricante;
    private String modelo;

    public int getCodProd() {
        return cod_prod;
    }

    public void setCodProd(int cod_prod) {
        this.cod_prod = cod_prod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodBarras() {
        return cod_barras;
    }

    public void setCodBarras(String cod_barras) {
        this.cod_barras = cod_barras;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo){        
        this.modelo = modelo;
    }


}
