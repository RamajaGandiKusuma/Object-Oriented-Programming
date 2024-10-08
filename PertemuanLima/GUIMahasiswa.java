/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PertemuanLima;

import java.sql.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.io.*;

public class GUIMahasiswa extends javax.swing.JFrame {
    Connection connect;
    String a, b, c, d;
    private final ArrayList<String[]> list = new ArrayList<>();
    private final String[] kolom = {"nim", "nama", "prodi", "fakultas"};

    String driver = "org.postgresql.Driver";
    String koneksi = "jdbc:postgresql://localhost:5432/Mahasiswa";
    String user = "postgres";
    String password = "muklishotin";
    

    /**
     * Creates new form GUIMahasiswa
     */
    public GUIMahasiswa() {
        initComponents();
        this.getAllData();
        this.refreshModel();

    }

    public final void getAllData() {
        try {
            list.clear();
            String sql = "SELECT * FROM mahasiswa";
            connect = DriverManager.getConnection(koneksi, user, password);
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.executeQuery();
            final ResultSet data = ps.getResultSet();
            while (data.next()) {
                final String[] row = new String[]{
                    data.getString("nim"),
                    data.getString("nama"),
                    data.getString("prodi"),
                    data.getString("fakultas")
                };

                list.add(row);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public final void refreshModel() {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(kolom);
        for (String[] data : list) {
            model.addRow(data);
        }
        tbcrud.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbcrud = new javax.swing.JTable();
        btninput = new java.awt.Button();
        btnupdate = new java.awt.Button();
        btndelete = new java.awt.Button();
        btnhapus = new java.awt.Button();
        tfnim = new javax.swing.JTextField();
        tfnama = new javax.swing.JTextField();
        tfprodi = new javax.swing.JTextField();
        tffakultas = new javax.swing.JTextField();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("PROGRAM STUDI");

        jLabel5.setText("FAKULTAS");

        jLabel6.setText("NAMA");

        jLabel7.setText("NIM");

        tbcrud.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbcrud.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NIM", "NAMA", "PROGRAM STUDI", "FAKULTAS"
            }
        ));
        tbcrud.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tbcrudAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tbcrud);

        btninput.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btninput.setLabel("INPUT");
        btninput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninputActionPerformed(evt);
            }
        });

        btnupdate.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnupdate.setLabel("UPDATE");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btndelete.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btndelete.setLabel("DELETE DATA");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnhapus.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnhapus.setLabel("HAPUS");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnupdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btndelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btninput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfnama)
                            .addComponent(tfnim)
                            .addComponent(tfprodi)
                            .addComponent(tffakultas, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfnim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfprodi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(tffakultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btninput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btninputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninputActionPerformed
        a = tfnim.getText();
        b = tfnama.getText();
        c = tfprodi.getText();
        d = tffakultas.getText();

        if (a.trim().isEmpty() || b.trim().isEmpty() || c.trim().isEmpty()||d.trim().isEmpty()) {
            JOptionPane.showMessageDialog(btninput, "TERDAPAT DATA YANG KOSONG");
        } else {
            try {
                String query = "insert into mahasiswa (nim,nama,prodi,fakultas) values (?,?,?,?)";
                PreparedStatement ps ;
                ps = connect.prepareStatement(query);
                ps.setString(1, a);
                ps.setString(2, b);
                ps.setString(3, c);
                ps.setString(4, d);
                ps.executeUpdate();
               
                this.getAllData();
                this.refreshModel();
                tfnim.setText("");
                tfnama.setText("");
                tfprodi.setText("");
                tffakultas.setText("");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(btninput, "INPUT DATA GAGAL");
            }
        }

    }//GEN-LAST:event_btninputActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        a = tfnim.getText();

        if (a.trim().isEmpty()) {
            JOptionPane.showMessageDialog(btndelete, "TERDAPAT DATA YANG KOSONG");
        } else {
            try {
                String query = String.format("delete from mahasiswa where nim = '%s'", a);
                Statement s = connect.createStatement();
                s.executeUpdate(query);
                JOptionPane.showMessageDialog(this, "Data Telah Terhapus");
                this.getAllData();
                this.refreshModel();
                
                tfnim.setText("");
                tfnama.setText("");
                tfprodi.setText("");
                tffakultas.setText("");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(btndelete, "INPUT DATA GAGAL");
            }
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        try {
            tfnim.setText("");
            tfnama.setText("");
            tfprodi.setText("");
            tffakultas.setText("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        a = tfnama.getText();
        b = tfnim.getText();
        c = tfprodi.getText();
        d = tffakultas.getText();

        if (a.trim().isEmpty() || b.trim().isEmpty() || c.trim().isEmpty()||d.trim().isEmpty()) {
            JOptionPane.showMessageDialog(btnupdate, "TERDAPAT FIELD YANG KOSONG");
        }else{
            try {
                String sql = "update mahasiswa set nama =?,  prodi = ?,fakultas = ? where nim = ?";
                PreparedStatement ps = connect.prepareStatement(sql);
                ps.setString(1, a);
                ps.setString(2, c);
                ps.setString(3, d);
                ps.setString(4, b);
                int baris = ps.executeUpdate();
                if (baris > 0) {
                    this.getAllData();
                    this.refreshModel();
                }

                tfnim.setText("");
                tfnama.setText("");
                tfprodi.setText("");
                tffakultas.setText("");

            } catch (Exception e) {
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void tbcrudAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tbcrudAncestorAdded

    }//GEN-LAST:event_tbcrudAncestorAdded

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
            java.util.logging.Logger.getLogger(GUIMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIMahasiswa().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btndelete;
    private java.awt.Button btnhapus;
    private java.awt.Button btninput;
    private java.awt.Button btnupdate;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbcrud;
    private javax.swing.JTextField tffakultas;
    private javax.swing.JTextField tfnama;
    private javax.swing.JTextField tfnim;
    private javax.swing.JTextField tfprodi;
    // End of variables declaration//GEN-END:variables
}
