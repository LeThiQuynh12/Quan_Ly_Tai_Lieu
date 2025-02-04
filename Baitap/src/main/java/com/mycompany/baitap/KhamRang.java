package com.mycompany.baitap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class KhamRang extends javax.swing.JFrame {

    /**
     * Creates new form KhamRang
     */
    public KhamRang() {
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

        lbTieuDe = new javax.swing.JLabel();
        lbTenKH = new javax.swing.JLabel();
        txtTenKH = new javax.swing.JTextField();
        chkCaoVoi = new javax.swing.JCheckBox();
        chkTayTrang = new javax.swing.JCheckBox();
        lbGiaCaoVoi = new javax.swing.JLabel();
        lbGiaTayTrang = new javax.swing.JLabel();
        lbGiaNhoRang = new javax.swing.JLabel();
        lbGiaTramRang = new javax.swing.JLabel();
        lbTongCong = new javax.swing.JLabel();
        btnTinhTien = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        lbTramRang = new javax.swing.JLabel();
        lbNhoRang = new javax.swing.JLabel();
        txtTongCong = new javax.swing.JTextField();
        spnNhoRang = new javax.swing.JSpinner();
        spnTramRang = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTieuDe.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbTieuDe.setForeground(new java.awt.Color(255, 51, 51));
        lbTieuDe.setText("DENTAL PAYMENT APPLICATION");

        lbTenKH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTenKH.setText("Tên khách hàng");

        txtTenKH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTenKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenKHActionPerformed(evt);
            }
        });

        chkCaoVoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chkCaoVoi.setSelected(true);
        chkCaoVoi.setText("Cạo Vôi");
        chkCaoVoi.setToolTipText("");
        chkCaoVoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCaoVoiActionPerformed(evt);
            }
        });

        chkTayTrang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chkTayTrang.setText("Tẩy trắng");

        lbGiaCaoVoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbGiaCaoVoi.setForeground(new java.awt.Color(51, 51, 255));
        lbGiaCaoVoi.setText("100000 Đ");

        lbGiaTayTrang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbGiaTayTrang.setForeground(new java.awt.Color(51, 51, 255));
        lbGiaTayTrang.setText("1500000 Đ");

        lbGiaNhoRang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbGiaNhoRang.setForeground(new java.awt.Color(0, 51, 255));
        lbGiaNhoRang.setText("150000 Đ");

        lbGiaTramRang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbGiaTramRang.setForeground(new java.awt.Color(0, 51, 255));
        lbGiaTramRang.setText("200000 Đ");

        lbTongCong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTongCong.setText("Tổng cộng");

        btnTinhTien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTinhTien.setForeground(new java.awt.Color(255, 51, 51));
        btnTinhTien.setText("Tính tiền");
        btnTinhTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTinhTienActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(255, 51, 51));
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnThoat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(255, 0, 51));
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        lbTramRang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTramRang.setText("Trám răng");

        lbNhoRang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbNhoRang.setText("Nhổ răng");

        txtTongCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTongCongActionPerformed(evt);
            }
        });

        spnNhoRang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        spnTramRang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(lbTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(txtTenKH))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbNhoRang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbTramRang, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(spnNhoRang, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spnTramRang, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbGiaCaoVoi)
                                    .addComponent(lbGiaTayTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbGiaNhoRang, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbGiaTramRang, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(83, 83, 83)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnTinhTien)
                                                .addGap(35, 35, 35)
                                                .addComponent(btnXoa)
                                                .addGap(44, 44, 44)
                                                .addComponent(btnThoat))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lbTongCong, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30)
                                                .addComponent(txtTongCong, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 55, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkTayTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkCaoVoi, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(95, 95, 95))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbTieuDe)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbTenKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkCaoVoi)
                    .addComponent(lbGiaCaoVoi))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkTayTrang)
                    .addComponent(lbGiaTayTrang))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNhoRang)
                    .addComponent(lbGiaNhoRang)
                    .addComponent(spnNhoRang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbGiaTramRang)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbTramRang)
                        .addComponent(spnTramRang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTongCong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTongCong))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnXoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTinhTien)
                        .addComponent(btnThoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkCaoVoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCaoVoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkCaoVoiActionPerformed

    private void txtTenKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenKHActionPerformed

    private void txtTongCongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTongCongActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtTongCongActionPerformed

    private void btnTinhTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTinhTienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTinhTienActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:dc
      
  
        System.exit(0);
    
    }//GEN-LAST:event_btnThoatActionPerformed
    
    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        txtTenKH.setText("");
        chkCaoVoi.setSelected(false);
        chkTayTrang.setSelected(false);
        spnNhoRang.setValue(0);
        spnTramRang.setValue(0);
        txtTongCong.setText("");
        
    }//GEN-LAST:event_btnXoaActionPerformed

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
            java.util.logging.Logger.getLogger(KhamRang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KhamRang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KhamRang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KhamRang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KhamRang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTinhTien;
    private javax.swing.JButton btnXoa;
    private javax.swing.JCheckBox chkCaoVoi;
    private javax.swing.JCheckBox chkTayTrang;
    private javax.swing.JLabel lbGiaCaoVoi;
    private javax.swing.JLabel lbGiaNhoRang;
    private javax.swing.JLabel lbGiaTayTrang;
    private javax.swing.JLabel lbGiaTramRang;
    private javax.swing.JLabel lbNhoRang;
    private javax.swing.JLabel lbTenKH;
    private javax.swing.JLabel lbTieuDe;
    private javax.swing.JLabel lbTongCong;
    private javax.swing.JLabel lbTramRang;
    private javax.swing.JSpinner spnNhoRang;
    private javax.swing.JSpinner spnTramRang;
    private javax.swing.JTextField txtTenKH;
    private javax.swing.JTextField txtTongCong;
    // End of variables declaration//GEN-END:variables
}
