/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanTiga;

/**
 *
 * @author RAMAJA
 */
public class IlmuFormal extends RumpunIlmu{
    
    public void identitas(String nama, String objek){
        this.namaCabang(nama);
        this.objekKajian(objek);
    }

    @Override
    public void namaCabang(String nama) {
        System.out.println("Nama cabang ilmu: "+nama);
    }

    @Override
    public void objekKajian(String objek) {
        System.out.println("Objek kajian ilmu: "+objek);
    }
    
    public void bidangFormalMurni(){
        System.out.println("Ini ilmu formal murni");
    }
    
    public void bidangFormalTerapan(){
        System.out.println("Ini ilmu formal terapan");
    }
    
}
