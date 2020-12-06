package br.com.atividade01;

public class Produto{
    private int codigo;
    private String descricao;
    private double valorCompra;
    private double custo;
    private double margemLucro;
    private int quantidadeEstoque;

    public Produto(){}

    public Produto(int codigo, String descricao){
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Produto(int codigo, String descricao, double valorCompra, double custo, double margemLucro){
        this.codigo = codigo;
        this.descricao = descricao;
        this.valorCompra = valorCompra;
        this.custo = custo;
        this.margemLucro = margemLucro;
    }

    public Produto(int codigo, String descricao, double valorCompra, double custo, double margemLucro, int quantidadeEstoque){
        this.codigo = codigo;
        this.descricao = descricao;
        this.valorCompra = valorCompra;
        this.custo = custo;
        this.margemLucro = margemLucro;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void compra(int quant){
        this.quantidadeEstoque += quant;
    }

    public void venda(int quant){
        this.quantidadeEstoque -= quant;
    }

    public double calculaPrecoVenda(){
        return this.valorCompra + this.custo + this.margemLucro*(this.valorCompra + this.custo);
    }

    public int getCodigo(){
        return this.codigo;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public int getQuantidadeEstoque(){
        return this.quantidadeEstoque;
    }

    public double getValorCompra(){
        return this.valorCompra;
    }
    public void setValorCompra(double valorCompra){
        this.valorCompra = valorCompra;
    }

    public double getCusto(){
        return this.custo;
    }
    public void setCusto(double custo){
        this.custo = custo;
    }

    public double getMargemLucro(){
        return this.margemLucro;
    }
    public void setMargemLucro(double margemLucro){
        this.margemLucro = margemLucro;
    }

}