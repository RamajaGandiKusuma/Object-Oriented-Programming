# OPERASI CRUD (CREATE, READ, UPDATE, DELETE) 
## Buatlah CRUD dengan Java Swing untuk entitas Buku dengan atribut: ISBN, Judul Buku, Tahun Terbit, Penerbit!
  Kasus ini merupakan salah satu tugas dalam soal UTS mata kuliah pemograman berorientasi objek

## Langkah - langkah
## 1. Membuat Method Database Connection Baru
  Koneksi ini mengarah ke database yang menyimpan entitas Buku sesuai perintah.
  
  ![Alt text](https://github.com/RamajaGandiKusuma/Object-Oriented-Programming/blob/main/Pict%20GITHUB/Screenshot%202024-10-08%20134248.png)


## 2. Membuat Desain GUI

  ![Alt text](https://github.com/RamajaGandiKusuma/Object-Oriented-Programming/blob/main/Pict%20GITHUB/Screenshot%202024-10-08%20134615.png)


## 4. Membuat Method getAllData
  Pembuatan method ini bertujuan untuk menampilkan data - data dalam database ke dalam tabel dengan cara menyimpanya dalam arraylist kemudian dimasukan dalam method refreshModel untuk dihubungkan dengan tabel.

  ![Alt text](https://github.com/RamajaGandiKusuma/Object-Oriented-Programming/blob/main/Pict%20GITHUB/Screenshot%202024-10-02%20213407.png)
  
  ![Alt text](https://github.com/RamajaGandiKusuma/Object-Oriented-Programming/blob/main/Pict%20GITHUB/Screenshot%202024-10-02%20212830.png)

  ## 4. Membuat Method refreshModel
  
  ![Alt text](https://github.com/RamajaGandiKusuma/Object-Oriented-Programming/blob/main/Pict%20GITHUB/Screenshot%202024-10-08%20134816.png)

## 5. Memberikan query dalam button input data untuk memasukan data pada database
   Sebelum melakukan proses insert, field diseleksi bahwa setiap field tidak boleh null atau tidak terdapat data yang dimasukan.
 
  ![Alt text](https://github.com/RamajaGandiKusuma/Object-Oriented-Programming/blob/main/Pict%20GITHUB/Screenshot%202024-10-08%20134953.png)

## 6. Memberikan query dalam button update untuk memperbarui data yang ada pada database
   Sama halnya pada button input data, field diseleksi terlebih dahulu apakah terdapat field yang null.

  ![Alt text](https://github.com/RamajaGandiKusuma/Object-Oriented-Programming/blob/main/Pict%20GITHUB/Screenshot%202024-10-08%20135105.png)

## 7. Memberikan query dalam button hapus data untuk menghapus data dalam database
   Dalam button hapus data, field untuk menginput isbn tidak boleh null karena atribut isbn merupakan primary key dalam entitas Buku.

 ![Alt text](https://github.com/RamajaGandiKusuma/Object-Oriented-Programming/blob/main/Pict%20GITHUB/Screenshot%202024-10-08%20135335.png)



   
