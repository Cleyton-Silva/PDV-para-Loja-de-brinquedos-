/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo8.pdv_loja_brinquedos.model;


public class CarrinhoItem {
    private int ProdutoId;
    private int ProdutoQtd;
    private double ProdutoValor;   
    private Produto produto;
    private String CodigoProduto;

    public CarrinhoItem(int ProdutoId, int ProdutoQtd, double ProdutoValor, Produto produto) {
        this.ProdutoId = ProdutoId;
        this.ProdutoQtd = ProdutoQtd;
        this.ProdutoValor = ProdutoValor;
        this.produto = produto;
    }    

    public CarrinhoItem() {
    }

    public String getCodigoProduto() {
        return CodigoProduto;
    }

    public void setCodigoProduto(String CodigoProduto) {
        this.CodigoProduto = CodigoProduto;
    }
    
    
    
    public double getValorTotal() {
        return ProdutoValor * ProdutoQtd;        
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }    

    public int getProdutoId() {
        return ProdutoId;
    }

    public void setProdutoId(int ProdutoId) {
        this.ProdutoId = ProdutoId;
    }

    public int getProdutoQtd() {
        return ProdutoQtd;
    }

    public void setProdutoQtd(int ProdutoQtd) {
        this.ProdutoQtd = ProdutoQtd;
    }

    public double getProdutoValor() {
        return ProdutoValor;
    }

    public void setProdutoValor(double ProdutoValor) {
        this.ProdutoValor = ProdutoValor;
    }
    
    
}
