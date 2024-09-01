/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanKedua;

/**
 *
 * @author RAMAJA
 */
public class SainsKebumian extends IlmuAlam implements TeoriKeb{
    
    public SainsKebumian(){
        super();
    }

    @Override
    public void Geologi() {
        System.out.println("Geologi adalah ilmu yang mempelajari bumi, termasuk struktur, komposisi, proses, dan sejarahnya.");
    }

    @Override
    public void Geofisika() {
        System.out.println("Geofisika adalah cabang ilmu yang mempelajari bumi menggunakan prinsip-prinsip fisika.");
    }

    @Override
    public void Meteorologi() {
        System.out.println("Meteorologi adalah ilmu yang mempelajari atmosfer dan proses-proses yang mempengaruhi cuaca dan iklim.");
    }
    
}
