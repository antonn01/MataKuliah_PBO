/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tes;

/**
 *
 * @author Human
 */
public class PembagianNol2 {
     public static void main(String[] args) {
         int x = 6, y = 2;
      try {
          System.out.println(x + " / " + y + " = " + (x / y));
          
          y = 0;//Ubah menjadi nol
          System.out.println(x + " / " + y + " = " + (x / y));
          
      }
       catch (Exception e){
           System.out.println("Terjadi pembagin dengan nol");
       }
           System.out.println("Finish !");
     }
    
}
