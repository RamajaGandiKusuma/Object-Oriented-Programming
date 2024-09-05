/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanKedua;

/**
 *
 * @author RAMAJA
 */
public class IlmuFormalTerapan extends IlmuFormal implements PengembanganAlgoritma, PengolahanData {
   
    public IlmuFormalTerapan(){
        super.bidangFormalTerapan();
        this.bidangFormalTerapan();
    }
    
    public void bidangFormalTerapan(){
        this.pemrosesanData();
        this.simulasiKomputasi();
        this.membersihkanData();
        this.menganalisisData();
        this.mengumpulkanData();
    }

    @Override
    public void pemrosesanData() {
        System.out.println("Melakukan Pemrosesan Data");
    }

    @Override
    public void simulasiKomputasi() {
        System.out.println("Melakukan Simulasi Komputasi");
    }

    @Override
    public void mengumpulkanData() {
        System.out.println("Melakukan Mengumpulkan Data");
    }

    @Override
    public void membersihkanData() {
        System.out.println("Melakukan Pembersihan Data");
    }

    @Override
    public void menganalisisData() {
        System.out.println("Melakukan Penganalisisan Data");
    }
    
}
