/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanPertama;

/**
 *
 * @author RAMAJA
 */
public class Pisces extends Hewan {
    public void HabitatAirAsin(){
        System.out.println("Hidup di air Asin");
    }
    public void HabitatAirTawar(){
        System.out.println("Hidup di air Tawar");
    }
    public void HabitatAirPayau(){
        System.out.println("Hidup di air Payau");
    }
    public void HabitatAirAsam(){
        System.out.println("Hidup di air Asam");
    }
    private String karakterSisik;
    
    
    public String getKarakterSisik() {
        return karakterSisik;
    }

    /**
     * @param karakterSisik the karakterSisik to set
     */
    public void setKarakterSisik(String karakterSisik) {
        this.karakterSisik = karakterSisik;
    }
    
}
