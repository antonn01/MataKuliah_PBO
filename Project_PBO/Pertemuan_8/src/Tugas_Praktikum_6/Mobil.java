/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Praktikum_6;

/**
 *
 * @author Human
 */
public class Mobil extends Kendaraan_Darat {
    private String nama; 
    private String harga;
     
    Mobil (String jenisX, String merekX, String warnaX, String namaX, String hrgX)
    {
        super(jenisX, merekX, warnaX);
        nama = namaX;
        harga = hrgX;
    }
    
    public void viewMobil()
    {
        System.out.println("Nama Mobil : "+ nama);
        System.out.println("Harga Mobil : "+ harga);
        System.out.println("");
    }
}
 