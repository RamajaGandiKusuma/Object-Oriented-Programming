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
  Pembuatan method ini bertujuan untuk menampilkan data - data dalam database ke dalam tabel
  ![Alt text](https://github.com/RamajaGandiKusuma/Object-Oriented-Programming/blob/main/Pict%20GITHUB/Screenshot%202024-10-02%20212830.png)
