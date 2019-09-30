/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.util.Date;
import javax.swing.JFrame;

/**
 *
 * @author T.K.Dias
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Add
     */
    public Main() {
        initComponents();
        time();
    }

//===============================================================(Time & Date)==
    public void time() {

        try {

            new Thread(new Runnable() {
                @Override
                public void run() {

                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    while (true) {

                        Date d = new Date();
                        String date = d.toString();
                        String arr[] = date.split(" ");
                        String newdate = arr[5] + "-" + arr[1] + "-" + arr[2];
                        jLabel4.setText(newdate);
                        jLabel5.setText(arr[3]);
                    }

                }
            }).start();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

//==============================================================================
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtBox = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAddProfile = new javax.swing.JButton();
        btnAddDistrict = new javax.swing.JButton();
        btnAddLocation = new javax.swing.JButton();
        btnAddProvince = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Home");
        setBackground(new java.awt.Color(255, 204, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 140, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 140, 30));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Smart City Traveler");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 290, 40));

        txtBox.setBackground(new java.awt.Color(255, 255, 255));
        txtBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtBox.setForeground(new java.awt.Color(255, 255, 255));
        txtBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(txtBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 120, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 600, 90));

        jPanel2.setBackground(new java.awt.Color(255, 204, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAddProfile.setBackground(new java.awt.Color(153, 153, 153));
        btnAddProfile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddProfile.setText("Profile Management");
        btnAddProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProfileActionPerformed(evt);
            }
        });
        jPanel2.add(btnAddProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 580, 60));

        btnAddDistrict.setBackground(new java.awt.Color(153, 153, 153));
        btnAddDistrict.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddDistrict.setText("Districts Management");
        btnAddDistrict.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDistrictActionPerformed(evt);
            }
        });
        jPanel2.add(btnAddDistrict, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 580, 60));

        btnAddLocation.setBackground(new java.awt.Color(153, 153, 153));
        btnAddLocation.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddLocation.setText("Tourism Location Management");
        btnAddLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddLocationActionPerformed(evt);
            }
        });
        jPanel2.add(btnAddLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 580, 60));

        btnAddProvince.setBackground(new java.awt.Color(153, 153, 153));
        btnAddProvince.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddProvince.setText("Province Management");
        btnAddProvince.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProvinceActionPerformed(evt);
            }
        });
        jPanel2.add(btnAddProvince, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 580, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 550));

        setSize(new java.awt.Dimension(634, 564));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProfileActionPerformed

        MgmProfile ProfileMgm = new MgmProfile();
        String xx = txtBox.getText();
        MgmProfile.txtBox.setText(xx);
        ProfileMgm.setVisible(true);
        ProfileMgm.pack();
        ProfileMgm.setLocationRelativeTo(null);
        ProfileMgm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();

    }//GEN-LAST:event_btnAddProfileActionPerformed

    private void btnAddDistrictActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDistrictActionPerformed
        MgmDistrict DistrictMgm = new MgmDistrict();
        String xx = txtBox.getText();
        MgmDistrict.txtBox.setText(xx);
        DistrictMgm.setVisible(true);
        DistrictMgm.pack();
        DistrictMgm.setLocationRelativeTo(null);
        DistrictMgm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnAddDistrictActionPerformed

    private void btnAddLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddLocationActionPerformed
        MgmProfile ProfileMgm = new MgmProfile();
        String xx = txtBox.getText();
        MgmProfile.txtBox.setText(xx);
        ProfileMgm.setVisible(true);
        ProfileMgm.pack();
        ProfileMgm.setLocationRelativeTo(null);
        ProfileMgm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnAddLocationActionPerformed

    private void btnAddProvinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProvinceActionPerformed
        MgmProvince ProvinceMgm = new MgmProvince();
        String xx = txtBox.getText();
        MgmProvince.txtBox.setText(xx);
        ProvinceMgm.setVisible(true);
        ProvinceMgm.pack();
        ProvinceMgm.setLocationRelativeTo(null);
        ProvinceMgm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnAddProvinceActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDistrict;
    private javax.swing.JButton btnAddLocation;
    private javax.swing.JButton btnAddProfile;
    private javax.swing.JButton btnAddProvince;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    public static javax.swing.JLabel txtBox;
    // End of variables declaration//GEN-END:variables
}
