/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kedua;

/**
 *
 * @author Human
 */
import java.util.Scanner;
public class area {
    public static void CheckCoding() throws NumberFormatException {
        Scanner A = new Scanner(System.in);
        float area, panjang, lebar;
      
        System.out.println(" < Perhitungan untuk mencari Luas Area yang berbentuk Persegi Panjang >");
        System.out.println();
        System.out.print("Input Panjang dari Area : ");
        panjang = Float.parseFloat(A.next());
        System.out.print("Input Lebar dari Area : ");
        lebar = Float.parseFloat(A.next());
        
        area = panjang * lebar ;
        
         System.out.println("Hasil dari hasil perhitungan Area yang berbentuk persegi panjang: " +area);
        
        
        
    }
     public static void main(String[] args) {
        try{
            CheckCoding();
        }
        catch (NumberFormatException e){
            System.out.println("Program yang di jalankan EROR(Terjadi Kesalahan !");
            System.out.println(e.getMessage());
        }
    }
}
        
                
           
                

