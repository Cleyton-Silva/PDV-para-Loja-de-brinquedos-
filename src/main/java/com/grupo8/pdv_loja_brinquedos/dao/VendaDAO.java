/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo8.pdv_loja_brinquedos.dao;

import com.grupo8.pdv_loja_brinquedos.model.Carrinho;
import com.grupo8.pdv_loja_brinquedos.model.CarrinhoItem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Felipe
 */
public class VendaDAO {
    public static boolean realizarVenda(Carrinho carrinho) {
        Connection conexao = null;
        int carrinhoId = 0;
        
        try {
            //1º passo - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //2º passo - Abrir a conexão
            conexao = DriverManager.getConnection(Context.url, Context.login, Context.senha);
            
            //3º passo - Criar o comando SQL
            PreparedStatement comandoSQL = 
            conexao.prepareStatement("INSERT INTO Carrinho (ValorTotal,ClienteId) VALUES(?,?); "
                    , Statement.RETURN_GENERATED_KEYS );                       
            
            // Passagem de parametros para os valores da string
            comandoSQL.setDouble(1, carrinho.getValorTotal());
            
            if(carrinho.getClienteId() == 0) {
                comandoSQL.setNull(2, 0);
            } else {
                comandoSQL.setInt(2, carrinho.getClienteId());
            }
                                        
            //4º passo - Executar o comando
            int linhasAfetadas = comandoSQL.executeUpdate();
            if(linhasAfetadas>0){                              
                ResultSet rs = comandoSQL.getGeneratedKeys();
                if(rs != null){
                    if(rs.next()){
                        carrinhoId = rs.getInt(1);
                    }
                }
                
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        
        salvarItens(carrinho.getItens(), carrinhoId);
        
        return true;
    }
    
    public static boolean salvarItens(ArrayList<CarrinhoItem> itens, int carrinhoId) {
        Connection conexao = null;        
        int itensContador = 1;
        
        try {
            //1º passo - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //2º passo - Abrir a conexão
            conexao = DriverManager.getConnection(Context.url, Context.login, Context.senha);
            
            String strSQL = "INSERT INTO CarrinhoProdutos (ProdutoId,CarrinhoId,ProdutoQtd,ProdutoValor) VALUES";
            
            for(CarrinhoItem x: itens) {
                strSQL += "(?,?,?,?),";
            }
            
            strSQL = strSQL.substring(0,strSQL.length()-1); 
                                    
            //3º passo - Criar o comando SQL
            PreparedStatement comandoSQL = 
            conexao.prepareStatement(strSQL
                    , Statement.RETURN_GENERATED_KEYS );                       
            
            // Passagem de parametros para os valores da string            
            for(CarrinhoItem item: itens) {
                comandoSQL.setInt(itensContador++, item.getProdutoId());
                comandoSQL.setInt(itensContador++, carrinhoId);
                comandoSQL.setInt(itensContador++, item.getProdutoQtd());
                comandoSQL.setDouble(itensContador++, item.getProdutoValor());
            }
                                        
            //4º passo - Executar o comando
            comandoSQL.executeUpdate();            
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        return true;
    }
}
