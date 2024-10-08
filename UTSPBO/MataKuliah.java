/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UTSPBO;


import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class MataKuliah extends javax.swing.JFrame {
    
    Connection conn;
    ArrayList<String[]> list = new ArrayList<>();
    String kolom[]={"KODE MATAKULIAH","NAMA MATAKULIAH","SKS","SEMESTER"};
 
    public final void Connect(){
        try{
        String url = "org.postgresql.Driver";
        String koneksi = "jdbc:postgresql://localhost:5432/KRS";
        String user = "postgres";
        String password = "muklishotin";
        this.conn=DriverManager.getConnection(koneksi, user, password);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }
    public MataKuliah() {
        initComponents();
        this.Connect();
        this.getAllData();
        this.refreshModel();
    }
    
    
   
    
    public void getAllData() {
        try {
            list.clear();
            String sql = "SELECT * FROM MataKuliah";
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btninput = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnbersihkan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbkrs = new javax.swing.JTable();
        tfkodemk = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfnamamk = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfsks = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfsemester = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jLabel3.setText("SKS");

        jLabel4.setText("SEMESTER");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfnamamk, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfkodemk, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btninput, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfsemester, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnbersihkan, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfsks, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btninput)
                    .addComponent(tfkodemk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel2)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnupdate)
                    .addComponent(tfnamamk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndelete)
                    .addComponent(tfsks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbersihkan)
                    .addComponent(tfsemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btninputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninputActionPerformed
       String a = tfkodemk.getText();
       String b = tfnamamk.getText();
       String c = tfsks.getText();
       String d = tfsemester.getText();
       
       if(a.trim().isEmpty() || b.trim().isEmpty() || c.trim().isEmpty() || d.trim().isEmpty()){
           JOptionPane.showMessageDialog(null, "TERDAPAT DATA YANG KOSONG");
       }else{
           try{
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
           }catch(Exception e){
               JOptionPane.showMessageDialog(null, e.getMessage());
           }
       }
       
    }//GEN-LAST:event_btninputActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        String a = tfkodemk.getText();
       String b = tfnamamk.getText();
       String c = tfsks.getText();
       String d = tfsemester.getText();
       
       if(a.trim().isEmpty() || b.trim().isEmpty() || c.trim().isEmpty() || d.trim().isEmpty()){
           JOptionPane.showMessageDialog(null, "TERDAPAT DATA YANG KOSONG");
       }else{
           try{
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
           }catch(Exception e){
               JOptionPane.showMessageDialog(null, e.getMessage());
           }
       }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
         String a = tfkodemk.getText();
       
       if(a.trim().isEmpty()){
           JOptionPane.showMessageDialog(null, "TERDAPAT DATA YANG KOSONG");
       }else{
           try{
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
           }catch(Exception e){
               JOptionPane.showMessageDialog(null, e.getMessage());
           }
       }
    }//GEN-LAST:event_btndeleteActionPerformed
        
    private void btnbersihkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbersihkanActionPerformed
            tfkodemk.setText("");
            tfnamamk.setText("");
            tfsks.setText("");
            tfsemester.setText("");
    }//GEN-LAST:event_btnbersihkanActionPerformed

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
            java.util.logging.Logger.getLogger(MataKuliah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MataKuliah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MataKuliah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MataKuliah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MataKuliah().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbersihkan;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btninput;
    private javax.swing.JButton btnupdate;
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
