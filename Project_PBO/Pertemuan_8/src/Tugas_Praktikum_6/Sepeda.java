/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Praktikum_6;

/**
 *
 * @author Human
 */
public class Sepeda extends Kendaraan_Darat {
    private String model;
    private String harga;
    
    Sepeda (String jenisX, String merekX, String warnaX, String mdlX, String hrgX)
    {
        super(jenisX, merekX, warnaX);
        model = mdlX;
        harga = hrgX;
    }        
    
    public void viewSepeda()
    {
        System.out.println("Model Sepeda : "+ model);
        System.out.println("Harga Sepeda : "+ harga);
        
    }

   
}
