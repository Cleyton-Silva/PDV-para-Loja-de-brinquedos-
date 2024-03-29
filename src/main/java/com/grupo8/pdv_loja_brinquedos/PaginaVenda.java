/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.grupo8.pdv_loja_brinquedos;

import com.grupo8.pdv_loja_brinquedos.dao.ClienteDAO;
import com.grupo8.pdv_loja_brinquedos.dao.ProdutoDAO;
import com.grupo8.pdv_loja_brinquedos.dao.VendaDAO;
import com.grupo8.pdv_loja_brinquedos.model.Carrinho;
import com.grupo8.pdv_loja_brinquedos.model.CarrinhoItem;
import com.grupo8.pdv_loja_brinquedos.model.Cliente;
import com.grupo8.pdv_loja_brinquedos.model.Produto;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author arthu
 */
public class PaginaVenda extends javax.swing.JFrame {
    
   
    Produto produto = null;
    Cliente cliente = null;
    
    Carrinho carrinho = null;
           

    /**
     * Creates new form principal
     */
    public PaginaVenda() {
        initComponents();
        
        carrinho = new Carrinho();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        txtClienteNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jbpesquisar1 = new javax.swing.JButton();
        txtClienteCPF = new javax.swing.JFormattedTextField();
        jButton2 = new javax.swing.JButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel5 = new javax.swing.JLabel();
        txtProduto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jbpesquisar2 = new javax.swing.JButton();
        txtCodigo = new javax.swing.JFormattedTextField();
        txtqtd = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        txtValorTotal = new javax.swing.JTextField();
        jblimpar = new javax.swing.JButton();
        btnFinalizarVenda = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCarrinho = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();
        jblimpar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pagina de Vendas");
        setMinimumSize(new java.awt.Dimension(820, 700));
        getContentPane().setLayout(null);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 130, 70, 0);

        jLayeredPane1.setBackground(new java.awt.Color(0, 0, 0));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Cliente"));
        jLayeredPane1.setForeground(new java.awt.Color(0, 0, 0));
        jLayeredPane1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLayeredPane1KeyPressed(evt);
            }
        });

        txtClienteNome.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("CPF Cliente:");

        jbpesquisar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbpesquisar1.setText("Pesquisar");
        jbpesquisar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbpesquisar1ActionPerformed(evt);
            }
        });

        try {
            txtClienteCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtClienteCPF.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);
        txtClienteCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteCPFActionPerformed(evt);
            }
        });

        jButton2.setText("Remover");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(txtClienteNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jbpesquisar1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtClienteCPF, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtClienteNome)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtClienteCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbpesquisar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClienteCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbpesquisar1))
                .addGap(20, 20, 20))
        );

        getContentPane().add(jLayeredPane1);
        jLayeredPane1.setBounds(10, 60, 370, 160);

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Produto"));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Código:");

        txtProduto.setEditable(false);
        txtProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdutoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Produto:");

        txtPreco.setEditable(false);
        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Preço:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Quantidade:");

        jbpesquisar2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbpesquisar2.setText("Pesquisar");
        jbpesquisar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbpesquisar2ActionPerformed(evt);
            }
        });

        txtCodigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtCodigo.setToolTipText("");
        txtCodigo.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        txtqtd.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtqtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtqtdActionPerformed(evt);
            }
        });

        jButton1.setText("Adicionar Produto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLayeredPane2.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtProduto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtPreco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jbpesquisar2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtqtd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtqtd)))
                            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jbpesquisar2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel5)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtProduto)))
                        .addGap(32, 32, 32))))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbpesquisar2)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(4, 4, 4)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtqtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        getContentPane().add(jLayeredPane2);
        jLayeredPane2.setBounds(10, 230, 370, 290);

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createTitledBorder("Total Venda"));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("ValorTotal:");

        txtValorTotal.setEditable(false);
        txtValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorTotalActionPerformed(evt);
            }
        });

        jblimpar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jblimpar.setText("Limpar");
        jblimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jblimparActionPerformed(evt);
            }
        });

        btnFinalizarVenda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnFinalizarVenda.setText("Finalizar");
        btnFinalizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarVendaActionPerformed(evt);
            }
        });

        jLayeredPane3.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(txtValorTotal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jblimpar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(btnFinalizarVenda, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtValorTotal)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane3Layout.createSequentialGroup()
                        .addComponent(btnFinalizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(jblimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFinalizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(jLayeredPane3);
        jLayeredPane3.setBounds(390, 360, 390, 160);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel10.setText("Vendas");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 10, 210, 40);

        tblCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Produto", "Quantidade", "Preço Unitario", "Preço Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCarrinho);
        tblCarrinho.getAccessibleContext().setAccessibleName("c");

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(390, 70, 390, 220);

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar);
        btnVoltar.setBounds(10, 520, 120, 40);

        jblimpar1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jblimpar1.setText("Remover Item");
        jblimpar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jblimpar1ActionPerformed(evt);
            }
        });
        getContentPane().add(jblimpar1);
        jblimpar1.setBounds(390, 310, 390, 40);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jblimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jblimparActionPerformed
        //Limpo o carriho
        carrinho.setItens(new ArrayList<>());
        
        //Atualizar a tabela
        carregarCarrinho();                        
    }//GEN-LAST:event_jblimparActionPerformed

    private void btnFinalizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarVendaActionPerformed
        //Desativar bota de finalizar venda
        btnFinalizarVenda.setEnabled(false);
        
        // Valido se o cliente foi selecionado para informar o id no carrinho
        if(cliente != null) {
            carrinho.setClienteId(cliente.getId());            
        }
        
        // Realiza a venda
        boolean retorno = VendaDAO.realizarVenda(carrinho);
        
        //Se não executar tudo certo exibe mensagem de erro
        if(!retorno) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao realizar a venda!");       
            btnFinalizarVenda.setEnabled(true);
            return;
        }
        
        //Realiza o debito de produtos do estoque
        for(CarrinhoItem item : carrinho.getItens()) {
            //Obtem produto do carrinho
            var produtoCarrinho = item.getProduto();
            
            //Calcula novo estoque
            int novoEstoque = produtoCarrinho.getEstoque() - item.getProdutoQtd();                       
            
            produtoCarrinho.setEstoque(novoEstoque);
            
            
            //Altera o novo produto com novo estoque
            ProdutoDAO.alterar(produtoCarrinho);
            
            item.setProduto(produtoCarrinho);
        }
        
        JOptionPane.showMessageDialog(null, "Venda Realizada!");       

        carrinho = new Carrinho();
        
        //Atualiza a tabela
        carregarCarrinho();
        
        //Reabilita o botao
        btnFinalizarVenda.setEnabled(true);
        
    }//GEN-LAST:event_btnFinalizarVendaActionPerformed

    private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoActionPerformed

    private void txtProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdutoActionPerformed

    private void jLayeredPane1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLayeredPane1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLayeredPane1KeyPressed

    private void jbpesquisar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbpesquisar1ActionPerformed
        
        //Obter o cpf digitado
        String cpf = txtClienteCPF.getText().replaceAll("\\D+","");
        
        //Valido se o cpf foi digitado
        if(cpf.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite o cpf do cliente"); 
            return;
        }
        
        //Carrego o cliente pelo cpf
        cliente = ClienteDAO.carregarPorCpf(cpf);
        
        //Valido se o cliente foi encontrado
        if(cliente == null) {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado"); 
            return;
        }
        
        //Colocar na tela o nome do cliente
        txtClienteNome.setText(cliente.getNome());
    }//GEN-LAST:event_jbpesquisar1ActionPerformed

    private void jbpesquisar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbpesquisar2ActionPerformed
        // Obter o codigo digitado
        int codigo = txtCodigo.getText().isEmpty() ? 0 : Integer.parseInt(txtCodigo.getText());
        
        //Validar se o codigo foi digitado
        if(codigo == 0) {
            JOptionPane.showMessageDialog(null, "Digite um código válido"); 
            return;
        }
        
        //Obter o produto
        produto = ProdutoDAO.carregar(codigo);
        
        //Validar se o produto existe
        if(produto == null) {
            JOptionPane.showMessageDialog(null, "Código não encontrado"); 
            return;
        }
        
        //Valido se o produto possui estoque
        if(produto.getEstoque() <= 0) {
            JOptionPane.showMessageDialog(null, "Não há itens em estoque deste produto");            
            produto = null;
            return;
        }
        
        //Informar valores sobre o produto na tela
        txtProduto.setText(produto.getNome());
        txtPreco.setText(String.valueOf(produto.getPrecoVenda()));
        
    }//GEN-LAST:event_jbpesquisar2ActionPerformed

    private void txtClienteCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteCPFActionPerformed
        
    }//GEN-LAST:event_txtClienteCPFActionPerformed

    private void txtValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorTotalActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new PaginaPrincipal().setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void jblimpar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jblimpar1ActionPerformed
        //Obter codigo do produto
        int linhaSelecionada = tblCarrinho.getSelectedRow();
        int codigo = Integer.parseInt(tblCarrinho.getValueAt(linhaSelecionada,0).toString());
        
        //Remover item do carrinho
        carrinho.removeItem(codigo);
        
        //Ataulizar a tabela
        carregarCarrinho();
    }//GEN-LAST:event_jblimpar1ActionPerformed

    private void txtqtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtqtdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtqtdActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Obter quantidade digita        
        int qtd = txtqtd.getText().isEmpty() ? 0 : Integer.parseInt(txtqtd.getText());
        
        //Validar se foi selecionado um produto
        if(produto == null) {
            JOptionPane.showMessageDialog(null, "Não há um produto selecionado"); 
            return;
        }
        
        //Valido se a quantidade é valida
        if(qtd < 1) {
            JOptionPane.showMessageDialog(null, "Selecione uma quantidade válida."); 
            return;
        }        
        
        //Valido se a quantidade digitada é maior que a quantidade no estoque
        if(qtd > produto.getEstoque()) {
            JOptionPane.showMessageDialog(null, "A quantidade informada é maior do que a quantidade em estoque: (" + produto.getEstoque() + ")"); 
            return;
        }
             
        // Instancion um novo carrinhoItem que representa um item dentro do carrinho
        var carrinhoItem = new CarrinhoItem(produto.getId(), qtd, produto.getPrecoVenda(), produto);
        
        //Adicinar item ao carrinho
        carrinho.addItens(carrinhoItem);
        
        //Atualiza 
        carregarCarrinho();                
        
        txtqtd.setText("");
        txtProduto.setText("");
        txtPreco.setText("");
        txtCodigo.setText("");
        
        this.produto = null;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Removo o cliente
        cliente = null;
        
        //Apago os textos da tela
        txtClienteNome.setText("");
        txtClienteCPF.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void carregarCarrinho() {
        //obter modelo da tabela
        DefaultTableModel modelo = (DefaultTableModel) tblCarrinho.getModel();    
        
        // limpa tabela
        modelo.setNumRows(0);
        
        //Popula tabela com os dados do carrinho
        for (CarrinhoItem item : carrinho.getItens()) {
            modelo.addRow(new String[]{                
                String.valueOf(item.getProduto().getCodigo()),
                String.valueOf(item.getProduto().getNome()),
                String.valueOf(item.getProdutoQtd()),
                String.valueOf(item.getProdutoValor()),
                String.valueOf(item.getValorTotal()),
            });
        }
        
        // Colocar na tela o valor total do carrinho      
        txtValorTotal.setText(String.valueOf(carrinho.getValorTotal()));
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PaginaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizarVenda;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jblimpar;
    private javax.swing.JButton jblimpar1;
    private javax.swing.JButton jbpesquisar1;
    private javax.swing.JButton jbpesquisar2;
    private javax.swing.JTable tblCarrinho;
    private javax.swing.JFormattedTextField txtClienteCPF;
    private javax.swing.JTextField txtClienteNome;
    private javax.swing.JFormattedTextField txtCodigo;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JTextField txtValorTotal;
    private javax.swing.JFormattedTextField txtqtd;
    // End of variables declaration//GEN-END:variables
}
