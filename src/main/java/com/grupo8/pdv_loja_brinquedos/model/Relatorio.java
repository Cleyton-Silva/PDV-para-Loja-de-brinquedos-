/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo8.pdv_loja_brinquedos.model;

import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Felipe
 */
public class Relatorio {
    private int VendaId;
    private String NomeCliente;
    private Date DataCompra;
    private double ValorTotal;
    private String CpfCliente;
    private ArrayList<CarrinhoItem> Itens;    

    public Relatorio(int VendaId, String NomeCliente, Date DataCompra, double ValorTotal, String CpfCliente) {
        this.VendaId = VendaId;
        this.NomeCliente = NomeCliente;
        this.DataCompra = DataCompra;
        this.ValorTotal = ValorTotal;
        this.CpfCliente = CpfCliente;        
    }
    
    

    public int getVendaId() {
        return VendaId;
    }

    public void setVendaId(int VendaId) {
        this.VendaId = VendaId;
    }
    
    

    public Relatorio() {
        this.Itens = new ArrayList<>();
    }

    public String getNomeCliente() {
        return NomeCliente;
    }

    public void setNomeCliente(String NomeCliente) {
        this.NomeCliente = NomeCliente;
    }

    public Date getDataCompra() {
        return DataCompra;
    }

    public void setDataCompra(Date DataCompra) {
        this.DataCompra = DataCompra;
    }

    public double getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(double ValorTotal) {
        this.ValorTotal = ValorTotal;
    }

    public String getCpfCliente() {
        return CpfCliente;
    }

    public void setCpfCliente(String CpfCliente) {
        this.CpfCliente = CpfCliente;
    }

    public ArrayList<CarrinhoItem> getItens() {
        return Itens;
    }

    public void setItens(ArrayList<CarrinhoItem> Itens) {
        this.Itens = Itens;
    }
    
    
    
}
