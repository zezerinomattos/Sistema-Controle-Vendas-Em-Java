package br.com.projeto.dao;

import br.com.projeto.jdbc.ConnectionFactory;
import br.com.projeto.model.Clientes;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClientesDAO {

    private Connection con;

    public ClientesDAO() {
        this.con = new ConnectionFactory().getConnection();

    }

//  METODO CADASTRAR CLIENTE
    public void cadastrarCliente(Clientes obj) {
        try {

//          1 passo - criar o comando sql  
            String sql = "insert into tb_clientes(nome,rg,cpf,email,telefone,celular,cep,endereco,numero,complemento,bairro,cidade,estado)"
                    + "Values(?,?,?,?,?,?,?,?,?,?,?,?,?)";

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
            stmt.setString(11, obj.getBairro());
            stmt.setString(12, obj.getCidade());
            stmt.setString(13, obj.getUf());

//          3 passo - executar o comandos SQL
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "CADASTRADO COM SUCESSO!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ERRO: " + erro);
        }

    }

//  METODO ALTERAR CLIENTE
    public void alterarCliente(Clientes obj) {

        try {

//          1 passo - criar o comando sql  
            String sql = "update tb_clientes set nome=?,rg=? ,cpf=? ,email=? ,telefone=? ,celular=? ,cep=? ,"
                    + "endereco=?,numero=? ,complemento=?,bairro=? ,cidade=?, estado=? where id=?";

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
            stmt.setString(11, obj.getBairro());
            stmt.setString(12, obj.getCidade());
            stmt.setString(13, obj.getUf());
            stmt.setInt(14, obj.getId());

//          3 passo - executar o comandos SQL
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "ALTERADO COM SUCESSO!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ERRO: " + erro);
        }

    }

//  METODO EXCLUIR CLIENTE
    public void excluirCliente(Clientes obj) {

        try {

//          1 passo - criar o comando sql  
            String sql = "delete from tb_clientes where id = ?";

//          2 passo - conectar o banco de dados e organizar os comandos SQL            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getId());

//          3 passo - executar o comandos SQL
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "EXCLUIDO COM SUCESSO!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ERRO: " + erro);
        }

    }

//  METODO LISTAR CLIENTE
    public List<Clientes> listaClientes() {

        try {

            //criando a lista
            List<Clientes> lista = new ArrayList<>();

            //Criando o comando sql, organizando e executando
            String sql = "select*from tb_clientes";

            PreparedStatement stmt = con.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Clientes obj = new Clientes();

                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setEmail(rs.getString("email"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setCelular(rs.getString("celular"));
                obj.setCep(rs.getString("cep"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setNumero(rs.getInt("numero"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setUf(rs.getString("estado"));

                lista.add(obj);

            }
            return lista;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
            return null;
        }

    }

    //METODO BUSCAR CLIENTE POR NOME
    public List<Clientes> buscaClientePorNome(String nome) {

        try {

            //criando a lista
            List<Clientes> lista = new ArrayList<>();

            //Criando o comando sql, organizando e executando
            String sql = "select*from tb_clientes where nome like ?";

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Clientes obj = new Clientes();

                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setEmail(rs.getString("email"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setCelular(rs.getString("celular"));
                obj.setCep(rs.getString("cep"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setNumero(rs.getInt("numero"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setUf(rs.getString("estado"));

                lista.add(obj);

            }
            return lista;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
            return null;
        }
    }

    //BUSCAR CLIENTE POR CPF
    public List<Clientes> buscaClientePorCpf(String cpf) {

        try {

            //criando a lista
            List<Clientes> lista = new ArrayList<>();

            //Criando o comando sql, organizando e executando
            String sql = "select*from tb_clientes where cpf like ?";

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, cpf);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Clientes obj = new Clientes();
   
                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setEmail(rs.getString("email"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setCelular(rs.getString("celular"));
                obj.setCep(rs.getString("cep"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setNumero(rs.getInt("numero"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setUf(rs.getString("estado"));

                lista.add(obj);              

            }
            return lista;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
            return null;
        }
    }

    //BUSCAR CLIENTE POR CODIGO ID
    public List<Clientes> buscaClientePorCod(int id) {

        try {

            //criando a lista
            List<Clientes> lista = new ArrayList<>();

            //Criando o comando sql, organizando e executando
            String sql = "select*from tb_clientes where id = ?";

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Clientes obj = new Clientes();

                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setEmail(rs.getString("email"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setCelular(rs.getString("celular"));
                obj.setCep(rs.getString("cep"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setNumero(rs.getInt("numero"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setUf(rs.getString("estado"));

                lista.add(obj);

            }
            return lista;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
            return null;
        }
    }

    //METODO CONSULTA CLIENTE POR CPF
    public Clientes consultaPorCpf(String cpf) {

        try {

            //Criando o comando sql, organizando e executando
            String sql = "select*from tb_clientes where cpf = ?";

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, cpf);
            
            ResultSet rs = stmt.executeQuery();
            Clientes obj = new Clientes();
            
            if (rs.next()) {
 
                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setEmail(rs.getString("email"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setCelular(rs.getString("celular"));
                obj.setCep(rs.getString("cep"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setNumero(rs.getInt("numero"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setUf(rs.getString("estado"));
            }
            return obj;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "CLIENTE NÃO ENCONTRADO!");
            return null;
        }

    }
    //METODO CONSULTA CLIENTE POR CODIGO
    public Clientes consultaPorCod(int id) {

        try {

            //Criando o comando sql, organizando e executando
            String sql = "select*from tb_clientes where id = ?";

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            Clientes obj = new Clientes();
            
            if (rs.next()) {
 
                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setEmail(rs.getString("email"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setCelular(rs.getString("celular"));
                obj.setCep(rs.getString("cep"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setNumero(rs.getInt("numero"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setUf(rs.getString("estado"));
            }
            return obj;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "CLIENTE NÃO ENCONTRADO!");
            return null;
        }

    }

}
