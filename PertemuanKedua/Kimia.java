/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanKedua;

/**
 *
 * @author RAMAJA
 */
public class Kimia extends IlmuAlam implements TeoriKim {
    
    public Kimia(){
        super();
    }

    @Override
    public void Biokimia() {
        System.out.println("Biokimia adalah cabang ilmu yang mempelajari proses kimia dan molekuler yang terjadi dalam organisme hidup.");
    }

    @Override
    public void Farmasi() {
        System.out.println("Farmasi adalah ilmu yang mempelajari tentang obat-obatan, termasuk pengembangan, produksi, distribusi, dan penggunaan obat untuk mencegah, mengobati, dan mengelola penyakit serta meningkatkan kesehatan. ");
    }

    @Override
    public void Material() {
        System.out.println("Material adalah cabang ilmu yang mempelajari sifat, struktur, dan aplikasi bahan-bahan. Ilmu ini mencakup berbagai aspek dari bahan-bahan, mulai dari yang sangat kecil (seperti nanomaterial) hingga yang sangat besar (seperti struktur bangunan).");
    }
    
}
