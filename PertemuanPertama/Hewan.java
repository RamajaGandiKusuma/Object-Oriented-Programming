/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanPertama;

/**
 *
 * @author RAMAJA
 */
public class Hewan extends MakhlukHidup {
    private int jumlahKaki;
    private String berjalan;
    private String tempatHidup;
    private String sistemPernafasan;
    public void Melahirkan(){
        System.out.println("Hewan melahirkan");
    }
    public void Bertelur(){
        System.out.println("Hewan bertelur");
    }
    public void BertelurMelahirkan(){
        System.out.println("Hewan bertelur & melahirkan");
    }

    /**
     * @return the JumlahKaki
     */
    public int getJumlahKaki() {
        return jumlahKaki;
    }

    /**
     * @param JumlahKaki the JumlahKaki to set
     */
    public void setJumlahKaki(int JumlahKaki) {
        this.jumlahKaki = JumlahKaki;
    }
    
    public String isBerjalan() {
        return getBerjalan();
    }

    /**
     * @param berjalan
     */
    public void setBerjalan(String berjalan) {
        this.berjalan = berjalan;
    }

    /**
     * @return the tempatHidup
     */
    public String getTempatHidup() {
        return tempatHidup;
    }

    /**
     * @param tempatHidup the tempatHidup to set
     */
    public void setTempatHidup(String tempatHidup) {
        this.tempatHidup = tempatHidup;
    }

    /**
     * @return the berjalan
     */
    public String getBerjalan() {
        return berjalan;
    }

    /**
     * @return the sistemPernafasan
     */
    public String getSistemPernafasan() {
        return sistemPernafasan;
    }

    /**
     * @param sistemPernafasan the sistemPernafasan to set
     */
    public void setSistemPernafasan(String sistemPernafasan) {
        this.sistemPernafasan = sistemPernafasan;
    }
}
