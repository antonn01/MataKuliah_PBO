/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Praktikum_6;

/**
 *
 * @author Human
 */
public class Motor extends Kendaraan_Darat {
    private int Tahun_Pro;
    private int Kode_Pro;
    
    Motor (String jenisX, String merekX, String warnaX, int thpX, int kdpX)
    {
        super(jenisX, merekX, warnaX);
        Tahun_Pro = thpX;
        Kode_Pro = kdpX;
    }       
     
    public void viewMotor()
    
    {
        System.out.println("Tahun Produksi : "+ Tahun_Pro);
        System.out.println("Kode Produksi : "+ Kode_Pro);
        System.out.println("");
    }
}
