package models;

import services.GerarCodUnico;

public class Produto {
    private float preco;
    private String descricao;
    private float avaliacao;
    private String nomeDoProduto;
    private int idProduto;
    public int quantidade;
    private GerarCodUnico geradorId = new GerarCodUnico();

    public Produto(float preco, String descricao, String nomeDoProduto){
        this.preco = preco;
        this.descricao = descricao;
        this.nomeDoProduto = nomeDoProduto;
        this.idProduto = geradorId.gerarCodRandom();
    }

    public boolean pagar(int valorPago) {
        if(valorPago == preco) {
            System.out.println("Produto: " + nomeDoProduto + ", Estoque: " + quantidade);

            return true;
        }  else if (valorPago < preco) {
            System.out.println("Valor insuficiente para transação");
            
            return false;
        } else {
            System.out.println("Produto: " + nomeDoProduto + ", Estoque: " + quantidade);
            System.out.println("Troco: R$" + (valorPago - preco));

            return true;
        }
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(float avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public int getIdProduto() {
        return idProduto;
    }
}