/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanKedua;

/**
 *
 * @author RAMAJA
 */
public class IlmuAlamMurni extends IlmuAlam implements Eksperimen, Modeling {
    public IlmuAlamMurni(){
        this.bidangAlam();
        super.bidangAlam();
    }
    
    public void bidangAlam(){
        this.membangunModel();
        this.memprediksi();
        this.mensimulasikan();
        this.analisisData();
        this.observasi();
        this.pengukuran();
    }

    @Override
    public void observasi() {
        System.out.println("Melakukan observasi");
    }

    @Override
    public void analisisData() {
        System.out.println("Melakukan analisis data");
    }

    @Override
    public void pengukuran() {
        System.out.println("Melakukan pengukuran");
    }

    @Override
    public void membangunModel() {
        System.out.println("Melakukan pembangunan model");
    }

    @Override
    public void mensimulasikan() {
        System.out.println("Melakukan pensimulasian");
    }

    @Override
    public void memprediksi() {
        System.out.println("Melakukan prediksi");
    }
}
