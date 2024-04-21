package view;

import java.awt.Desktop;
import java.net.URI;
import javax.swing.JOptionPane;

public class FRSobre extends javax.swing.JDialog {

    /**
     * Creates new form FRSobre
     */
    public FRSobre(java.awt.Frame parent, boolean modal) {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnGithubK = new javax.swing.JButton();
        btnLinkedinK = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        btnGitHubD = new javax.swing.JButton();
        btnLinkedInD = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sobre");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 81, 81));
        jPanel1.setMinimumSize(new java.awt.Dimension(498, 452));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setText("Sobre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Data: 22/04/2024");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 128, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Versão: 1.0");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 128, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Autores: Daniel Vieira e Kauã Valim");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 250, -1));

        btnGithubK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Github_logo.png"))); // NOI18N
        btnGithubK.setText("Kauã");
        btnGithubK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGithubK.setFocusPainted(false);
        btnGithubK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGithubKActionPerformed(evt);
            }
        });
        jPanel1.add(btnGithubK, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 100, -1));

        btnLinkedinK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Linkedin_logo.png"))); // NOI18N
        btnLinkedinK.setText("Kauã");
        btnLinkedinK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLinkedinK.setFocusPainted(false);
        btnLinkedinK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLinkedinKActionPerformed(evt);
            }
        });
        jPanel1.add(btnLinkedinK, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 100, -1));

        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/return.png"))); // NOI18N
        btnReturn.setText("Voltar");
        btnReturn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReturn.setFocusPainted(false);
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        jPanel1.add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, -1, -1));

        btnGitHubD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Github_logo.png"))); // NOI18N
        btnGitHubD.setText("Daniel");
        btnGitHubD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGitHubD.setFocusPainted(false);
        btnGitHubD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGitHubDActionPerformed(evt);
            }
        });
        jPanel1.add(btnGitHubD, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 100, -1));

        btnLinkedInD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Linkedin_logo.png"))); // NOI18N
        btnLinkedInD.setText("Daniel");
        btnLinkedInD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLinkedInD.setFocusPainted(false);
        btnLinkedInD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLinkedInDActionPerformed(evt);
            }
        });
        jPanel1.add(btnLinkedInD, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGithubKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGithubKActionPerformed
        try {
            Desktop desktop = Desktop.getDesktop();
            URI uri = new URI("https://github.com/KauaValim");
            desktop.browse(uri);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnGithubKActionPerformed

    private void btnLinkedinKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLinkedinKActionPerformed
        try {
            Desktop desktop = Desktop.getDesktop();
            URI uri = new URI("https://www.linkedin.com/in/kauavalim");
            desktop.browse(uri);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnLinkedinKActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnGitHubDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGitHubDActionPerformed
         try {
            Desktop desktop = Desktop.getDesktop();
            URI uri = new URI("https://www.github.com/vieiradaniels");
            desktop.browse(uri);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnGitHubDActionPerformed

    private void btnLinkedInDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLinkedInDActionPerformed
         try {
            Desktop desktop = Desktop.getDesktop();
            URI uri = new URI("https://www.linkedin.com/in/vieiradaniels");
            desktop.browse(uri);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnLinkedInDActionPerformed

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
            java.util.logging.Logger.getLogger(FRSobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRSobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRSobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRSobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FRSobre dialog = new FRSobre(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnGitHubD;
    private javax.swing.JButton btnGithubK;
    private javax.swing.JButton btnLinkedInD;
    private javax.swing.JButton btnLinkedinK;
    private javax.swing.JButton btnReturn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
