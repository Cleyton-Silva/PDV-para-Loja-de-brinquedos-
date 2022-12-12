/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo8.pdv_loja_brinquedos.model;
import java.util.ArrayList;
import java.util.Date;


public class Carrinho {
    private int ClienteId;
    private double ValorTotal;
    private Date DataCompra;
    
    private ArrayList<CarrinhoItem> Itens;

    public Carrinho() {
        this.Itens = new ArrayList<>();       
    }

    public int getClienteId() {
        return ClienteId;
    }

    public void setClienteId(int ClienteId) {
        this.ClienteId = ClienteId;
    }

    public double getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(double ValorTotal) {
        this.ValorTotal = ValorTotal;
    }

    public Date getDataCompra() {
        return DataCompra;
    }

    public void setDataCompra(Date DataCompra) {
        this.DataCompra = DataCompra;
    }    

    public ArrayList<CarrinhoItem> getItens() {
        return Itens;
    }    

    public void setItens(ArrayList<CarrinhoItem> Itens) {
        this.Itens = Itens;
        
        CalcularTotalCarrinho();
    }
    
    private void CalcularTotalCarrinho() {
        double total = 0;
        
        //Adicionar ao valor total o valor dos itens
        for(CarrinhoItem item : Itens) {
            total += item.getValorTotal();
        }
        
        setValorTotal(total);
    }
    
    public void addItens(CarrinhoItem item) {                            
        this.Itens.add(item);
                        
        CalcularTotalCarrinho();
    }
    
    public void removeItem(int codigo) {
        //Remover o item do carrinho
        for(CarrinhoItem item : Itens) {
            if(item.getProduto().getCodigo() == codigo) {
                Itens.remove(item);
                break;
            }
        }
        
        CalcularTotalCarrinho();
    }
}
