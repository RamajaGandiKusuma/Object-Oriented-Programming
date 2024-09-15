# **CRUD OPERATION (Create, Read, Update, Delete)**
## Pada folder ini menerapkan operasi CRUD sederhana dengan menggunakan IDE Netbeans dan database PostgreSQL.
  Study case yang digunakan adalah mengelolah data mahasiswa disuatu perguruan tinggi. Didalamya hanya terdapat satu entitas yaitu mahasiswa, karena pada tugas ini lebih berfokus untuk membuat source code CRUD yang baik.

## A. DATABASE
   Didalam Database Postgresql hanya terdapat satu entitas yaitu mahasiswa.
   ![alt text](https://github.com/RamajaGandiKusuma/Object-Oriented-Programming/blob/main/Pict%20GITHUB/Screenshot%202024-09-15%20130846.png?raw=true)
   
   Didalam entitas mahasiswa memiliki beberapa atribut yaitu nim yang menjadi **PRIMARY KEY** dari entitas mahasiswa, kemudian terdapat atribut nama, prodi dan fakultas.

## B. PROGRAM
   Didalam program sendiri terdapat 6 class yang saling berhirarki.

   ## 1. Koneksi Class
   Pada Class ini berisi source code untuk menghubungkan antara database dengan netbeans. Untuk menghubungkanya sendiri harus mengimport class connection dari JDBC. Tidak hanya itu, didalam Koneksi Class juga terdapat method logger yang didapat dari "import java.util.logging.*". Class ini nantinya akan menjadi superclass dari Class lainya yang akan extends ke Class ini.
   ![alt text](https://github.com/RamajaGandiKusuma/Object-Oriented-Programming/blob/main/Pict%20GITHUB/Screenshot%202024-09-15%20133919.png?raw=true)

   Terdapat beberapa atribut dalam Koneksi Class yaitu url, user dan password. ketiga atribut ini yang nantinya akan dimasukan dalam method connection.

   ## 2. InputData Class
   Pada Class ini berisi source code untuk menginput data dalam entitas mahasiswa atau menerapkan operasi _Create_. Didalam InputData Class ini juga mingimport class sql dari JDBC untuk menggunakan method PreparedStatement.
   ![alt text](https://github.com/RamajaGandiKusuma/Object-Oriented-Programming/blob/main/Pict%20GITHUB/Screenshot%202024-09-15%20135522.png?raw=true)
