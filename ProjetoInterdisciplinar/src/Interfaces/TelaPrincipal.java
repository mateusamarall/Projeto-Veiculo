/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;


/**
 *
 * @author mateus
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
       
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

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        panelcadastro = new javax.swing.JPanel();
        btnVeiculos = new javax.swing.JButton();
        btnEstados = new javax.swing.JButton();
        btnMarcasVeiculos = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuAjuda = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuAutores = new javax.swing.JMenu();
        menuSair = new javax.swing.JMenu();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenuItem2.setText("jMenuItem2");

        jMenu6.setText("jMenu6");

        jMenu7.setText("jMenu7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 370));
        setMinimumSize(new java.awt.Dimension(500, 370));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Bem vindo. Este é o menu de opções, o que deseja fazer?.");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 470, 20);

        btnCadastrar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnCadastrar.setText("CADASTRO");
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar);
        btnCadastrar.setBounds(140, 60, 190, 31);

        panelcadastro.setVisible(false);

        btnVeiculos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnVeiculos.setText("VEÍCULOS");
        btnVeiculos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnEstados.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEstados.setText("ESTADOS");
        btnEstados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadosActionPerformed(evt);
            }
        });

        btnMarcasVeiculos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnMarcasVeiculos.setText("MARCAS VEÍCULOS");
        btnMarcasVeiculos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelcadastroLayout = new javax.swing.GroupLayout(panelcadastro);
        panelcadastro.setLayout(panelcadastroLayout);
        panelcadastroLayout.setHorizontalGroup(
            panelcadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelcadastroLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnVeiculos)
                .addGap(46, 46, 46)
                .addComponent(btnEstados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnMarcasVeiculos)
                .addGap(26, 26, 26))
        );
        panelcadastroLayout.setVerticalGroup(
            panelcadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelcadastroLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelcadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEstados, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMarcasVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        getContentPane().add(panelcadastro);
        panelcadastro.setBounds(0, 110, 490, 170);

        jMenuBar1.setBackground(new java.awt.Color(240, 110, 83));

        menuAjuda.setText("Ajuda");
        menuAjuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem1.setText("Sobre");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuAjuda.add(jMenuItem1);

        jMenuBar1.add(menuAjuda);

        menuAutores.setText("Autores do Programa");
        menuAutores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBar1.add(menuAutores);

        menuSair.setText("Sair");
        menuSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBar1.add(menuSair);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        
        panelcadastro.setVisible(true);
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnEstadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadosActionPerformed
        // TODO add your handling code here:
        
        TelaEstados viewEstado = new TelaEstados();
        viewEstado.setVisible(true);
    }//GEN-LAST:event_btnEstadosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEstados;
    private javax.swing.JButton btnMarcasVeiculos;
    private javax.swing.JButton btnVeiculos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuAutores;
    private javax.swing.JMenu menuSair;
    private javax.swing.JPanel panelcadastro;
    // End of variables declaration//GEN-END:variables


}
