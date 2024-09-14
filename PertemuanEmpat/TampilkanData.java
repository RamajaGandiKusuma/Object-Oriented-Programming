/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanEmpat;

import java.sql.*;

public class TampilkanData extends Koneksi {
    
    public TampilkanData(){
        try{
            String sql = "SELECT * FROM mahasiswa";
            PreparedStatement tampilkan = connection.prepareStatement(sql);
            ResultSet jalankan = tampilkan.executeQuery();
            
            while(jalankan.next()){
                
            }
            
            System.out.println("Menampilkan Data Sukses.");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
