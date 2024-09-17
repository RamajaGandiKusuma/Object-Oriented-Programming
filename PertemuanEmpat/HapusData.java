
package PertemuanEmpat;

import java.sql.*;

public class HapusData extends Koneksi {
    
    public void hapusSemua(){
         try{
        String sql = "DELETE FROM mahasiswa";
        PreparedStatement hapus = connection.prepareStatement(sql);
        int jalankan = hapus.executeUpdate();
            System.out.println("Data Berhasil Dihapus.\n");
        }catch(Exception e){
             System.out.println("Data Gagal Dihapus\n");
        }
    }
    
    public void hapusSatuData(String nim){
        try{
            String sql = "DELETE FROM mahasiswa WHERE nim = ?";
            PreparedStatement hapus = connection.prepareStatement(sql);
            
            hapus.setString(1, nim);
            
            int jalankan = hapus.executeUpdate();
            System.out.println("Data Berhasil Dihapus\n");
        }catch(Exception e){
            System.out.println("Data Gagal Dihapus\n");
        }
    }
}
