/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanKedua;

import java.util.*;
/**
 *
 * @author RAMAJA
 */
public class Main {
    public static void main (String[] args){
        System.out.println("====================");
        System.out.println("     Ilmu Alam");
        System.out.println("====================");
        
        IlmuAlamTerapan tkim = new IlmuAlamTerapan();
        tkim.setNamaCabangIlmu("Teknik Kimia");
        tkim.setMetodologi("merancang, mengembangkan, dan mengoptimalkan proses kimia serta industri yang melibatkan bahan kimia.");
        tkim.setObjekKajian("desain, analisis, dan pengoperasian proses pada bahan kimia");
        tkim.setSkalaFenomena("skala molekuler hingga skala industri");
        
        System.out.println("Nama Cabang Ilmu: "+tkim.getNamaCabangIlmu());
        System.out.println("Metodologi Cabang Ilmu: "+tkim.getMetodologi());
        System.out.println("Objek Kajian Ilmu: "+tkim.getObjekKajian());
        System.out.println("Skala Fenomena Ilmu: "+tkim.getSkalaFenomena());
        System.out.println("\n\n");
        
        IlmuAlamMurni fis = new IlmuAlamMurni();
        fis.setNamaCabangIlmu("Fisika");
        fis.setMetodologi("memahami, menganalisis, dan menerapkan prinsip-prinsip fisika.");
        fis.setObjekKajian(" sifat dan interaksi materi dan energi.");
        fis.setSkalaFenomena("skala kuantum, skala mikroskopis dan skala kontinental.");
        
        System.out.println("Nama Cabang Ilmu: "+fis.getNamaCabangIlmu());
        System.out.println("Metodologi Cabang Ilmu: "+fis.getMetodologi());
        System.out.println("Objek Kajian Ilmu: "+fis.getObjekKajian());
        System.out.println("Skala Fenomena Ilmu: "+fis.getSkalaFenomena());
        System.out.println("\n\n");
        
        System.out.println("====================");
        System.out.println("     Ilmu Formal");
        System.out.println("====================");
        
        IlmuFormalTerapan kom = new IlmuFormalTerapan();
        kom.setNamaCabangIlmu("Sistem Informasi.");
        kom.setMetodologi("pengembangan sistem dan pengelolahan sistem.");
        kom.setObjekKajian("manajemen informasi, teknologi informasi dan sistem basis data");
        kom.setciptaanInovasi("cloud computing, big data analitik dan AI");
        
        System.out.println("Nama Cabang Ilmu: "+kom.getNamaCabangIlmu());
        System.out.println("Metodologi Cabang Ilmu: "+kom.getMetodologi());
        System.out.println("Objek Kajian Ilmu: "+kom.getObjekKajian());
        System.out.println("Ciptaan Inovasi Ilmu: "+kom.getciptaanInovasi());
        System.out.println("\n\n");
        
        IlmuFormalMurni mat = new IlmuFormalMurni();
        mat.setNamaCabangIlmu("Matematika");
        mat.setMetodologi("teorema deduktif, teorema induktif dan analisis serta kalkulus.");
        mat.setObjekKajian("Matematika diskrit, numerik, dan graf");
        mat.setciptaanInovasi("Algoritma & metode numerik");
        
        System.out.println("Nama Cabang Ilmu: "+kom.getNamaCabangIlmu());
        System.out.println("Metodologi Cabang Ilmu: "+kom.getMetodologi());
        System.out.println("Objek Kajian Ilmu: "+kom.getObjekKajian());
        System.out.println("Ciptaan Inovasi Ilmu: "+kom.getciptaanInovasi());
        
        
        
        System.out.println("\n\n");
        
        
       
        
  }
}
