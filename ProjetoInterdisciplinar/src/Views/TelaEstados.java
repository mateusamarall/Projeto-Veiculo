/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import javax.swing.JOptionPane;

/**
 *
 * @author mateus
 */
public class TelaEstados extends javax.swing.JFrame {

    /**
     * Creates new form TelaEstados
     */
    public TelaEstados() {
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
        btnInserir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtAberturaEstado = new javax.swing.JTextField();
        txtNomeEstado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnvoltar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaEstado = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Insira os dados Abaixo:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 50, 190, 30);

        btnInserir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnInserir.setText(" INSERIR");
        btnInserir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });
        getContentPane().add(btnInserir);
        btnInserir.setBounds(100, 200, 190, 38);

        btnEditar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnEditar.setText("EDITAR UM ESTADO");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar);
        btnEditar.setBounds(340, 100, 290, 38);

        btnEliminar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/delete_remove_bin_icon-icons.com_72400.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR UM ESTADO");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(340, 40, 290, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Nome do Estado:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 170, 108, 17);

        txtAberturaEstado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(txtAberturaEstado);
        txtAberturaEstado.setBounds(160, 120, 130, 31);

        txtNomeEstado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(txtNomeEstado);
        txtNomeEstado.setBounds(160, 160, 130, 31);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Abreviatura do Estado:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(8, 130, 150, 17);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Você Deseja:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(390, 10, 130, 30);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Estados Já cadastrados: ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 240, 180, 17);

        btnvoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ic-back_97586.png"))); // NOI18N
        btnvoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnvoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnvoltarMouseClicked(evt);
            }
        });
        getContentPane().add(btnvoltar);
        btnvoltar.setBounds(22, 10, 60, 30);

        tabelaEstado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ABREVIATURA DO ESTADO", "ESTADO"
            }
        ));
        jScrollPane1.setViewportView(tabelaEstado);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 270, 460, 230);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnvoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnvoltarMouseClicked
        // TODO add your handling code here:
        TelaPrincipal telap = new TelaPrincipal();
         this.dispose();
        telap.setVisible(true);
    }//GEN-LAST:event_btnvoltarMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        
        if(txtAberturaEstado.getText().equals("")|| txtAberturaEstado == null || txtNomeEstado.getText().equals("") || txtNomeEstado == null){
            JOptionPane.showMessageDialog(null, "Para remover um Estado é necessário inserir os dados ao lado.");
        }
        
        //adicionar a logica para excluir um estado
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        // TODO add your handling code here:
        
        txtAberturaEstado.setText("");
        txtNomeEstado.setText("");
        txtAberturaEstado.requestFocus();
        if(txtAberturaEstado.getText().equals("")|| txtAberturaEstado == null || txtNomeEstado.getText().equals("") || txtNomeEstado == null){
            JOptionPane.showMessageDialog(null, "Para Adicioanr um Estado é necessário inserir os dados acima.");
            
        }
        if(!(txtAberturaEstado.getText().equals("")|| txtAberturaEstado == null || txtNomeEstado.getText().equals("") || txtNomeEstado == null)){
            JOptionPane.showMessageDialog(null, "Estado Adicionado");
            
            //adicionar a logica para adicionar um estado
          
            
        }
        
        
        
        
    }//GEN-LAST:event_btnInserirActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEstados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEstados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEstados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEstados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEstados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JLabel btnvoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaEstado;
    private javax.swing.JTextField txtAberturaEstado;
    private javax.swing.JTextField txtNomeEstado;
    // End of variables declaration//GEN-END:variables
}
