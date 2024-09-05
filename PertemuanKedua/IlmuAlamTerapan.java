/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanKedua;

/**
 *
 * @author RAMAJA
 */
public class IlmuAlamTerapan extends IlmuAlam implements Rekayasa, LingkunganTerapan{
    
    public IlmuAlamTerapan(){
        this.bidangAlamTerapan();
        super.bidangAlamTerapan();
    }
    
    
    public void bidangAlamTerapan(){
       this.pengelolaanSDM();
       this.pengembanganProyek();
       this.restorasiEkosistem();
       this.simulasiPengujian();
    }

    @Override
    public void pengembanganProyek() {
        System.out.println("Melakukan pengembangan suatu proyek");
    }

    @Override
    public void simulasiPengujian() {
        System.out.println("Simulasi dan pengujian hasil proyek");
    }

    @Override
    public void pengelolaanSDM() {
        System.out.println("pengelolaan sumber daya seperti air, hutan, dan mineral, termasuk pemantauan dan evaluasi dampak lingkungan.");
    }

    @Override
    public void restorasiEkosistem() {
        System.out.println("Melakukan restorasi suatu ekosistem");
    }


    
    


}
