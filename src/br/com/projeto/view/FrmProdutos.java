package br.com.projeto.view;

import br.com.projeto.dao.FornecedoresDAO;
import br.com.projeto.dao.ProdutosDAO;
import br.com.projeto.model.Fornecedores;
import br.com.projeto.model.Produtos;
import br.com.projeto.model.Utilitarios;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmProdutos extends javax.swing.JFrame {

    //METODO LISTAR NA TABELA
    public void listar() {
        ProdutosDAO dao = new ProdutosDAO();
        List<Produtos> lista = dao.listaProdutos();
        DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();
        dados.setNumRows(0);

        for (Produtos c : lista) {
            dados.addRow(new Object[]{
                c.getId(),
                c.getDescricao(),
                c.getMarca(),
                c.getCorPredominante(),
                c.getCorDetalhes(),
                c.getTamanho(),
                c.getQtd_estoque(),
                c.getPreco(),
                c.getFornecedor().getNome(),
                c.getPreco_custo(),
                c.getPorcentagem_aumento(),
                c.getLucro(),
                c.getObs()
            //   c.getEntrada(),
            //    c.getSaida()
            });

        }

    }

    public FrmProdutos() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        painel_dados = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txtdescricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtlucro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cbfornecedor = new javax.swing.JComboBox();
        btnbusca = new javax.swing.JButton();
        txtqtdestoque = new javax.swing.JTextField();
        txtcusto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtprecoVenda = new javax.swing.JTextField();
        txtporcentagem = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtentrada = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtsaida = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtmarca = new javax.swing.JTextField();
        txttamanho = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtcorpredominante = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtcordetalhes = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtobs = new javax.swing.JTextArea();
        painel_tabela = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtpesquisaDescricao = new javax.swing.JTextField();
        btnpesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtpesquisaCod = new javax.swing.JTextField();
        btnatualizar = new javax.swing.JButton();
        txtpesquisaFornecedor = new javax.swing.JTextField();
        btnovo = new javax.swing.JButton();
        btnsalvar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btnexcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro de Produtos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        painel_dados.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Código:");

        txtcodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtdescricao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Descrição:");

        txtlucro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Lucro Previsto:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Qtd.Estoque:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Fornecedor:");

        cbfornecedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbfornecedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        cbfornecedor.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                cbfornecedorAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        btnbusca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnbusca.setText("Pesquisar");
        btnbusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscaActionPerformed(evt);
            }
        });

        txtqtdestoque.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtcusto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Custo:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Venda:");

        txtprecoVenda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtprecoVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecoVendaActionPerformed(evt);
            }
        });

        txtporcentagem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtporcentagem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtporcentagemKeyPressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("%:");

        txtentrada.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtentrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtentradaActionPerformed(evt);
            }
        });
        txtentrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtentradaKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Entrada:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Saída:");

        txtsaida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtsaida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsaidaKeyPressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Marca:");

        txtmarca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txttamanho.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Tamanho:");

        txtcorpredominante.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Cor Predominante:");

        txtcordetalhes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Detalhes:");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("Obs:");

        txtobs.setColumns(20);
        txtobs.setRows(5);
        jScrollPane2.setViewportView(txtobs);

        javax.swing.GroupLayout painel_dadosLayout = new javax.swing.GroupLayout(painel_dados);
        painel_dados.setLayout(painel_dadosLayout);
        painel_dadosLayout.setHorizontalGroup(
            painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_dadosLayout.createSequentialGroup()
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_dadosLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painel_dadosLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtentrada, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painel_dadosLayout.createSequentialGroup()
                                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painel_dadosLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(txtlucro, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtprecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(painel_dadosLayout.createSequentialGroup()
                                        .addComponent(txtcusto, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(47, 47, 47)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtporcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtqtdestoque, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtsaida, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(painel_dadosLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(cbfornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(painel_dadosLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painel_dadosLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painel_dadosLayout.createSequentialGroup()
                                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel19))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(painel_dadosLayout.createSequentialGroup()
                                        .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(btnbusca))
                                    .addGroup(painel_dadosLayout.createSequentialGroup()
                                        .addComponent(txttamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtcorpredominante, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtcordetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(painel_dadosLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(369, Short.MAX_VALUE))
        );
        painel_dadosLayout.setVerticalGroup(
            painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_dadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbusca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txttamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtcorpredominante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtcordetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtentrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtsaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtqtdestoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_dadosLayout.createSequentialGroup()
                        .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtcusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtporcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_dadosLayout.createSequentialGroup()
                        .addComponent(txtprecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtlucro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(cbfornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dados do Produto", painel_dados);

        painel_tabela.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Descrição:");

        txtpesquisaDescricao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtpesquisaDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpesquisaDescricaoKeyPressed(evt);
            }
        });

        btnpesquisar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnpesquisar.setText("Pesquisar");
        btnpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesquisarActionPerformed(evt);
            }
        });

        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Marca", "Cor Pred.", "Detalhes", "Tamanho", "Qtd. Estoque", "Preço", "Fornecedor", "Custo", "%", "Lucro", "Obs"
            }
        ));
        tabelaProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaProdutos);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Fornecedor:");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Cód:");

        txtpesquisaCod.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtpesquisaCod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpesquisaCodKeyPressed(evt);
            }
        });

        btnatualizar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnatualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projeto/images/refresh.png"))); // NOI18N
        btnatualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatualizarActionPerformed(evt);
            }
        });

        txtpesquisaFornecedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtpesquisaFornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpesquisaFornecedorKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout painel_tabelaLayout = new javax.swing.GroupLayout(painel_tabela);
        painel_tabela.setLayout(painel_tabelaLayout);
        painel_tabelaLayout.setHorizontalGroup(
            painel_tabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_tabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_tabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1022, Short.MAX_VALUE)
                    .addGroup(painel_tabelaLayout.createSequentialGroup()
                        .addGroup(painel_tabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painel_tabelaLayout.createSequentialGroup()
                                .addGroup(painel_tabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel18))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painel_tabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painel_tabelaLayout.createSequentialGroup()
                                        .addComponent(txtpesquisaCod, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(painel_tabelaLayout.createSequentialGroup()
                                        .addComponent(txtpesquisaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtpesquisaFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnpesquisar))))
                            .addComponent(btnatualizar))
                        .addGap(211, 211, 211)))
                .addContainerGap())
        );
        painel_tabelaLayout.setVerticalGroup(
            painel_tabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_tabelaLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(painel_tabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtpesquisaCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_tabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtpesquisaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(btnpesquisar)
                    .addComponent(txtpesquisaFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnatualizar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consulta de Produtos", painel_tabela);

        btnovo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnovo.setText("+ NOVO");
        btnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnovoActionPerformed(evt);
            }
        });

        btnsalvar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnsalvar.setText("SALVAR");
        btnsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarActionPerformed(evt);
            }
        });

        btneditar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btneditar.setText("EDITAR");
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        btnexcluir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnexcluir.setText("EXCLUIR");
        btnexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(btnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnsalvar)
                .addGap(18, 18, 18)
                .addComponent(btneditar)
                .addGap(18, 18, 18)
                .addComponent(btnexcluir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btneditar, btnexcluir, btnovo, btnsalvar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsalvar)
                    .addComponent(btneditar)
                    .addComponent(btnexcluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btneditar, btnexcluir, btnovo, btnsalvar});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        // BOTAO EDITAR
        try {
            Produtos obj = new Produtos();
            obj.setDescricao(txtdescricao.getText());
            obj.setPreco_custo(Double.parseDouble(txtcusto.getText()));
            obj.setPorcentagem_aumento(Integer.parseInt(txtporcentagem.getText()));
            obj.setPreco(Double.parseDouble(txtprecoVenda.getText()));
            obj.setLucro(Double.parseDouble(txtlucro.getText()));

            obj.setMarca(txtmarca.getText());
            obj.setTamanho(txttamanho.getText());
            obj.setCorPredominante(txtcorpredominante.getText());
            obj.setCorDetalhes(txtcordetalhes.getText());
            obj.setObs(txtobs.getText());

            if (!txtentrada.getText().equals("") && txtsaida.getText().equals("")) {

                obj.setEntrada(Integer.parseInt(txtentrada.getText()));
                int estoque = Integer.parseInt(txtqtdestoque.getText());
                int entrada = Integer.parseInt(txtentrada.getText());
                int res = estoque + entrada;
                txtqtdestoque.setText(String.valueOf(res));
                obj.setQtd_estoque(Integer.parseInt(txtqtdestoque.getText()));

            } else if (!txtsaida.getText().equals("") && txtentrada.getText().equals("")) {
                obj.setSaida(Integer.parseInt(txtsaida.getText()));
                int estoque = Integer.parseInt(txtqtdestoque.getText());
                int saida = Integer.parseInt(txtsaida.getText());
                int res = estoque - saida;
                txtqtdestoque.setText(String.valueOf(res));
                obj.setQtd_estoque(Integer.parseInt(txtqtdestoque.getText()));
            }
            obj.setId(Integer.parseInt(txtcodigo.getText()));

            Fornecedores f = new Fornecedores();
            f = (Fornecedores) cbfornecedor.getSelectedItem();

            obj.setFornecedor(f);

            ProdutosDAO dao = new ProdutosDAO();
            dao.alterarProdutos(obj);
            new Utilitarios().LimpaTela(painel_dados);
            txtcodigo.setEditable(true);
            txtobs.setText("");

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }

    }//GEN-LAST:event_btneditarActionPerformed

    private void btnexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirActionPerformed
        // BOTAO EXCLUIR
        try {
            Produtos obj = new Produtos();

            obj.setId(Integer.parseInt(txtcodigo.getText()));

            ProdutosDAO dao = new ProdutosDAO();
            dao.excluirProdutos(obj);

            new Utilitarios().LimpaTela(painel_dados);
            txtcodigo.setEditable(true);
            txtobs.setText("");

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
    }//GEN-LAST:event_btnexcluirActionPerformed

    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed
        // BOTAO SALVAR

        try {
            Produtos obj = new Produtos();
            obj.setDescricao(txtdescricao.getText());
            obj.setPreco_custo(Double.parseDouble(txtcusto.getText()));
            obj.setPorcentagem_aumento(Integer.parseInt(txtporcentagem.getText()));
            obj.setPreco(Double.parseDouble(txtprecoVenda.getText()));
            obj.setLucro(Double.parseDouble(txtlucro.getText()));

            obj.setMarca(txtmarca.getText());
            obj.setTamanho(txttamanho.getText());
            obj.setCorPredominante(txtcorpredominante.getText());
            obj.setCorDetalhes(txtcordetalhes.getText());
            obj.setObs(txtobs.getText());

            //FAZENDO COM QUE O SISTEMA FAÇA ENTRADA PELO CAMPO DE ENTRADA
            if (!txtentrada.getText().equals("") && txtsaida.getText().equals("") && txtqtdestoque.getText().equals("")) {
                obj.setEntrada(Integer.parseInt(txtentrada.getText()));
                obj.setQtd_estoque(Integer.parseInt(txtentrada.getText()));
            } else if (txtentrada.getText().equals("") && !txtsaida.getText().equals("") && txtqtdestoque.getText().equals("")) {
                obj.setSaida(Integer.parseInt(txtsaida.getText()));
                obj.setQtd_estoque(Integer.parseInt(txtsaida.getText()));
            }
            //   obj.setQtd_estoque(Integer.parseInt(txtqtdestoque.getText()));

            //Criando o objeto fornecedor
            Fornecedores f = new Fornecedores();
            f = (Fornecedores) cbfornecedor.getSelectedItem();
            obj.setFornecedor(f);

            ProdutosDAO dao = new ProdutosDAO();
            dao.cadastrarProdutos(obj);

            new Utilitarios().LimpaTela(painel_dados);
            txtcodigo.setEditable(true);
            txtobs.setText("");

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }

    }//GEN-LAST:event_btnsalvarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // CARREGA A LISTA
        listar();

    }//GEN-LAST:event_formWindowActivated

    private void tabelaProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProdutosMouseClicked
        // PEGA OS DADOS
        jTabbedPane1.setSelectedIndex(0);
        txtcodigo.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 0).toString());
        txtdescricao.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 1).toString());
        txtmarca.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 2).toString());
        txtcorpredominante.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 3).toString());
        txtcordetalhes.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 4).toString());
        txttamanho.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 5).toString());
        txtqtdestoque.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 6).toString());
        txtprecoVenda.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 7).toString());
        txtcusto.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 9).toString());
        txtporcentagem.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 10).toString());
        txtlucro.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 11).toString());
        txtobs.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 12).toString());
        //   txtentrada.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 13).toString());
        //   txtsaida.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 14).toString());

        //CRIANDO O OBJETO DO TIPO FORNECDOR PRA PODER ALTERAR
        Fornecedores f = new Fornecedores();
        FornecedoresDAO dao = new FornecedoresDAO();

        f = dao.consultaFornecedorPorNome(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 8).toString());
        cbfornecedor.removeAllItems();
        cbfornecedor.getModel().setSelectedItem(f);
        txtcodigo.setEditable(false);

        txtcodigo.setEditable(false);

    }//GEN-LAST:event_tabelaProdutosMouseClicked

    private void btnpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesquisarActionPerformed
        // BOTÃO PESQUISAR FORMULARIO DA TABELA

        if (!txtpesquisaCod.getText().equals("")) {

            try {

                int id = Integer.parseInt(txtpesquisaCod.getText());

                ProdutosDAO dao = new ProdutosDAO();
                List<Produtos> lista = dao.buscaProdutoPorCod(id);
                DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();
                dados.setNumRows(0);

                for (Produtos c : lista) {
                    dados.addRow(new Object[]{
                        c.getId(),
                        c.getDescricao(),
                        c.getMarca(),
                        c.getCorPredominante(),
                        c.getCorDetalhes(),
                        c.getTamanho(),
                        c.getQtd_estoque(),
                        c.getPreco(),
                        c.getFornecedor().getNome(),
                        c.getPreco_custo(),
                        c.getPorcentagem_aumento(),
                        c.getLucro(),
                        c.getObs()
                    //   c.getEntrada(),
                    //    c.getSaida()
                    });

                }

            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "DIGITAR APENAS NUMEROS: " + erro);

            }
            //PESQUISA POR DESCRIÇÃO DO PRODUTO
        } else if (!txtpesquisaDescricao.getText().equals("") && txtpesquisaCod.getText().equals("")) {

            try {

                String nome = "%" + txtpesquisaDescricao.getText() + "%";

                ProdutosDAO dao = new ProdutosDAO();
                List<Produtos> lista = dao.buscaProdutoPorNome(nome);
                DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();
                dados.setNumRows(0);

                for (Produtos c : lista) {
                    dados.addRow(new Object[]{
                        c.getId(),
                        c.getDescricao(),
                        c.getMarca(),
                        c.getCorPredominante(),
                        c.getCorDetalhes(),
                        c.getTamanho(),
                        c.getQtd_estoque(),
                        c.getPreco(),
                        c.getFornecedor().getNome(),
                        c.getPreco_custo(),
                        c.getPorcentagem_aumento(),
                        c.getLucro(),
                        c.getObs()
                    //   c.getEntrada(),
                    //    c.getSaida()
                    });
                }

            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "PRODUTO NÃO ENCONTRADO!" + erro);
            }

        } else if (txtpesquisaCod.getText().equals("") && !txtpesquisaFornecedor.getText().equals("")) {
            // BOTÃO PESQUISAR PRLO FORNECEDOR
            try {

                String fornecedor = "%" + txtpesquisaFornecedor.getText() + "%";

                ProdutosDAO dao = new ProdutosDAO();
                List<Produtos> lista = dao.buscaProdutoPorFornecedor(fornecedor);
                DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();
                dados.setNumRows(0);

                for (Produtos c : lista) {
                    dados.addRow(new Object[]{
                        c.getId(),
                        c.getDescricao(),
                        c.getMarca(),
                        c.getCorPredominante(),
                        c.getCorDetalhes(),
                        c.getTamanho(),
                        c.getQtd_estoque(),
                        c.getPreco(),
                        c.getFornecedor().getNome(),
                        c.getPreco_custo(),
                        c.getPorcentagem_aumento(),
                        c.getLucro(),
                        c.getObs()
                    //   c.getEntrada(),
                    //    c.getSaida()
                    });

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "PRODUTO NÃO ENCONTRADO!");
            }

        }
    }//GEN-LAST:event_btnpesquisarActionPerformed

    private void txtpesquisaDescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpesquisaDescricaoKeyPressed
        // PESQUISANDO AO DIGITAR NO CAMPO PESQUISAR 

        try {

            String nome = "%" + txtpesquisaDescricao.getText() + "%";

            ProdutosDAO dao = new ProdutosDAO();
            List<Produtos> lista = dao.buscaProdutoPorNome(nome);
            DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();
            dados.setNumRows(0);

            for (Produtos c : lista) {
                dados.addRow(new Object[]{
                    c.getId(),
                        c.getDescricao(),
                        c.getMarca(),
                        c.getCorPredominante(),
                        c.getCorDetalhes(),
                        c.getTamanho(),
                        c.getQtd_estoque(),
                        c.getPreco(),
                        c.getFornecedor().getNome(),
                        c.getPreco_custo(),
                        c.getPorcentagem_aumento(),
                        c.getLucro(),
                        c.getObs()
                    //   c.getEntrada(),
                    //    c.getSaida()
                });
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "PRODUTO NÃO ENCONTRADO!" + erro);
        }


    }//GEN-LAST:event_txtpesquisaDescricaoKeyPressed

    private void txtpesquisaCodKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpesquisaCodKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpesquisaCodKeyPressed

    private void btnatualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatualizarActionPerformed
        //BOTÃO PARA ATUALIZAR TABELA
        listar();
        new Utilitarios().LimpaTela(painel_dados);
        new Utilitarios().LimpaTela(painel_tabela);
        txtobs.setText("");
        txtcodigo.setEditable(true);

    }//GEN-LAST:event_btnatualizarActionPerformed

    private void btnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnovoActionPerformed
        // BOTAO NOVO
        new Utilitarios().LimpaTela(painel_dados);
        txtobs.setText("");
        txtcodigo.setEditable(true);
    }//GEN-LAST:event_btnovoActionPerformed

    private void btnbuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscaActionPerformed

        //BOTAO BUSCAR FORMULÁRIO DE DADOS DO PRODUTO
        try {
            int id = Integer.parseInt(txtcodigo.getText());
            Produtos obj = new Produtos();
            ProdutosDAO dao = new ProdutosDAO();

            obj = dao.consultaPorId(id);
            cbfornecedor.removeAllItems();

            // exibindo os dados do obj no formulario
            if (obj.getDescricao() != null) {
                txtcodigo.setText(String.valueOf(obj.getId()));
                txtdescricao.setText(obj.getDescricao());
                txtcusto.setText(String.valueOf(obj.getPreco_custo()));
                txtporcentagem.setText(String.valueOf(obj.getPorcentagem_aumento()));
                txtprecoVenda.setText(String.valueOf(obj.getPreco()));
                txtlucro.setText(String.valueOf(obj.getLucro()));
                txtqtdestoque.setText(String.valueOf(obj.getQtd_estoque()));

                txtmarca.setText(obj.getMarca());
                txttamanho.setText(obj.getTamanho());
                txtcorpredominante.setText(obj.getCorPredominante());
                txtcordetalhes.setText(obj.getCorDetalhes());
                txtobs.setText(obj.getObs());
                //    txtentrada.setText(String.valueOf(obj.getEntrada()));
                //    txtsaida.setText(String.valueOf(obj.getSaida()));

                Fornecedores f = new Fornecedores();
                FornecedoresDAO fdao = new FornecedoresDAO();

                f = fdao.consultaFornecedorPorNome(obj.getFornecedor().getNome());
                cbfornecedor.getModel().setSelectedItem(f);
            } else {
                JOptionPane.showMessageDialog(null, "PRODUTO NÃO ENCONTRADO!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "FAVOR DIGITAR UM CODIGO VALIDO DE PRODUTO!");
            txtcodigo.setText("");
            txtcodigo.requestFocusInWindow();
        }
        txtcodigo.setEditable(false);

    }//GEN-LAST:event_btnbuscaActionPerformed


    private void txtpesquisaFornecedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpesquisaFornecedorKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpesquisaFornecedorKeyPressed

    private void cbfornecedorAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cbfornecedorAncestorAdded
        // CARREGANDO O COMBOBOX FORNECEDORES
        FornecedoresDAO dao = new FornecedoresDAO();
        List<Fornecedores> listaFornecedores = dao.listaFornecedores();

        cbfornecedor.removeAll();

        for (Fornecedores f : listaFornecedores) {
            cbfornecedor.addItem(f);
        }
    }//GEN-LAST:event_cbfornecedorAncestorAdded
    private void cbfornecedorMouseClicked(java.awt.event.MouseEvent evt) {
        // CARREGANDO O COMBOBOX FORNECEDORES
        FornecedoresDAO dao = new FornecedoresDAO();
        List<Fornecedores> listadefornecedores = dao.listaFornecedores();
        cbfornecedor.removeAllItems();

        for (Fornecedores f : listadefornecedores) {
            cbfornecedor.addItem(f);
        }

    }


    private void txtprecoVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecoVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecoVendaActionPerformed

    private void txtentradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtentradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtentradaActionPerformed

    private void txtporcentagemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtporcentagemKeyPressed
        // PUXANDO METODO PORCENTAGEM:
        try {
            String val;
            double resultado = 0.0, diferenca = 0.0, valor2 = 0.0;
            double valor1 = Double.parseDouble(txtcusto.getText());
            valor2 = Double.parseDouble(txtporcentagem.getText());

            resultado = valor1 * (valor2 / 100) + valor1;
            diferenca = resultado - valor1;
            val = String.valueOf(resultado);
            txtprecoVenda.setText(val);
            txtlucro.setText(String.valueOf(diferenca));

        } catch (Exception e) {
        }

    }//GEN-LAST:event_txtporcentagemKeyPressed

    private void txtentradaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtentradaKeyPressed
        // FAZENDO A ENTRADA DO PRODUTO NO ESTOQUE
//        try {
//            int valor1 = Integer.parseInt(txtentrada.getText());
//            int valor2 = Integer.parseInt(txtqtdestoque.getText());
//            int resultado = valor2 + valor1;
//            txtqtdestoque.setText(String.valueOf(resultado));
//        } catch (Exception e) {
//        }
    }//GEN-LAST:event_txtentradaKeyPressed

    private void txtsaidaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsaidaKeyPressed
//        // FAZENDO A SAIDA DO PRODUTO NO ESTOQUE
//        try {
//            int valor1 = Integer.parseInt(txtsaida.getText());
//            int valor2 = Integer.parseInt(txtqtdestoque.getText());
//            int resultado = valor2 - valor1;
//            txtqtdestoque.setText(String.valueOf(resultado));
//        } catch (Exception e) {
//        }
    }//GEN-LAST:event_txtsaidaKeyPressed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnatualizar;
    private javax.swing.JButton btnbusca;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btnexcluir;
    private javax.swing.JButton btnovo;
    private javax.swing.JButton btnpesquisar;
    private javax.swing.JButton btnsalvar;
    private javax.swing.JComboBox cbfornecedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel painel_dados;
    private javax.swing.JPanel painel_tabela;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtcordetalhes;
    private javax.swing.JTextField txtcorpredominante;
    private javax.swing.JTextField txtcusto;
    private javax.swing.JTextField txtdescricao;
    private javax.swing.JTextField txtentrada;
    private javax.swing.JTextField txtlucro;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextArea txtobs;
    private javax.swing.JTextField txtpesquisaCod;
    private javax.swing.JTextField txtpesquisaDescricao;
    private javax.swing.JTextField txtpesquisaFornecedor;
    private javax.swing.JTextField txtporcentagem;
    private javax.swing.JTextField txtprecoVenda;
    private javax.swing.JTextField txtqtdestoque;
    private javax.swing.JTextField txtsaida;
    private javax.swing.JTextField txttamanho;
    // End of variables declaration//GEN-END:variables
}
