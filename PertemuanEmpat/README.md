# **CRUD OPERATION (Create, Read, Update, Delete)**
## Pada folder ini menerapkan operasi CRUD sederhana dengan menggunakan IDE Netbeans dan database PostgreSQL.
  Study case yang digunakan adalah mengelolah data mahasiswa disuatu perguruan tinggi. Didalamya hanya terdapat satu entitas yaitu mahasiswa, karena pada tugas ini lebih berfokus untuk membuat source code CRUD yang baik.

## A. DATABASE
   Didalam Database Postgresql hanya terdapat satu entitas yaitu mahasiswa.
   ```sql
   CREATE TABLE mahasiswa(
	nim CHAR(11) PRIMARY KEY NOT NULL,
	nama VARCHAR(50) NOT NULL,
	prodi VARCHAR(50) NOT NULL,
	fakultas VARCHAR(50) NOT NULL
);
```
   
   Didalam entitas mahasiswa memiliki beberapa atribut yaitu nim yang menjadi **PRIMARY KEY** dari entitas mahasiswa, kemudian terdapat atribut nama, prodi dan fakultas.

## B. PROGRAM
   Didalam program sendiri terdapat 6 class yang saling berhirarki.

   ## 1. Koneksi Class
   Pada Class ini berisi source code untuk menghubungkan antara database dengan netbeans. Untuk menghubungkanya sendiri harus mengimport class connection dari JDBC. Tidak hanya itu, didalam Koneksi Class juga terdapat method logger yang didapat dari "import java.util.logging.*". Class ini nantinya akan menjadi superclass dari Class lainya yang akan extends ke Class ini.
   ```java
   import java.sql.*;
import java.util.logging.*;

public class Koneksi {
   String url = "jdbc:postgresql://localhost:5432/Mahasiswa";
   String user = "postgres";
   String password = "muklishotin";
   Connection connection;
   
   public Koneksi(){
       try{
           connection = DriverManager.getConnection(url, user, password);
           Class.forName("org.postgresql.Driver");
       }catch(Exception e){
           Logger.getLogger(Mahasiswa.class.getName()).log(Level.SEVERE, null, e);
           e.printStackTrace();
       } 
   }
}
```

   Terdapat beberapa atribut dalam Koneksi Class yaitu url, user dan password. ketiga atribut ini yang nantinya akan dimasukan dalam method connection.

   ## 2. InputData Class
   Pada Class ini berisi source code untuk menginput data dalam entitas mahasiswa atau menerapkan operasi _Create_. Didalam InputData Class ini juga mingimport class sql dari JDBC untuk menggunakan method PreparedStatement.
   ```java
   import java.sql.*;

public class InputData extends Koneksi { 
    public void Input (String nim, String nama, String prodi, String fakultas){
        try{
        String sql = "INSERT INTO mahasiswa (nim, nama, prodi, fakultas) VALUES (?, ?, ?, ?)";
        PreparedStatement input = connection.prepareStatement(sql); 
        
        input.setString(1, nim);
        input.setString(2, nama);
        input.setString(3, prodi);
        input.setString(4, fakultas);
        
        int jalankan = input.executeUpdate();
        System.out.println("Input Berhasil.\n");
    }catch(Exception e){
            e.printStackTrace();
            System.out.println("Input Gagal");
    }
 } 
}
  ```


   Didalam InputData memiliki method input yang memuat parameter nim, nama, prodi dan fakultas bertipe data String. Parameter tersebut akan menjadi perwakilan Field yang ada didalam entitas mahasiswa. Query untuk menginput data di database diwakilkan menggunakan variabel sql yang bertipe data String. Terdapat variabel jalankan bertipe data int untuk menjalankan query yang diwakilkan oleh variabel sql.

   ## 3. Read Class
   Pada Class ini berisi source code untuk menampilkan data - data yang telah di input atau menerapkan operasi _Read_. Didalam InputData Class ini juga mingimport class sql dari JDBC untuk menggunakan method createStatement.
   ```java
   import java.sql.*;

public class Read extends Koneksi {
    public void tampilkan(){
        try{
           String sql = "SELECT * FROM mahasiswa";
           Statement tampil = connection.createStatement();
           ResultSet jalankan = tampil.executeQuery(sql);
           
           while(jalankan.next()){
               System.out.println("NIM : "+jalankan.getObject(1));
               System.out.println("NAMA : "+jalankan.getObject(2));
               System.out.println("FAKULTAS : "+jalankan.getObject(4));
               System.out.println("PROGRAM STUDI : "+jalankan.getObject(3)+"\n");
           }
           
            System.out.println("Data Sukses Ditampilkan");
        }catch(Exception e){
            System.out.println("Data Tidak Dapat Ditampilkan");
        }
    }
 }
 ```
  

