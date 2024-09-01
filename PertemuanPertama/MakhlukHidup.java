/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanPertama;

/**
 *
 * @author RAMAJA
 */
public class MakhlukHidup {

    private String nama;
    public void Nafas (){
        System.out.println("Dapat Bernafas...");
    }
    public void Tumbuh(){
        System.out.println("Dapat Tumbuh.... ");
    }
    public void Reproduksi(){
        System.out.println("Dapat Bereproduksi");
    }
    public void PekaTerhadapLingkungan(){
        System.out.println("Dapat Merasakan Lingkungan Sekitar");
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }
}
