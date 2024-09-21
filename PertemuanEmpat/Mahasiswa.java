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
public class Mahasiswa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        InputData masukan = new InputData();
        HapusData hps = new HapusData();
        Read tampil = new Read();
        UpdateData ubah = new UpdateData();
        String a, b, c, d;

        System.out.println("Pilih Operasi: \n1. Menginput Data \n2. Menampilkan Data\n3. Hapus Data\n4. Mengubah Data Yang Telah Ada");
        System.out.println("Pilihan Anda: ");
        int e = input.nextInt();
        if (e == 1) {
            input.nextLine();
            System.out.println("Masukan NIM mahasiswa: ");
            a = input.nextLine();
            System.out.println("Masukan Nama Mahasiswa: ");
            b = input.nextLine();
            System.out.println("Masukan Program Studi Mahasiswa: ");
            c = input.nextLine();
            System.out.println("Masukan Fakultas Mahasiswa: ");
            d = input.nextLine();
            masukan.Input(a, b, c, d);
            main(args);
        } else if (e == 2) {
            tampil.tampilkan();
            main(args);
        } else if (e == 3) {
            input.nextLine();
            System.out.println("Masukan Pilihan Anda:\n1. Hapus Semua Data\n2. Hapus beberapa data");
            System.out.println("Pilihan Anda: ");
            e = input.nextInt();
            if (e == 1) {
                input.nextLine();
                hps.hapusSemua();
                main(args);
            } else if (e == 2) {
                input.nextLine();
                System.out.println("Masukan NIM Yang Ingin Anda Hapus: ");
                a = input.nextLine();
                hps.hapusSatuData(a);
                main(args);
            }
        } else if (e == 4) {
            System.out.println("Apakah Anda Ingin Merubah Data NIM?\n1. IYA\n2. TIDAK");
            System.out.println("Pilihan Anda: ");
            e = input.nextInt();
            if (e == 1) {
                input.nextLine();
                System.out.println("Masukan NIM Yang Ingin Anda Ubah: ");
                a = input.nextLine();
                System.out.println("Masukan NIM Yang Baru: ");
                b = input.nextLine();
                ubah.updateNIM(b, a);
                main(args);
            } else if (e == 2) {
                input.nextLine();
                System.out.println("Apakah Anda Ingin Merubah Data Nama?\n1. IYA\n2. TIDAK");
                System.out.println("Pilihan Anda: ");
                e = input.nextInt();
                if (e == 1) {
                    input.nextLine();
                    System.out.println("Masukan NIM Yang Ingin Anda Ubah: ");
                    a = input.nextLine();
                    System.out.println("Masukan Nama Yang Baru: ");
                    b = input.nextLine();
                    ubah.updateNama(b, a);
                    main(args);
                } else if (e == 2) {
                    input.nextLine();
                    System.out.println("Apakah Anda Ingin Merubah Data Fakultas?\n1. IYA\n2. TIDAK");
                    System.out.println("Pilihan Anda: ");
                    e = input.nextInt();
                    if (e == 1) {
                        input.nextLine();
                        System.out.println("Masukan NIM Yang Ingin Anda Ubah: ");
                        a = input.nextLine();
                        System.out.println("Masukan Fakultas Yang Baru: ");
                        b = input.nextLine();
                        ubah.updateFakultas(b, a);
                        main(args);
                    } else if (e == 2) {
                        input.nextLine();
                        System.out.println("Apakah Anda Ingin Merubah Data Prodi?\n1. IYA\n2. TIDAK");
                        System.out.println("Pilihan Anda: ");
                        e = input.nextInt();
                        if (e == 1) {
                            input.nextLine();
                            System.out.println("Masukan NIM Yang Ingin Anda Ubah: ");
                            a = input.nextLine();
                            System.out.println("Masukan Prodi Yang Baru: ");
                            b = input.nextLine();
                            ubah.updateProdi(b, a);
                            main(args);
                        } else if (e == 2) {
                            System.out.println("Terima Kasih");
                        }
                    }
                }
            }
        }
    }
}
