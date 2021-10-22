
package br.com.projeto.model;

// Vou fazer com que a classe de funcionarios estenda da classe cliente
//Porque um funcionario tambem pode ser um cliente

public class Funcionarios extends Clientes{
    private String senha;
    private String cargo;
    private String nivel_acesso;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNivel_acesso() {
        return nivel_acesso;
    }

    public void setNivel_acesso(String nivel_acesso) {
        this.nivel_acesso = nivel_acesso;
    }
    
    
    
    
}
