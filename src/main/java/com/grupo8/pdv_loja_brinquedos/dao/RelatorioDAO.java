/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo8.pdv_loja_brinquedos.dao;

import static com.grupo8.pdv_loja_brinquedos.dao.ClienteDAO.login;
import static com.grupo8.pdv_loja_brinquedos.dao.ClienteDAO.senha;
import static com.grupo8.pdv_loja_brinquedos.dao.ClienteDAO.url;
import com.grupo8.pdv_loja_brinquedos.model.CarrinhoItem;
import com.grupo8.pdv_loja_brinquedos.model.Relatorio;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Felipe
 */
public class RelatorioDAO {
    public static ArrayList<Relatorio> ObterRelatorio(Date dataInicial, Date dataFinal) {
        Connection conexao = null;
        ArrayList<Relatorio> retorno = new ArrayList<>();        
        
        try {
            //1º passo - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //2º passo - Abrir a conexão
            conexao = DriverManager.getConnection(url, login, senha);
            
            String strSQL = "SELECT cr.*, COALESCE(c.Nome, '') as Nome, c.Cpf  from Carrinho cr\n" +
                            "LEFT JOIN Cliente c on c.Id = cr.ClienteId "+ 
                            "WHERE DataCompra between ? and ?";                        
            
            //3º passo - Criar o comando SQL
            PreparedStatement comandoSQL = 
            conexao.prepareStatement(strSQL);                       
            
            comandoSQL.setDate(1, new Date(dataInicial.getTime()));            
            comandoSQL.setDate(2, new Date(dataFinal.getTime()));            
            
            ResultSet rs = comandoSQL.executeQuery();
            
            if(rs!=null){
               
                while(rs.next()){                                                                                                  
                    retorno.add(new Relatorio(
                            rs.getInt("Id"),
                            rs.getString("Nome"),
                            new Date(rs.getDate("DataCompra").getTime()),
                            rs.getDouble("ValorTotal"),
                            rs.getString("Cpf")                           
                    ));                                                           
                }                
            }                                                
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return retorno;
    }
    
    
    public static ArrayList<CarrinhoItem> ObterItensCarrinho(int carrinhoId) {
        Connection conexao = null;
        ArrayList<CarrinhoItem> retorno = null;        
        
        try {
            //1º passo - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //2º passo - Abrir a conexão
            conexao = DriverManager.getConnection(url, login, senha);
            
            String strSQL = "select cp.*, p.Nome, p.Codigo from CarrinhoProdutos cp\n" +
                            "left join Produto p on p.Id = cp.ProdutoId \n" +
                            "where CarrinhoId = ?";                        
            
            //3º passo - Criar o comando SQL
            PreparedStatement comandoSQL = 
            conexao.prepareStatement(strSQL);                       
            
            comandoSQL.setInt(1, carrinhoId);                        
            
            ResultSet rs = comandoSQL.executeQuery();
            
            
            if(rs!=null){
                retorno = new ArrayList<>();
                while(rs.next()){                                                                                                  
                    var carrinhoItem = new CarrinhoItem(
                            rs.getInt("ProdutoId"),
                            rs.getInt("ProdutoQtd"),
                            rs.getDouble("ProdutoValor"),
                            null
                    );
                    
                    carrinhoItem.setCodigoProduto(rs.getString("Codigo"));
                    
                    retorno.add(carrinhoItem);                                        
                }                
            }                        
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return retorno;
    }
}
