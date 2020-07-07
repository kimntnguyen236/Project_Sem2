/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DBModels.PlayerDAO;
import DBEntities.Player;
import Sound.Sound;
import static View.Admin_List.Active;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author LENOVO
 */
public final class Players_Details extends javax.swing.JFrame {

    String userName, Password;
    String user;
    String pass;
    DefaultTableModel model1;
    List<Player> ds = new ArrayList<>();
    TableRowSorter<TableModel> sorter;
    Sound sound = new Sound();
    static boolean Active = false;

    public Players_Details() {
        initComponents();
        model1 = (DefaultTableModel) tbPlayer.getModel();
        ShowtbPlayer();
    }

    public void active() {
        Active = true;
    }

    public void ShowtbPlayer() {
        ds = new PlayerDAO().getList();
        ds.forEach((tem) -> {
            model1.addRow(tem.toVector());
        });
    }

    public void getPlayer(String user, String pass) {
        userName = user;
        Password = pass;
        jlbAdmin.setText("Tài khoản: " + user);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPlayer = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        bntCancel = new javax.swing.JButton();
        bntDetail = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bntsearch = new javax.swing.JButton();
        jlbAdmin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbPlayer.setAutoCreateRowSorter(true);
        tbPlayer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tài khoản", "Email", "Ngày sinh", "Số điện thoại", "Ngày Tham gia"
            }
        ));
        tbPlayer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbPlayer.setMinimumSize(new java.awt.Dimension(50, 0));
        jScrollPane1.setViewportView(tbPlayer);
        if (tbPlayer.getColumnModel().getColumnCount() > 0) {
            tbPlayer.getColumnModel().getColumn(1).setPreferredWidth(130);
            tbPlayer.getColumnModel().getColumn(2).setPreferredWidth(80);
            tbPlayer.getColumnModel().getColumn(3).setPreferredWidth(100);
            tbPlayer.getColumnModel().getColumn(4).setPreferredWidth(80);
        }

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 930, 390));
        jPanel4.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 510, 40));

        bntCancel.setBackground(new java.awt.Color(51, 51, 51));
        bntCancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bntCancel.setForeground(new java.awt.Color(255, 255, 255));
        bntCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel_48px.png"))); // NOI18N
        bntCancel.setText("Thoát");
        bntCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bntCancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bntCancelMouseExited(evt);
            }
        });
        bntCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCancelActionPerformed(evt);
            }
        });
        jPanel4.add(bntCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 640, 170, 60));

        bntDetail.setBackground(new java.awt.Color(51, 51, 51));
        bntDetail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bntDetail.setForeground(new java.awt.Color(255, 255, 255));
        bntDetail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_edit_property_50px.png"))); // NOI18N
        bntDetail.setText("Xem Chi Tiết");
        bntDetail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntDetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bntDetailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bntDetailMouseExited(evt);
            }
        });
        bntDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntDetailActionPerformed(evt);
            }
        });
        jPanel4.add(bntDetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 640, 210, 60));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thông Tin Người Chơi");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 410, 40));

        bntsearch.setBackground(new java.awt.Color(51, 51, 51));
        bntsearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bntsearch.setForeground(new java.awt.Color(255, 255, 255));
        bntsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search_48px.png"))); // NOI18N
        bntsearch.setText("Tìm kiếm");
        bntsearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntsearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bntsearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bntsearchMouseExited(evt);
            }
        });
        bntsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntsearchActionPerformed(evt);
            }
        });
        jPanel4.add(bntsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, -1, 40));

        jlbAdmin.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlbAdmin.setForeground(new java.awt.Color(255, 255, 51));
        jPanel4.add(jlbAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 40));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 730));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bntsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntsearchActionPerformed
        // TODO add your handling code here:
        sound.playMusic("./src/Sound/click2.wav");
        if (txtSearch.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Vui long nhập từ khóa muốn tìm kiếm....");
            txtSearch.requestFocus();
        } else {
            sorter = (TableRowSorter<TableModel>) tbPlayer.getRowSorter();
            //  sorter.setRowFilter(RowFilter.regexFilter(txtSearch.getText(), 0));
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + txtSearch.getText()));
        }
    }//GEN-LAST:event_bntsearchActionPerformed

    private void bntDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntDetailActionPerformed
        // TODO add your handling code here:
        sound.playMusic("./src/Sound/click2.wav");
        Print_Player_Details rgf = new Print_Player_Details();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        rgf.getPrintPlayer(userName, Password);

    }//GEN-LAST:event_bntDetailActionPerformed

    private void bntCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCancelActionPerformed
        // TODO add your handling code here:
        sound.playMusic("./src/Sound/click2.wav");
        Admin_page rgf = new Admin_page();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        rgf.getAdmin(userName, Password);
    }//GEN-LAST:event_bntCancelActionPerformed

    private void bntsearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntsearchMouseEntered
        ImageIcon close = new ImageIcon("./src/images/search-icon.png");
        sound.playMusic("./src/Sound/click2.wav");
        bntsearch.setIcon(close);
        bntsearch.setBackground(Color.black);
    }//GEN-LAST:event_bntsearchMouseEntered

    private void bntsearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntsearchMouseExited
        // TODO add your handling code here:
        ImageIcon close = new ImageIcon("./src/images/search_48px.png");
        bntsearch.setIcon(close);
        bntsearch.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_bntsearchMouseExited

    private void bntDetailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntDetailMouseEntered
        ImageIcon close = new ImageIcon("./src/images/icons8_edit_property_80px.png");
        bntDetail.setIcon(close);
        bntDetail.setBackground(Color.black);
    }//GEN-LAST:event_bntDetailMouseEntered

    private void bntDetailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntDetailMouseExited
        // TODO add your handling code here:
        ImageIcon close = new ImageIcon("./src/images/icons8_edit_property_80px.png");
        bntDetail.setIcon(close);
        bntDetail.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_bntDetailMouseExited

    private void bntCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntCancelMouseEntered
        // TODO add your handling code here:
        ImageIcon close = new ImageIcon("./src/images/cancel2.png");
        bntCancel.setIcon(close);
        bntCancel.setBackground(Color.black);
    }//GEN-LAST:event_bntCancelMouseEntered

    private void bntCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntCancelMouseExited
        // TODO add your handling code here:
        ImageIcon close = new ImageIcon("./src/images/cancel_48px.png");
        bntCancel.setIcon(close);
        bntCancel.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_bntCancelMouseExited

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
            java.util.logging.Logger.getLogger(Players_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Players_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Players_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Players_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if (Active) {
                    new Players_Details().setVisible(true);
                    new Login().setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Bạn cần phải đăng nhập trước khi mở trang này!!!");
                    new Login().setVisible(true);
                }

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCancel;
    private javax.swing.JButton bntDetail;
    private javax.swing.JButton bntsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbAdmin;
    private javax.swing.JTable tbPlayer;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
