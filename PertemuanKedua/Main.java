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
        Biologi bio = new Biologi();
        bio.setNamaCabangIlmu("BIOLOGI");
        bio.setMetodologi("Biologi mengikuti langkah sistematis untuk memahami kehidupan, dimulai dengan observasi untuk mengidentifikasi fenomena dan kemudian merumuskan hipotesis atau pertanyaan penelitian.");
        bio.setObjekKajian("Biologi mempelajari sel sebagai unit dasar kehidupan, termasuk bagaimana sel berfungsi dan berkomunikasi.");
        bio.setSkalaFenomena("Biologi dapat dilihat dari seluler, organisme, dan populasi, mulai dari interaksi molekul hingga dinamika kelompok organisme.");
        bio.setHukumTeoriUtama("Biologi meliputi Teori Sel, Teori Evolusi, Hukum Pewarisan Mendel, Teori Genetik Modern, Hukum Termodinamika, dan Teori Ekosistem.");
        
        System.out.println("Nama Cabang Ilmu "+bio.getNamaCabangIlmu());
        System.out.println("Metodologi "+bio.getMetodologi());
        System.out.println("Objek Kajian "+bio.getObjekKajian());
        System.out.println("Skala Fenomena "+bio.getSkalaFenomena());
        System.out.println("Hukum Teori Utama "+bio.getHukumTeoriUtama());
        bio.BiologiTeknologi();
        bio.Biomedis();
        bio.IlmuBiologi();
        System.out.println("\n\n");
        
        Kimia kim = new Kimia();
        kim.setNamaCabangIlmu("Kimia");
        kim.setMetodologi("Kimia mencakup eksperimen, analisis kualitatif dan kuantitatif, spektroskopi, kromatografi, elektroanalisis, sintesis kimia, dan komputasi kimia.");
        kim.setObjekKajian("Kimia meliputi struktur molekul, reaksi kimia, sifat zat, termokimia, kinetika kimia, kimia organik dan anorganik, kimia fisik, kimia analitik, dan kimia biologi..");
        kim.setSkalaFenomena("Kimia meliputi Molekuler, Atom, Reaksi Kimia, Larutan, Materi, dan Makroskopik, dari interaksi molekul hingga sifat materi pada skala besar.");
        kim.setHukumTeoriUtama("Kimia meliputi Kekekalan Massa, Proporsi Tetap, Proporsi Berganda, Teori Atom Dalton, Molekul Kinetik, Gas Ideal, Hukum Raoult, Asam-Basa Brønsted-Lowry, dan Asam-Basa Lewis.");
        
        System.out.println("Nama Cabang Ilmu "+kim.getNamaCabangIlmu());
        System.out.println("Metodologi "+kim.getMetodologi());
        System.out.println("Objek Kajian "+kim.getObjekKajian());
        System.out.println("Skala Fenomena "+kim.getSkalaFenomena());
        System.out.println("Hukum Teori Utama "+kim.getHukumTeoriUtama());
        kim.Biokimia();
        kim.Material();
        kim.Farmasi();
        System.out.println("\n\n");
        
        SainsKebumian sk = new SainsKebumian();
        sk.setNamaCabangIlmu("Sains Kebumian");
        sk.setMetodologi("Sains kebumian mencakup observasi, pengukuran, eksperimen, analisis data, pemodelan, peramalan, dan pengambilan sampel.");
        sk.setObjekKajian("Sains kebumian meliputi Geologi, Meteorologi, Klimatologi, Oseanografi, Astronomi, Hidrologi, Geofisika, dan Geografi.");
        sk.setSkalaFenomena("Skala fenomena dalam sains kebumian meliputi Molekuler, Panjang Waktu Geologis, Geologi Struktur, Geomorfologi, Sistem Bumi, Klimatologi, dan Ekologi Lingkungan.");
        sk.setHukumTeoriUtama("Hukum dan teori utama dalam sains kebumian meliputi Teori Tektonik Lempeng, Hukum Uniformitarianisme, Teori Batuan, Hukum Stratigrafi, Teori Ekspansi Dasar Laut, dan Teori Big Bang.");
        
        System.out.println("Nama Cabang "+sk.getNamaCabangIlmu());
        System.out.println("Metodologi "+sk.getMetodologi());
        System.out.println("Objek Kajian "+sk.getObjekKajian());
        System.out.println("Skala Fenomena "+sk.getSkalaFenomena());
        System.out.println("Hukum Teori Utama "+sk.getHukumTeoriUtama());
        sk.Geofisika();
        sk.Geologi();
        sk.Meteorologi();
        System.out.println("\n\n");
        
        System.out.println("====================");
        System.out.println("     Ilmu Formal");
        System.out.println("====================");
        IlmuFormal IF = new Komputer();
        Komputer kom = (Komputer) IF;
        kom.setNamaCabangIlmu("Komputer");
        kom.setMetodologi("Komputer meliputi pengembangan perangkat lunak, analisis sistem, pemrograman, pengujian, manajemen proyek, pengelolaan basis data, keamanan informasi, pembelajaran mesin, dan rekayasa perangkat lunak.");
        kom.setObjekKajian("Komputer meliputi algoritma, pemrograman, sistem operasi, jaringan, basis data, kecerdasan buatan, dan keamanan siber.");
        kom.setciptaanInovasi("Ciptaan inovasi dalam ilmu komputer meliputi AI, Pembelajaran Mesin, Big Data, Komputasi Awan, IoT, Keamanan Siber, Blockchain, AR/VR, Komputasi Kuantum, dan Jaringan 5G.");
        
        System.out.println("Nama Cabang "+kom.getNamaCabangIlmu());
        System.out.println("Metodologi "+kom.getMetodologi());
        System.out.println("Objek Kajian "+kom.getObjekKajian());
        System.out.println("Ciptaan Inovasi "+kom.getciptaanInovasi());
        kom.Informatika();
        kom.SistemInformasi();
        kom.TeknologiInformasi();
        System.out.println("\n\n");
        
        IlmuFormal formal = new Matematika();
        Matematika mat = (Matematika) formal;
        mat.setNamaCabangIlmu("Matematika");
        mat.setMetodologi("Matematika mencakup Aksioma, Bukti, Model, Algoritma, Analisis, dan Simulasi.");
        mat.setObjekKajian("Matematika mencakup bilangan, aljabar, geometri, kalkulus, statistik, hingga logika dan topologi.");
        mat.setciptaanInovasi("Matematika mencakup Pembelajaran mesin,matematika komputasional, geometri fraktal dan kriptografi.");
        
        System.out.println("Nama Cabang "+mat.getNamaCabangIlmu());
        System.out.println("Metodologi "+mat.getMetodologi());
        System.out.println("Objek Kajian "+mat.getObjekKajian());
        System.out.println("Ciptaan inovasi "+mat.getciptaanInovasi());
        mat.IlmuMatematika();
        mat.SainsData();
        mat.Statistika();
        System.out.println("\n\n");
        
        System.out.println("====================");
        System.out.println("     Ilmu Sosial");
        System.out.println("====================");
        Sosial sos = new Sosial();
        sos.setNamaCabangIlmu("Sosial");
        sos.setMetodologi("Sosial mencakup metode kualitatif, kuantitatif, survei, eksperimen, observasi partisipan, wawancara, studi kasus, dan analisis data sekunder.");
        sos.setObjekKajian("Sosial dapat dilihat dari individu, kelompok sosial, lembaga sosial, dan masyarakat, dari perilaku pribadi hingga struktur sosial.");
        sos.setKelompokSosial("Sosial dapat dilihat dari struktur kelompok, dinamika, peran sosial, dan interaksi, mulai dari organisasi hingga hubungan antaranggota.");
        
        System.out.println("Nama Cabang "+sos.getNamaCabangIlmu());
        System.out.println("Metodologi "+sos.getMetodologi());
        System.out.println("Objek Kajian "+sos.getObjekKajian());
        System.out.println("Kelompok sosial "+sos.getKelompokSosial());
        sos.Sosiologi();
        sos.KesejahteraanSosial();
        sos.IlmuKomunikasi();
        System.out.println("\n\n");
        
        Psikologi psi = new Psikologi();
        psi.setNamaCabangIlmu("Psikologi");
        psi.setMetodologi("Psikologi dapat dilihat dari skala eksperimen, observasi, studi kasus, dan survei.");
        psi.setObjekKajian("Psikologi dapat dilihat dari persepsi, kognisi, emosi, dan perilaku.");
        psi.setKelompokSosial("Psikologi dapat dilihat dari anggota, peran, norma, dan status, mulai dari dinamika kelompok kecil hingga struktur kelompok besar.");
        
        System.out.println("Nama Cabang "+psi.getNamaCabangIlmu());
        System.out.println("Metodologi "+psi.getMetodologi());
        System.out.println("Objek Kajian "+psi.getObjekKajian());
        System.out.println("Kelompok sosial "+psi.getKelompokSosial());
        psi.IlmuPsikologi();
        psi.PsikologiMedis();
        System.out.println("\n\n");
        
        Ekonomi eko = new Ekonomi();
        eko.setNamaCabangIlmu("Ekonomi");
        eko.setMetodologi("Ekonomi dapat dilihat dari teori, analisis empiris, model, dan eksperimen, mulai dari pengembangan hingga penerapan data.");
        eko.setObjekKajian("Ekonomi dapat dilihat dari konsumsi, produksi, distribusi, dan pasar, mulai dari perilaku individu hingga dinamika ekonomi makro.");
        eko.setKelompokSosial("Ekonomi dapat dilihat dari rumah tangga, perusahaan, pasar, dan pemerintah.");
        
        System.out.println("Nama Cabang "+eko.getNamaCabangIlmu());
        System.out.println("Metodologi "+eko.getMetodologi());
        System.out.println("Objek Kajian "+eko.getObjekKajian());
        System.out.println("Kelompok sosial "+eko.getKelompokSosial());
        eko.EkonomiPembangunan();
        eko.EkonomiSyariah();
        eko.Perpajakan();
        
        
  }
}
