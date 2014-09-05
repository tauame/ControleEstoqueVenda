package br.unisc.model;

/**
 *
 * @author Eduardo
 */
public class Estoque {
    private int cod_estoque;
    private int cod_produto;
    private int qtd_produto;
    private String validade;

    public int getCod_estoque() {
        return cod_estoque;
    }

    public void setCod_estoque(int cod_estoque) {
        this.cod_estoque = cod_estoque;
    }

    public int getCod_produto() {
        return cod_produto;
    }

    public void setCod_produto(int cod_produto) {
        this.cod_produto = cod_produto;
    }

    public int getQtd_produto() {
        return qtd_produto;
    }

    public void setQtd_produto(int qtd_produto) {
        this.qtd_produto = qtd_produto;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }
}
