package br.com.projeto.dao;

import br.com.projeto.jdbc.ConnectionFactory;
import br.com.projeto.model.Clientes;
import br.com.projeto.model.ItemVendas;
import br.com.projeto.model.Produtos;
import br.com.projeto.model.Vendas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ItemVendaDAO {
    //CONEXÃO COM BANCO
    private Connection con;

    public ItemVendaDAO() {
        this.con = new ConnectionFactory().getConnection();
    }
    //CADASTRAR ITENS NO BANCO
    public void cadastrarItem(ItemVendas obj){
        
        try {

//          1 passo - criar o comando sql  
            String sql = "insert into tb_itensvendas(venda_id, produto_id, qtd, subtotal) "
                    + "Values(?,?,?,?)";

//          2 passo - conectar o banco de dados e organizar os comandos SQL            
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, obj.getVenda().getId());
            stmt.setInt(2, obj.getProduto().getId());
            stmt.setInt(3, obj.getQtd());
            stmt.setDouble(4, obj.getSubtotal());

//          3 passo - executar o comandos SQL
            stmt.execute();
            stmt.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ERRO: " + erro);
        }
        
    }
    //LISTAR ITENS DE UMA VENDA POR ID
    public List<ItemVendas> listarItensPorVendas(int venda_id) {

        try {

            //criando a lista
            List<ItemVendas> lista = new ArrayList<>();

            //Criando o comando sql, organizando e executando
            String sql = "select i.id, p.descricao, i.qtd, p.preco_venda, i.subtotal from tb_itensvendas as i "
                    + " inner join tb_produtos as p on(i.produto_id = p.id) where i.venda_id = ? ";

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, venda_id);
            

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
               ItemVendas item = new ItemVendas();
               Produtos prod = new Produtos();
               
               item.setId(rs.getInt("i.id"));
               prod.setDescricao(rs.getString("p.descricao"));
               item.setQtd(rs.getInt("i.qtd"));
               prod.setPreco(rs.getDouble("p.preco_venda"));
               item.setSubtotal(rs.getDouble("i.subtotal"));
               
               item.setProduto(prod);
               
              
                lista.add(item);
            }
            return lista;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
            return null;
        }
    }
    
}
