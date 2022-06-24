/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Process.DoiTac;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class QuanLyDoiTac extends javax.swing.JFrame {

    int maDT = -1;
    //ArrayList<String> listMaGiai = null;
    DefaultTableModel DSDT = new DefaultTableModel();

    /**
     * Creates new form ChonDoiTac
     */
    public QuanLyDoiTac() throws SQLException, ClassNotFoundException {
        initComponents();
        setListDT();
        setVisible(true);
    }

    private void setListDT() throws SQLException, ClassNotFoundException {
        try {
            DoiTac dt = new DoiTac();
            ResultSet rs = dt.getListDT();
            DSDT = (DefaultTableModel) bang.getModel();
            DSDT.setRowCount(0);
            String row[] = new String[4];
            while (rs.next()) {
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                DSDT.addRow(row);
            }
            bang.setModel(DSDT);

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Xay ra loi");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bang = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        bThem = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        bXoa = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        bSua = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        quayLai = new javax.swing.JButton();
        tenCongTy = new javax.swing.JTextField();
        diaChi = new javax.swing.JTextField();
        soDienThoai = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Đối Tác");

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Danh Sách Đối Tác");

        bang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã DT", "Tên Công Ty", "Địa Chỉ", "Số Điện Thoại"
            }
        ));
        bang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(bang);
        if (bang.getColumnModel().getColumnCount() > 0) {
            bang.getColumnModel().getColumn(0).setMinWidth(80);
            bang.getColumnModel().getColumn(0).setPreferredWidth(80);
            bang.getColumnModel().getColumn(0).setMaxWidth(80);
            bang.getColumnModel().getColumn(3).setMinWidth(160);
            bang.getColumnModel().getColumn(3).setPreferredWidth(160);
            bang.getColumnModel().getColumn(3).setMaxWidth(160);
        }

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("Quản Lý Đối Tác");

        bThem.setBackground(new java.awt.Color(0, 0, 255));
        bThem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bThem.setForeground(new java.awt.Color(255, 255, 255));
        bThem.setText("Thêm");
        bThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bThemActionPerformed(evt);
            }
        });

        jLabel2.setText("Tên Công Ty");

        bXoa.setBackground(new java.awt.Color(255, 0, 0));
        bXoa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bXoa.setForeground(new java.awt.Color(255, 255, 255));
        bXoa.setText("Xóa");
        bXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bXoaActionPerformed(evt);
            }
        });

        jLabel4.setText("Địa chỉ");

        bSua.setBackground(new java.awt.Color(0, 255, 0));
        bSua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bSua.setForeground(new java.awt.Color(255, 255, 255));
        bSua.setText("Sửa");
        bSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSuaActionPerformed(evt);
            }
        });

        jLabel5.setText("SĐT");

        quayLai.setBackground(new java.awt.Color(102, 102, 102));
        quayLai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        quayLai.setForeground(new java.awt.Color(255, 255, 255));
        quayLai.setText("Quay Lại");
        quayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quayLaiActionPerformed(evt);
            }
        });

        soDienThoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soDienThoaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1018, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addGap(30, 30, 30)))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(quayLai)
                                .addGap(227, 227, 227)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tenCongTy, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(bThem)
                                .addGap(103, 103, 103)
                                .addComponent(bXoa)
                                .addGap(95, 95, 95)
                                .addComponent(bSua))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(diaChi)
                                .addComponent(soDienThoai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(jLabel3)))
                        .addGap(225, 225, 225))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(475, 475, 475)
                        .addComponent(jLabel6)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(quayLai))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tenCongTy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bThem)
                    .addComponent(bXoa)
                    .addComponent(bSua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void soDienThoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soDienThoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soDienThoaiActionPerformed

    private void bangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bangMouseClicked
        // TODO add your handling code here:
        bThem.setEnabled(true);
        bXoa.setEnabled(true);
        bSua.setEnabled(true);
        int Index = bang.getSelectedRow();
        if (Index < DSDT.getRowCount() && Index >= 0) {
            maDT = Integer.valueOf(DSDT.getValueAt(Index, 0).toString());
            tenCongTy.setText(DSDT.getValueAt(Index, 1).toString());
            diaChi.setText(DSDT.getValueAt(Index, 2).toString());
            soDienThoai.setText(DSDT.getValueAt(Index, 3).toString());
    }//GEN-LAST:event_bangMouseClicked
    }
    private void bThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bThemActionPerformed
        // TODO add your handling code here:
        String tenCT = tenCongTy.getText();
        String diaC = diaChi.getText();
        String soDT = soDienThoai.getText();
        if (tenCT.equals("") || diaC.equals("") || soDT.equals("")) {
            JOptionPane.showMessageDialog(this, "Không được để trống !!!");
            return;
        }
        int ret = 0;
        ret = JOptionPane.showConfirmDialog(null, "Bạn có muốn Thêm", "Thêm", JOptionPane.YES_NO_OPTION);
        if (!(ret == JOptionPane.YES_OPTION)) {
            return;
        }
        try {
            DoiTac dt = new DoiTac();
            int check = dt.checkDoiTac(tenCT);
            if (check == 0) {
                JOptionPane.showMessageDialog(this, "Đối tác đã tồn tại !!!");
                return;
            }
            int rs = dt.addDoiTac(tenCT, diaC, soDT);
            setListDT();
            JOptionPane.showMessageDialog(this, "Thêm thành công !!!");
            tenCongTy.setText("");
            diaChi.setText("");
            soDienThoai.setText("");
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Số điện thoại phải là số !!!");
        }
    }//GEN-LAST:event_bThemActionPerformed

    private void bXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bXoaActionPerformed
        // TODO add your handling code here:
        int Index = bang.getSelectedRow();
        if (!(Index < DSDT.getRowCount() && Index >= 0)) {
            JOptionPane.showMessageDialog(this, "Chọn loại sản phẩm cần xóa !!!");
            return;
        }

        int ret = 0;
        ret = JOptionPane.showConfirmDialog(null, "Bạn có muốn Xóa", "Xóa", JOptionPane.YES_NO_OPTION);
        if (!(ret == JOptionPane.YES_OPTION)) {
            return;
        }

        try {
            DoiTac dt = new DoiTac();
            int rs = dt.remoteDT(maDT);
            setListDT();
            JOptionPane.showMessageDialog(this, "Xóa thành công !!!");
            tenCongTy.setText("");
            diaChi.setText("");
            soDienThoai.setText("");
            bXoa.setEnabled(false);
            bSua.setEnabled(false);
            bThem.setEnabled(true);
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Xóa thất bại !!!");
        }
    }//GEN-LAST:event_bXoaActionPerformed

    private void bSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSuaActionPerformed
        // TODO add your handling code here:
        int Index = bang.getSelectedRow();
        if (!(Index < DSDT.getRowCount() && Index >= 0)) {
            JOptionPane.showMessageDialog(this, "Chọn đối tác cần sửa !!!");
            return;
        }

        String tenCT = tenCongTy.getText();
        String diaC = diaChi.getText();
        String soDT = soDienThoai.getText();
        if (tenCT.equals("") || diaC.equals("") || soDT.equals("")) {
            JOptionPane.showMessageDialog(this, "Không được để trống !!!");
            return;
        }

        int ret = 0;
        ret = JOptionPane.showConfirmDialog(null, "Bạn có muốn Sửa", "Sửa", JOptionPane.YES_NO_OPTION);
        if (!(ret == JOptionPane.YES_OPTION)) {
            return;
        }

        try {
            DoiTac dt = new DoiTac();
            int rs = dt.updateKM(maDT, tenCT, diaC, soDT);
            setListDT();
            JOptionPane.showMessageDialog(this, "Sửa thành công !!!");
            tenCongTy.setText("");
            diaChi.setText("");
            soDienThoai.setText("");
            bSua.setEnabled(false);
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Sửa thất bại !!!");
        }
    }//GEN-LAST:event_bSuaActionPerformed

    private void quayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quayLaiActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Menu.main(null);
    }//GEN-LAST:event_quayLaiActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyDoiTac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyDoiTac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyDoiTac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyDoiTac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new QuanLyDoiTac().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(QuanLyDoiTac.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(QuanLyDoiTac.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bSua;
    private javax.swing.JButton bThem;
    private javax.swing.JButton bXoa;
    private javax.swing.JTable bang;
    private javax.swing.JTextField diaChi;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton quayLai;
    private javax.swing.JTextField soDienThoai;
    private javax.swing.JTextField tenCongTy;
    // End of variables declaration//GEN-END:variables
}
