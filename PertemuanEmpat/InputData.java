/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanEmpat;

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
