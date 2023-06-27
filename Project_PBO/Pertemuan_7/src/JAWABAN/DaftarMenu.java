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
public class DaftarMenu {
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Menu mn = new Menu();
        int pil;
        System.out.print("\n SELAMAT DATANG DI RESTAURANT DAPUR LARISA");
        System.out.println("\n DISINI MENYEDIAKAN ANEKA MENU ");
        System.out.print("\n 1. AYAM BAKAR ");
        System.out.print("\n 2. PECEL LELE ");
        System.out.print("\n 3. SEAFOOD (KERANG-KERANGAN, KEPITING,UDANG) SAUS PADANG ");
        System.out.print("\n 4. NASI GORENG AYAM ");
        System.out.print("\n 5. NASI GORENG SEAFOOD ");
        System.out.print("\n 6. MIE GORENG SPESIAL ");
        System.out.print("\n Pilih menu : ");
        pil = scan.nextInt();
        mn.Pilihan(pil);
    }
    
}
