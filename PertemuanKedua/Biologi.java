/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanKedua;

/**
 *
 * @author RAMAJA
 */
public class Biologi extends IlmuAlam implements TeoriBio {
    
    public Biologi(){
        super();
    }
    
    @Override
    public void BiologiTeknologi() {
      
        System.out.println("Bioteknologi adalah bidang ilmu yang mempelajari bagaimana menggunakan organisme kehidupan, sistem biologi, atau proses biologi untuk membuat produk dan layanan yang bermanfaat bagi manusia.");
    }

    @Override
    public void Biomedis() {
        System.out.println("Biomedis adalah bidang yang mempelajari hubungan antara biologi dan kedokteran, dengan fokus pada bagaimana pengetahuan biologis dapat diterapkan untuk memahami, mendiagnosis, mengobati, dan mencegah penyakit serta memperbaiki kesehatan manusia.");
    }

    @Override
    public void IlmuBiologi() {
        System.out.println("Ilmu biologi adalah cabang ilmu yang mempelajari kehidupan dan organisme hidup, termasuk struktur, fungsi, pertumbuhan, evolusi, dan interaksi mereka dengan lingkungan.");
    }
    
}
