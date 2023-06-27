package LATIHAN_1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Human
 */
class Kotak {
    double panjang;
    double lebar;
    double tinggi;
    
}

public class DemoKotak1 {
public static void main (String[] args) {
        double volume;
        Kotak k = new Kotak();
        
        //mengisi nilai kedalam data kelas kotak//
        k.panjang = 4;
        k.lebar = 3;
        k.tinggi = 2;
        //menghitung isi volume kotak//
        volume = k.panjang * k.tinggi * k.lebar;
        //system out (printlin)//
        System.out.println("volume kotak " + volume);
    }
}