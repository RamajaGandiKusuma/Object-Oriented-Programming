/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanTiga;

/**
 *
 * @author RAMAJA
 */
public class IlmuAlamMurni extends IlmuAlam{
    public void identitas(String nama, String objek){
        super.bidangAlamMurni();
        this.bidangAlamMurni();
        super.namaCabang(nama);
        super.objekKajian(objek);   
    }

     public void bidangAlamMurni(){
        System.out.println("Ilmu alam murni adalah cabang ilmu pengetahuan yang berfokus pada studi tentang fenomena alam dan hukum-hukum dasar yang mengatur alam semesta.");
    }
    
    public void profesi(String spesialis){
        System.out.println("Profesi sebagai ilmuwan atau peneliti dibidang: "+spesialis);
    }
    
    public void profesi(String spesialis, String industri){
        System.out.println("Ahli pada bidang: "+spesialis);
        System.out.println("Profesi sebagai pengembang di dalam industri: "+industri);
    }
    
}
