/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import java.awt.event.KeyEvent;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author kaua_
 */
public class FRUPDAdicionarItens extends javax.swing.JDialog {

    private Long codProd;
    private String nomeProd;
    private int quantProd;
    private double precoProd;
    private boolean ativa;

    public Long getCodProd() {
        return codProd;
    }

    public void setCodProd(Long codProd) {
        this.codProd = codProd;
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    public int getQuantProd() {
        return quantProd;
    }

    public void setQuantProd(int quantProd) {
        this.quantProd = quantProd;
    }

    public double getPrecoProd() {
        return precoProd;
    }

    public void setPrecoProd(double precoProd) {
        this.precoProd = precoProd;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    /**
     * Creates new form FRUPDAdicionarItens
     */
    public FRUPDAdicionarItens(java.awt.Frame parent, boolean modal) {
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
        btnPesquisar = new javax.swing.JButton();
        txtCodigoProd = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnReturn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNomeProd = new javax.swing.JTextField();
        txtPreco = new javax.swing.JFormattedTextField();
        txtQuant = new javax.swing.JSpinner();
        btnInserir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(16, 157, 218));
        jPanel1.setMinimumSize(new java.awt.Dimension(490, 509));
        jPanel1.setPreferredSize(new java.awt.Dimension(490, 509));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/find_user.png"))); // NOI18N
        jLabel1.setText("Adição de itens");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        btnPesquisar.setText("Pesquisar Produto");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        jPanel1.add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 140, 23));

        txtCodigoProd.setEditable(false);
        txtCodigoProd.setEnabled(false);
        txtCodigoProd.setFocusable(false);
        jPanel1.add(txtCodigoProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 110, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Código Produto:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/return.png"))); // NOI18N
        btnReturn.setText("Voltar");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        jPanel1.add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Nome do Produto:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Quantidade:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Preço:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        txtNomeProd.setEditable(false);
        txtNomeProd.setEnabled(false);
        txtNomeProd.setFocusable(false);
        jPanel1.add(txtNomeProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 450, -1));
        jPanel1.add(txtPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 120, -1));

        txtQuant.setModel(new javax.swing.SpinnerNumberModel(0, 0, 9999, 1));
        txtQuant.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(txtQuant, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });
        jPanel1.add(btnInserir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        FRUPDProdutos telaUPD = new FRUPDProdutos(null, rootPaneCheckingEnabled);
        telaUPD.setVisible(true);

        if (telaUPD.isAtiva()) {
            if (telaUPD.getPk() == 0) {
                txtCodigoProd.setText("");
            } else {
                txtCodigoProd.setText(String.valueOf(telaUPD.getPk()));
                this.setCodProd(telaUPD.getPk());
                txtCodigoProd.setEnabled(true);
            }
            txtNomeProd.setText(telaUPD.getNome());
            this.setNomeProd(telaUPD.getNome());
            txtNomeProd.setEnabled(true);
        }
        telaUPD.dispose();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        this.setAtiva(false);
        this.setVisible(false);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        try {
            if (verificaCampos() == false) {
                return;
            }
            NumberFormat nf = NumberFormat.getInstance(Locale.GERMANY);
            double preco = nf.parse(txtPreco.getText()).doubleValue();

            if (txtCodigoProd.getText() == "" || txtNomeProd.getText() == "" || txtQuant.getValue() == null || preco == 0) {
                JOptionPane.showMessageDialog(null, "Favor preencher todos os campos");
            } else {
                this.setQuantProd(Integer.parseInt(txtQuant.getValue().toString()));
                this.setPrecoProd(preco);
                this.setAtiva(true);
                this.setVisible(false);
            }
        } catch (ParseException ex) {
            Logger.getLogger(FRUPDAdicionarItens.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnInserirActionPerformed

    private boolean verificaCampos() {
        if (txtCodigoProd.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo 'Código do Produto' está vazio.");
            return false;
        }
        if (txtNomeProd.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo 'Nome do Produto' está vazio.");
            return false;
        }

        if (txtQuant.getValue().equals(0)) {
            JOptionPane.showMessageDialog(null, "Campo 'Quantidade' está zerada.");
            return false;
        }

        if (txtPreco.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo 'Preço' está vazio.");
            return false;
        }
        return true;
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
            java.util.logging.Logger.getLogger(FRUPDAdicionarItens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRUPDAdicionarItens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRUPDAdicionarItens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRUPDAdicionarItens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FRUPDAdicionarItens dialog = new FRUPDAdicionarItens(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnReturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCodigoProd;
    private javax.swing.JTextField txtNomeProd;
    private javax.swing.JFormattedTextField txtPreco;
    private javax.swing.JSpinner txtQuant;
    // End of variables declaration//GEN-END:variables
}
