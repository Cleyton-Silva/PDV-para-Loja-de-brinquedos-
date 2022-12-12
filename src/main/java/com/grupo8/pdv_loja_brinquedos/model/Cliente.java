/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo8.pdv_loja_brinquedos.model;

import java.util.Date;
import java.util.InputMismatchException;

/**
 *
 * @author Felipe
 */
public class Cliente {

    public Cliente() {        
    }

    public Cliente(String Nome, String Cpf, String Rua, String Cidade, String Bairro, String Cep, String Estado, String Telefone, String Email, String Sexo, Date DataNascimento, String Complemento, String Nacionalidade, String Apelido) {        
        this.Nome = Nome;
        this.Cpf = Cpf;
        this.Rua = Rua;
        this.Cidade = Cidade;
        this.Bairro = Bairro;
        this.Cep = Cep;
        this.Estado = Estado;
        this.Telefone = Telefone;
        this.Email = Email;
        this.Sexo = Sexo;
        this.DataNascimento = DataNascimento;
        this.Complemento = Complemento;
        this.Nacionalidade = Nacionalidade;
        this.Apelido = Apelido;
    }

    
    
    private int Id;
    private String Nome;
    private String Cpf;
    private String Rua;
    private String Cidade;
    private String Bairro;
    private String Cep;
    private String Estado;    
    private String Telefone;
    private String Email;
    private String Sexo;    
    private Date DataNascimento;
    private String Complemento;
    private String Nacionalidade;
    private String Apelido;

    public void setId(int Id) {
        this.Id = Id;
    }    

    public void setApelido(String Apelido) {
        this.Apelido = Apelido;
    }

    public void setComplemento(String Complemento) {
        this.Complemento = Complemento;
    }

    public void setNacionalidade(String Nacionalidade) {
        this.Nacionalidade = Nacionalidade;
    }       
    
    public void setNome(String nome) {
        this.Nome = nome;
    }

    public void setCpf(String cpf) {
        String newstr = cpf.replaceAll("\\D+","");
        
        this.Cpf = newstr;
    }       

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public void setCep(String Cep) {
        this.Cep = Cep;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public void setDataNascimento(Date DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }    

    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }        

    public int getId() {
        return Id;
    }

    public String getApelido() {
        return Apelido;
    }

    public String getComplemento() {
        return Complemento;
    }

    public String getNacionalidade() {
        return Nacionalidade;
    }        

    public String getNome() {
        return Nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public Date getDataNascimento() {
        return DataNascimento;
    }

    public String getEmail() {
        return Email;
    }

    public String getRua() {
        return Rua;
    }

    public String getCidade() {
        return Cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public String getCep() {
        return Cep;
    }

    public String getBairro() {
        return Bairro;
    }    

    public String getSexo() {
        return Sexo;
    }

    public String getTelefone() {
        return Telefone;
    }             
    
    public boolean ValidarNomeCompleto() {
        String[] nomeArray = this.Nome.trim().split(" ");
        
        return nomeArray.length > 1;
    }
    
    public boolean ValidarCPF() {
        // considera-se erro CPF's formados por uma sequencia de numeros iguais
        if (this.Cpf.equals("00000000000") ||
            this.Cpf.equals("11111111111") ||
            this.Cpf.equals("22222222222") || this.Cpf.equals("33333333333") ||
            this.Cpf.equals("44444444444") || this.Cpf.equals("55555555555") ||
            this.Cpf.equals("66666666666") || this.Cpf.equals("77777777777") ||
            this.Cpf.equals("88888888888") || this.Cpf.equals("99999999999") ||
            (this.Cpf.length() != 11))
            return(false);

        char dig10, dig11;
        int sm, i, r, num, peso;

        // "try" - protege o codigo para eventuais erros de conversao de tipo (int)
        try {
        // Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 10;
            for (i=0; i<9; i++) {
        // converte o i-esimo caractere do CPF em um numero:
        // por exemplo, transforma o caractere '0' no inteiro 0
        // (48 eh a posicao de '0' na tabela ASCII)
            num = (int)(this.Cpf.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig10 = '0';
            else dig10 = (char)(r + 48); // converte no respectivo caractere numerico

        // Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 11;
            for(i=0; i<10; i++) {
            num = (int)(this.Cpf.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                 dig11 = '0';
            else dig11 = (char)(r + 48);

        // Verifica se os digitos calculados conferem com os digitos informados.
            if ((dig10 == this.Cpf.charAt(9)) && (dig11 == this.Cpf.charAt(10)))
                 return(true);
            else return(false);
                } catch (InputMismatchException erro) {
                return(false);
            }
        }
}
