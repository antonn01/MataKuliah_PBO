/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uji_Coba;

/**
 *
 * @author Human
 */
public class paus extends hewan {
    private String suara;
    private String berjalan;
    
    public paus(String suara){
        super("paus");
        this.suara = suara;
        suara = "Belum teridentifikasi";
    }
   
    public paus(String suara, String berjalan){
        super("paus");
        this.suara = suara;
        this.berjalan = berjalan;
    }
    
    public void informasi(){
        System.out.println("Suara Paus Berbunyi  :" + suara);
        System.out.println("Cara Berjalan Paus   :" + berjalan);
        System.out.println("");
    } 

}
