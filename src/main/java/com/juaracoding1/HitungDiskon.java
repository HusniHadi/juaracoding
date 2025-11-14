package com.juaracoding1;

import java.util.Scanner;

public class HitungDiskon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double grandTotal;
        double diskon = 0;
        double hargaDiskon;
        double hargaSetelahDiskon;

        // Input total belanja
        System.out.print("Masukkan total belanja: ");
        grandTotal = input.nextDouble();

        // Pilih diskon
        System.out.println("Pilih diskon: 30 / 50 / 70");
        System.out.print("Masukkan diskon (%): ");
        int pilihanDiskon = input.nextInt();

        // Tentukan besar diskon
        if (pilihanDiskon == 30 || pilihanDiskon == 50 || pilihanDiskon == 70) {
            diskon = pilihanDiskon;
        } else {
            System.out.println("Pilihan diskon tidak valid. Diskon diatur ke 0%.");
        }

        // Hitung harga setelah diskon
        hargaDiskon = grandTotal * (diskon / 100);
        hargaSetelahDiskon = grandTotal - hargaDiskon;

        // Tampilkan hasil
        System.out.println("\nSummary");
        System.out.println("Harga before discount: " + grandTotal);
        System.out.println("Diskon: " + diskon + "%");
        System.out.println("Harga diskon: " + hargaDiskon);
        System.out.println("Harga after discount: " + hargaSetelahDiskon);

        input.close();
    }
}
