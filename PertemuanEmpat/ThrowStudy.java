/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanEmpat;

/**
 *
 * @author RAMAJA
 */
public class ThrowStudy {
    
    public int nilai(int a) throws ArithmeticException {
        if(a<=75){
            throw new ArithmeticException("Anda Tidak Lulus");
        }else{
            System.out.println("Anda Lulus");
        }
        return a;
    }
    
    public static void main(String[] args) {
        ThrowStudy thr = new ThrowStudy();
        thr.nilai(97);
    }
}
