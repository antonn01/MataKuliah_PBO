package LATIHAN_1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Human
 */
class Kotak2 {
            double panjang;
            double lebar;
            double tinggi;
        }
public class DemoKotak2 {
public static void main(String[] args) {
        
        double volume1, volume2;
        Kotak2 k1 = new Kotak2();
        Kotak2 k2 = new Kotak2();
        
        //Mengisikan nilai kedalam data-data kelas kotak
        k1.panjang = 10;
        k1.lebar = 10;
        k1.tinggi = 1;
        
        k2.panjang = 10;
        k2.lebar = 10;
        k2.tinggi = 2;
        
        //Menghitung isi/volume kotak
        volume1 = k1.panjang * k1.tinggi * k1.lebar;
        
        volume2 = k2.panjang * k2.tinggi * k2.lebar;
        
         //menampilkan nilai volume ke layar monitor
        System.out.println("Volume K1 = " + volume1);
        System.out.println("Volume K2 = " + volume2);
    }
}