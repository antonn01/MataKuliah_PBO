/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JAWABAN;

import java.util.Scanner;

/**
 *
 * @author Human
 */
public class Menu {
    
    Scanner scan = new Scanner(System.in);
    Bahan bhn = new Bahan();
    
    double PPN, totalharga, totalbayar, kembalian;
    void Pilihan(int pil){ 
       
        switch(pil) {
            case 1:
            bhn.namaProduk = "AYAM BAKAR ";
            bhn.harga = 25000;
            break;

            case 2:
            bhn.namaProduk = "PECEL LELE ";
            bhn.harga = 18000;
            break;

            case 3:
            bhn.namaProduk = "SEAFOOD (KERANG-KERANGAN, KEPITING, UDANG)SAUS PADANG ";
            bhn.harga = 80000;
            break;

            case 4:
            bhn.namaProduk = "NASI GORENG AYAM ";
            bhn.harga = 20000;
            break;

            case 5:
            bhn.namaProduk = "NASI GORENG SEAFOOD ";
            bhn.harga = 28000;
            break;

            case 6:
            bhn.namaProduk = "MIE GORENG SPESIAL ";
            bhn.harga = 30000;
            break;
            default:
            System.out.println("Maaf, pilihan tidak tersedia");
        }
       
        PPN = bhn.harga*0.10;
        totalharga = bhn.harga + PPN;
        System.out.println("\nJumlah Harga : Rp " + bhn.harga);
        System.out.println("\nPPN : Rp " + PPN);
        System.out.println("\nTotal Harga : Rp " + totalharga);
        System.out.print("\nTotal Bayar : Rp ");
        totalbayar = scan.nextInt();
        kembalian = totalbayar - totalharga;
        System.out.println("\nKembalian : Rp " + kembalian);
        
    }

   
    
}
