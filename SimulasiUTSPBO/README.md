# OPERASI CRUD (CREATE, READ, UPDATE, DELETE) 
## Buatlah CRUD dengan Java Swing untuk entitas Buku dengan atribut: ISBN, Judul Buku, Tahun Terbit, Penerbit!
  Kasus ini merupakan salah satu tugas dalam soal simulasi UTS mata kuliah pemograman berorientasi objek

## Langkah - langkah
## 1. Membuat Database Connection Baru
  Koneksi ini mengarah ke database yang menyimpan entitas Buku sesuai perintah.
  
  ![Alt text](https://github.com/RamajaGandiKusuma/Object-Oriented-Programming/blob/main/Pict%20GITHUB/Screenshot%202024-10-02%20205958.png)

## 2. Membuat Desain GUI

  ![Alt text](https://github.com/RamajaGandiKusuma/Object-Oriented-Programming/blob/main/Pict%20GITHUB/Screenshot%202024-10-02%20210247.png)

## 3. Menghubungkan GUI Dengan Database
   Pendeklarasian koneksi ke database dilakukan dalam method getAllData agar dapat diketahui kesalahan pada proses connecting. Hal tersebut dilakukan karena didalam method juga terdapat trycatch.
   
   ![Alt text](https://github.com/RamajaGandiKusuma/Object-Oriented-Programming/blob/main/Pict%20GITHUB/Screenshot%202024-10-02%20212142.png)
   
   ![Alt text](https://github.com/RamajaGandiKusuma/Object-Oriented-Programming/blob/main/Pict%20GITHUB/Screenshot%202024-10-02%20212155.png)

## 4. Membuat Method getAllData
  Pembuatan method ini bertujuan untuk menampilkan data - data dalam database ke dalam tabel dengan cara menyimpanya dalam arraylist kemudian dimasukan dalam method refreshModel untuk dihubungkan dengan tabel.

  ![Alt text](https://github.com/RamajaGandiKusuma/Object-Oriented-Programming/blob/main/Pict%20GITHUB/Screenshot%202024-10-02%20213407.png)
  
  ![Alt text](https://github.com/RamajaGandiKusuma/Object-Oriented-Programming/blob/main/Pict%20GITHUB/Screenshot%202024-10-02%20212830.png)

## 5. Memberikan query dalam button input data untuk memasukan data pada database
   Sebelum melakukan proses insert, field diseleksi bahwa setiap field tidak boleh null atau tidak terdapat data yang dimasukan.
 
  ![Alt text](https://github.com/RamajaGandiKusuma/Object-Oriented-Programming/blob/main/Pict%20GITHUB/Screenshot%202024-10-02%20213911.png)

## 6. Memberikan query dalam button update untuk memperbarui data yang ada pada database
   Sama halnya pada button input data, field diseleksi terlebih dahulu apakah terdapat field yang null.

  ![Alt text](https://github.com/RamajaGandiKusuma/Object-Oriented-Programming/blob/main/Pict%20GITHUB/Screenshot%202024-10-02%20214944.png)

## 7. Memberikan query dalam button hapus data untuk menghapus data dalam database
   Dalam button hapus data, field untuk menginput isbn tidak boleh null karena atribut isbn merupakan primary key dalam entitas Buku.

 ![Alt text](https://github.com/RamajaGandiKusuma/Object-Oriented-Programming/blob/main/Pict%20GITHUB/Screenshot%202024-10-02%20215352.png)

## 8. Memberikan source code dalam button bersihkan 
  Button ini bertujuan untuk menghapus teks atau kalimat dalam field, dengan cara menginput pada field teks yang kosong tidak ada kata.

  ![Alt text](https://github.com/RamajaGandiKusuma/Object-Oriented-Programming/blob/main/Pict%20GITHUB/Screenshot%202024-10-02%20215813.png)
   
