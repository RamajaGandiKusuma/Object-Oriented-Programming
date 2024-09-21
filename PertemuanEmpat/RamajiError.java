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
public class RamajiError extends ArrayIndexOutOfBoundsException {

    public RamajiError(String s) {
        super(s);
    }

    public static void pilihMatrixs(int matriks[][], int baris, int kolom) throws RamajiError {
        try {
            int nilai = matriks[baris - 1][kolom - 1];
            System.out.println("Nilai: " + nilai);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RamajiError("Ada yang salah abangku");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matrx[][] = {
            {2, 4, 6},
            {8, 10, 12},
            {14, 16, 18}
        };

        System.out.println("INI MATRIKS 3X3");
        System.out.println("Pilih baris ke: ");
        int a = input.nextInt();
        System.out.println("Pilih kolom ke: ");
        int b = input.nextInt();

        try {
            pilihMatrixs(matrx, a, b);
        } catch (RamajiError e) {
            System.out.println(e.getMessage());
        }
    }
}