/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo8.pdv_loja_brinquedos.dao;

import com.grupo8.pdv_loja_brinquedos.model.Cliente;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author Felipe
 */
public class ClienteDAO {
    static String url = Context.url;
    static String senha = Context.senha;
    static String login = Context.login;
    
    public static Cliente carregarPorCpf(String cpf) {
        Connection conexao = null;
        Cliente retorno = null;
        
        try {
            //1º passo - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //2º passo - Abrir a conexão
            conexao = DriverManager.getConnection(url, login, senha);
            
            String strSQL = "SELECT * FROM Cliente WHERE Cpf like CONCAT('%', ?, '%')";                        
            
            //3º passo - Criar o comando SQL
            PreparedStatement comandoSQL = 
            conexao.prepareStatement(strSQL);                       
            
            comandoSQL.setString(1, cpf);            
            
            ResultSet rs = comandoSQL.executeQuery();
            
            if(rs!=null){
               
                while(rs.next()){                                                                                                  
                    retorno = new Cliente(
                            rs.getString("Nome"), 
                            rs.getString("Cpf"), 
                            rs.getString("Rua"), 
                            rs.getString("Cidade"), 
                            rs.getString("Bairro"), 
                            rs.getString("Cep"), 
                            rs.getString("Estado"), 
                            rs.getString("Telefone"), 
                            rs.getString("Email"), 
                            rs.getString("Sexo"),                             
                            new Date(rs.getDate("DataNascimento").getTime()),
                            rs.getString("Complemento"),
                            rs.getString("Nacionalidade"),
                            rs.getString("Apelido")
                    );
                    
                    retorno.setId(rs.getInt("Id"));
                }
                
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return retorno;
    }
    
    public static Cliente carregar(int id) {
        Connection conexao = null;
        Cliente retorno = null;
        
        try {
            //1º passo - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //2º passo - Abrir a conexão
            conexao = DriverManager.getConnection(url, login, senha);
            
            String strSQL = "SELECT * FROM Cliente WHERE Id = ?";                        
            
            //3º passo - Criar o comando SQL
            PreparedStatement comandoSQL = 
            conexao.prepareStatement(strSQL);                       
            
            comandoSQL.setInt(1, id);            
            
            ResultSet rs = comandoSQL.executeQuery();
            
            if(rs!=null){
               
                while(rs.next()){                                                                                                  
                    retorno = new Cliente(
                            rs.getString("Nome"), 
                            rs.getString("Cpf"), 
                            rs.getString("Rua"), 
                            rs.getString("Cidade"), 
                            rs.getString("Bairro"), 
                            rs.getString("Cep"), 
                            rs.getString("Estado"), 
                            rs.getString("Telefone"), 
                            rs.getString("Email"), 
                            rs.getString("Sexo"),                             
                            new Date(rs.getDate("DataNascimento").getTime()),
                            rs.getString("Complemento"),
                            rs.getString("Nacionalidade"),
                            rs.getString("Apelido")
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
            conexao.prepareStatement("DELETE FROM Cliente WHERE Id = ?; ");
            
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
    
    public static boolean possuiCompras(int id) {
        Connection conexao = null;
        boolean retorno = false;
        
        try {
            //1º passo - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //2º passo - Abrir a conexão
            conexao = DriverManager.getConnection(url, login, senha);
            
            String strSQL = "SELECT * FROM Carrinho WHERE ClienteId = ?";                        
            
            //3º passo - Criar o comando SQL
            PreparedStatement comandoSQL = 
            conexao.prepareStatement(strSQL);                       
            
            comandoSQL.setInt(1, id);            
            
            ResultSet rs = comandoSQL.executeQuery();
            
            if(rs!=null){               
                while(rs.next()){                                                                                                  
                    retorno = true;
                }
                
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return retorno;
    }
    
    public static ArrayList<Cliente> pesquisar (String nome, String cpf) {
        Connection conexao = null;
        var lista = new ArrayList<Cliente>();
        
        try {
            //1º passo - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //2º passo - Abrir a conexão
            conexao = DriverManager.getConnection(url, login, senha);
            
            String strSQL = "SELECT * FROM Cliente WHERE Nome like CONCAT('%', ?, '%') and Cpf like CONCAT('%', ?, '%')";                        
            
            //3º passo - Criar o comando SQL
            PreparedStatement comandoSQL = 
            conexao.prepareStatement(strSQL);                       
            
            comandoSQL.setString(1, nome);
            comandoSQL.setString(2, cpf);            
            
            ResultSet rs = comandoSQL.executeQuery();
            
            if(rs!=null){
               
                while(rs.next()){
                    Cliente objNovo = new Cliente();
                    objNovo.setId(rs.getInt("Id"));
                    objNovo.setCpf(rs.getString("Cpf"));
                    objNovo.setNome(rs.getString("Nome"));
                    objNovo.setSexo(rs.getString("Sexo"));
                    
                    lista.add(objNovo);                
                }
                
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return lista;
    }    
    
    public static boolean alterar(Cliente cliente) {        
        Connection conexao = null;        
        
        try {
            //1º passo - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //2º passo - Abrir a conexão
            conexao = DriverManager.getConnection(url, login, senha);
            
            //3º passo - Criar o comando SQL
            PreparedStatement comandoSQL = 
            conexao.prepareStatement("UPDATE Cliente SET Nome=? ,Cpf=?,Rua=?,Cidade=?,Bairro=?,Cep=?,Estado=?,Telefone=?,Email=?,Sexo=?,DataNascimento=?,Apelido=?,Complemento=?,Nacionalidade=? WHERE Id=?; ");
            
            comandoSQL.setString(1, cliente.getNome());
            comandoSQL.setString(2, cliente.getCpf());
            comandoSQL.setString(3, cliente.getRua());
            comandoSQL.setString(4, cliente.getCidade());
            comandoSQL.setString(5, cliente.getBairro());
            comandoSQL.setString(6, cliente.getCep());
            comandoSQL.setString(7, cliente.getEstado());
            comandoSQL.setString(8, cliente.getTelefone());
            comandoSQL.setString(9, cliente.getEmail());
            comandoSQL.setString(10, cliente.getSexo());
            comandoSQL.setDate(11, new Date(cliente.getDataNascimento().getTime()));
            comandoSQL.setString(12, cliente.getApelido());
            comandoSQL.setString(13, cliente.getComplemento());
            comandoSQL.setString(14, cliente.getNacionalidade());            
            comandoSQL.setInt(15, cliente.getId());            
            
            //4º passo - Executar o comando
            int linhasAfetadas = comandoSQL.executeUpdate();            
            
            return linhasAfetadas>0;
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }                
        
        return false;
    }
    
    public static boolean salvar(Cliente cliente) {
                
        Connection conexao = null;
        
        try {
            //1º passo - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //2º passo - Abrir a conexão
            conexao = DriverManager.getConnection(Context.url, Context.login, Context.senha);
            
            //3º passo - Criar o comando SQL
            PreparedStatement comandoSQL = 
            conexao.prepareStatement("INSERT INTO Cliente (Nome,Cpf,Rua,Cidade,Bairro,Cep,Estado,Telefone,Email,Sexo,DataNascimento, Apelido, Complemento, Nacionalidade) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?); "
                    , Statement.RETURN_GENERATED_KEYS );
            
            // Passagem de parametros para os valores da string
            comandoSQL.setString(1, cliente.getNome());
            comandoSQL.setString(2, cliente.getCpf());
            comandoSQL.setString(3, cliente.getRua());
            comandoSQL.setString(4, cliente.getCidade());
            comandoSQL.setString(5, cliente.getBairro());
            comandoSQL.setString(6, cliente.getCep());
            comandoSQL.setString(7, cliente.getEstado());
            comandoSQL.setString(8, cliente.getTelefone());
            comandoSQL.setString(9, cliente.getEmail());
            comandoSQL.setString(10, cliente.getSexo()); 
            comandoSQL.setDate(11, new Date(cliente.getDataNascimento().getTime())); 
            comandoSQL.setString(12, cliente.getApelido());        
            comandoSQL.setString(13, cliente.getComplemento());        
            comandoSQL.setString(14, cliente.getNacionalidade());                                               
            
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
