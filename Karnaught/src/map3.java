
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author erick
 */
public class map3 extends javax.swing.JFrame {
    simplificacao simpli = new simplificacao();
    
    int quantidadeBits=0;
    
    String[] a = new String[8];
    String[] b = new String[8];
    String[] c = new String[8];
    String[] s = new String[8];
    /**
     * Creates new form map2
     */
    public map3() {
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
        jLabel1 = new javax.swing.JLabel();
        jTextA = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextB = new javax.swing.JTextField();
        jTextS = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButtonAdd = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextC = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTrue = new javax.swing.JTable();
        jLabelBits = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonSimplificar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        _A_B_C = new javax.swing.JLabel();
        _A_BC = new javax.swing.JLabel();
        _ABC = new javax.swing.JLabel();
        _AB_C = new javax.swing.JLabel();
        A_B_C = new javax.swing.JLabel();
        A_BC = new javax.swing.JLabel();
        ABC = new javax.swing.JLabel();
        AB_C = new javax.swing.JLabel();
        jButtonMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Adicionando"));

        jLabel1.setFont(new java.awt.Font("Aileron", 0, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("A");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel2.setFont(new java.awt.Font("Aileron", 0, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("B");

        jLabel3.setFont(new java.awt.Font("Aileron", 0, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("S");

        jButtonAdd.setText("Adicionar");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Aileron", 0, 13)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("C");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextC, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextB, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextA, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextS, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jButtonAdd)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 40, 140, 320);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabela Verdade"));

        jTableTrue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "A", "B", "C", "S"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableTrue);

        jLabel4.setText("Quantidade de bits:");

        jButtonSimplificar.setText("Simplificar");
        jButtonSimplificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimplificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonSimplificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(56, 56, 56)
                        .addComponent(jLabelBits, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 6, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBits, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jButtonSimplificar))))
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(160, 50, 470, 470);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mapa-karnaugh-3var.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(620, 80, 470, 400);

        _A_B_C.setFont(new java.awt.Font("Aileron", 0, 48)); // NOI18N
        _A_B_C.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        _A_BC.setFont(new java.awt.Font("Aileron", 0, 48)); // NOI18N
        _A_BC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        _ABC.setFont(new java.awt.Font("Aileron", 0, 48)); // NOI18N
        _ABC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        _AB_C.setFont(new java.awt.Font("Aileron", 0, 48)); // NOI18N
        _AB_C.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        A_B_C.setFont(new java.awt.Font("Aileron", 0, 48)); // NOI18N
        A_B_C.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        A_BC.setFont(new java.awt.Font("Aileron", 0, 48)); // NOI18N
        A_BC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        ABC.setFont(new java.awt.Font("Aileron", 0, 48)); // NOI18N
        ABC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        AB_C.setFont(new java.awt.Font("Aileron", 0, 48)); // NOI18N
        AB_C.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(A_B_C, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A_BC, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ABC, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AB_C, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(_A_B_C, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_A_BC, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(_ABC, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(_AB_C, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_A_B_C, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_A_BC, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_ABC, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_AB_C, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A_B_C, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A_BC, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ABC, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AB_C, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(630, 60, 450, 450);

        jButtonMenu.setText("MENU");
        jButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMenu);
        jButtonMenu.setBounds(10, 370, 140, 25);

        setSize(new java.awt.Dimension(1128, 601));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        if(quantidadeBits<8)
        {
            Object row[] = {jTextA.getText(),jTextB.getText(),jTextC.getText(),jTextS.getText()};
            
            a[quantidadeBits] = jTextA.getText();
            b[quantidadeBits] = jTextB.getText();
            c[quantidadeBits] = jTextC.getText();
            s[quantidadeBits] = jTextS.getText();
            
            quantidadeBits++;
            ((DefaultTableModel)jTableTrue.getModel()).addRow(row);
            jLabelBits.setText(Integer.toString(quantidadeBits));
        }else
        {
            JOptionPane.showMessageDialog(null, "MAPA DE 3 VARIAVEIS, ACEITA NO MAXIMO 8 BITS! ESTUDE MAIS!");
        }
        
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonSimplificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimplificarActionPerformed
        // TODO add your handling code here:
        preenchendoMapa();
       // _A_B.setText(simpli.transfereDados(a, b, s, quantidadeBits));
    }//GEN-LAST:event_jButtonSimplificarActionPerformed

    private void jButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuActionPerformed
        // TODO add your handling code here:
        new tela().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonMenuActionPerformed

    void preenchendoMapa()
    {
        int i;
        for(i=0;i<quantidadeBits;i++)
        {
            if(a[i].equals("0") && b[i].equals("0") && c[i].equals("0")) //000
            {
                _A_B_C.setText(s[i]);
            } else {
                if(a[i].equals("0") && b[i].equals("0") && c[i].equals("1")) //001
                {
                    _A_BC.setText(s[i]);
                }else
                {
                    if(a[i].equals("0") && b[i].equals("1") && c[i].equals("1")) //011
                    {
                         _ABC.setText(s[i]);
                    }else
                    {
                        if(a[i].equals("0") && b[i].equals("1") && c[i].equals("0")) //010
                        {
                            _AB_C.setText(s[i]);
                        }else
                        {
                            if(a[i].equals("1") && b[i].equals("0") && c[i].equals("0")) //100
                            {
                                A_B_C.setText(s[i]);
                            }else
                            {
                                if(a[i].equals("1") && b[i].equals("0") && c[i].equals("1")) //101
                                {
                                    A_BC.setText(s[i]);
                                }else
                                {
                                    if(a[i].equals("1") && b[i].equals("1") && c[i].equals("1")) //111
                                    {
                                        ABC.setText(s[i]);
                                    }else
                                    {
                                        if(a[i].equals("1") && b[i].equals("1") && c[i].equals("0"))//110
                                        {
                                            AB_C.setText(s[i]);
                                        }
                                    }
                                }
                            }
                        }
                    }
            }
        }
    }
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
                new map3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ABC;
    private javax.swing.JLabel AB_C;
    private javax.swing.JLabel A_BC;
    private javax.swing.JLabel A_B_C;
    private javax.swing.JLabel _ABC;
    private javax.swing.JLabel _AB_C;
    private javax.swing.JLabel _A_BC;
    private javax.swing.JLabel _A_B_C;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JButton jButtonSimplificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelBits;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTrue;
    private javax.swing.JTextField jTextA;
    private javax.swing.JTextField jTextB;
    private javax.swing.JTextField jTextC;
    private javax.swing.JTextField jTextS;
    // End of variables declaration//GEN-END:variables
}
