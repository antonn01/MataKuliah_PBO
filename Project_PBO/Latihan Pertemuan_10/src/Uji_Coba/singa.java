/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uji_Coba;

/**
 *
 * @author Human
 */
    public class singa extends hewan {
    private String suara;
    private String berjalan;
    
    public singa(String suara){
        super("singa");
        this.suara = suara;
        suara = "Belum teridentifikasi";
    }
   
    public singa(String suara, String berjalan){
        super("singa");
        this.suara = suara;
        this.berjalan = berjalan;
    }
    
    public void informasi(){
        System.out.println("Suara Singa Berbunyi :" + suara);
        System.out.println("Cara Berjalan Singa  :" + berjalan);
        System.out.println("");
    }

}

