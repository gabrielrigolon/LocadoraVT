/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadoravt;

/**
 *
 * @author gabrielrigolon
 */
public class Cliente {
    
    private String cpf;
    private String nome;
    private String sobrenome;
    private String endereco;
    private String telefone;
    private String email;
    private String senha;
    private double renda;

    
    @Override
    public String toString() {
        String str = "";
        
        str += "Cliente:";
        str += "\nCPF = " + cpf;
        str += "\nNome = " + nome; 
        str += "\nSobrenome = " + sobrenome; 
        str += "\nEndereço = " + endereco;
        str += "\nTelefone = " + telefone;
        str += "\nE-mail = " + email;
        str += "\nSenha = " + senha;
        str += "\nRenda = " + renda;
        
        return str;
    }

    
    
    public Cliente(String cpf, String nome, String sobrenome, String endereco, String telefone, String email, String senha, double renda) {
        this.cpf = cpf;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
        this.renda = renda;
    }
    
    
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }
    
    
    
}
