/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanKedua;

/**
 *
 * @author RAMAJA
 */
public class IlmuFormalMurni extends IlmuFormal implements PengembanganTeori, StudiGeometri{
    public IlmuFormalMurni (){
        super.bidangFormal();
        this.bidangFormal();
    }
    
    public void bidangFormal(){
        this.mengkajiSifatRuang();
        this.penelaahanLiteratur();
        this.pengkomunikasianTemuan();
        this.pengujianTeori();
    }

    @Override
    public void penelaahanLiteratur() {
        System.out.println("Melakukan Penelaahan Literatur");
    }

    @Override
    public void pengujianTeori() {
        System.out.println("Melakukan Pengujian Teori");
    }

    @Override
    public void pengkomunikasianTemuan() {
        System.out.println("Melakukan Pengkomunikasian Temuan");
    }

    @Override
    public void mengkajiSifatRuang() {
        System.out.println("Melakukan Pengkajian Sifat - Sifat Ruang");
    }
    

}
