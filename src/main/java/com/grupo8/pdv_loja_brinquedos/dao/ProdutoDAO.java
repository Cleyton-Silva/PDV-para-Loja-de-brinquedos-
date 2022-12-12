/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo8.pdv_loja_brinquedos.dao;

import com.grupo8.pdv_loja_brinquedos.model.Produto;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author Felipe
 */
public class ProdutoDAO {
    static String url = Context.url;
    static String senha = Context.senha;
    static String login = Context.login;
    
    public static Produto carregar(int codigo) {
        Connection conexao = null;
        Produto retorno = null;
        
        try {
            //1º passo - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //2º passo - Abrir a conexão
            conexao = DriverManager.getConnection(url, login, senha);
            
            String strSQL = "SELECT * FROM Produto WHERE Codigo = ?";                        
            
            //3º passo - Criar o comando SQL
            PreparedStatement comandoSQL = 
            conexao.prepareStatement(strSQL);                       
            
            comandoSQL.setInt(1, codigo);            
            
            ResultSet rs = comandoSQL.executeQuery();
            
            if(rs!=null){
               
                while(rs.next()){                                                                                                  
                    retorno = new Produto(
                            rs.getInt("Codigo"),
                            rs.getString("Nome"),
                            rs.getInt("Estoque"),
                            rs.getDouble("PrecoVenda"),
                            rs.getDouble("PrecoCusto"),
                            rs.getString("Genero")
                    );
                    
                    retorno.setId(rs.getInt("Id"));
                }
                
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return retorno;
    }
    
    public static boolean excluir(int id){
        
        boolean retorno = false;
        Connection conexao = null;
        
        try {
            //1º passo - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //2º passo - Abrir a conexão
            conexao = DriverManager.getConnection(url, login, senha);
            
            //3º passo - Criar o comando SQL
            PreparedStatement comandoSQL = 
            conexao.prepareStatement("DELETE FROM Produto WHERE COdigo = ?; ");
            
            comandoSQL.setInt(1, id);
            
            
            //4º passo - Executar o comando
            int linhasAfetadas = comandoSQL.executeUpdate();
            if(linhasAfetadas>0){
                retorno = true;
                
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return retorno;
    }
    
    public static ArrayList<Produto> pesquisar (int codigo, String nome) {
        Connection conexao = null;
        var lista = new ArrayList<Produto>();
        
        try {
            //1º passo - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //2º passo - Abrir a conexão
            conexao = DriverManager.getConnection(url, login, senha);
            
            String strSQL = "SELECT * FROM Produto WHERE (? = 0 or Codigo like CONCAT('%', ?, '%')) and Nome like CONCAT('%', ?, '%')";                        
            
            //3º passo - Criar o comando SQL
            PreparedStatement comandoSQL = 
            conexao.prepareStatement(strSQL);                       
            
            comandoSQL.setInt(1, codigo);
            comandoSQL.setString(2, String.valueOf(codigo));                        
            comandoSQL.setString(3, nome);
            
            ResultSet rs = comandoSQL.executeQuery();
            
            if(rs!=null){
               
                while(rs.next()){
                    Produto objNovo = new Produto();
                    objNovo.setId(rs.getInt("Id"));
                    objNovo.setPrecoCusto(rs.getDouble("PrecoCusto"));
                    objNovo.setNome(rs.getString("Nome"));
                    objNovo.setPrecoVenda(rs.getDouble("PrecoVenda"));
                    objNovo.setGenero(rs.getString("Genero"));
                    objNovo.setCodigo(rs.getInt("Codigo"));
                    objNovo.setEstoque(rs.getInt("Estoque"));
                    
                    lista.add(objNovo);                
                }
                
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return lista;
    }            
    
     public static boolean alterar(Produto produto) {        
        Connection conexao = null;        
        
        try {
            //1º passo - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //2º passo - Abrir a conexão
            conexao = DriverManager.getConnection(url, login, senha);
            
            //3º passo - Criar o comando SQL
            PreparedStatement comandoSQL = 
            conexao.prepareStatement("UPDATE Produto SET  Nome=? ,PrecoVenda=?,PrecoCusto=?,Genero=?,Estoque=?,Codigo=? WHERE Id=?; ");
            
            comandoSQL.setString(1, produto.getNome());
            comandoSQL.setDouble(2, produto.getPrecoVenda());
            comandoSQL.setDouble(3, produto.getPrecoCusto());
            comandoSQL.setString(4, produto.getGenero());            
            comandoSQL.setInt(5, produto.getEstoque());        
            comandoSQL.setInt(6, produto.getCodigo());        
            comandoSQL.setInt(7, produto.getId());            
            
            //4º passo - Executar o comando
            int linhasAfetadas = comandoSQL.executeUpdate();            
            
            return linhasAfetadas>0;
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }                
        
        return false;
    }
    
    public static boolean salvar(Produto cliente) {
                
        Connection conexao = null;
        
        try {
            //1º passo - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //2º passo - Abrir a conexão
            conexao = DriverManager.getConnection(Context.url, Context.login, Context.senha);
            
            //3º passo - Criar o comando SQL
            PreparedStatement comandoSQL = 
            conexao.prepareStatement("INSERT INTO Produto (Nome,PrecoVenda,PrecoCusto,Genero,Codigo,Estoque) VALUES(?,?,?,?,?,?); "
                    , Statement.RETURN_GENERATED_KEYS );
            
            // Passagem de parametros para os valores da string
            comandoSQL.setString(1, cliente.getNome());
            comandoSQL.setDouble(2, cliente.getPrecoVenda());
            comandoSQL.setDouble(3, cliente.getPrecoCusto());
            comandoSQL.setString(4, cliente.getGenero());                           
            comandoSQL.setInt(5, cliente.getCodigo());                           
            comandoSQL.setInt(6, cliente.getEstoque());
            
            //4º passo - Executar o comando
            int linhasAfetadas = comandoSQL.executeUpdate();
            if(linhasAfetadas>0){                              
                ResultSet rs = comandoSQL.getGeneratedKeys();
                if(rs != null){
                    if(rs.next()){
                        //cliente.setIdNota(rs.getInt(1));
                    }
                }
                
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        
        return true;
    }
}
