/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.sql.*;
import javax.swing.JOptionPane;
import Koneksi.Koneksi;


/**
 *
 * @author ASUS
 */
public class Form_login extends javax.swing.JFrame {
    int xx, xy;
    private Connection conn = new Koneksi().connect();
    /**
     * Creates new form Form_login
     */
    public Form_login() {
        initComponents();
        Koneksi DB = new Koneksi();
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
        b_Login = new javax.swing.JButton();
        b_Cancel = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        t_Username = new javax.swing.JTextField();
        Luser = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Lpass = new javax.swing.JLabel();
        t_Passw = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1057, 617));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(26, 83, 25));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(79, 78, 134, 58);

        b_Login.setBackground(new java.awt.Color(255, 255, 255));
        b_Login.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        b_Login.setForeground(new java.awt.Color(26, 83, 25));
        b_Login.setText("LOGIN");
        b_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_LoginActionPerformed(evt);
            }
        });
        jPanel1.add(b_Login);
        b_Login.setBounds(84, 427, 97, 29);

        b_Cancel.setBackground(new java.awt.Color(255, 255, 255));
        b_Cancel.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        b_Cancel.setForeground(new java.awt.Color(204, 0, 0));
        b_Cancel.setText("CANCEL");
        b_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_CancelActionPerformed(evt);
            }
        });
        jPanel1.add(b_Cancel);
        b_Cancel.setBounds(215, 427, 105, 29);

        jPanel3.setBackground(new java.awt.Color(26, 83, 25));

        t_Username.setFont(new java.awt.Font("Lucida Fax", 0, 24)); // NOI18N
        t_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_UsernameActionPerformed(evt);
            }
        });

        Luser.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        Luser.setForeground(new java.awt.Color(255, 255, 255));
        Luser.setText("Username");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Luser)
                    .addComponent(t_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Luser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_Username, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(65, 170, 280, 114);

        jPanel4.setBackground(new java.awt.Color(26, 83, 25));

        Lpass.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        Lpass.setForeground(new java.awt.Color(255, 255, 255));
        Lpass.setText("Password");

        t_Passw.setFont(new java.awt.Font("Lucida Fax", 0, 24)); // NOI18N
        t_Passw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_PasswActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t_Passw, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lpass))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lpass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_Passw, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(65, 293, 280, 116);

        getContentPane().add(jPanel1, java.awt.BorderLayout.EAST);

        jPanel2.setBackground(new java.awt.Color(214, 239, 216));
        jPanel2.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/logo smk yappa.png"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(64, 33, 499, 407);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(26, 83, 25));
        jLabel5.setText("APLIKASI PENILAIAN KINERJA GURU TERBAIK");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(60, 450, 510, 29);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(26, 83, 25));
        jLabel6.setText("SMK YAPPA DEPOK");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(213, 494, 203, 29);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void t_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_UsernameActionPerformed

    private void t_PasswActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_PasswActionPerformed
        try {
        String sql = "SELECT * FROM tb_user WHERE username ='" + t_Username.getText() + "' AND password='" + t_Passw.getText() + "'";
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        java.sql.ResultSet rs = pst.executeQuery(sql);
        if (rs.next()) {
            if (t_Username.getText().equals(rs.getString("username")) && t_Passw.getText().equals(rs.getString("password"))) {
                String jabatan = rs.getString("jabatan"); // Mendapatkan jabatan pengguna dari hasil query
                JOptionPane.showMessageDialog(null, "Login Berhasil!");
                this.setVisible(false);
                new Dashbord(jabatan).setVisible(true); // Mengirim jabatan ke Form_MenuUtama
            }
        } else {
            JOptionPane.showMessageDialog(null, "Masukan Username dan Password yang Benar!");
            t_Username.requestFocus(true);
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_t_PasswActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x  = evt.getXOnScreen();
        int y  = evt.getYOnScreen();
        this.setLocation(x-xx, y-xy);
    }//GEN-LAST:event_formMouseDragged

    private void b_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_CancelActionPerformed
        dispose();
    }//GEN-LAST:event_b_CancelActionPerformed

    private void b_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_LoginActionPerformed
        try{
        String sql = "SELECT * FROM tb_user WHERE username ='" + t_Username.getText() + "' AND password='" + t_Passw.getText() + "'";
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        java.sql.ResultSet rs = pst.executeQuery(sql);
        if (rs.next()){
            if (t_Username.getText().equals(rs.getString("username")) && t_Passw.getText().equals(rs.getString("password"))) {
                String jabatan = rs.getString("jabatan"); // Mendapatkan jabatan pengguna dari hasil query
                JOptionPane.showMessageDialog(null, "Login Berhasil!");
                this.setVisible(false);
                new Dashbord(jabatan).setVisible(true); 
                //Dashbord ds = new Dashbord(jabatan);
                //ds.setVisible(true); // Mengirim jabatan ke Form_Dashbord
                //ds.revalidate();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Masukan Username dan Password yang Benar!");
            t_Username.requestFocus(true);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
    }//GEN-LAST:event_b_LoginActionPerformed

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
            java.util.logging.Logger.getLogger(Form_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lpass;
    private javax.swing.JLabel Luser;
    private javax.swing.JButton b_Cancel;
    private javax.swing.JButton b_Login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField t_Passw;
    private javax.swing.JTextField t_Username;
    // End of variables declaration//GEN-END:variables
}