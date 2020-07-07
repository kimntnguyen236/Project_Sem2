/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DBModels.AdminDAO;
import DBModels.HelpSupportDAO;
import DBEntities.Admin;
import DBEntities.HelpSupport;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class HelpSupport_Admin extends javax.swing.JFrame {

    DefaultTableModel model1;
    ArrayList<HelpSupport> ds;
    public int id;

    String username = "", password = "";
    String userName, Password;
    public void getAdmin(String user, String pass) {
        username = user;
        password = pass;
    }
    
    public HelpSupport_Admin() {
        initComponents();
        model1 = (DefaultTableModel) tbQA.getModel();
        showHp();
    }

    public void showHp() {
        ds = new HelpSupportDAO().getList();
        model1.setRowCount(0);
        ds.forEach((tem) -> {
            model1.addRow(tem.toVector());
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jAdmin = new javax.swing.JLabel();
        bntCancel = new javax.swing.JButton();
        bntview = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbQA = new javax.swing.JTable();
        bntDelete1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ PHẢN HỒI");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 480, -1));

        jAdmin.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jAdmin.setForeground(new java.awt.Color(255, 255, 255));
        jAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 40));

        bntCancel.setBackground(new java.awt.Color(255, 255, 51));
        bntCancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bntCancel.setText("Thoát");
        bntCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCancelActionPerformed(evt);
            }
        });
        jPanel2.add(bntCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 90, 200, 50));

        bntview.setBackground(new java.awt.Color(255, 51, 0));
        bntview.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bntview.setText("Xem Chi Tiết");
        bntview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntviewActionPerformed(evt);
            }
        });
        jPanel2.add(bntview, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 200, 50));

        tbQA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Tài Khoản", "Tiêu Đề", "Nôi Dung", "Ngày Nhận"
            }
        ));
        jScrollPane1.setViewportView(tbQA);
        if (tbQA.getColumnModel().getColumnCount() > 0) {
            tbQA.getColumnModel().getColumn(0).setMinWidth(50);
            tbQA.getColumnModel().getColumn(0).setPreferredWidth(5);
            tbQA.getColumnModel().getColumn(0).setMaxWidth(50);
            tbQA.getColumnModel().getColumn(1).setMinWidth(150);
            tbQA.getColumnModel().getColumn(1).setMaxWidth(200);
            tbQA.getColumnModel().getColumn(2).setMinWidth(200);
            tbQA.getColumnModel().getColumn(2).setMaxWidth(250);
            tbQA.getColumnModel().getColumn(4).setMinWidth(150);
            tbQA.getColumnModel().getColumn(4).setMaxWidth(150);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 1310, 470));

        bntDelete1.setBackground(new java.awt.Color(255, 255, 51));
        bntDelete1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bntDelete1.setText("Xóa");
        bntDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntDelete1ActionPerformed(evt);
            }
        });
        jPanel2.add(bntDelete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 200, 50));

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1410, 710));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1450, 710));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void bntCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCancelActionPerformed
        // TODO add your handling code here:
        Admin_page rgf = new Admin_page();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        rgf.getAdmin(username, password);
    }//GEN-LAST:event_bntCancelActionPerformed
    private void bntviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntviewActionPerformed
        // TODO add your handling code here:
        int selectedIndex = tbQA.getSelectedRow();
        if (selectedIndex >= 0) {
            HelpSupport Hp = ds.get(selectedIndex);
            id = Hp.getCaseid();

            HelpSupport_Admin_Detail vhp = new HelpSupport_Admin_Detail(this, rootPaneCheckingEnabled);

            vhp.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn nôi dung bạn muốn xem...");
        }
    }//GEN-LAST:event_bntviewActionPerformed

    private void bntDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntDelete1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bntDelete1ActionPerformed
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
            java.util.logging.Logger.getLogger(HelpSupport_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HelpSupport_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HelpSupport_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HelpSupport_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HelpSupport_Admin().setVisible(true);
                new Login().setVisible(false);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCancel;
    private javax.swing.JButton bntDelete1;
    public javax.swing.JButton bntview;
    private javax.swing.JLabel jAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbQA;
    // End of variables declaration//GEN-END:variables
}
