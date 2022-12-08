/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Sesi10;

/**
 *
 * @author Human
 */
public class Luas_Segitiga extends Bangun_Datar{
    private float hasil;
   Luas_Segitiga(float angka1X,float angka2X){
       super(angka1X,angka2X);
       hasil= 0.5f *angka1X*angka2X;
       
   }
   public void luas_S(){
       System.out.println("Hasil Luas Segitiga : "+ hasil);
       
   }
    
}
