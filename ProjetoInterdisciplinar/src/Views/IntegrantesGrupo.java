/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

/**
 *
 * @author mateus
 */
public class IntegrantesGrupo extends javax.swing.JFrame {

    /**
     * Creates new form IntegrantesGrupo
     */
    public IntegrantesGrupo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnsobre = new javax.swing.JButton();
        btnvoltar = new javax.swing.JLabel();
        painelSobre = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(550, 450));
        setResizable(false);
        getContentPane().setLayout(null);

        btnsobre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnsobre.setText("SOBRE");
        btnsobre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnsobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsobreActionPerformed(evt);
            }
        });
        getContentPane().add(btnsobre);
        btnsobre.setBounds(190, 40, 190, 38);

        btnvoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ic-back_97586.png"))); // NOI18N
        btnvoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnvoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnvoltarMouseClicked(evt);
            }
        });
        getContentPane().add(btnvoltar);
        btnvoltar.setBounds(22, 10, 60, 30);

        painelSobre.setLayout(null);
        painelSobre.setVisible(false);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("INTEGRANTES");
        painelSobre.add(jLabel2);
        jLabel2.setBounds(210, 20, 150, 22);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Mateus Passos Amaral  RGM: 20999470");
        painelSobre.add(jLabel4);
        jLabel4.setBounds(140, 60, 270, 17);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Gustavo Santos Melo  RGM: 20644272");
        painelSobre.add(jLabel5);
        jLabel5.setBounds(140, 90, 270, 17);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Gustavo Ferreira Marinho   RGM: 20477023");
        painelSobre.add(jLabel6);
        jLabel6.setBounds(140, 180, 290, 17);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Everton Alves Marques  RGM: 20690614");
        painelSobre.add(jLabel7);
        jLabel7.setBounds(140, 120, 270, 17);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Luis Eduardo Souza Silva   RGM: 21209375");
        painelSobre.add(jLabel8);
        jLabel8.setBounds(140, 150, 290, 17);

        getContentPane().add(painelSobre);
        painelSobre.setBounds(0, 100, 580, 220);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsobreActionPerformed
        // TODO add your handling code here:
        painelSobre.setVisible(true);
    }//GEN-LAST:event_btnsobreActionPerformed

    private void btnvoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnvoltarMouseClicked
        // TODO add your handling code here:
        TelaPrincipal telap = new TelaPrincipal();
        this.dispose();
        telap.setVisible(true);
    }//GEN-LAST:event_btnvoltarMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IntegrantesGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntegrantesGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntegrantesGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntegrantesGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntegrantesGrupo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsobre;
    private javax.swing.JLabel btnvoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel painelSobre;
    // End of variables declaration//GEN-END:variables
}
