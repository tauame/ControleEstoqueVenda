package br.unisc.model;

/**
 *
 * @author Usuario
 */
public class Produto {
    
    private int cod_produto;
    private String nome;
    private String cod_barras;
    private String fabricante;
    private String modelo;

    public int getCodProd() {
        return cod_produto;
    }

    public void setCodProd(int cod_produto) {
        this.cod_produto = cod_produto;
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
