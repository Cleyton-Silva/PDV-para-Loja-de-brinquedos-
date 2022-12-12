/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo8.pdv_loja_brinquedos.model;

/**
 *
 * @author Felipe
 */
public class Produto {

    public Produto() {
    }
    
    private int Id;
    private String Nome;
    private int Estoque;
    private double PrecoVenda;
    private double PrecoCusto;
    private String Genero;
    private int Codigo;

    public Produto(int Codigo, String Nome, int Estoque, double PrecoVenda, double PrecoCusto, String Genero) {                
        this.Nome = Nome;
        this.Estoque = Estoque;
        this.PrecoVenda = PrecoVenda;
        this.PrecoCusto = PrecoCusto;
        this.Genero = Genero; 
        this.Codigo = Codigo;
    }

    public Produto(int Id, int Codigo, String Nome, int Estoque, double PrecoVenda, double PrecoCusto, String Genero) {
        this.Id = Id;
        this.Nome = Nome;
        this.Estoque = Estoque;
        this.PrecoVenda = PrecoVenda;
        this.PrecoCusto = PrecoCusto;
        this.Genero = Genero;
        this.Codigo = Codigo;
    }
    
    

    public int getCodigo() {
        return Codigo;
    }  
    
    public int getEstoque() {
        return Estoque;
    }

    public int getId() {
        return Id;
    }

    public String getNome() {
        return Nome;
    }

    public double getPrecoCusto() {
        return PrecoCusto;
    }

    public double getPrecoVenda() {
        return PrecoVenda;
    }

    public String getGenero() {
        return Genero;
    }       

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }    

    public void setEstoque(int Estoque) {
        this.Estoque = Estoque;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setPrecoCusto(double PrecoCusto) {
        this.PrecoCusto = PrecoCusto;
    }

    public void setPrecoVenda(double PrecoVenda) {
        this.PrecoVenda = PrecoVenda;
    }        

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }
    
    
}
