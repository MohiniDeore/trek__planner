/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author main
 */
public class createtrek extends javax.swing.JFrame {

    /**
     * Creates new form createtrek
     */
    public createtrek() {
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
        jPanel1 = new javax.swing.JPanel();
        jLblcreate_trek = new javax.swing.JLabel();
        jlabitinary = new javax.swing.JLabel();
        jlbheight = new javax.swing.JLabel();
        jlabeltransportation = new javax.swing.JLabel();
        jlabelinfo = new javax.swing.JLabel();
        jlbinclusion = new javax.swing.JLabel();
        jTextitinary = new javax.swing.JTextField();
        jTexttransportation = new javax.swing.JTextField();
        jTextheight = new javax.swing.JTextField();
        jTextinclusion = new javax.swing.JTextField();
        jTextinfo = new javax.swing.JTextField();
        jlbtrekname = new javax.swing.JLabel();
        jlbprice = new javax.swing.JLabel();
        jTextprice = new javax.swing.JTextField();
        jlblocation1 = new javax.swing.JLabel();
        jTextlocation1 = new javax.swing.JTextField();
        jTextlocation2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trek_planner/bgmtresizeddddd.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1080, 720));
        jLabel1.setMinimumSize(new java.awt.Dimension(1080, 720));
        jLabel1.setPreferredSize(new java.awt.Dimension(1080, 720));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1080, 720));
        setMinimumSize(new java.awt.Dimension(1020, 720));
        setPreferredSize(new java.awt.Dimension(1080, 720));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(1080, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1080, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 720));
        jPanel1.setLayout(null);

        jLblcreate_trek.setFont(new java.awt.Font("RomanT", 1, 24)); // NOI18N
        jLblcreate_trek.setForeground(new java.awt.Color(255, 255, 255));
        jLblcreate_trek.setText("Create A Trek");
        jPanel1.add(jLblcreate_trek);
        jLblcreate_trek.setBounds(99, 33, 246, 52);

        jlabitinary.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
        jlabitinary.setForeground(new java.awt.Color(255, 255, 255));
        jlabitinary.setText("short Itinary");
        jPanel1.add(jlabitinary);
        jlabitinary.setBounds(170, 380, 182, 47);

        jlbheight.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
        jlbheight.setForeground(new java.awt.Color(255, 255, 255));
        jlbheight.setText("Height");
        jPanel1.add(jlbheight);
        jlbheight.setBounds(170, 240, 182, 47);

        jlabeltransportation.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
        jlabeltransportation.setForeground(new java.awt.Color(255, 255, 255));
        jlabeltransportation.setText("Transportation");
        jPanel1.add(jlabeltransportation);
        jlabeltransportation.setBounds(170, 310, 182, 47);

        jlabelinfo.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
        jlabelinfo.setForeground(new java.awt.Color(255, 255, 255));
        jlabelinfo.setText("Information about trek ");
        jPanel1.add(jlabelinfo);
        jlabelinfo.setBounds(70, 540, 270, 47);

        jlbinclusion.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
        jlbinclusion.setForeground(new java.awt.Color(255, 255, 255));
        jlbinclusion.setText("Inclusions");
        jPanel1.add(jlbinclusion);
        jlbinclusion.setBounds(170, 450, 182, 47);

        jTextitinary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextitinaryActionPerformed(evt);
            }
        });
        jPanel1.add(jTextitinary);
        jTextitinary.setBounds(349, 384, 228, 47);

        jTexttransportation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTexttransportationActionPerformed(evt);
            }
        });
        jPanel1.add(jTexttransportation);
        jTexttransportation.setBounds(349, 312, 228, 47);

        jTextheight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextheightActionPerformed(evt);
            }
        });
        jPanel1.add(jTextheight);
        jTextheight.setBounds(349, 238, 228, 47);
        jPanel1.add(jTextinclusion);
        jTextinclusion.setBounds(349, 456, 228, 49);
        jPanel1.add(jTextinfo);
        jTextinfo.setBounds(349, 541, 228, 47);

        jlbtrekname.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
        jlbtrekname.setForeground(new java.awt.Color(255, 255, 255));
        jlbtrekname.setText("Name of trek ");
        jPanel1.add(jlbtrekname);
        jlbtrekname.setBounds(170, 120, 182, 47);

        jlbprice.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        jlbprice.setForeground(new java.awt.Color(255, 255, 255));
        jlbprice.setText("price");
        jPanel1.add(jlbprice);
        jlbprice.setBounds(150, 610, 182, 47);
        jPanel1.add(jTextprice);
        jTextprice.setBounds(349, 615, 228, 47);

        jlblocation1.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
        jlblocation1.setForeground(new java.awt.Color(255, 255, 255));
        jlblocation1.setText("Location");
        jPanel1.add(jlblocation1);
        jlblocation1.setBounds(170, 170, 182, 47);

        jTextlocation1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextlocation1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextlocation1);
        jTextlocation1.setBounds(349, 111, 228, 47);

        jTextlocation2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextlocation2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextlocation2);
        jTextlocation2.setBounds(349, 173, 228, 47);

        jButton2.setText("Confirm");
        jPanel1.add(jButton2);
        jButton2.setBounds(720, 210, 130, 70);

        jButton4.setText("Home");
        jPanel1.add(jButton4);
        jButton4.setBounds(720, 330, 130, 70);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trek_planner/bgmtresizeddddd.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, -50, 1110, 800);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTexttransportationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTexttransportationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTexttransportationActionPerformed

    private void jTextheightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextheightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextheightActionPerformed

    private void jTextitinaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextitinaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextitinaryActionPerformed

    private void jTextlocation1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextlocation1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextlocation1ActionPerformed

    private void jTextlocation2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextlocation2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextlocation2ActionPerformed

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
            java.util.logging.Logger.getLogger(createtrek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createtrek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createtrek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createtrek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createtrek().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLblcreate_trek;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextheight;
    private javax.swing.JTextField jTextinclusion;
    private javax.swing.JTextField jTextinfo;
    private javax.swing.JTextField jTextitinary;
    private javax.swing.JTextField jTextlocation1;
    private javax.swing.JTextField jTextlocation2;
    private javax.swing.JTextField jTextprice;
    private javax.swing.JTextField jTexttransportation;
    private javax.swing.JLabel jlabelinfo;
    private javax.swing.JLabel jlabeltransportation;
    private javax.swing.JLabel jlabitinary;
    private javax.swing.JLabel jlbheight;
    private javax.swing.JLabel jlbinclusion;
    private javax.swing.JLabel jlblocation1;
    private javax.swing.JLabel jlbprice;
    private javax.swing.JLabel jlbtrekname;
    // End of variables declaration//GEN-END:variables
}