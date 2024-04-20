/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import controller.OCController;
import java.awt.event.KeyEvent;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ItensOC;
import model.OrdemCompra;
import utils.Utils;

/**
 *
 * @author S.Lucas
 */
public class FROrdemCompra extends javax.swing.JDialog {

    OrdemCompra oc = new OrdemCompra();

    List<ItensOC> lista = new ArrayList<>();

    /**
     * Creates new form FRUPDOrdemCompra
     */
    public FROrdemCompra(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigoForn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCondPag = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbListaCompras = new javax.swing.JTable();
        btnAddItem = new javax.swing.JButton();
        btnNovaOC = new javax.swing.JButton();
        btnSelectForn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtNomeForn = new javax.swing.JTextField();
        btnRemoveItem = new javax.swing.JButton();
        txtDataEmissao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtQntTot = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtVlrTot = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ordem de compra");

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 490));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/OrdemCompra64px.png"))); // NOI18N
        jLabel1.setText("Ordem de compra");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Nº Fornecedor:");

        txtCodigoForn.setEditable(false);
        txtCodigoForn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCodigoForn.setFocusable(false);
        txtCodigoForn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoFornKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Condição de pagamento:");

        txtCondPag.setFocusable(false);
        txtCondPag.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCondPagKeyPressed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.setMaximumSize(new java.awt.Dimension(104, 31));
        btnSalvar.setMinimumSize(new java.awt.Dimension(104, 31));
        btnSalvar.setPreferredSize(new java.awt.Dimension(104, 31));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        btnSalvar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSalvarKeyPressed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.setFocusable(false);
        btnCancelar.setMaximumSize(new java.awt.Dimension(104, 31));
        btnCancelar.setMinimumSize(new java.awt.Dimension(104, 31));
        btnCancelar.setPreferredSize(new java.awt.Dimension(104, 31));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtCodigo.setEditable(false);
        txtCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCodigo.setFocusable(false);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Nº OC:");

        tbListaCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Quantidade", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbListaCompras.setEnabled(false);
        tbListaCompras.setShowGrid(true);
        tbListaCompras.getTableHeader().setReorderingAllowed(false);
        tbListaCompras.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tbListaComprasFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(tbListaCompras);

        btnAddItem.setText("Adicionar Item");
        btnAddItem.setEnabled(false);
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });
        btnAddItem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAddItemKeyPressed(evt);
            }
        });

        btnNovaOC.setText("Gerar nova OC");
        btnNovaOC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaOCActionPerformed(evt);
            }
        });
        btnNovaOC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnNovaOCKeyPressed(evt);
            }
        });

        btnSelectForn.setText("Selecionar Fornecedor");
        btnSelectForn.setEnabled(false);
        btnSelectForn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectFornActionPerformed(evt);
            }
        });
        btnSelectForn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSelectFornKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Nome:");

        txtNomeForn.setEditable(false);
        txtNomeForn.setFocusable(false);

        btnRemoveItem.setText("Remover item selecionado");
        btnRemoveItem.setEnabled(false);
        btnRemoveItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveItemActionPerformed(evt);
            }
        });

        txtDataEmissao.setEditable(false);
        txtDataEmissao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDataEmissao.setEnabled(false);
        txtDataEmissao.setFocusable(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Data de Emissão:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Quantidade Total");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Valor Total");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCondPag)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRemoveItem, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(txtVlrTot)
                            .addComponent(txtQntTot)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCodigoForn, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeForn)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnNovaOC, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(btnSelectForn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDataEmissao)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel4))
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(262, 262, 262))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNovaOC)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDataEmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoForn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelectForn)
                    .addComponent(txtNomeForn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCondPag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnAddItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRemoveItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQntTot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVlrTot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoFornKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoFornKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtCondPag.requestFocus();
        }
    }//GEN-LAST:event_txtCodigoFornKeyPressed

    private void txtCondPagKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCondPagKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnAddItem.requestFocus();
        }
    }//GEN-LAST:event_txtCondPagKeyPressed

    private void btnSalvarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSalvarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_SPACE) {
            btnSalvarActionPerformed(null);
        }
    }//GEN-LAST:event_btnSalvarKeyPressed

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        FRUPDAdicionarItens telaUPD2 = new FRUPDAdicionarItens(null, rootPaneCheckingEnabled);
        telaUPD2.setVisible(true);

        if (telaUPD2.isAtiva()) {
            ItensOC it = new ItensOC();
            it.setCodigo(telaUPD2.getCodProd());
            it.setNome(telaUPD2.getNomeProd());
            it.setQuantidade(telaUPD2.getQuantProd());
            it.setPrecoUnitario(telaUPD2.getPrecoProd());
            lista.add(it);

            oc.setItens(lista);
            DefaultTableModel modelo = (DefaultTableModel) tbListaCompras.getModel();
            modelo.setNumRows(0);
            for (ItensOC i : oc.getItens()) {
                Object[] linha = {i.getCodigo(),
                    i.getNome(),
                    i.getQuantidade(),
                    i.getPrecoUnitario()
                };
                modelo.addRow(linha);
            }

            int quant = 0;
            double vlr = 0;
            for (int i = 0; i < lista.size(); i++) {
                /*System.out.println("\nIteracao: n." + (i + 1));
                System.out.println("qnt: " + lista.size());
                System.out.println("qnttot: " + lista.get(i).getQuantidade());
                System.out.println("vlrtot: " + lista.get(i).getQuantidade() * lista.get(i).getPrecoUnitario());*/
                quant += lista.get(i).getQuantidade();
                vlr += lista.get(i).getQuantidade() * lista.get(i).getPrecoUnitario();
                /*System.out.println("qntTotArr: " + quant);
                System.out.println("vlrTotArr: " + vlr);*/
            };
            NumberFormat nf = NumberFormat.getInstance(Locale.GERMANY);
            txtVlrTot.setText(String.valueOf(nf.format(vlr)));
            txtQntTot.setText(Integer.toString(quant));

        }

        telaUPD2.dispose();
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // Verificar campos
        if (verificaCampos() == false) {
            return;
        }

        // Salvar no banco de dados
        Date data = Utils.converterStringToDate(txtDataEmissao.getText());
        oc.setDataEmissao(data);
        oc.setCondPagamento(txtCondPag.getText());

        oc.setValorTotal(Double.parseDouble(txtVlrTot.getText()));
        oc.setQntdTotal(Integer.parseInt(txtQntTot.getText()));
        
        oc.setPkFornecedor(Long.parseLong(txtCodigoForn.getText()));
        
        oc.setItens(lista);

        OCController controller = new OCController();
        if (controller.salvarOC(oc)) {
            this.dispose();
        }


    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnSelectFornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectFornActionPerformed
        FRUPDFornecedores telaUPD = new FRUPDFornecedores(null, rootPaneCheckingEnabled);
        telaUPD.setVisible(true);

        if (telaUPD.getPk() == 0) {
            txtCodigoForn.setText("");
        } else {
            txtCodigoForn.setText(String.valueOf(telaUPD.getPk()));
        }
        txtNomeForn.setText(telaUPD.getNome());
        telaUPD.dispose();
    }//GEN-LAST:event_btnSelectFornActionPerformed

    private void btnNovaOCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaOCActionPerformed
        OCController controller = new OCController();
        if (controller.getLastId().isEmpty()){
            txtCodigo.setText("1");
        } else {
            Long id = controller.getLastId().get(0).getNumOC() + 1;
            oc.setNumOC(id);
            txtCodigo.setText(oc.getNumOC().toString());
        }

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        txtDataEmissao.setText(dtf.format(now));

        txtDataEmissao.setEnabled(true);
        btnSelectForn.setEnabled(true);
        btnAddItem.setEnabled(true);
        tbListaCompras.setEnabled(true);
        txtCondPag.setEnabled(true);
        txtCondPag.setEditable(true);
        txtCondPag.setFocusable(true);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
    }//GEN-LAST:event_btnNovaOCActionPerformed

    private void btnRemoveItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveItemActionPerformed
        if (tbListaCompras.getSelectedRow() != -1) {
            DefaultTableModel modelo = (DefaultTableModel) tbListaCompras.getModel();
            lista.remove(tbListaCompras.getSelectedRow());
            modelo.removeRow(tbListaCompras.getSelectedRow());
        }
        int quant = 0;
        double vlr = 0;
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("\nIteracao: n." + (i + 1));
            System.out.println("qnt: " + lista.size());
            System.out.println("qnttot: " + lista.get(i).getQuantidade());
            System.out.println("vlrtot: " + lista.get(i).getQuantidade() * lista.get(i).getPrecoUnitario());
            quant += lista.get(i).getQuantidade();
            vlr += lista.get(i).getQuantidade() * lista.get(i).getPrecoUnitario();
            System.out.println("qntTotArr: " + quant);
            System.out.println("vlrTotArr: " + vlr);
        };
        txtVlrTot.setText(String.valueOf(vlr));
        txtQntTot.setText(Integer.toString(quant));
        btnRemoveItem.setEnabled(false);
    }//GEN-LAST:event_btnRemoveItemActionPerformed

    private void tbListaComprasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tbListaComprasFocusGained
        btnRemoveItem.setEnabled(true);
    }//GEN-LAST:event_tbListaComprasFocusGained

    private void btnNovaOCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnNovaOCKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnNovaOCActionPerformed(null);
            btnSelectForn.requestFocus();
        }
    }//GEN-LAST:event_btnNovaOCKeyPressed

    private void btnSelectFornKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSelectFornKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSelectFornActionPerformed(null);
            txtCondPag.requestFocus();
        }
    }//GEN-LAST:event_btnSelectFornKeyPressed

    private void btnAddItemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAddItemKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnAddItemActionPerformed(null);
        }
    }//GEN-LAST:event_btnAddItemKeyPressed

    private boolean verificaCampos() {
        if (txtCodigoForn.getText().equals("") && txtNomeForn.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Selecionar um fornecedor");
            return false;
        }

        if (txtCondPag.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informar uma condição de pagamento");
            return false;
        }

        if (lista.size() == 0) {
            JOptionPane.showMessageDialog(null, "Adicionar ao menos um item na ordem de compra");
            return false;
        }

        return true;
    }

    /**
     * @param args the command line arguments
     *
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
            java.util.logging.Logger.getLogger(FROrdemCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FROrdemCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FROrdemCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FROrdemCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FROrdemCompra dialog = new FROrdemCompra(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnNovaOC;
    private javax.swing.JButton btnRemoveItem;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSelectForn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbListaCompras;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigoForn;
    private javax.swing.JTextField txtCondPag;
    private javax.swing.JTextField txtDataEmissao;
    private javax.swing.JTextField txtNomeForn;
    private javax.swing.JTextField txtQntTot;
    private javax.swing.JTextField txtVlrTot;
    // End of variables declaration//GEN-END:variables

}
