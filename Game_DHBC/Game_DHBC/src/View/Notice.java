/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import org.omg.CORBA.SystemException;

/**
 *
 * @author BuuBuu
 */
public class Notice extends javax.swing.JFrame {

    /**
     * Creates new form Rules
     */
    public Notice() {
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

        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(138, 207, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextPane1.setEditable(false);
        jTextPane1.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 2, true));
        jTextPane1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(0, 0, 51));
        jTextPane1.setText("      + Đuổi hình bắt chữ là một game trí tuệ, thú vị, hài hước vui nhộn và bất ngờ!!!  \n      + Bạn hãy khám phá những tầng ý nghĩa đặc sắc của các câu chữ ẩn sau những hình ảnh quen thuộc.\n      + Bạn sẽ không nhịn được cười khi mở ra đáp án, những hình ảnh tường chừng như không liên quan, nhưng khi ghép lại với nhau lại tạo thành những câu chữ thú vị.  \n      + Cùng nhau tham gia trò chơi để có những tiếng cười sảng khoái bạn nhé!!!  \n      + Đừng quên lưu điểm để có tên trên Bảng Xếp Hạng của Game nhé!!!");
        jScrollPane3.setViewportView(jTextPane1);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 640, 290));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_info_80px_1.png"))); // NOI18N
        jLabel3.setText("Giới Thiệu");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 260, 70));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_dice_80px.png"))); // NOI18N
        jLabel4.setText("Cách Chơi");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, -1, -1));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 0, 51));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("          * Bạn điền đáp án vào ô trống với những chữ cái xáo trộn có sẵn trong bảng\n          * Khi nào bí quá thì hãy dùng 3 viên Kim Cương để mua 1 ô chữ bất kỳ để xem gợi ý nhé!\n          * Trả lời đúng được 1 câu, bạn sẽ được cộng 5 điểm thưởng để tham gia xếp hạng và 3 Kim Cương dùng để mua ô gợi ý.\n          * Khi hết Kim Cương mà vẫn không đoán được ô chữ?? Đừng lo, bạn có thể nạp thêm Kim Cương để tiếp tục trò chơi nhé!!!\n          * Ngoài ra, nếu bạn là người thông minh và sáng tạo, có thể đóng góp thêm câu hỏi để giúp chúng mình phát triển thêm vào thư viện câu hỏi của Game trong mục Trợ giúp & Đóng góp!!!");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 153, 0), new java.awt.Color(255, 102, 102), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 51, 0)));
        jScrollPane1.setViewportView(jTextArea1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 589, 290));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Cach Choi.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 467, 290, 320));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 320));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_undo_80px_2.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
        });
        jPanel3.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Hướng dẫn");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1180, 790));

        jPanel1.setBackground(new java.awt.Color(1, 21, 45));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 10));

        jPanel2.setBackground(new java.awt.Color(1, 21, 45));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 800, 1200, -1));

        jPanel5.setBackground(new java.awt.Color(1, 21, 45));
        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 10, 10, 790));

        jPanel4.setBackground(new java.awt.Color(1, 21, 45));
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 10, 790));

        setSize(new java.awt.Dimension(1200, 811));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_closeMouseEntered

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
            java.util.logging.Logger.getLogger(Notice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Notice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Notice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Notice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}