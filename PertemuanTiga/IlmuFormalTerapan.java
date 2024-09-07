/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanTiga;

/**
 *
 * @author RAMAJA
 */
public class IlmuFormalTerapan extends IlmuFormal{
    public void identitas(String nama, String objek){
        super.bidangFormalTerapan();
        this.bidangFormalTerapan();
        super.namaCabang(nama);
        super.objekKajian(objek);
    }

    public void bidangFormalTerapan(){
        System.out.println("Ilmu formal terapan adalah cabang ilmu yang menerapkan teori-teori formal, seperti matematika, logika, dan ilmu komputer.");
    }
    
    public void profesi(String spesialis){
        System.out.println("Profesi sebagai ilmuwan atau peneliti dibidang: "+spesialis);
    }
    
    public void profesi(String spesialis, String industri){
        System.out.println("Ahli pada bidang: "+spesialis);
        System.out.println("Profesi sebagai pengembang di dalam industri: "+industri);
    }
}
