/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UASPBO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author RAMAJA
 */
public class ManageMahasiswa extends javax.swing.JFrame {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("OOPStudyPU");
    EntityManager em = emf.createEntityManager();

    public ManageMahasiswa() {
        initComponents();
        getAllData();
    }

    public void getAllData() {

        Query q = em.createNamedQuery("Mahasiswa.findAll");
        List<Mahasiswa> hasil = q.getResultList();

        DefaultTableModel tb = new DefaultTableModel(new String[]{"NIM", "NAMA", "ALAMAT", "ASAL SMA", "NAMA ORTU"}, 0);
        for (Mahasiswa data : hasil) {
            Object[] baris = new Object[5];
            baris[0] = data.getNim();
            baris[1] = data.getNama();
            baris[2] = data.getAlamat();
            baris[3] = data.getAsalsma();
            baris[4] = data.getNamaorangtua();
            tb.addRow(baris);
        }
        tbmhs.setModel(tb);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfnim = new javax.swing.JTextField();
        tfnama = new javax.swing.JTextField();
        tfalamat = new javax.swing.JTextField();
        tfasalsma = new javax.swing.JTextField();
        tfnamaorangtua = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btninput = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnbersih = new javax.swing.JButton();
        btncetak = new javax.swing.JButton();
        btnupload = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbmhs = new javax.swing.JTable();
        btnlogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NIM");

        jLabel2.setText("NAMA");

        jLabel3.setText("ALAMAT");

        jLabel4.setText("ASAL SMA");

        jLabel5.setText("NAMA ORANG TUA");

        btninput.setText("INPUT");
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

        btnhapus.setText("DELETE");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        btnbersih.setText("BERSIH");
        btnbersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbersihActionPerformed(evt);
            }
        });

        btncetak.setText("CETAK");
        btncetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncetakActionPerformed(evt);
            }
        });

        btnupload.setText("UPLOAD");
        btnupload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuploadActionPerformed(evt);
            }
        });

        tbmhs.setModel(new javax.swing.table.DefaultTableModel(
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
        tbmhs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbmhsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbmhs);

        btnlogout.setText("LOGOUT");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfnamaorangtua, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfasalsma, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfalamat, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfnama, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfnim, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btninput, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnbersih, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(42, 42, 42))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btncetak, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnupload, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(42, 42, 42))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfnim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btninput))
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnupdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfalamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfasalsma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbersih))
                .addGap(13, 13, 13)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfnamaorangtua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncetak))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnupload)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnlogout)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnuploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuploadActionPerformed
       
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        int returnValue = jfc.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File filePilihan = jfc.getSelectedFile();
            System.out.println("yang dipilih : " + filePilihan.getAbsolutePath());
            
            try {
                BufferedReader br = new BufferedReader(new FileReader(filePilihan));
                String baris ;
                String pemisah = ";";
                
                while ((baris = br.readLine()) != null) {
                    String[] Mhs = baris.split(pemisah);
                    String nim = Mhs[0];
                    String nama = Mhs[1];
                    String alamat = Mhs[2];
                    String asalsma = Mhs[3];
                    String namaortu = Mhs[4];
                   
                    if (!nim.isEmpty() && !nama.isEmpty() && !alamat.isEmpty() && !asalsma.isEmpty() && !namaortu.isEmpty()) {
                        em.getTransaction().begin();
                        Mahasiswa mhs = new Mahasiswa();
                        mhs.setNim(nim);
                        mhs.setNama(nama);
                        mhs.setAlamat(alamat);
                        mhs.setAsalsma(asalsma);
                        mhs.setNamaorangtua(namaortu);
                        em.persist(mhs);
                        em.getTransaction().commit();

                    } else {
                        JOptionPane.showMessageDialog(null, "TERDAPAT DATA YANG KOSONG");
                    }
                }
                this.getAllData();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_btnuploadActionPerformed

    private void btninputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninputActionPerformed
        String a = tfnim.getText();
        String b = tfnama.getText().toUpperCase();
        String c = tfalamat.getText();
        String d = tfasalsma.getText();
        String e = tfnamaorangtua.getText().toUpperCase();

        if (a.trim().isEmpty() || b.trim().isEmpty() || c.trim().isEmpty() || d.trim().isEmpty() || e.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "TERDAPAT DATA YANG KOSONG");
        } else {
            em.getTransaction().begin();
            Mahasiswa mhs = new Mahasiswa();
            mhs.setNim(a);
            mhs.setNama(b);
            mhs.setAlamat(c);
            mhs.setAsalsma(d);
            mhs.setNamaorangtua(e);
            em.persist(mhs);

            em.getTransaction().commit();
            this.getAllData();
            tfnim.setText("");
            tfnama.setText("");
            tfalamat.setText("");
            tfasalsma.setText("");
        }
    }//GEN-LAST:event_btninputActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        String a = tfnim.getText();
        String b = tfnama.getText().toUpperCase();
        String c = tfalamat.getText();
        String d = tfasalsma.getText();
        String e = tfnamaorangtua.getText().toUpperCase();

        if (a.trim().isEmpty() || b.trim().isEmpty() || c.trim().isEmpty() || d.trim().isEmpty() || e.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "TERDAPAT DATA YANG KOSONG");
        } else {
            em.getTransaction().begin();
            Mahasiswa mhs = em.find(Mahasiswa.class, a);
            mhs.setNama(b);
            mhs.setAlamat(c);
            mhs.setAsalsma(d);
            mhs.setNamaorangtua(e);
            em.persist(mhs);

            em.getTransaction().commit();
            this.getAllData();
            tfnim.setText("");
            tfnama.setText("");
            tfalamat.setText("");
            tfasalsma.setText("");
            tfnamaorangtua.setText("");
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void tbmhsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbmhsMouseClicked
        int selectedRow = tbmhs.getSelectedRow();
        if (selectedRow != -1) {
            String a = tbmhs.getValueAt(selectedRow, 0).toString();
            String b = tbmhs.getValueAt(selectedRow, 1).toString();
            String c = tbmhs.getValueAt(selectedRow, 2).toString();
            String d = tbmhs.getValueAt(selectedRow, 3).toString();
            String e = tbmhs.getValueAt(selectedRow, 4).toString();

            tfnim.setText(a);
            tfnama.setText(b);
            tfalamat.setText(c);
            tfasalsma.setText(d);
            tfnamaorangtua.setText(e);
        }
    }//GEN-LAST:event_tbmhsMouseClicked

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        String a = tfnim.getText();

        if (a.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "TERDAPAT DATA YANG KOSONG");
        } else {
            em.getTransaction().begin();
            Mahasiswa mhs = em.find(Mahasiswa.class, a);
            em.remove(mhs);
            this.getAllData();

            em.getTransaction().commit();
            tfnim.setText("");
            tfnama.setText("");
            tfalamat.setText("");
            tfasalsma.setText("");
            tfnamaorangtua.setText("");
        }

    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnbersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbersihActionPerformed
        tfnim.setText("");
        tfnama.setText("");
        tfalamat.setText("");
        tfasalsma.setText("");
        tfnamaorangtua.setText("");
    }//GEN-LAST:event_btnbersihActionPerformed

    private void btncetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncetakActionPerformed
        try {
            JasperReport reports;
            String path = "src\\UASPBO\\DataMahasiswa.jasper";
            List<Mahasiswa> daftarMahasiswa = em.createQuery("SELECT m FROM Mahasiswa m", Mahasiswa.class).getResultList();
            JRBeanCollectionDataSource ds = new JRBeanCollectionDataSource(daftarMahasiswa);
            JasperPrint print = JasperFillManager.fillReport(path, null, ds);
            JasperViewer view = new JasperViewer(print, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
        } catch (JRException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btncetakActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
       Login lg = new Login();
       lg.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnlogoutActionPerformed

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
            java.util.logging.Logger.getLogger(ManageMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbersih;
    private javax.swing.JButton btncetak;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btninput;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton btnupload;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbmhs;
    private javax.swing.JTextField tfalamat;
    private javax.swing.JTextField tfasalsma;
    private javax.swing.JTextField tfnama;
    private javax.swing.JTextField tfnamaorangtua;
    private javax.swing.JTextField tfnim;
    // End of variables declaration//GEN-END:variables
}