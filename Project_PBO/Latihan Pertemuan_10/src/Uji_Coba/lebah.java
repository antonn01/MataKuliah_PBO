/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uji_Coba;

/**
 *
 * @author Human
 */

    public class lebah extends hewan {
    private String suara;
    private String berjalan;
    
    public lebah(String suara){
        super("lebah");
        this.suara = suara;
        suara = "Belum teridentifikasi";
    }
   
    public lebah(String suara, String berjalan){
        super("lebah");
        this.suara = suara;
        this.berjalan = berjalan;
    }
    
    public void informasi(){
        System.out.println("Suara lebah Berbunyi :" + suara);
        System.out.println("Cara Berjalan lebah  :" + berjalan);
        System.out.println("");
    }

}
    

