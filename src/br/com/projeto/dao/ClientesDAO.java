
package br.com.projeto.dao;

import br.com.projeto.jdbc.ConnectionFactory;
import br.com.projeto.model.Clientes;
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class ClientesDAO {
    
    private Connection con;

    public ClientesDAO() {
        this.con = new ConnectionFactory().getConnection();
        
    }
    
    
//  METODO CADASTRAR CLIENTE
    public void cadastrarCliente(Clientes obj){
        try {
            
        
//          1 passo - criar o comando sql  
            String sql = "insert into tb_clientes(nome,rg,cpf,email,telefone,celular,cep,endereco,numero,complemento,bairro,cidade,estado)" 
                                                 +"Values(?,?,?,?,?,?,?,?,?,?,?,?,?)";

//          2 passo - conectar o banco de dados e organizar os comandos SQL            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getRg());
            stmt.setString(3, obj.getCpf());
            stmt.setString(4, obj.getEmail());
            stmt.setString(5, obj.getTelefone());
            stmt.setString(6, obj.getCelular());
            stmt.setString(7, obj.getCep());
            stmt.setString(8, obj.getEndereco());
            stmt.setInt(9, obj.getNumero());
            stmt.setString(10, obj.getComplemento());
            stmt.setString(10, obj.getBairro());
            stmt.setString(10, obj.getCidade());
            stmt.setString(10, obj.getUf());
            
//          3 passo - executar o comandos SQL
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "CADASTRADO COM SUCESSO!");
            
        
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ERRO: "+ erro);
        }
        
    }
    
//  METODO ALTERAR CLIENTE
    public void alterarCliente(){
        
    }    
    
//  METODO EXCLUIR CLIENTE
    public void excluirCliente(){
        
    }    
    
}
