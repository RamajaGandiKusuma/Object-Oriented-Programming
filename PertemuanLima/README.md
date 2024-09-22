#**OPERASI CRUD DENGAN GUI**
## Pada materi ini mengimplementasikan operasi CRUD menggunakan java.swing dan database postgresql
Study case yang digunakan adalah mengelolah data mahasiswa disuatu perguruan tinggi. Didalamya hanya terdapat satu entitas yaitu mahasiswa, karena pada tugas ini lebih berfokus untuk membuat source code CRUD yang baik.

## A. Database
Didalam Database Postgresql hanya terdapat satu entitas yaitu mahasiswa.
```sql
CREATE TABLE mahasiswa(
 nim CHAR(11) PRIMARY KEY NOT NULL,
 nama VARCHAR(50) NOT NULL,
 prodi VARCHAR(50) NOT NULL,
 fakultas VARCHAR(50) NOT NULL
);
```
Didalam entitas mahasiswa memiliki beberapa atribut yaitu nim yang menjadi PRIMARY KEY dari entitas mahasiswa, kemudian terdapat atribut nama, prodi dan fakultas

## B. Source Code
  Pada desain GUI ini memiliki 4 field yang bernama tfnim, tfnama, tfprodi dan tffakultas. Selain itu, juga terdapat 4 button yaitu btninput, btndelete, btnupdate dan btnhapus. Serta terdapat 1 tabel untuk menampilkan data - data yang ada didalam database.

## 1. Membuat Class JFrame Form
```java
import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
public class GUIMahasiswa extends javax.swing.JFrame {}
```
Jika menggunakan GUI atau Class JFrame Form pasti menggunakan package swing.

## 2. Connecting to Database
  ```java
    Connection connect;
    String driver = "org.postgresql.Driver";
    String koneksi = "jdbc:postgresql://localhost:5432/Mahasiswa";
    String user = "postgres";
    String password = "muklishotin";
```

## 3. Membuat Method getAllData & refreshModel
```java
 public final void getAllData() { // Untuk menampilkan data pada tabel
        try {
            list.clear();
            String sql = "SELECT * FROM mahasiswa";
            connect = DriverManager.getConnection(koneksi, user, password); // Memanggil database yang dimaksud
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
```
  Method getAllData digunakan untuk memanggil data yang ada pada database dan method refreshModel digunakan untuk memasukan data - data pada database kedalam tabel.

## 4. Source Code Pada btninput
```java
private void btninputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninputActionPerformed
        a = tfnim.getText();
        b = tfnama.getText();
        c = tfprodi.getText();
        d = tffakultas.getText();

        if (a.trim().isEmpty() || b.trim().isEmpty() || c.trim().isEmpty()||d.trim().isEmpty()) { //Setiap text fields tidak boleh ada yang kosong ketika proses input
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
```
Variabel String a, b, c, d digunakan untuk menampung seluruh text atau data yang dimasukan melalui textField. Setelah itu menggunakan penyeleksian jika setiap textField tidak boleh ada yang kosong ketika melakukan operasi input.

## 5. Source Code btnupdate
```java
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
                int baris = ps.executeUpdate(); //Untuk menampung data yang teraupdate
                if (baris > 0) {   // Jika terdapat data yang terganti maka tampilkan kedalam tabel
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
```
   Variabel String a, b, c, d digunakan untuk menampung seluruh text atau data yang dimasukan melalui textField. Setelah itu menggunakan penyeleksian jika setiap textField tidak boleh ada yang kosong ketika melakukan operasi update.

## 6. Source Code btndelete
```java
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
    }
```
Pada operasi delete, textfields nim tidak boleh kosong karena nim akan menjadi kondisi pada sql. Maka dari itu, terdapat penyeleksiaan jika tfnim tidak ada maka akan memulculkan "TERDAPAT DATA YANG KOSONG".

## 7. Source Code btnhapus
```java
 private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        try {
            tfnim.setText("");
            tfnama.setText("");
            tfprodi.setText("");
            tffakultas.setText("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
```
Pada btnhapus hanya untuk menghapus text yang ada didalam textfields jika masih ada didalamnya.
