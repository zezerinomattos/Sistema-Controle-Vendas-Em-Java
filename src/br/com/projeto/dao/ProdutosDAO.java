package br.com.projeto.dao;

import br.com.projeto.jdbc.ConnectionFactory;
import br.com.projeto.model.Fornecedores;
import br.com.projeto.model.Produtos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProdutosDAO {

    //CONEXÃO COM BANCO
    private Connection con;

    public ProdutosDAO() {
        this.con = new ConnectionFactory().getConnection();
    }

    //  METODO CADASTRAR PRODUTOS
    public void cadastrarProdutos(Produtos obj) {
        try {

//          1 passo - criar o comando sql  
            String sql = "insert into tb_produtos(descricao,preco_custo, "
                    + "porcentagem_aumento,preco_venda,lucro_real,qtd_estoque,for_id,marca,tamanho,corPredominante, "
                    + "corDetalhes,obs,entrada,saida)"
                    + "Values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

//          2 passo - conectar o banco de dados e organizar os comandos SQL            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getDescricao());
            stmt.setDouble(2, obj.getPreco_custo());
            stmt.setInt(3, obj.getPorcentagem_aumento());
            stmt.setDouble(4, obj.getPreco());
            stmt.setDouble(5, obj.getLucro());
            stmt.setInt(6, obj.getQtd_estoque());
            stmt.setInt(7, obj.getFornecedor().getId());
            stmt.setString(8, obj.getMarca());
            stmt.setString(9, obj.getTamanho());
            stmt.setString(10, obj.getCorPredominante());
            stmt.setString(11, obj.getCorDetalhes());
            stmt.setString(12, obj.getObs());
            stmt.setInt(13, obj.getEntrada());
            stmt.setInt(14, obj.getSaida());

//          3 passo - executar o comandos SQL
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "CADASTRADO COM SUCESSO!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ERRO: " + erro);
        }

    }

    //  METODO ALTERAR PRODUTOS
    public void alterarProdutos(Produtos obj) {

        try {

//          1 passo - criar o comando sql  
            String sql = "update tb_produtos set descricao=?,preco_custo=?, "
                    + "porcentagem_aumento=?,preco_venda=?,lucro_real=?,qtd_estoque=? ,for_id=?, "
                    + "marca=?,tamanho=?,corPredominante=?, "
                    + "corDetalhes=?,obs=?,entrada=?,saida=?";

//          2 passo - conectar o banco de dados e organizar os comandos SQL            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getDescricao());
            stmt.setDouble(2, obj.getPreco_custo());
            stmt.setInt(3, obj.getPorcentagem_aumento());
            stmt.setDouble(4, obj.getPreco());
            stmt.setDouble(5, obj.getLucro());
            stmt.setInt(6, obj.getQtd_estoque());
            stmt.setInt(7, obj.getFornecedor().getId());
            stmt.setString(8, obj.getMarca());
            stmt.setString(9, obj.getTamanho());
            stmt.setString(10, obj.getCorPredominante());
            stmt.setString(11, obj.getCorDetalhes());
            stmt.setString(12, obj.getObs());
            stmt.setInt(13, obj.getEntrada());
            stmt.setInt(14, obj.getSaida());

            stmt.setInt(5, obj.getId());

//          3 passo - executar o comandos SQL
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "ALTERADO COM SUCESSO!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ERRO: " + erro);
        }

    }
//  METODO EXCLUIR PRODUTOS

    public void excluirProdutos(Produtos obj) {

        try {

//          criar o comando sql  
            String sql = "delete from tb_produtos where id = ?";

//          conectar o banco de dados e organizar os comandos SQL            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getId());

//          executar o comandos SQL
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "EXCLUIDO COM SUCESSO!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ERRO: " + erro);
        }

    }
//  METODO LISTAR PRODUTOS

    public List<Produtos> listaProdutos() {

        try {

            //criando a lista
            List<Produtos> lista = new ArrayList<>();

            //Criando o comando sql, organizando e executando
            String sql = "select p.id, p.descricao, p.preco_custo, p.porcentagem_aumento, p.preco_venda, "
                    + " p.lucro_real, p.qtd_estoque, p.marca, p.tamanho, p.corPredominante, "
                    + " p.corDetalhes, p.obs, p.entrada, p.saida, f.nome from tb_produtos as p "
                    + " inner join tb_fornecedores as f on(p.for_id = f.id) ";

            PreparedStatement stmt = con.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Produtos obj = new Produtos();
                Fornecedores f = new Fornecedores();

                obj.setId(rs.getInt("p.id"));
                obj.setDescricao(rs.getString("p.descricao"));
                obj.setPreco_custo(rs.getDouble("p.preco_custo"));
                obj.setPorcentagem_aumento(rs.getInt("p.porcentagem_aumento"));
                obj.setPreco(rs.getDouble("p.preco_venda"));
                obj.setLucro(rs.getDouble("p.lucro_real"));
                obj.setQtd_estoque(rs.getInt("p.qtd_estoque"));

                obj.setMarca(rs.getString("p.marca"));
                obj.setTamanho(rs.getString("p.tamanho"));
                obj.setCorPredominante(rs.getString("p.corPredominante"));
                obj.setCorDetalhes(rs.getString("p.corDetalhes"));
                obj.setObs(rs.getString("p.obs"));
                obj.setEntrada(rs.getInt("p.entrada"));
                obj.setSaida(rs.getInt("p.saida"));

                f.setNome(rs.getString("f.nome"));
                obj.setFornecedor(f);
                lista.add(obj);
            }
            return lista;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ErroTestando: " + erro);
            return null;
        }

    }
    //METODO BUSCAR PRODUTOS POR NOME

    public List<Produtos> buscaProdutoPorNome(String nome) {

        try {

            //criando a lista
            List<Produtos> lista = new ArrayList<>();

            //Criando o comando sql, organizando e executando
            String sql = "select p.id, p.descricao, p.preco_custo, p.porcentagem_aumento, p.preco_venda, "
                    + " p.lucro_real, p.qtd_estoque, p.marca,p.tamanho,p.corPredominante, "
                    + "p.corDetalhes,p.obs,p.entrada,p.saida, f.nome from tb_produtos as p "
                    + "inner join tb_fornecedores as f on(p.for_id = f.id) where p.descricao like ?";

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Produtos obj = new Produtos();
                Fornecedores f = new Fornecedores();

                obj.setId(rs.getInt("p.id"));
                obj.setDescricao(rs.getString("p.descricao"));
                obj.setPreco_custo(rs.getDouble("p.preco_custo"));
                obj.setPorcentagem_aumento(rs.getInt("p.porcentagem_aumento"));
                obj.setPreco(rs.getDouble("p.preco_venda"));
                obj.setLucro(rs.getDouble("p.lucro_real"));
                obj.setQtd_estoque(rs.getInt("p.qtd_estoque"));
                
                obj.setMarca(rs.getString("p.marca"));
                obj.setTamanho(rs.getString("p.tamanho"));
                obj.setCorPredominante(rs.getString("p.corPredominante"));
                obj.setCorDetalhes(rs.getString("p.corDetalhes"));
                obj.setObs(rs.getString("p.obs"));
                obj.setEntrada(rs.getInt("p.entrada"));
                obj.setSaida(rs.getInt("p.saida"));

                f.setNome(rs.getString("f.nome"));
                obj.setFornecedor(f);
                lista.add(obj);

            }
            return lista;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
            return null;
        }
    }
    //METODO BUSCAR PRODUTO PELO CÓDIGO

    public List<Produtos> buscaProdutoPorCod(int id) {

        try {

            //criando a lista
            List<Produtos> lista = new ArrayList<>();

            //Criando o comando sql, organizando e executando
            String sql = "select p.id, p.descricao, p.preco_custo, p.porcentagem_aumento, p.preco_venda, "
                    + " p.lucro_real, p.qtd_estoque, p.marca,p.tamanho,p.corPredominante, "
                    + "p.corDetalhes,p.obs,p.entrada,p.saida, f.nome from tb_produtos as p "
                    + "inner join tb_fornecedores as f on(p.for_id = f.id) where p.id = ? ";

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Produtos obj = new Produtos();
                Fornecedores f = new Fornecedores();

                obj.setId(rs.getInt("p.id"));
                obj.setDescricao(rs.getString("p.descricao"));
                obj.setPreco_custo(rs.getDouble("p.preco_custo"));
                obj.setPorcentagem_aumento(rs.getInt("p.porcentagem_aumento"));
                obj.setPreco(rs.getDouble("p.preco_venda"));
                obj.setLucro(rs.getDouble("p.lucro_real"));
                obj.setQtd_estoque(rs.getInt("p.qtd_estoque"));
                
                obj.setMarca(rs.getString("p.marca"));
                obj.setTamanho(rs.getString("p.tamanho"));
                obj.setCorPredominante(rs.getString("p.corPredominante"));
                obj.setCorDetalhes(rs.getString("p.corDetalhes"));
                obj.setObs(rs.getString("p.obs"));
                obj.setEntrada(rs.getInt("p.entrada"));
                obj.setSaida(rs.getInt("p.saida"));

                f.setNome(rs.getString("f.nome"));
                obj.setFornecedor(f);
                lista.add(obj);

            }
            return lista;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
            return null;
        }
    } 
    //METODO BUSCAR PRODUTO PELO FORNECEDOR

    public List<Produtos> buscaProdutoPorFornecedor(String fornecedor) {

        try {

            //criando a lista
            List<Produtos> lista = new ArrayList<>();

            //Criando o comando sql, organizando e executando
            String sql = "select p.id, p.descricao, p.preco_custo, p.porcentagem_aumento, p.preco_venda,"
                    + " p.lucro_real, p.qtd_estoque, "
                    + "p.marca,p.tamanho,p.corPredominante, "
                    + "p.corDetalhes,p.obs,p.entrada,p.saida, f.nome from tb_produtos as p "
                    + "inner join tb_fornecedores as f on(p.for_id = f.id) where inner join tb_fornecedores as f on(p.for_id = f.id) like?";

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, fornecedor);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Produtos obj = new Produtos();
                Fornecedores f = new Fornecedores();

                obj.setId(rs.getInt("p.id"));
                obj.setDescricao(rs.getString("p.descricao"));
                obj.setPreco_custo(rs.getDouble("p.preco_custo"));
                obj.setPorcentagem_aumento(rs.getInt("p.porcentagem_aumento"));
                obj.setPreco(rs.getDouble("p.preco_venda"));
                obj.setLucro(rs.getDouble("p.lucro_real"));
                obj.setQtd_estoque(rs.getInt("p.qtd_estoque"));
                
                obj.setMarca(rs.getString("p.marca"));
                obj.setTamanho(rs.getString("p.tamanho"));
                obj.setCorPredominante(rs.getString("p.corPredominante"));
                obj.setCorDetalhes(rs.getString("p.corDetalhes"));
                obj.setObs(rs.getString("p.obs"));
                obj.setEntrada(rs.getInt("p.entrada"));
                obj.setSaida(rs.getInt("p.saida"));

                f.setNome(rs.getString("f.nome"));
                obj.setFornecedor(f);
                lista.add(obj);

            }
            return lista;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
            return null;
        }
    }
    //METODO CONSULTA PRODUTOS POR ID
    public Produtos consultaPorId(int cod) {

        try {

            //Criando o comando sql, organizando e executando
            String sql = "select p.id, p.descricao, p.preco_custo, p.porcentagem_aumento, p.preco_venda, "
                    + " p.lucro_real, p.qtd_estoque, p.marca,p.tamanho,p.corPredominante, "
                    + "p.corDetalhes,p.obs,p.entrada,p.saida, f.nome from tb_produtos as p "
                    + "inner join tb_fornecedores as f on(p.for_id = f.id) where p.id = ? ";

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, cod);

            ResultSet rs = stmt.executeQuery();
            Produtos obj = new Produtos();
            Fornecedores f = new Fornecedores();

            if (rs.next()) {
                
                obj.setId(rs.getInt("p.id"));
                obj.setDescricao(rs.getString("p.descricao"));
                obj.setPreco_custo(rs.getDouble("p.preco_custo"));
                obj.setPorcentagem_aumento(rs.getInt("p.porcentagem_aumento"));
                obj.setPreco(rs.getDouble("p.preco_venda"));
                obj.setLucro(rs.getDouble("p.lucro_real"));
                obj.setQtd_estoque(rs.getInt("p.qtd_estoque"));
                
                obj.setMarca(rs.getString("p.marca"));
                obj.setTamanho(rs.getString("p.tamanho"));
                obj.setCorPredominante(rs.getString("p.corPredominante"));
                obj.setCorDetalhes(rs.getString("p.corDetalhes"));
                obj.setObs(rs.getString("p.obs"));
                obj.setEntrada(rs.getInt("p.entrada"));
                obj.setSaida(rs.getInt("p.saida"));

                f.setNome(rs.getString("f.nome"));
                obj.setFornecedor(f);                
            }
            return obj;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "PRODUTO NÃO ENCONTRADO!");
            return null;
        }

    }
    
}
