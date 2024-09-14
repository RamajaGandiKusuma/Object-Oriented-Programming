/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanEmpat;

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
