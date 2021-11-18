package br.com.projeto.dao;

import br.com.projeto.jdbc.ConnectionFactory;
import br.com.projeto.model.ItemVendas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
}
