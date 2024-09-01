/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanPertama;

/**
 *
 * @author RAMAJA
 */
public class Utama {

    public static void main(String[] args) {
        
        System.out.println("Makhluk Hidup Hewan\n");
        
        Pisces mujaer = new Pisces();
        mujaer.setNama("Mujaer");
        System.out.println("Nama Ikan "+mujaer.getNama());
        mujaer.setJumlahKaki(0);
        System.out.println("Jumlah Kaki "+mujaer.getJumlahKaki());
        mujaer.setTempatHidup("Air");
        System.out.println("Tempat hidup di "+mujaer.getTempatHidup());
        mujaer.HabitatAirTawar();
        mujaer.setKarakterSisik("Berukuran 5-8 mm, mengkilap, keras dan menyerupai kepingan plastik");
        System.out.println("Karakteristik sisik yaitu "+mujaer.getKarakterSisik());
        mujaer.setSistemPernafasan("Insang");
        mujaer.Nafas();
        System.out.println("Bernafas dengan "+mujaer.getSistemPernafasan());
        mujaer.Bertelur();
        mujaer.setBerjalan("Sirip");
        System.out.println("Bergerak dengan "+mujaer.getBerjalan());
        mujaer.Tumbuh();
        mujaer.Reproduksi();
        mujaer.PekaTerhadapLingkungan();
        
        System.out.println("");
        
        Amfibi salamender = new Amfibi ();
        salamender.setNama("Salamender");
        System.out.println("Nama "+salamender.getNama());
        salamender.setJumlahKaki(4);
        System.out.println("Jumlah Kaki "+salamender.getJumlahKaki());
        salamender.setTempatHidup("Air dan Daratan yang lembab");
        System.out.println("Tempat hidup di "+ salamender.getTempatHidup());
        salamender.Aquatic();
        salamender.Nafas();
        salamender.setSistemPernafasan("Menggunakan kombinasi paru-paru, kulit, dan mulut untuk bernapas, tergantung pada lingkungannya.");
        System.out.println("Bernafas dengan "+salamender.getSistemPernafasan());
        salamender.Bertelur();
        salamender.setBerjalan("Kaki & ekor");
        System.out.println("Bergerak dengan "+salamender.getBerjalan());
        salamender.Tumbuh();
        salamender.Reproduksi();
        salamender.PekaTerhadapLingkungan();
        
        System.out.println("");
        
        Aves merak = new Aves ();
        merak.setNama("Merak");
        System.out.println("Nama Burung "+merak.getNama());
        merak.ParuhKecilPendek();
        merak.setJumlahKaki(2);
        System.out.println("Jumlah Kaki "+merak.getJumlahKaki());
        merak.setTempatHidup("Hutan");
        System.out.println("Tempat hidup di "+ merak.getTempatHidup());
        merak.Nafas();
        merak.setSistemPernafasan("Paru-paru.");
        System.out.println("Bernafas dengan "+merak.getSistemPernafasan());
        merak.Bertelur();
        merak.setBerjalan("Kaki & sayap");
        System.out.println("Bergerak dengan "+merak.getBerjalan());
        merak.Tumbuh();
        merak.Reproduksi();
        merak.PekaTerhadapLingkungan();
        
        System.out.println("");
        
        Reptil komodo = new Reptil();
        komodo.setNama("Komodo");
        System.out.println("Nama Hewan "+komodo.getNama());
        komodo.BuntutTidakTerputus();
        komodo.setJumlahKaki(4);
        System.out.println("Jumlah Kaki "+komodo.getJumlahKaki());
        komodo.setTempatHidup("Bukit & lembah");
        System.out.println("Tempat hidup di "+ komodo.getTempatHidup());
        komodo.Nafas();
        komodo.setSistemPernafasan("Paru-paru.");
        System.out.println("Bernafas dengan "+komodo.getSistemPernafasan());
        komodo.Bertelur();
        komodo.setBerjalan("Kaki");
        System.out.println("Bergerak dengan "+komodo.getBerjalan());
        komodo.Tumbuh();
        komodo.Reproduksi();
        komodo.PekaTerhadapLingkungan();
        
        System.out.println("");
        
        Mamalia gajah = new Mamalia();
        gajah.setNama("Gajah");
        System.out.println("Nama Hewan "+gajah.getNama());
        gajah.Placental();
        gajah.setJumlahKaki(4);
        System.out.println("Jumlah Kaki "+gajah.getJumlahKaki());
        gajah.setTempatHidup("Hutan & rawa-rawa");
        System.out.println("Tempat hidup di "+ gajah.getTempatHidup());
        gajah.Nafas();
        gajah.setSistemPernafasan("Paru-paru.");
        System.out.println("Bernafas dengan "+gajah.getSistemPernafasan());
        gajah.Bertelur();
        gajah.setBerjalan("Kaki");
        System.out.println("Bergerak dengan "+gajah.getBerjalan());
        gajah.Tumbuh();
        gajah.Reproduksi();
        gajah.PekaTerhadapLingkungan();
        
        System.out.println("\n");
        System.out.println("Makhluk Hidup Tumbuhan\n");
        
        Dikotil tomat = new Dikotil();
        tomat.setNama("Tomat");
        System.out.println("Nama tumbuhan "+tomat.getNama());
        tomat.Menyirip();
        tomat.setWarnaDaun("Hijau tua");
        System.out.println("Memiliki daun berwarna "+tomat.getWarnaDaun());
        tomat.setArahDaun("Berseling");
        System.out.println("Memiliki arah daun "+tomat.getArahDaun());
        tomat.setBentukAkar("Tunggang");
        System.out.println("Memiliki bentuk akar "+tomat.getBentukAkar());
        tomat.setJumlahBiji(2);
        System.out.println("Memiliki jumlah keping biji yaitu "+tomat.getJumlahBiji());
        tomat.Nafas();
        tomat.Tumbuh();
        tomat.Reproduksi();
        tomat.PekaTerhadapLingkungan();
        
        System.out.println("");
        
        Monokotil jagung = new Monokotil();
        jagung.setNama("jagung");
        System.out.println("Nama tumbuhan "+jagung.getNama());
        jagung.Serabut();
        jagung.setWarnaDaun("Hijau tua");
        System.out.println("Memiliki daun berwarna "+jagung.getWarnaDaun());
        jagung.setArahDaun("melengkung atau memiring ke arah luar dan ke atas. ");
        System.out.println("Memiliki arah daun "+jagung.getArahDaun());
        jagung.setBentukAkar("Serabut");
        System.out.println("Memiliki bentuk akar "+jagung.getBentukAkar());
        jagung.setJumlahBiji(1);
        System.out.println("Memiliki jumlah keping biji yaitu "+jagung.getJumlahBiji());
        jagung.Nafas();
        jagung.Tumbuh();
        jagung.Reproduksi();
        jagung.PekaTerhadapLingkungan();
        
        
        
      
    }
}
