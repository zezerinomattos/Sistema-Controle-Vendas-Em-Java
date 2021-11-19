package br.com.projeto.view;

import br.com.projeto.dao.FornecedoresDAO;
import br.com.projeto.model.Fornecedores;
import br.com.projeto.model.Utilitarios;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmFornecedores extends javax.swing.JFrame {

    //METODO LISTAR NA TABELA
    public void listar() {
        FornecedoresDAO dao = new FornecedoresDAO();
        List<Fornecedores> lista = dao.listaFornecedores();
        DefaultTableModel dados = (DefaultTableModel) tabelaFornecedores.getModel();
        dados.setNumRows(0);

        for (Fornecedores c : lista) {
            dados.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getCnpj(),
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

    public FrmFornecedores() {
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
        txtnome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtcelular = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txtfixo = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        txtcep = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        txtendereco = new javax.swing.JTextField();
        txtnumero = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtbairro = new javax.swing.JTextField();
        txtcidade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtcomplemento = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtcnpj = new javax.swing.JFormattedTextField();
        cbuf = new javax.swing.JComboBox<>();
        btnbusca = new javax.swing.JButton();
        painel_tabela = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtpesquisanome = new javax.swing.JTextField();
        btnpesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFornecedores = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtpesquisaCod = new javax.swing.JTextField();
        btnatualizar = new javax.swing.JButton();
        txtpesquisaCnpj = new javax.swing.JFormattedTextField();
        btnovo = new javax.swing.JButton();
        btnsalvar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btnexcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro de Fornecedores");

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

        txtnome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Nome:");

        txtemail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("E-mail:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Celular:");

        try {
            txtcelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtcelular.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Telefone (fixo):");

        try {
            txtfixo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtfixo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("CEP:");

        try {
            txtcep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtcep.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtcep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcepKeyPressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Endereço:");

        txtendereco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtnumero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("N°:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Bairro:");

        txtbairro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtcidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Cidade:");

        txtcomplemento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Complemento:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("UF:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("CNPJ:");

        try {
            txtcnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtcnpj.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cbuf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbuf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", " " }));

        btnbusca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnbusca.setText("Pesquisar");
        btnbusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel_dadosLayout = new javax.swing.GroupLayout(painel_dados);
        painel_dados.setLayout(painel_dadosLayout);
        painel_dadosLayout.setHorizontalGroup(
            painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_dadosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_dadosLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painel_dadosLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnbusca))
                    .addGroup(painel_dadosLayout.createSequentialGroup()
                        .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painel_dadosLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtcelular, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painel_dadosLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtcep, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtendereco, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painel_dadosLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtfixo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painel_dadosLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(painel_dadosLayout.createSequentialGroup()
                        .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtbairro, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(txtcnpj))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcidade, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcomplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbuf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(121, Short.MAX_VALUE))
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
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtfixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtcep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtendereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_dadosLayout.createSequentialGroup()
                        .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(txtcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12)
                                .addComponent(txtcomplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13)
                                .addComponent(cbuf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtbairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dados pessoais", painel_dados);

        painel_tabela.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Nome:");

        txtpesquisanome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtpesquisanome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpesquisanomeKeyPressed(evt);
            }
        });

        btnpesquisar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnpesquisar.setText("Pesquisar");
        btnpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesquisarActionPerformed(evt);
            }
        });

        tabelaFornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "CNPJ", "E-mail", "Telefone", "Celular", "CEP", "Endereço", "N°", "Comp", "Bairro", "Cidade", "UF"
            }
        ));
        tabelaFornecedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaFornecedoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaFornecedores);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("CNPJ:");

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

        try {
            txtpesquisaCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtpesquisaCnpj.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

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
                                .addGroup(painel_tabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painel_tabelaLayout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtpesquisanome, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(painel_tabelaLayout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabel18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtpesquisaCod, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtpesquisaCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnpesquisar))
                            .addComponent(btnatualizar))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                    .addComponent(txtpesquisanome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(btnpesquisar)
                    .addComponent(txtpesquisaCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnatualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consulta de Fornecedores", painel_tabela);

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        // BOTAO EDITAR
        try {
            Fornecedores obj = new Fornecedores();
            obj.setNome(txtnome.getText());
            obj.setCnpj(txtcnpj.getText());
            obj.setEmail(txtemail.getText());
            obj.setTelefone(txtfixo.getText());
            obj.setCelular(txtcelular.getText());
            obj.setCep(txtcep.getText());
            obj.setEndereco(txtendereco.getText());
            obj.setNumero(Integer.parseInt(txtnumero.getText()));
            obj.setComplemento(txtcomplemento.getText());
            obj.setBairro(txtbairro.getText());
            obj.setCidade(txtcidade.getText());
            obj.setUf(cbuf.getSelectedItem().toString());

            obj.setId(Integer.parseInt(txtcodigo.getText()));

            FornecedoresDAO dao = new FornecedoresDAO();
            dao.alterarFornecedores(obj);
            new Utilitarios().LimpaTela(painel_dados);
            txtcodigo.setEditable(true);

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro);
        }

    }//GEN-LAST:event_btneditarActionPerformed

    private void btnexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirActionPerformed
        // BOTAO EXCLUIR
        try {
            Fornecedores obj = new Fornecedores();

            obj.setId(Integer.parseInt(txtcodigo.getText()));

            FornecedoresDAO dao = new FornecedoresDAO();
            dao.excluirFornecedores(obj);

            new Utilitarios().LimpaTela(painel_dados);
            txtcodigo.setEditable(true);

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
    }//GEN-LAST:event_btnexcluirActionPerformed

    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed
        // BOTAO SALVAR
        try {
            Fornecedores obj = new Fornecedores();
            obj.setNome(txtnome.getText());
            obj.setCnpj(txtcnpj.getText());
            obj.setEmail(txtemail.getText());
            obj.setTelefone(txtfixo.getText());
            obj.setCelular(txtcelular.getText());
            obj.setCep(txtcep.getText());
            obj.setEndereco(txtendereco.getText());
            obj.setNumero(Integer.parseInt(txtnumero.getText()));
            obj.setComplemento(txtcomplemento.getText());
            obj.setBairro(txtbairro.getText());
            obj.setCidade(txtcidade.getText());
            obj.setUf(cbuf.getSelectedItem().toString());

            FornecedoresDAO dao = new FornecedoresDAO();
            dao.cadastrarFornecedores(obj);

            new Utilitarios().LimpaTela(painel_dados);
            txtcodigo.setEditable(true);

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "testando o erro" + erro);
        }

    }//GEN-LAST:event_btnsalvarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // CARREGA A LISTA
        listar();

    }//GEN-LAST:event_formWindowActivated

    private void tabelaFornecedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaFornecedoresMouseClicked
        // PEGA OS DADOS
        jTabbedPane1.setSelectedIndex(0);
        txtcodigo.setText(tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(), 0).toString());
        txtnome.setText(tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(), 1).toString());
        txtcnpj.setText(tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(), 2).toString());
        txtemail.setText(tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(), 3).toString());
        txtfixo.setText(tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(), 4).toString());
        txtcelular.setText(tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(), 5).toString());
        txtcep.setText(tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(), 6).toString());
        txtendereco.setText(tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(), 7).toString());
        txtnumero.setText(tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(), 8).toString());
        txtcomplemento.setText(tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(), 9).toString());
        txtbairro.setText(tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(), 10).toString());
        txtcidade.setText(tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(), 11).toString());
        cbuf.setSelectedItem(tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(), 12).toString());

        txtcodigo.setEditable(false);

    }//GEN-LAST:event_tabelaFornecedoresMouseClicked

    private void btnpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesquisarActionPerformed
        // BOTÃO PESQUISAR FORMULARIO DA TABELA

        if (!txtpesquisaCod.getText().equals("")) {

            try {

                int id = Integer.parseInt(txtpesquisaCod.getText());

                FornecedoresDAO dao = new FornecedoresDAO();
                List<Fornecedores> lista = dao.buscaFornecedorPorCod(id);
                DefaultTableModel dados = (DefaultTableModel) tabelaFornecedores.getModel();
                dados.setNumRows(0);

                for (Fornecedores c : lista) {
                    dados.addRow(new Object[]{
                        c.getId(),
                        c.getNome(),
                        c.getCnpj(),
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

        } else if (!txtpesquisanome.getText().equals("") && txtpesquisaCod.getText().equals("")) {

            try {

                String nome = "%" + txtpesquisanome.getText() + "%";

                FornecedoresDAO dao = new FornecedoresDAO();
                List<Fornecedores> lista = dao.buscaFornecedorPorNome(nome);
                DefaultTableModel dados = (DefaultTableModel) tabelaFornecedores.getModel();
                dados.setNumRows(0);

                for (Fornecedores c : lista) {
                    dados.addRow(new Object[]{
                        c.getId(),
                        c.getNome(),
                        c.getCnpj(),
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
                JOptionPane.showMessageDialog(null, "FORNECEDOR NÃO ENCONTRADO!" + erro);
            }

        } else if (txtpesquisaCod.getText().equals("") && !txtpesquisaCnpj.getText().equals("")) {
            // BOTÃO PESQUISAR PRLO CNPJ
            try {

                String cnpj = "%" + txtpesquisaCnpj.getText() + "%";

                FornecedoresDAO dao = new FornecedoresDAO();
                List<Fornecedores> lista = dao.buscaFornecedorPorCnpj(cnpj);
                DefaultTableModel dados = (DefaultTableModel) tabelaFornecedores.getModel();
                dados.setNumRows(0);

                for (Fornecedores c : lista) {
                    dados.addRow(new Object[]{
                        c.getId(),
                        c.getNome(),
                        c.getCnpj(),
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
                JOptionPane.showMessageDialog(null, "CNPJ NÃO ENCONTRADO!");
            }

        }
    }//GEN-LAST:event_btnpesquisarActionPerformed

    private void txtpesquisanomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpesquisanomeKeyPressed
        // PESQUISANDO AO DIGITAR NO CAMPO PESQUISAR 

        String nome = "%" + txtpesquisanome.getText() + "%";

        FornecedoresDAO dao = new FornecedoresDAO();
        List<Fornecedores> lista = dao.buscaFornecedorPorNome(nome);
        DefaultTableModel dados = (DefaultTableModel) tabelaFornecedores.getModel();
        dados.setNumRows(0);

        for (Fornecedores c : lista) {
            dados.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getCnpj(),
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


    }//GEN-LAST:event_txtpesquisanomeKeyPressed

    private void txtpesquisaCodKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpesquisaCodKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpesquisaCodKeyPressed

    private void btnatualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatualizarActionPerformed
        //BOTÃO PARA ATUALIZAR TABELA
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

            //BOTAO BUSCAR FORMULÁRIO DE DADOS DO FORNECEDOR
            try {
                int id = Integer.parseInt(txtcodigo.getText());
                Fornecedores obj = new Fornecedores();
                FornecedoresDAO dao = new FornecedoresDAO();

                obj = dao.consultaFornecedorPorCod(id);

                // exibindo os dados do obj no formulario
                txtcodigo.setText(String.valueOf(obj.getId()));
                txtnome.setText(obj.getNome());
                txtcnpj.setText(obj.getCnpj());
                txtemail.setText(obj.getEmail());
                txtfixo.setText(obj.getTelefone());
                txtcelular.setText(obj.getCelular());
                txtcep.setText(obj.getCep());
                txtendereco.setText(obj.getEndereco());
                txtnumero.setText(String.valueOf(obj.getNumero()));
                txtcomplemento.setText(obj.getComplemento());
                txtbairro.setText(obj.getBairro());
                txtcidade.setText(obj.getCidade());
                cbuf.setSelectedItem(obj.getUf());

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "FAVOR DIGITAR UM CODIGO OU CNPJ VALIDO DE FORNECEDOR!");
                txtcodigo.setText("");
                txtcnpj.requestFocusInWindow();
            }

        } else if (txtcodigo.getText().equals("") && !txtcnpj.getText().equals("")) {

            String cnpj = txtcnpj.getText();
            Fornecedores obj = new Fornecedores();
            FornecedoresDAO dao = new FornecedoresDAO();

            obj = dao.consultaFornecedorPorCnpj(cnpj);

            if (obj.getCnpj()!= null) {
                // exibindo os dados do obj no formulario
                txtcodigo.setText(String.valueOf(obj.getId()));
                txtnome.setText(obj.getNome());
                txtcnpj.setText(obj.getCnpj());
                txtemail.setText(obj.getEmail());
                txtfixo.setText(obj.getTelefone());
                txtcelular.setText(obj.getCelular());
                txtcep.setText(obj.getCep());
                txtendereco.setText(obj.getEndereco());
                txtnumero.setText(String.valueOf(obj.getNumero()));
                txtcomplemento.setText(obj.getComplemento());
                txtbairro.setText(obj.getBairro());
                txtcidade.setText(obj.getCidade());
                cbuf.setSelectedItem(obj.getUf());

            } else {
                JOptionPane.showMessageDialog(null, "CNPJ NÃO CADASTRADO!");
                txtcnpj.requestFocusInWindow();
            }
        }
        txtcodigo.setEditable(false);

    }//GEN-LAST:event_btnbuscaActionPerformed

    private void txtcepKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcepKeyPressed
        // CARREGANDO CEP NO FORMULARIO
        try {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                Fornecedores obj = new Fornecedores();
                FornecedoresDAO dao = new FornecedoresDAO();
                obj = dao.buscaCep(txtcep.getText());

                txtendereco.setText(obj.getEndereco());
                txtbairro.setText(obj.getBairro());
                txtcidade.setText(obj.getCidade());
                cbuf.setSelectedItem(obj.getUf());

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "COLOQUE O ENDEREÇO MANUALMENTE E CONTINUE COM O CADASTRO!");
        }


    }//GEN-LAST:event_txtcepKeyPressed

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
            java.util.logging.Logger.getLogger(FrmFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmFornecedores().setVisible(true);
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
    private javax.swing.JComboBox<String> cbuf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel painel_dados;
    private javax.swing.JPanel painel_tabela;
    private javax.swing.JTable tabelaFornecedores;
    private javax.swing.JTextField txtbairro;
    private javax.swing.JFormattedTextField txtcelular;
    private javax.swing.JFormattedTextField txtcep;
    private javax.swing.JTextField txtcidade;
    private javax.swing.JFormattedTextField txtcnpj;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtcomplemento;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtendereco;
    private javax.swing.JFormattedTextField txtfixo;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtnumero;
    private javax.swing.JFormattedTextField txtpesquisaCnpj;
    private javax.swing.JTextField txtpesquisaCod;
    private javax.swing.JTextField txtpesquisanome;
    // End of variables declaration//GEN-END:variables
}
