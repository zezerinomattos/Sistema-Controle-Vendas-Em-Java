package br.com.projeto.view;

import br.com.projeto.dao.ClientesDAO;
import br.com.projeto.model.Clientes;
import br.com.projeto.model.Utilitarios;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmProdutos extends javax.swing.JFrame {

    //METODO LISTAR NA TABELA
    public void listar() {
        ClientesDAO dao = new ClientesDAO();
        List<Clientes> lista = dao.listaClientes();
        DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();
        dados.setNumRows(0);

        for (Clientes c : lista) {
            dados.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getRg(),
                c.getCpf(),
                c.getEmail(),
                c.getTelefone(),
                c.getCelular(),
                c.getCep(),
                c.getEndereco(),
                c.getNumero(),
                c.getComplemento(),
                c.getBairro(),
                c.getCidade(),
                c.getUf()
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
        txtpreco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cbfornecedor = new javax.swing.JComboBox<>();
        btnbusca = new javax.swing.JButton();
        txtqtdestoque = new javax.swing.JTextField();
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
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        painel_dados.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Código:");

        txtcodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtdescricao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Descrição:");

        txtpreco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Preço:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Qtd.Estoque:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Fornecedor:");

        cbfornecedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbfornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", " " }));

        btnbusca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnbusca.setText("Pesquisar");
        btnbusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscaActionPerformed(evt);
            }
        });

        txtqtdestoque.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout painel_dadosLayout = new javax.swing.GroupLayout(painel_dados);
        painel_dados.setLayout(painel_dadosLayout);
        painel_dadosLayout.setHorizontalGroup(
            painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_dadosLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_dadosLayout.createSequentialGroup()
                        .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnbusca))
                    .addComponent(txtdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cbfornecedor, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painel_dadosLayout.createSequentialGroup()
                            .addComponent(txtpreco, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(16, 16, 16)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtqtdestoque, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(504, Short.MAX_VALUE))
        );
        painel_dadosLayout.setVerticalGroup(
            painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_dadosLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbusca))
                .addGap(18, 18, 18)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtpreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtqtdestoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cbfornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(153, Short.MAX_VALUE))
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
                "Código", "Descrição", "Preço", "Qtd. Estoque", "Fornecedor"
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
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
                .addGap(247, 247, 247)
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
                .addComponent(jTabbedPane1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsalvar)
                    .addComponent(btneditar)
                    .addComponent(btnexcluir))
                .addGap(18, 18, 18))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btneditar, btnexcluir, btnovo, btnsalvar});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        // BOTAO EDITAR
        try {
            Clientes obj = new Clientes();
            obj.setNome(txtdescricao.getText());
            obj.setRg(txtrg.getText());
            obj.setCpf(txtcpf.getText());
            obj.setEmail(txtpreco.getText());
            obj.setTelefone(txtfixo.getText());
            obj.setCelular(txtcelular.getText());
            obj.setCep(txtcep.getText());
            obj.setEndereco(txtendereco.getText());
            obj.setNumero(Integer.parseInt(txtnumero.getText()));
            obj.setComplemento(txtcomplemento.getText());
            obj.setBairro(txtbairro.getText());
            obj.setCidade(txtcidade.getText());
            obj.setUf(cbfornecedor.getSelectedItem().toString());

            obj.setId(Integer.parseInt(txtcodigo.getText()));

            ClientesDAO dao = new ClientesDAO();
            dao.alterarCliente(obj);
            new Utilitarios().LimpaTela(painel_dados);
            txtcodigo.setEditable(true);

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro);
        }

    }//GEN-LAST:event_btneditarActionPerformed

    private void btnexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirActionPerformed
        // BOTAO EXCLUIR
        try {
            Clientes obj = new Clientes();

            obj.setId(Integer.parseInt(txtcodigo.getText()));

            ClientesDAO dao = new ClientesDAO();
            dao.excluirCliente(obj);

            new Utilitarios().LimpaTela(painel_dados);
            txtcodigo.setEditable(true);

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
    }//GEN-LAST:event_btnexcluirActionPerformed

    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed
        // BOTAO SALVAR
        try {
            Clientes obj = new Clientes();
            obj.setNome(txtdescricao.getText());
            obj.setRg(txtrg.getText());
            obj.setCpf(txtcpf.getText());
            obj.setEmail(txtpreco.getText());
            obj.setTelefone(txtfixo.getText());
            obj.setCelular(txtcelular.getText());
            obj.setCep(txtcep.getText());
            obj.setEndereco(txtendereco.getText());
            obj.setNumero(Integer.parseInt(txtnumero.getText()));
            obj.setComplemento(txtcomplemento.getText());
            obj.setBairro(txtbairro.getText());
            obj.setCidade(txtcidade.getText());
            obj.setUf(cbfornecedor.getSelectedItem().toString());

            ClientesDAO dao = new ClientesDAO();
            dao.cadastrarCliente(obj);

            new Utilitarios().LimpaTela(painel_dados);
            txtcodigo.setEditable(true);

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro);
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
        txtrg.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 2).toString());
        txtcpf.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 3).toString());
        txtpreco.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 4).toString());
        txtfixo.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 5).toString());
        txtcelular.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 6).toString());
        txtcep.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 7).toString());
        txtendereco.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 8).toString());
        txtnumero.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 9).toString());
        txtcomplemento.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 10).toString());
        txtbairro.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 11).toString());
        txtcidade.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 12).toString());
        cbfornecedor.setSelectedItem(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 13).toString());

        txtcodigo.setEditable(false);

    }//GEN-LAST:event_tabelaProdutosMouseClicked

    private void btnpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesquisarActionPerformed
        // BOTÃO PESQUISAR FORMULARIO DA TABELA

        if (!txtpesquisaCod.getText().equals("")) {

            try {

                int id = Integer.parseInt(txtpesquisaCod.getText());

                ClientesDAO dao = new ClientesDAO();
                List<Clientes> lista = dao.buscaClientePorCod(id);
                DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();
                dados.setNumRows(0);

                for (Clientes c : lista) {
                    dados.addRow(new Object[]{
                        c.getId(),
                        c.getNome(),
                        c.getRg(),
                        c.getCpf(),
                        c.getEmail(),
                        c.getTelefone(),
                        c.getCelular(),
                        c.getCep(),
                        c.getEndereco(),
                        c.getNumero(),
                        c.getComplemento(),
                        c.getBairro(),
                        c.getCidade(),
                        c.getUf()
                    });

                }

            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "DIGITAR APENAS NUMEROS: " + erro);

            }

        } else if (!txtpesquisaDescricao.getText().equals("") && txtpesquisaCod.getText().equals("")) {

            try {

                String nome = "%" + txtpesquisaDescricao.getText() + "%";

                ClientesDAO dao = new ClientesDAO();
                List<Clientes> lista = dao.buscaClientePorNome(nome);
                DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();
                dados.setNumRows(0);

                for (Clientes c : lista) {
                    dados.addRow(new Object[]{
                        c.getId(),
                        c.getNome(),
                        c.getRg(),
                        c.getCpf(),
                        c.getEmail(),
                        c.getTelefone(),
                        c.getCelular(),
                        c.getCep(),
                        c.getEndereco(),
                        c.getNumero(),
                        c.getComplemento(),
                        c.getBairro(),
                        c.getCidade(),
                        c.getUf()
                    });

                }

            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "CLIENTE NÃO ENCONTRADO!" + erro);
            }

        } else if (txtpesquisaCod.getText().equals("") && !txtpesquisaCpf.getText().equals("")) {
            // BOTÃO PESQUISAR PRLO CPF
            try {

                String cpf = "%" + txtpesquisaCpf.getText() + "%";

                ClientesDAO dao = new ClientesDAO();
                List<Clientes> lista = dao.buscaClientePorCpf(cpf);
                DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();
                dados.setNumRows(0);

                for (Clientes c : lista) {
                    dados.addRow(new Object[]{
                        c.getId(),
                        c.getNome(),
                        c.getRg(),
                        c.getCpf(),
                        c.getEmail(),
                        c.getTelefone(),
                        c.getCelular(),
                        c.getCep(),
                        c.getEndereco(),
                        c.getNumero(),
                        c.getComplemento(),
                        c.getBairro(),
                        c.getCidade(),
                        c.getUf()
                    });

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "CPF NÃO ENCONTRADO!");
            }

        }
    }//GEN-LAST:event_btnpesquisarActionPerformed

    private void txtpesquisaDescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpesquisaDescricaoKeyPressed
        // PESQUISANDO AO DIGITAR NO CAMPO PESQUISAR 

        String nome = "%" + txtpesquisaDescricao.getText() + "%";

        ClientesDAO dao = new ClientesDAO();
        List<Clientes> lista = dao.buscaClientePorNome(nome);
        DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();
        dados.setNumRows(0);

        for (Clientes c : lista) {
            dados.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getRg(),
                c.getCpf(),
                c.getEmail(),
                c.getTelefone(),
                c.getCelular(),
                c.getCep(),
                c.getEndereco(),
                c.getNumero(),
                c.getComplemento(),
                c.getBairro(),
                c.getCidade(),
                c.getUf()
            });

        }


    }//GEN-LAST:event_txtpesquisaDescricaoKeyPressed

    private void txtpesquisaCodKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpesquisaCodKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpesquisaCodKeyPressed

    private void btnatualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatualizarActionPerformed
        //NOTÃO PARA ATUALIZAR TABELA
        listar();
        new Utilitarios().LimpaTela(painel_dados);
        new Utilitarios().LimpaTela(painel_tabela);
        txtcodigo.setEditable(true);

    }//GEN-LAST:event_btnatualizarActionPerformed

    private void btnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnovoActionPerformed
        // BOTAO NOVO
        new Utilitarios().LimpaTela(painel_dados);
        txtcodigo.setEditable(true);
    }//GEN-LAST:event_btnovoActionPerformed

    private void btnbuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscaActionPerformed

        if (!txtcodigo.getText().equals("")) {

            //BOTAO BUSCAR FORMULÁRIO DE DADOS DO CLIENTE
            try {
                int id = Integer.parseInt(txtcodigo.getText());
                Clientes obj = new Clientes();
                ClientesDAO dao = new ClientesDAO();

                obj = dao.consultaPorCod(id);

                // exibindo os dados do obj no formulario
                txtcodigo.setText(String.valueOf(obj.getId()));
                txtdescricao.setText(obj.getNome());
                txtrg.setText(obj.getRg());
                txtcpf.setText(obj.getCpf());
                txtpreco.setText(obj.getEmail());
                txtfixo.setText(obj.getTelefone());
                txtcelular.setText(obj.getCelular());
                txtcep.setText(obj.getCep());
                txtendereco.setText(obj.getEndereco());
                txtnumero.setText(String.valueOf(obj.getNumero()));
                txtcomplemento.setText(obj.getComplemento());
                txtbairro.setText(obj.getBairro());
                txtcidade.setText(obj.getCidade());
                cbfornecedor.setSelectedItem(obj.getUf());

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "FAVOR DIGITAR UM CODIGO OU CPF VALIDO DE CLIENTE!");
                txtcodigo.setText("");
                txtcpf.requestFocusInWindow();
            }

        } else if (txtcodigo.getText().equals("") && !txtcpf.getText().equals("")) {

            String cpf = txtcpf.getText();
            Clientes obj = new Clientes();
            ClientesDAO dao = new ClientesDAO();

            obj = dao.consultaPorCpf(cpf);

            if (obj.getCpf() != null) {
                // exibindo os dados do obj no formulario
                txtcodigo.setText(String.valueOf(obj.getId()));
                txtdescricao.setText(obj.getNome());
                txtrg.setText(obj.getRg());
                txtcpf.setText(obj.getCpf());
                txtpreco.setText(obj.getEmail());
                txtfixo.setText(obj.getTelefone());
                txtcelular.setText(obj.getCelular());
                txtcep.setText(obj.getCep());
                txtendereco.setText(obj.getEndereco());
                txtnumero.setText(String.valueOf(obj.getNumero()));
                txtcomplemento.setText(obj.getComplemento());
                txtbairro.setText(obj.getBairro());
                txtcidade.setText(obj.getCidade());
                cbfornecedor.setSelectedItem(obj.getUf());

            } else {
                JOptionPane.showMessageDialog(null, "CPF NÃO CADASTRADO!");
                txtcpf.requestFocusInWindow();
            }
        }
        txtcodigo.setEditable(false);

    }//GEN-LAST:event_btnbuscaActionPerformed

    private void txtpesquisaFornecedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpesquisaFornecedorKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpesquisaFornecedorKeyPressed

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
    private javax.swing.JComboBox<String> cbfornecedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel painel_dados;
    private javax.swing.JPanel painel_tabela;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdescricao;
    private javax.swing.JTextField txtpesquisaCod;
    private javax.swing.JTextField txtpesquisaDescricao;
    private javax.swing.JTextField txtpesquisaFornecedor;
    private javax.swing.JTextField txtpreco;
    private javax.swing.JTextField txtqtdestoque;
    // End of variables declaration//GEN-END:variables
}
