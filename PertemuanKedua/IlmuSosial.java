/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanKedua;

/**
 *
 * @author RAMAJA
 */
public class IlmuSosial extends RumpunIlmu {
    private String kelompokSosial;
    public IlmuSosial(){
        System.out.println("Ilmu sosial adalah cabang ilmu yang mempelajari aspek-aspek yang berhubungan dengan manusia dan interaksinya dalam masyarakat. "
                + "Ilmu ini fokus pada analisis perilaku individu, kelompok, dan institusi serta bagaimana struktur sosial, ekonomi, politik, budaya, dan lingkungan membentuk dan mempengaruhi perilaku ini.");
    }

    /**
     * @return the kelompokSosial
     */
    public String getKelompokSosial() {
        return kelompokSosial;
    }

    /**
     * @param kelompokSosial the kelompokSosial to set
     */
    public void setKelompokSosial(String kelompokSosial) {
        this.kelompokSosial = kelompokSosial;
    }
}
