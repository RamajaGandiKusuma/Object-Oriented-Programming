/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanEmpat;

import java.sql.*;

/**
 *
 * @author RAMAJA
 */
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

