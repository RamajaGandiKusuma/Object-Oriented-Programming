/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanEmpat;

import java.util.Scanner;

/**
 *
 * @author RAMAJA
 */
public class ThrowStudy {

    public static void pilihMatrixs(int matriks [][], int baris, int kolom ) throws ArrayIndexOutOfBoundsException {
           if(baris!=0||kolom!=0){
            int nilai=matriks[baris-1][kolom-1];
            System.out.println("Nilai: "+nilai);
           }else{
               throw new ArrayIndexOutOfBoundsException("BARIS DAN KOLOM YANG ANDA MASUKAN SALAH");
           }
            
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
          int matrx [][]={
              {2, 4, 6},
              {8, 10, 12},
              {14, 16, 18}
          };
        
        System.out.println("INI MATRIKS 3X3");
        System.out.println("Pilih baris ke: ");
        int a=input.nextInt();
        System.out.println("Pilih kolom ke: ");
        int b=input.nextInt();
        pilihMatrixs(matrx,a,b);
        
        
          
          
    }
}
