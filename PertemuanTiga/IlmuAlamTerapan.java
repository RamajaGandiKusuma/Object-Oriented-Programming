/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanTiga;

/**
 *
 * @author RAMAJA
 */
public class IlmuAlamTerapan extends IlmuAlam {
    public void identitas(String nama, String objek){
        super.bidangAlamTerapan();
        this.bidangAlamTerapan();
        super.namaCabang(nama);
        super.objekKajian(objek);
    }

    public void bidangAlamTerapan(){
        System.out.println("Ilmu alam terapan adalah cabang ilmu yang menerapkan prinsip-prinsip dan teori-teori dasar dari ilmu alam (seperti fisika, kimia, biologi) untuk memecahkan masalah praktis di kehidupan sehari-hari.");
    }
    
    public void profesi(String spesialis){
        System.out.println("Profesi sebagai ilmuwan dan peneliti dibidang: "+spesialis);
    }
    
    public void profesi(String spesialis, String industri){
        System.out.println("Ahli pada bidang: "+spesialis);
        System.out.println("Profesi sebagai pengembang di dalam industri: "+industri);
    }
}
