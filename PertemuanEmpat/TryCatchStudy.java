/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanEmpat;

/**
 *
 * @author RAMAJA
 */
public class TryCatchStudy {
    public static void main(String[] args) {
        try{
            int nilai [] = {99, 31, 66, 70, 1000};
            for(int i = 0; i<6; i++){
                System.out.println("Nilai ke-"+(i+1)+":"+nilai[i]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Perintah Anda salah karena "+e.getMessage());
        }
    }
}
