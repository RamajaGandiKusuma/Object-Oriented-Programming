/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanTiga;

/**
 *
 * @author RAMAJA
 */
public class Main {
    public static void main(String[] args){
        IlmuAlamMurni bio = new IlmuAlamMurni();
        bio.identitas("Biologi.", "Mikrobiologi, Genetika dan Biokimia.");
        bio.profesi("Genetika. \n");
        
        IlmuAlamTerapan elektro = new IlmuAlamTerapan();
        elektro.identitas("Teknik Elektro.", "Konsep-konsep listrik, elektronik, dan elektromagnetisme.");
        elektro.profesi("Energi & tenaga listrik", "Pembangkit listrik. \n");
        
        IlmuFormalMurni mat = new IlmuFormalMurni();
        mat.identitas("Matematika.", "Aljabar, analisis, geometri dan matematika terapan.");
        mat.profesi("Statistika & analisis. \n");
        
        IlmuFormalTerapan kom = new IlmuFormalTerapan();
        kom.identitas("Teknik Informatika.", "Pengembangan perangkat lunak, sistem basis data, algoritma & struktur data.");
        kom.profesi("Struktur data & sistem basis data.", "Perbankan & keuangan.");
       
    }
}

