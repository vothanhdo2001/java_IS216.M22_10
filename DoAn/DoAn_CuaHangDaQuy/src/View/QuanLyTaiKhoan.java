/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Process.TaiKhoan;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thetu
 */
public class QuanLyTaiKhoan extends javax.swing.JFrame {

    DefaultTableModel DSTK = new DefaultTableModel();
    int maNV = -1;
    /**
     * Creates new form QuanLyTaiKhoan
     */
    public QuanLyTaiKhoan() {
        initComponents();
        setListTK();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        xnMatKhau = new javax.swing.JFormattedTextField();
        quayLai = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btSua = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTK = new javax.swing.JTable();
        maNhanVien = new javax.swing.JFormattedTextField();
        tenTaiKhoan = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btThem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        matKhau = new javax.swing.JFormattedTextField();
        btXoa = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
<<<<<<< Updated upstream
=======
        xnMatKhau = new javax.swing.JFormattedTextField();
        quayLai = new javax.swing.JButton();
>>>>>>> Stashed changes

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Tài Khoản");

        jPanel2.setBackground(new java.awt.Color(255, 204, 255));

        quayLai.setBackground(new java.awt.Color(102, 102, 102));
        quayLai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        quayLai.setForeground(new java.awt.Color(255, 255, 255));
        quayLai.setText("Quay Lại");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Danh Sách Tài Khoản");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Tên TK");

        btSua.setBackground(new java.awt.Color(0, 204, 0));
        btSua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btSua.setForeground(new java.awt.Color(255, 255, 255));
        btSua.setText("Sửa");
        btSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaActionPerformed(evt);
            }
        });

        tbTK.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbTK.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã Nhân Viên", "Tên Tài Khoản", "Mật Khẩu"
            }
        ));
        tbTK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTKMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbTK);

        maNhanVien.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        maNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maNhanVienActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Quản Lý Tài Khoản");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Mật khẩu");

        btThem.setBackground(new java.awt.Color(0, 51, 204));
        btThem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btThem.setForeground(new java.awt.Color(255, 255, 255));
        btThem.setText("Thêm");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Mã NV");

        btXoa.setBackground(new java.awt.Color(255, 0, 51));
        btXoa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btXoa.setForeground(new java.awt.Color(255, 255, 255));
        btXoa.setText("Xóa");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Xác nhận MK");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(0, 91, Short.MAX_VALUE)
                            .addComponent(btThem, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(69, 69, 69)
                            .addComponent(btXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(63, 63, 63)
                            .addComponent(btSua, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(131, 131, 131))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addGap(64, 64, 64)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(maNhanVien)
                                .addComponent(tenTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(70, 70, 70)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(xnMatKhau)
                                .addComponent(matKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(quayLai)
                        .addGap(143, 143, 143)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(quayLai)))
                .addGap(65, 65, 65)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(matKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(xnMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(maNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tenTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btXoa)
                    .addComponent(btSua)
                    .addComponent(btThem))
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        quayLai.setBackground(new java.awt.Color(102, 102, 102));
        quayLai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        quayLai.setForeground(new java.awt.Color(255, 255, 255));
        quayLai.setText("Quay Lại");
        quayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quayLaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< Updated upstream
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
=======
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(quayLai)
                .addGap(242, 242, 242)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(293, 293, 293))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btThem, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(106, 106, 106)
                                .addComponent(btSua, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(maNhanVien)
                                    .addComponent(tenTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(xnMatKhau)
                                    .addComponent(matKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22))
                            .addComponent(btXoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(73, 73, 73))
>>>>>>> Stashed changes
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
<<<<<<< Updated upstream
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
=======
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(quayLai))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(maNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tenTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(matKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(xnMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btXoa)
                    .addComponent(btSua)
                    .addComponent(btThem))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
>>>>>>> Stashed changes
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setListTK() {
        try {
            TaiKhoan tk = new TaiKhoan();
            ResultSet rs = tk.getListTK();
            DSTK = (DefaultTableModel) tbTK.getModel();
            DSTK.setRowCount(0);
            String row[] = new String[3];
            while (rs.next()) {
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                DSTK.addRow(row);
            }
            tbTK.setModel(DSTK);

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Xay ra loi");
        }
    }
    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        // TODO add your handling code here:
        String tenTK = tenTaiKhoan.getText();
        String MK = matKhau.getText();
        String XNMK = xnMatKhau.getText();
        String maNV = maNhanVien.getText();
        if (tenTK.equals("") || MK.equals("") || XNMK.equals("")) {
            JOptionPane.showMessageDialog(this, "Không được để trống !!!");
            return;
        }
        
        if (XNMK.equals(MK) == false){
            JOptionPane.showMessageDialog(this, "Xác nhận mật khẩu không trùng khớp !!!");
            return;
        }
        
        int ret = 0;
        ret = JOptionPane.showConfirmDialog(null, "Bạn có muốn Thêm", "Thêm", JOptionPane.YES_NO_OPTION);
        if (!(ret == JOptionPane.YES_OPTION)) {
            return;
        }
        try {
            TaiKhoan tk = new TaiKhoan();
            int check = tk.checkTK(Integer.valueOf(maNV));
            if (check == 0) {
                JOptionPane.showMessageDialog(this, "Nhân viên đã tồn tại tài khoản !!!");
                return;
            }

            //int maLSP = Integer.valueOf(listMaLSP.get(loaiSanPham.getSelectedIndex()));
            //int intSL = Integer.valueOf(SL);
            int intmaNV = Integer.valueOf(maNV);
            int rs = tk.addTK(intmaNV, tenTK, MK);
            setListTK();
            JOptionPane.showMessageDialog(this, "Thêm thành công !!!");
            tenTaiKhoan.setText("");
            matKhau.setText("");
            maNhanVien.setText("");
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Thêm thất bại !!!" + ex.getMessage());
        }
    }//GEN-LAST:event_btThemActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        // TODO add your handling code here:
        int Index = tbTK.getSelectedRow();
        if (!(Index < DSTK.getRowCount() && Index >= 0)) {
            JOptionPane.showMessageDialog(this, "Chọn tài khoàn cần xóa !!!");
            return;
        }

        int ret = 0;
        ret = JOptionPane.showConfirmDialog(null, "Bạn có muốn Xóa", "Xóa", JOptionPane.YES_NO_OPTION);
        if (!(ret == JOptionPane.YES_OPTION)) {
            return;
        }

        try {
            System.out.println(maNV);
            TaiKhoan tk = new TaiKhoan();
            int rs = tk.remoteTK(maNV);
            setListTK();
            JOptionPane.showMessageDialog(this, "Xóa thành công !!!");
            maNhanVien.setText("");
            tenTaiKhoan.setText("");
            matKhau.setText("");
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Xóa thất bại !!!");
        }
    }//GEN-LAST:event_btXoaActionPerformed

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        // TODO add your handling code here:
        String tenTK = tenTaiKhoan.getText();
        String MK = matKhau.getText();
        String XNMK = xnMatKhau.getText();
        String maNV = maNhanVien.getText();
        int Index = tbTK.getSelectedRow();
        if (!(Index < DSTK.getRowCount() && Index >= 0)) {
            JOptionPane.showMessageDialog(this, "Chọn tài khoản cần sửa !!!");
            return;
        }
        
        if (XNMK.equals(MK) == false){
            JOptionPane.showMessageDialog(this, "Xác nhận mật khẩu không trùng khớp !!!");
            return;
        }

        if (maNV.equals("") || tenTK.equals("") || MK.equals("")) {
            JOptionPane.showMessageDialog(this, "Không được để trống !!!");
            return;
        }

        int ret = 0;
        ret = JOptionPane.showConfirmDialog(null, "Bạn có muốn Sửa", "Sửa", JOptionPane.YES_NO_OPTION);
        if (!(ret == JOptionPane.YES_OPTION)) {
            return;
        }

        try {
            TaiKhoan tk = new TaiKhoan();
            //int maL = Integer.valueOf(listMaLSP.get(loaiSanPham.getSelectedIndex()));
            int intmaNV = Integer.valueOf(maNV);
            //int intDG = Integer.valueOf(DG);
            int rs = tk.updateTK(intmaNV, tenTK, MK);
            setListTK();
            JOptionPane.showMessageDialog(this, "Sửa thành công !!!");
            maNhanVien.setText("");
            tenTaiKhoan.setText("");
            matKhau.setText("");
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Sửa thất bại !!!");
        }
        
    }//GEN-LAST:event_btSuaActionPerformed

    private void tbTKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTKMouseClicked
        // TODO add your handling code here:
        btThem.setEnabled(true);
        btXoa.setEnabled(true);
        btSua.setEnabled(true);
        int Index = tbTK.getSelectedRow();
        if (Index < DSTK.getRowCount() && Index >= 0) {
            maNV = Integer.valueOf(DSTK.getValueAt(Index, 0).toString());
            tenTaiKhoan.setText(DSTK.getValueAt(Index, 1).toString());
            matKhau.setText(DSTK.getValueAt(Index, 2).toString());
            System.out.println(maNV);
        }
    }//GEN-LAST:event_tbTKMouseClicked

    private void quayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quayLaiActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Menu.main(null);
    }//GEN-LAST:event_quayLaiActionPerformed

    private void maNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maNhanVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maNhanVienActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyTaiKhoan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField maNhanVien;
    private javax.swing.JFormattedTextField matKhau;
    private javax.swing.JButton quayLai;
    private javax.swing.JTable tbTK;
    private javax.swing.JFormattedTextField tenTaiKhoan;
    private javax.swing.JFormattedTextField xnMatKhau;
    // End of variables declaration//GEN-END:variables
}
