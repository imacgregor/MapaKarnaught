/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author erick
 */
public class tela extends javax.swing.JFrame {
    map2 tela2var = new map2();
    
    /**
     * Creates new form tela
     */
    public tela() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblTituloMapaDeKarnaugh = new javax.swing.JLabel();
        jButton2var = new javax.swing.JButton();
        jButton3var = new javax.swing.JButton();
        jButton4var = new javax.swing.JButton();
        jButton5var = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mapa de Karnaugh");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 700, 70);

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 310, 700, 80);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        lblTituloMapaDeKarnaugh.setFont(new java.awt.Font("Aileron", 0, 36)); // NOI18N
        lblTituloMapaDeKarnaugh.setForeground(new java.awt.Color(102, 0, 102));
        lblTituloMapaDeKarnaugh.setText("Mapa de Karnaugh");

        jButton2var.setBackground(new java.awt.Color(255, 255, 255));
        jButton2var.setFont(new java.awt.Font("Aileron", 0, 13)); // NOI18N
        jButton2var.setForeground(new java.awt.Color(102, 0, 102));
        jButton2var.setText("2");
        jButton2var.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2varActionPerformed(evt);
            }
        });

        jButton3var.setBackground(new java.awt.Color(255, 255, 255));
        jButton3var.setFont(new java.awt.Font("Aileron", 0, 13)); // NOI18N
        jButton3var.setForeground(new java.awt.Color(102, 0, 102));
        jButton3var.setText("3");
        jButton3var.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3varActionPerformed(evt);
            }
        });

        jButton4var.setBackground(new java.awt.Color(255, 255, 255));
        jButton4var.setFont(new java.awt.Font("Aileron", 0, 13)); // NOI18N
        jButton4var.setForeground(new java.awt.Color(102, 0, 102));
        jButton4var.setText("4");
        jButton4var.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4varActionPerformed(evt);
            }
        });

        jButton5var.setBackground(new java.awt.Color(255, 255, 255));
        jButton5var.setFont(new java.awt.Font("Aileron", 0, 13)); // NOI18N
        jButton5var.setForeground(new java.awt.Color(102, 0, 102));
        jButton5var.setText("5");
        jButton5var.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5varActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Aileron", 0, 18)); // NOI18N
        jLabel1.setText("Escolha a quantidade de variáveis do seu mapa");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton2var, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jButton3var, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jButton4var, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jButton5var, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lblTituloMapaDeKarnaugh, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloMapaDeKarnaugh, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2var, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3var, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4var, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5var, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 70, 650, 240);

        setSize(new java.awt.Dimension(682, 436));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2varActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2varActionPerformed
        // TODO add your handling code here:
        tela2var.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton2varActionPerformed

    private void jButton3varActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3varActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3varActionPerformed

    private void jButton4varActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4varActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4varActionPerformed

    private void jButton5varActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5varActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5varActionPerformed

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
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2var;
    private javax.swing.JButton jButton3var;
    private javax.swing.JButton jButton4var;
    private javax.swing.JButton jButton5var;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblTituloMapaDeKarnaugh;
    // End of variables declaration//GEN-END:variables
}
