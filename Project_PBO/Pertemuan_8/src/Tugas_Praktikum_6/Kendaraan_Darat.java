/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Praktikum_6;

/**
 *
 * @author Human
 */
public class Kendaraan_Darat {
    protected String jenis;
    protected String merek;
    protected String warna;
    
    Kendaraan_Darat(String jenisX, String merekX, String warnaX)
    {
        jenis = jenisX;
        merek = merekX;
        warna = warnaX;
    }
    
     public void view()
     {
         System.out.println("Jenis Kendaraan: "+ jenis);
         System.out.println("Merek kendaraan: "+ merek);
         System.out.println("Warna kendaraan: "+ warna);
     }
}
