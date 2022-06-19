/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import File.ReadWriteFile;
import Process.PhieuDichVu;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author thetu
 */
public class QuanLyPhieuDichVu extends javax.swing.JFrame {

    DefaultTableModel DSPDV = new DefaultTableModel();
    int maNV = -1;
    int maPDV = -1;
    /**
     * Creates new form QuanLyPhieuDichVu
     */
    public QuanLyPhieuDichVu() throws SQLException, ClassNotFoundException, IOException{
        initComponents();
        setListPDV();
        setMaNV();
    }
    
    private void setListPDV() throws SQLException, ClassNotFoundException {
        try {
            PhieuDichVu pdv = new PhieuDichVu();
            ResultSet rs = pdv.getListPDV();
            DSPDV = (DefaultTableModel) bang1.getModel();
            DSPDV.setRowCount(0);
            String row[] = new String[6];
            while (rs.next()) {
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                DSPDV.addRow(row);
            }
            bang1.setModel(DSPDV);

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Xay ra loi" + ex.getMessage());
        }
    }
    

    public void setMaNV() throws IOException {
        ReadWriteFile rw = new ReadWriteFile();
        String temp = rw.readMaNV();
        maNV = Integer.valueOf(temp);
        System.out.println(maNV);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        bang2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        bang1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        quayLai = new javax.swing.JButton();
        maPhieuDichVu = new javax.swing.JFormattedTextField();
        xoa = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TaoHD = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Danh Sách Phiếu Dịch Vụ");

        bang2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã", "Tên Dịch Vụ", "Số Lượng", "Giá Dịch Vụ", "Thành Tiền"
            }
        ));
        bang2.setEnabled(false);
        jScrollPane5.setViewportView(bang2);

        bang1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã PDV", "Tên KH", "Ngày Tạo", "Tổng Cộng", "Trả Trước", "Thành Tiền"
            }
        ));
        bang1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bang1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(bang1);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Chi Tiết Hóa Đơn");

        jLabel1.setText("Mã phiếu dịch vụ đã chọn");

        quayLai.setBackground(new java.awt.Color(102, 102, 102));
        quayLai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        quayLai.setForeground(new java.awt.Color(255, 255, 255));
        quayLai.setText("Quay Lại");
        quayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quayLaiActionPerformed(evt);
            }
        });

        maPhieuDichVu.setEditable(false);

        xoa.setBackground(new java.awt.Color(255, 0, 51));
        xoa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        xoa.setForeground(new java.awt.Color(255, 255, 255));
        xoa.setText("Xóa");
        xoa.setEnabled(false);
        xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Quản lý Phiếu Dịch Vụ");

        TaoHD.setBackground(new java.awt.Color(51, 51, 255));
        TaoHD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TaoHD.setForeground(new java.awt.Color(255, 255, 255));
        TaoHD.setText("Tạo Phiếu Dịch Vụ");
        TaoHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TaoHDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1527, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(227, 227, 227)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addGap(348, 348, 348))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addGap(28, 28, 28)
                                    .addComponent(maPhieuDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(205, 205, 205))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(quayLai)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2)))
                            .addGap(60, 60, 60)
                            .addComponent(xoa)
                            .addGap(32, 32, 32)
                            .addComponent(TaoHD)
                            .addGap(259, 259, 259))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 839, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 645, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(quayLai))
                    .addGap(29, 29, 29)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(maPhieuDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(xoa)
                        .addComponent(TaoHD))
                    .addGap(39, 39, 39)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bang1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bang1MouseClicked
        // TODO add your handling code here:
        xoa.setEnabled(true);

        int Index = bang1.getSelectedRow();
        if (Index < DSPDV.getRowCount() && Index >= 0) {
            maPDV = Integer.valueOf(DSPDV.getValueAt(Index, 0).toString());
            maPhieuDichVu.setText(String.valueOf(maPDV));
        }
        try {
            DefaultTableModel DSCTDV = new DefaultTableModel();
            PhieuDichVu pdv = new PhieuDichVu();
            ResultSet rs = pdv.getListCTDV(maPDV);
            DSCTDV = (DefaultTableModel) bang2.getModel();
            DSCTDV.setRowCount(0);
            String row[] = new String[7];
            while (rs.next()) {
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                float temp = Integer.valueOf(row[3]) * Integer.valueOf(row[5]);
                row[6] = String.valueOf(temp);
                DSCTDV.addRow(row);
            }
            bang2.setModel(DSCTDV);

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Xay ra loi");
        }
    }//GEN-LAST:event_bang1MouseClicked

    private void quayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quayLaiActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Menu.main(null);
    }//GEN-LAST:event_quayLaiActionPerformed

    private void xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaActionPerformed
        // TODO add your handling code here:
        int Index = bang1.getSelectedRow();
        if (!(Index < DSPDV.getRowCount() && Index >= 0)) {
            JOptionPane.showMessageDialog(this, "Chọn loại Phiếu dịch vụ cần xóa !!!");
            return;
        }

        int ret = 0;
        ret = JOptionPane.showConfirmDialog(null, "Bạn có muốn Xóa", "Xóa", JOptionPane.YES_NO_OPTION);
        if (!(ret == JOptionPane.YES_OPTION)) {
            return;
        }
        try {
            PhieuDichVu pdv = new PhieuDichVu();
            int rs = pdv.remoteCTDV(maPDV);
            //gui.setEnabled(false);
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Xóa thất bại !!!");
        }
        try {
            PhieuDichVu pdv = new PhieuDichVu();
            int rs = pdv.remotePDV(maPDV);
            setListPDV();
            JOptionPane.showMessageDialog(this, "Xóa thành công !!!");
            maPhieuDichVu.setText("");
            xoa.setEnabled(false);
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Xóa thất bại !!!");
        }
    }//GEN-LAST:event_xoaActionPerformed

    private void TaoHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TaoHDActionPerformed
        // TODO add your handling code here:

        try {
            PhieuDichVu pdv = new PhieuDichVu();
            int check = pdv.addPDV(maNV);
            if (check == 0) {
                JOptionPane.showMessageDialog(this, "Tạo phiếu dịch vụ thất bại");
                return;
            }

            JOptionPane.showMessageDialog(this, "Thêm thành công !!!");
            this.dispose();
            TaoPhieuDichVu.main(null);

        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Thêm thất bại !!!" + ex.getMessage());
        }
    }//GEN-LAST:event_TaoHDActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyPhieuDichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyPhieuDichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyPhieuDichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyPhieuDichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new QuanLyPhieuDichVu().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(QuanLyPhieuDichVu.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(QuanLyPhieuDichVu.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(QuanLyPhieuDichVu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton TaoHD;
    private javax.swing.JTable bang1;
    private javax.swing.JTable bang2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JFormattedTextField maPhieuDichVu;
    private javax.swing.JButton quayLai;
    private javax.swing.JButton xoa;
    // End of variables declaration//GEN-END:variables
}
