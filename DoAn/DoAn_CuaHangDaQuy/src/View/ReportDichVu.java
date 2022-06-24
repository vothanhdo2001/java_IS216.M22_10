/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import ConnectDB.ConnectionUtils;
import Process.PhieuDichVu;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author thetu
 */
public class ReportDichVu extends javax.swing.JFrame {

    DefaultTableModel DSPDV = new DefaultTableModel();
    int maNV = -1;
    int maPDV = -1;
    /**
     * Creates new form ReportDichVu
     */
    public ReportDichVu() throws SQLException, ClassNotFoundException, IOException{
        initComponents();
        setListPDV();
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
    
    private void getInput(String ma) throws SQLException, JRException{
        Hashtable map = new Hashtable();
        JasperReport report = JasperCompileManager.compileReport("src\\View\\DichVu.jrxml");

        map.put("PARA_MAPDV", ma);
        try {
            Connection con = ConnectionUtils.getMyConnection();
            JasperPrint p = JasperFillManager.fillReport(report, map, con);
            JasperViewer.viewReport(p, false);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
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
        maPhieuDichVu = new javax.swing.JFormattedTextField();
        btHD = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        bang1 = new javax.swing.JTable();
        quayLai = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Report Dịch Vụ");

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));

        jLabel1.setText("Mã phiếu dịch vụ đã chọn");

        maPhieuDichVu.setEditable(false);

        btHD.setBackground(new java.awt.Color(0, 255, 0));
        btHD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btHD.setForeground(new java.awt.Color(255, 255, 255));
        btHD.setText("Xem Phiếu DV");
        btHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHDActionPerformed(evt);
            }
        });

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
        if (bang1.getColumnModel().getColumnCount() > 0) {
            bang1.getColumnModel().getColumn(0).setMinWidth(80);
            bang1.getColumnModel().getColumn(0).setPreferredWidth(80);
            bang1.getColumnModel().getColumn(0).setMaxWidth(80);
        }

        quayLai.setBackground(new java.awt.Color(102, 102, 102));
        quayLai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        quayLai.setForeground(new java.awt.Color(255, 255, 255));
        quayLai.setText("Quay Lại");
        quayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quayLaiActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Report Dịch Vụ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addComponent(maPhieuDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(btHD, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(quayLai)
                        .addGap(272, 272, 272)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 988, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quayLai)
                    .addComponent(jLabel2))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(maPhieuDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btHD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bang1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bang1MouseClicked


        int Index = bang1.getSelectedRow();
        if (Index < DSPDV.getRowCount() && Index >= 0) {
            maPDV = Integer.valueOf(DSPDV.getValueAt(Index, 0).toString());
            maPhieuDichVu.setText(String.valueOf(maPDV));
        }
        try {
            DefaultTableModel DSCTDV = new DefaultTableModel();
            PhieuDichVu pdv = new PhieuDichVu();
            ResultSet rs = pdv.getListCTDV(maPDV);
            //DSCTDV = (DefaultTableModel) bang2.getModel();
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
            //bang2.setModel(DSCTDV);

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Xay ra loi");
        }
    }//GEN-LAST:event_bang1MouseClicked

    private void quayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quayLaiActionPerformed
        // TODO add your handling code here:
        this.dispose();
        QuanLyReport.main(null);
    }//GEN-LAST:event_quayLaiActionPerformed

    private void btHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHDActionPerformed
        // TODO add your handling code here:
        String ma = maPhieuDichVu.getText();

        try {
            getInput(ma);
        } catch(SQLException | JRException ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_btHDActionPerformed

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
            java.util.logging.Logger.getLogger(ReportDichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportDichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportDichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportDichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ReportDichVu().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ReportDichVu.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ReportDichVu.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(ReportDichVu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bang1;
    private javax.swing.JButton btHD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField maPhieuDichVu;
    private javax.swing.JButton quayLai;
    // End of variables declaration//GEN-END:variables
}
