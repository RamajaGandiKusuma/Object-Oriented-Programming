/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanEmpat;

import java.sql.*;
public class UpdateData extends Koneksi{
    
        public void updateNIM(String namaBaru, String nim){
        try{
            String sql = "UPDATE mahasiswa SET nim=? WHERE nim =? ";
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
    
    public void updateNama(String namaBaru, String nim){
        try{
            String sql = "UPDATE mahasiswa SET nama=? WHERE nim =? ";
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
    
       public void updateFakultas(String fakultasBaru, String nim){
        try{
            String sql = "UPDATE mahasiswa SET fakultas=? WHERE nim =? ";
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
    
    public void updateProdi(String prodiBaru, String nim){
        try{
            String sql = "UPDATE mahasiswa SET prodi=? WHERE nim =? ";
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
