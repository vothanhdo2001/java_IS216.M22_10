/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author votha
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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
        quanLyHoaDon = new javax.swing.JButton();
        quanLyKhuyenMai = new javax.swing.JButton();
        quanLyLoaiSanPham = new javax.swing.JButton();
        quanLySanPham = new javax.swing.JButton();
        quanLyDichVu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Trang Quản Lý");

        quanLyHoaDon.setText("Quản Lý Hóa Đơn");
        quanLyHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quanLyHoaDonActionPerformed(evt);
            }
        });

        quanLyKhuyenMai.setText("Quản Lý Khuyến Mãi");
        quanLyKhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quanLyKhuyenMaiActionPerformed(evt);
            }
        });

        quanLyLoaiSanPham.setText("Quản Lý Loại Sản Phẩm");
        quanLyLoaiSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quanLyLoaiSanPhamActionPerformed(evt);
            }
        });

        quanLySanPham.setText("Quản Lý Sản Phẩm");
        quanLySanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quanLySanPhamActionPerformed(evt);
            }
        });

        quanLyDichVu.setText("Quản Lý Hóa Đơn");
        quanLyDichVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quanLyDichVuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(quanLyDichVu)
                    .addComponent(quanLyHoaDon))
                .addGap(73, 73, 73)
                .addComponent(quanLyKhuyenMai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(quanLyLoaiSanPham)
                .addGap(58, 58, 58)
                .addComponent(quanLySanPham)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quanLyHoaDon)
                    .addComponent(quanLyKhuyenMai)
                    .addComponent(quanLyLoaiSanPham)
                    .addComponent(quanLySanPham))
                .addGap(31, 31, 31)
                .addComponent(quanLyDichVu)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quanLyHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quanLyHoaDonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        QuanLyHoaDon.main(null);
    }//GEN-LAST:event_quanLyHoaDonActionPerformed

    private void quanLyKhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quanLyKhuyenMaiActionPerformed
        // TODO add your handling code here:
        this.dispose();
        QuanLyKhuyenMai.main(null);
    }//GEN-LAST:event_quanLyKhuyenMaiActionPerformed

    private void quanLyLoaiSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quanLyLoaiSanPhamActionPerformed
        // TODO add your handling code here:
        this.dispose();
        QuanLyLoaiSanPham.main(null);
    }//GEN-LAST:event_quanLyLoaiSanPhamActionPerformed

    private void quanLySanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quanLySanPhamActionPerformed
        // TODO add your handling code here:
        this.dispose();
        QuanLySanPham.main(null);
    }//GEN-LAST:event_quanLySanPhamActionPerformed

    private void quanLyDichVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quanLyDichVuActionPerformed
        // TODO add your handling code here:
        this.dispose();
        QuanLyPhieuDichVu.main(null);
    }//GEN-LAST:event_quanLyDichVuActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton quanLyDichVu;
    private javax.swing.JButton quanLyHoaDon;
    private javax.swing.JButton quanLyKhuyenMai;
    private javax.swing.JButton quanLyLoaiSanPham;
    private javax.swing.JButton quanLySanPham;
    // End of variables declaration//GEN-END:variables
}