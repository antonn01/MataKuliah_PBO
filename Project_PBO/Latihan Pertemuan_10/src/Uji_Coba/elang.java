/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uji_Coba;

/**
 *
 * @author Human
 */

    public class elang extends hewan {
    private String suara;
    private String berjalan;
    
    public elang(String suara){
        super("elang");
        this.suara = suara;
        suara = "Belum teridentifikasi";
    }
   
    public elang(String suara, String berjalan){
        super("elang");
        this.suara = suara;
        this.berjalan = berjalan;
    }
    
    public void informasi(){
        System.out.println("Suara elang Berbunyi :" + suara);;
        System.out.println("Cara Berjalan elang  :" + berjalan);;
        System.out.println("");
    }

}
    
