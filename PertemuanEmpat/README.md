# **CRUD OPERATION (Create, Read, Update, Delete)**
## Pada materi ini menerapkan operasi CRUD sederhana dengan menggunakan IDE Netbeans dan database PostgreSQL.
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
   Pada Class ini berisi source code untuk menginput data dalam entitas mahasiswa atau menerapkan operasi _Create_. Didalam InputData Class ini juga mingimport class sql dari JDBC untuk menggunakan method PreparedStatement. Agar Class InputData dapat terhubung dengan database mahasiswa, Class InputData disambungkan atau extends dengan Class Koneksi.
   ```java
   import java.sql.*;

public class InputData extends Koneksi { 
    public void Input (String nim, String nama, String prodi, String fakultas){
        try{
        String sql = "INSERT INTO mahasiswa (nim, nama, prodi, fakultas) VALUES (?, ?, ?, ?)";   // Tanda tanya (?) merupakan Parameter Place Holder
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
   Pada Class ini berisi source code untuk menampilkan data - data yang telah di input atau menerapkan operasi _Read_. Didalam InputData Class ini juga mingimport class sql dari JDBC untuk menggunakan method createStatement. Agar Class Read dapat terhubung dengan database mahasiswa, Class Read disambungkan atau extends dengan Class Koneksi.
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
   Untuk menampilkan semua data yang ada dalam database dapat menggunakan perulangan, dimana variabel jalankan yang memuat perintah executeQuery. Agar method getObject dapat menampilkan semua data yang ada dalam database mahasiswa.
   
## 4. UpdateData Class
   Pada Class ini berisi source code untuk mengubah data - data yang ada dalam entitas mahasiswa atau menerapkan operasi _Update_. Didalam UpdateData Class juga mingimport class sql dari JDBC untuk menggunakan method PreparedStatement. Agar Class UpdateData dapat terhubung dengan database mahasiswa, Class UpdateData terhubung atau extends dengan Class Koneksi.
   ```java
import java.sql.*;
public class UpdateData extends Koneksi{
    
        public void updateNIM(String namaBaru, String nim){  // Method untuk Update nim suatu record
        try{
            String sql = "UPDATE mahasiswa SET nim=? WHERE nim =? ";		// Tanda tanya (?) merupakan Parameter Place Holder
            PreparedStatement tampil = connection.prepareStatement(sql);
            
            tampil.setString(1, namaBaru);
            tampil.setString(2, nim);
            
            int jalankan = tampil.executeUpdate();
            System.out.println("Pembaruan Data Telah Berhasil");
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Pembaruan Data Gagal");
        }
        
    }
    
    public void updateNama(String namaBaru, String nim){   // Method untuk Update nama suatu record
        try{
            String sql = "UPDATE mahasiswa SET nama=? WHERE nim =? ";		// Tanda tanya (?) merupakan Parameter Place Holder
            PreparedStatement tampil = connection.prepareStatement(sql);
            
            tampil.setString(1, namaBaru);
            tampil.setString(2, nim);
            
            int jalankan = tampil.executeUpdate();
            System.out.println("Pembaruan Data Telah Berhasil");
        }catch(SQLException ex){
            ex.printStackTrace();
            System.out.println("Pembaruan Data Gagal");
        }
        
    }
    
       public void updateFakultas(String fakultasBaru, String nim){    // Method untuk Update fakultas suatu record
        try{
            String sql = "UPDATE mahasiswa SET fakultas=? WHERE nim =? ";	// Tanda tanya (?) merupakan Parameter Place Holder
            PreparedStatement tampil = connection.prepareStatement(sql);
            
            tampil.setString(1, fakultasBaru);
            tampil.setString(2, nim);
            
            int jalankan = tampil.executeUpdate();
            System.out.println("Pembaruan Data Telah Berhasil");
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Pembaruan Data Gagal");
        }
        
    }
    
    public void updateProdi(String prodiBaru, String nim){          // Method untuk Update prodi suatu record
        try{
            String sql = "UPDATE mahasiswa SET prodi=? WHERE nim =? ";  // Tanda tanya (?) merupakan Parameter Place Holder
            PreparedStatement tampil = connection.prepareStatement(sql);
            
            tampil.setString(1, prodiBaru);
            tampil.setString(2, nim);
            
            int jalankan = tampil.executeUpdate();
            System.out.println("Pembaruan Data Telah Berhasil");
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Pembaruan Data Gagal");
        }
        
    }
    
}
```
Semua method yang dimiliki Class UpdateData menggunakan parameter placeholder agar dapat dimasukan dalam method setString yang dimiliki oleh PreparedStatement.

## 5. HapusData Class
   Pada Class ini berisi source code untuk menghapus semua data yang ada dalam entitas mahasiswa atau menerapkan operasi _Delete_. Didalam HapusData Class juga mingimport class sql dari JDBC untuk menggunakan method PreparedStatement. Agar Class UpdateData dapat terhubung dengan database mahasiswa, Class UpdateData terhubung atau extends dengan Class Koneksi.
   ```java
import java.sql.*;

public class HapusData extends Koneksi {
    
    public HapusData(){
         try{
        String sql = "DELETE FROM mahasiswa";
        PreparedStatement hapus = connection.prepareStatement(sql);
        int jalankan = hapus.executeUpdate();
            System.out.println("Data Berhasil Dihapus.\n");
        }catch(Exception e){
             System.out.println("Data Gagal Dihapus");
        }
    }
}
```
   Pada Class HapusData, source code untuk menghapus semua data diterapkan dalam konstruktor.

## 6. Mahasiswa Class
   Pada Class ini berisi source code untuk menerapkan semua method - method yang ada dalam 5 Class tersebut. Class Mahasiswa ini bisa disebut juga sebagai main class. Agar Class UpdateData dapat terhubung dengan database mahasiswa, Class UpdateData terhubung atau extends dengan Class Koneksi.
   ```java
import java.util.Scanner;

/**
 *
 * @author RAMAJA
 */
public class Mahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        InputData masukan = new InputData();
        Read tampil = new Read();
        UpdateData ubah = new UpdateData();
        String a,b,c,d;
        
        System.out.println("Pilih Operasi: \n1. Menginput Data \n2. Menampilkan Data\n3. Hapus Data\n4. Mengubah Data Yang Telah Ada");
        System.out.println("Pilihan Anda: ");
        int e = input.nextInt();
            if(e==1){  // Jika memilih 1 maka akan berisi perintah untuk mengisi data
                input.nextLine();
                System.out.println("Masukan NIM mahasiswa: ");
                a=input.nextLine();
                System.out.println("Masukan Nama Mahasiswa: ");
                b=input.nextLine();
                System.out.println("Masukan Program Studi Mahasiswa: ");
                c=input.nextLine();
                System.out.println("Masukan Fakultas Mahasiswa: ");
                d=input.nextLine();
                masukan.Input(a, b, c, d);
            }else if(e==2){ // Jika memilih 2 maka akan berisi perintah untuk menampilkan data
                   tampil.tampilkan();
            }else if(e==3){ // Jika memilih 3 maka akan berisi perintah untuk menghapus data
                    HapusData hapus = new HapusData();
            }else if(e==4){ // Jika memilih 4 maka akan menampilkan macam - macam pilihan untuk mengubah kolom pada setiap baris
                System.out.println("Apakah Anda Ingin Merubah Data NIM?\n1. IYA\n2. TIDAK");
                System.out.println("Pilihan Anda: ");
                e=input.nextInt(); 
                if(e==1){
                    input.nextLine();
                    System.out.println("Masukan NIM Yang Ingin Anda Ubah: ");
                    a=input.nextLine();
                    input.nextLine();
                    System.out.println("Masukan NIM Yang Baru: ");
                    b=input.nextLine();
                    ubah.updateNIM(a, b);
                    }else if(e==2){
                        input.nextLine();
                        System.out.println("Apakah Anda Ingin Merubah Data Nama?\n1. IYA\n2. TIDAK");
                        System.out.println("Pilihan Anda: ");
                        e=input.nextInt(); 
                           if(e==1){
                            input.nextLine();
                            System.out.println("Masukan NIM Yang Ingin Anda Ubah: ");
                            a=input.nextLine();
                            System.out.println("Masukan Nama Yang Baru: ");
                            b=input.nextLine();
                            ubah.updateNama(b, a);
                           }else if(e==2){
                               input.nextLine();
                               System.out.println("Apakah Anda Ingin Merubah Data Fakultas?\n1. IYA\n2. TIDAK");
                               System.out.println("Pilihan Anda: ");
                               e=input.nextInt(); 
                               if(e==1){
                                   input.nextLine();
                                   System.out.println("Masukan NIM Yang Ingin Anda Ubah: ");
                                   a=input.nextLine();
                                   input.nextLine();
                                   System.out.println("Masukan Fakultas Yang Baru: ");
                                   b=input.nextLine();
                                   ubah.updateFakultas(b, a);
                               }else if(e==2){
                                   input.nextLine();
                                   System.out.println("Apakah Anda Ingin Merubah Data Prodi?\n1. IYA\n2. TIDAK");
                                   System.out.println("Pilihan Anda: ");
                                   e=input.nextInt(); 
                                   if(e==1){
                                       input.nextLine();
                                       System.out.println("Masukan NIM Yang Ingin Anda Ubah: ");
                                       a=input.nextLine();
                                       System.out.println("Masukan Prodi Yang Baru: ");
                                       b=input.nextLine();
                                       ubah.updateProdi(b, a);
                                   }else if(e==2){
                                       System.out.println("Terima Kasih");
                        }
                    }
                }
            }
        }
    }
}
```
Pada bagian _main_ ini dibuat ketika dirunning akan muncul berbagai pertanyaan dan pilihan. Pilihan - pilah tersebut berisi perintah - perintah entah itu _Create, Read, Update, Delete_. Source code ini terstruktur menggunakan IfElseIfStatement.

# HASIL
   ## Create 
   ![alt text](https://github.com/RamajaGandiKusuma/Object-Oriented-Programming/blob/main/Pict%20GITHUB/Screenshot%202024-09-14%20233713.png?raw=true)

   ## Read
   ![alt text](https://github.com/RamajaGandiKusuma/Object-Oriented-Programming/blob/main/Pict%20GITHUB/Screenshot%202024-09-15%20165156.png?raw=true)

   ## Update
   ![alt text](https://github.com/RamajaGandiKusuma/Object-Oriented-Programming/blob/main/Pict%20GITHUB/Screenshot%202024-09-15%20165447.png?raw=true)

   ## Delete
   ![alt text](https://github.com/RamajaGandiKusuma/Object-Oriented-Programming/blob/main/Pict%20GITHUB/Screenshot%202024-09-15%20165627.png?raw=true)
   ![alt text](https://github.com/RamajaGandiKusuma/Object-Oriented-Programming/blob/main/Pict%20GITHUB/Screenshot%202024-09-15%20165649.png?raw=true)

##__________________________________________________________________________________________________________________________________________________

# **Try Catch & Throw **
## Pada materi ini menerapkan operasi Try Catch & Throw sederhana dengan menggunakan IDE Netbeans bahasa java.
   Study case yang digunakan terdapat dua yaitu array yang melebihi batas dan penyeleksian nilai. Pada tugas ini berfokus untuk menggunakan Try Catch & membuat bentuk Exception sendiri dengan baik.

## TryCatchStudy Class
   Pada Class ini terdapat array nilai yang memiliki 5 nilai didalamnya dan terdapat for loop untuk menampilakn semua nilai yang ada dalam array nilai. Tetapi, perulangan yang dilakukan melebihi nilai yang dimiliki oleh array nilai.
   ```java
public class TryCatchStudy {
    public static void main(String[] args) {
        try{
            int nilai [] = {99, 31, 66, 70, 1000};
            for(int i = 0; i<6; i++){
                System.out.println("Nilai ke-"+(i+1)+":"+nilai[i]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Perintah Anda salah karena "+e.getMessage());
        }
    }
}

```
## ThrowStudy Class
   Pada Class ini terdapat fungsi IfElseStatement untuk menyeleksi nilai yang masuk. Jika nilai yang di masukan tidak melebihi nilai minimum maka akan muncul Exception yang telah disetting sebelumnya pada fungsi nilai.
   ```java
public class ThrowStudy {
    
    public int nilai(int a) throws ArithmeticException { 
        if(a<=75){
            throw new ArithmeticException("Anda Tidak Lulus"); //ArithmeticException Disetting untuk menampilkan 
        }else{
            System.out.println("Anda Lulus");
        }
        return a;
    }
    
    public static void main(String[] args) {
        ThrowStudy thr = new ThrowStudy();
        thr.nilai(97);
    }
}

```






