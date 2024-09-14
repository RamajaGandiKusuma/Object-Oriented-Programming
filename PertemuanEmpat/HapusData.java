/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanEmpat;

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
