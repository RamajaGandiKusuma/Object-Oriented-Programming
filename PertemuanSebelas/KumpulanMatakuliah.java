/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PertemuanSebelas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class KumpulanMatakuliah extends javax.swing.JFrame {

    Connection conn;
    private final ArrayList<String[]> list = new ArrayList<>();
    private final String kolom[] = {"KODE MATAKULIAH", "NAMA MATAKULIAH", "SKS", "SEMESTER"};

    public final void Connect() {
        try {
            String url = "org.postgresql.Driver";
            String koneksi = "jdbc:postgresql://localhost:5432/KRS";
            String user = "postgres";
            String password = "muklishotin";
            this.conn = DriverManager.getConnection(koneksi, user, password);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    public void getAllData() {
        try {
            list.clear();
            String sql = "SELECT * FROM MataKuliah ORDER BY kodeMK";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeQuery();
            final ResultSet data = ps.getResultSet();
            while (data.next()) {
                final String[] row = new String[]{
                    data.getString("kodeMK"),
                    data.getString("namaMK"),
                    data.getString("SKS"),
                    data.getString("SemesterAjar")
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
        tbkrs.setModel(model);
    }

    public KumpulanMatakuliah() {
        initComponents();
        this.Connect();
        this.getAllData();
        this.refreshModel();
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
        jLabel4 = new javax.swing.JLabel();
        btninput = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnbersihkan = new javax.swing.JButton();
        btncetak = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbkrs = new javax.swing.JTable();
        tfkodemk = new javax.swing.JTextField();
        tfnamamk = new javax.swing.JTextField();
        tfsks = new javax.swing.JTextField();
        tfsemester = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnuploadfile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("SKS");

        jLabel4.setText("SEMESTER");

        btninput.setText("INPUT DATA");
        btninput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninputActionPerformed(evt);
            }
        });

        btnupdate.setText("UPDATE");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btndelete.setText("DELETE");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnbersihkan.setText("BERSIHKAN");
        btnbersihkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbersihkanActionPerformed(evt);
            }
        });

        btncetak.setText("CETAK");
        btncetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncetakActionPerformed(evt);
            }
        });

        tbkrs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbkrs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbkrsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbkrs);

        jLabel1.setText("KODE MATA KULIAH");

        jLabel2.setText("NAMA MATA KULIAH");

        btnuploadfile.setText("UPLOAD FILE");
        btnuploadfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuploadfileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(tfnamamk, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfsemester, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfkodemk, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(88, 88, 88)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btncetak, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btninput, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnuploadfile, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(173, 173, 173)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfsks, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(258, 258, 258)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnbersihkan, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfkodemk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btninput)
                    .addComponent(btnuploadfile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfnamamk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnupdate))
                .addGap(2, 2, 2)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfsks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfsemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbersihkan)
                    .addComponent(btncetak))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btninputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninputActionPerformed
        String a = tfkodemk.getText();
        String b = tfnamamk.getText();
        String c = tfsks.getText();
        String d = tfsemester.getText();

        if (a.trim().isEmpty() || b.trim().isEmpty() || c.trim().isEmpty() || d.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "TERDAPAT DATA YANG KOSONG");
        } else {
            try {
                int f = Integer.parseInt(c);
                int g = Integer.parseInt(d);
                String sql = "INSERT INTO matakuliah (KODEMK, NAMAMK, SKS, SEMESTERAJAR) VALUES (?,?,?,?)";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, a);
                ps.setString(2, b);
                ps.setInt(3, f);
                ps.setInt(4, g);
                ps.executeUpdate();

                this.getAllData();
                this.refreshModel();
                tfkodemk.setText("");
                tfnamamk.setText("");
                tfsks.setText("");
                tfsemester.setText("");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_btninputActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        String a = tfkodemk.getText();
        String b = tfnamamk.getText();
        String c = tfsks.getText();
        String d = tfsemester.getText();

        if (a.trim().isEmpty() || b.trim().isEmpty() || c.trim().isEmpty() || d.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "TERDAPAT DATA YANG KOSONG");
        } else {
            try {
                int f = Integer.parseInt(c);
                int g = Integer.parseInt(d);
                String sql = "UPDATE matakuliah SET namamk = ?, sks = ?, semesterajar = ? WHERE kodemk = ?";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, b);
                ps.setInt(2, f);
                ps.setInt(3, g);
                ps.setString(4, a);
                ps.executeUpdate();
                this.getAllData();
                this.refreshModel();
                tfkodemk.setText("");
                tfnamamk.setText("");
                tfsks.setText("");
                tfsemester.setText("");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        String a = tfkodemk.getText();

        if (a.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "TERDAPAT DATA YANG KOSONG");
        } else {
            try {
                String sql = "DELETE FROM MATAKULIAH WHERE KODEMK = ?";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, a);
                ps.executeUpdate();
                this.getAllData();
                this.refreshModel();
                tfkodemk.setText("");
                tfnamamk.setText("");
                tfsks.setText("");
                tfsemester.setText("");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnbersihkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbersihkanActionPerformed
        tfkodemk.setText("");
        tfnamamk.setText("");
        tfsks.setText("");
        tfsemester.setText("");
        this.refreshModel();
    }//GEN-LAST:event_btnbersihkanActionPerformed

    private void btncetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncetakActionPerformed
        try {
            JasperReport reports;
            String path = "src\\UTSPBO\\DaftarMahasiswa.jasper";
            reports = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint print = JasperFillManager.fillReport(path, null, conn);
            JasperViewer view = new JasperViewer(print, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);

        } catch (JRException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btncetakActionPerformed

    private void tbkrsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbkrsMouseClicked
        int selectedRow = tbkrs.getSelectedRow();
        if (selectedRow != -1) {
            String a = tbkrs.getValueAt(selectedRow, 0).toString();
            String b = tbkrs.getValueAt(selectedRow, 1).toString();
            String c = tbkrs.getValueAt(selectedRow, 2).toString();
            String e = tbkrs.getValueAt(selectedRow, 3).toString();

            tfkodemk.setText(a);
            tfnamamk.setText(b);
            tfsks.setText(c);
            tfsemester.setText(e);
        }
    }//GEN-LAST:event_tbkrsMouseClicked

    private void btnuploadfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuploadfileActionPerformed

        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        int returnValue = jfc.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File filePilihan = jfc.getSelectedFile();
            System.out.println("yang dipilih : " + filePilihan.getAbsolutePath());
            try {
                BufferedReader br = new BufferedReader(new FileReader(filePilihan));
                String baris = new String("");
                String pemisah = ";";
                while ((baris = br.readLine()) != null) 
                {
                    String[] dataMhs = baris.split(pemisah); 
                    String kodeMK = dataMhs[0]; 
                    String namaMK = dataMhs[1];
                    int sks = Integer.parseInt(dataMhs[2]); 
                    int semesterAjar = Integer.parseInt(dataMhs[3]); 
                    if (!kodeMK.isEmpty() && !namaMK.isEmpty() && sks > 0 && semesterAjar>0) {
                        String sql = "INSERT INTO matakuliah (KODEMK, NAMAMK, SKS, SEMESTERAJAR) VALUES (?,?,?,?)";
                        try (PreparedStatement ps = conn.prepareStatement(sql)) {
                            ps.setString(1, kodeMK);
                            ps.setString(2, namaMK);
                            ps.setInt(3, sks);
                            ps.setInt(4, semesterAjar);
                            ps.executeUpdate();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "TERDAPAT DATA YANG KOSONG");
                    }
                }
                this.getAllData();
                this.refreshModel();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_btnuploadfileActionPerformed

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
            java.util.logging.Logger.getLogger(KumpulanMatakuliah.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KumpulanMatakuliah.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KumpulanMatakuliah.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KumpulanMatakuliah.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KumpulanMatakuliah().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbersihkan;
    private javax.swing.JButton btncetak;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btninput;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton btnuploadfile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbkrs;
    private javax.swing.JTextField tfkodemk;
    private javax.swing.JTextField tfnamamk;
    private javax.swing.JTextField tfsemester;
    private javax.swing.JTextField tfsks;
    // End of variables declaration//GEN-END:variables
}
