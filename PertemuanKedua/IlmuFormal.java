/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanKedua;

/**
 *
 * @author RAMAJA
 */
public class IlmuFormal extends RumpunIlmu {
    private String ciptaanInovasi;
    
    public void bidangFormal(){
        System.out.println("Ini Bidang Ilmu Formal Murni.");
    }
    public void bidangFormalTerapan(){
        System.out.println("Ini Bidang Ilmu Formal Terapan.");
    }
    
    public IlmuFormal(){
        System.out.println("Ilmu formal adalah cabang ilmu yang fokus pada sistem abstrak dan logistik, seperti matematika, logika, dan ilmu komputer teoritis. "
                + "Ilmu formal tidak fokus pada fenomena fisik atau empiris, tetapi lebih pada pola, struktur, dan hubungan yang dapat dijelaskan secara logistik dan deduktif.");
    }

    /**
     * @return the ciptaanInovasi
     */
    public String getciptaanInovasi() {
        return ciptaanInovasi;
    }

    /**
     * @param ciptaanInovasi the ciptaanInovasi to set
     */
    public void setciptaanInovasi(String ciptaanInovasi) {
        this.ciptaanInovasi = ciptaanInovasi;
    }
}
