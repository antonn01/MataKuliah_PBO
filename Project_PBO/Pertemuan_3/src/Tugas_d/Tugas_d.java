/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_d;

/**
 *
 * @author Human
 */
import java.util.Scanner;
public class Tugas_d {
     
    public static void main(String[] args) {
        System.out.println("Nama : Anton Nurfendi");
        System.out.println("Nim  : 20210801242");
        System.out.println(" ");
        System.out.println("Tugas Praktikum 3");
        System.out.println(" ");
        System.out.println("SELAMAT DATANG DI RESTAURANT LARISA \n DISINI MENYEDIAKAN ANEKA MENU");
        System.out.println("1. IGA BAKAR");
        System.out.println("2. SOP IGA");
        System.out.println("3. KEPITING SAUS PADANG");
        System.out.println("4. NASI SAYUR CAPCAY");
        System.out.println("5. NASI GORENG SEAFOOD");
        System.out.println("6. MIE GORENG ITALIA");
        System.out.println("");
        Scanner myObj1 = new Scanner(System.in);
        System.out .print("Pilih menu : ");
        int menu = myObj1.nextInt();
        System.out.println("");
        float harga_1 = 25000.0f;
        float harga_2 = 15000.0f;
        float harga_3 = 50000.0f;
        float harga_4 = 15000.0f;
        float harga_5 = 15000.0f;
        float harga_6 = 12000.0f;
        float PPN = 2500.0f;
        float pembayaran = 70000.0f;
        
        if(menu == 1){
            System.out.println("Jumlah Harga : Rp " + harga_1);
            System.out.println("");
            System.out.println("pajak : Rp " + PPN);
            System.out.println("");
            System.out.println("Total Harga : " + (harga_1 + PPN));
            System.out.println("");
            System.out.println("Total pembayaran : " + pembayaran);
            System.out.println("");
            System.out.println("Kembalian : " + (pembayaran - (harga_1 + PPN)));
        }
        else if(menu == 2){
            System.out.println("Jumlah Harga : Rp " + harga_2);
            System.out.println("");
            System.out.println("pajak : Rp " + PPN);
            System.out.println("");
            System.out.println("Total Harga : " + (harga_2 + PPN));
            System.out.println("");
            System.out.println("Total pembayaran : " + pembayaran);
            System.out.println("");
            System.out.println("Kembalian : " + (pembayaran - (harga_2 + PPN)));
        }
        else if(menu == 3){
            System.out.println("Jumlah Harga : Rp " + harga_3);
            System.out.println("");
            System.out.println("pajak : Rp " + PPN);
            System.out.println("");
            System.out.println("Total Harga : " + (harga_3 + PPN));
            System.out.println("");
            System.out.println("Total pembayaran : " + pembayaran);
            System.out.println("");
            System.out.println("Kembalian : " + (pembayaran - (harga_3 + PPN)));
        }
        else if(menu == 4){
            System.out.println("Jumlah Harga : Rp " + harga_4);
            System.out.println("");
            System.out.println("pajak : Rp " + PPN);
            System.out.println("");
            System.out.println("Total Harga : " + (harga_4 + PPN));
            System.out.println("");
            System.out.println("Total pembayaran : " + pembayaran);
            System.out.println("");
            System.out.println("Kembalian : " + (pembayaran - (harga_4 + PPN)));
        }
        else if(menu == 5){
            System.out.println("Jumlah Harga : Rp " + harga_5);
            System.out.println("");
            System.out.println("pajak : Rp " + PPN);
            System.out.println("");
            System.out.println("Total Harga : " + (harga_5 + PPN));
            System.out.println("");
            System.out.println("Total pembayaran : " + pembayaran);
            System.out.println("");
            System.out.println("Kembalian : " + (pembayaran - (harga_5 + PPN)));
        }
        else if(menu == 6){
            System.out.println("Jumlah Harga : Rp " + harga_6);
            System.out.println("");
            System.out.println("pajak : Rp " + PPN);
            System.out.println("");
            System.out.println("Total Harga : " + (harga_6 + PPN));
            System.out.println("");
            System.out.println("Total pembayaran : " + pembayaran);
            System.out.println("");
            System.out.println("Kembalian : " + (pembayaran - (harga_6 + PPN)));
        }
        else{
            System.out.println("menu tidak tersedia");
        }
    }
}
