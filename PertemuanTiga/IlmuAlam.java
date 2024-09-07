/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanTiga;

/**
 *
 * @author RAMAJA
 */
public class IlmuAlam extends RumpunIlmu{
    
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
        System.out.println("Objek Kajian ilmu: "+objek);
    }
    
    public void bidangAlamMurni(){
        System.out.println("Ini ilmu alam murni");
    }
    
    public void bidangAlamTerapan(){
        System.out.println("Ini ilmu alam terapan");
    }

}
