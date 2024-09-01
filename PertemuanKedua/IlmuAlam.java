/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanKedua;

/**
 *
 * @author RAMAJA
 */
public class IlmuAlam extends RumpunIlmu{
    private String skalaFenomena;
    private String hukumTeoriUtama;
    public IlmuAlam(){
        System.out.println("Ilmu alam merupakan cabang ilmu pengetahuan yang mempelajari fenomena alam semesta. "
                           + "Ilmu ini berfokus pada aspek-aspek fisik dari alam dan sering menggunakan metode ilmiah untuk mengumpulkan data, melakukan eksperimen, dan mengembangkan teori. ");
    }

    /**
     * @return the skalaFenomena
     */
    public String getSkalaFenomena() {
        return skalaFenomena;
    }

    /**
     * @param skalaFenomena the skalaFenomena to set
     */
    public void setSkalaFenomena(String skalaFenomena) {
        this.skalaFenomena = skalaFenomena;
    }

    /**
     * @return the hukumTeoriUtama
     */
    public String getHukumTeoriUtama() {
        return hukumTeoriUtama;
    }

    /**
     * @param hukumTeoriUtama the hukumTeoriUtama to set
     */
    public void setHukumTeoriUtama(String hukumTeoriUtama) {
        this.hukumTeoriUtama = hukumTeoriUtama;
    }
}
