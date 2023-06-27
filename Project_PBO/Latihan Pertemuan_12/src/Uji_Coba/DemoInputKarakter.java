/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uji_Coba;

/**
 *
 * @author Human
 */
import java.io.*; 
public class DemoInputKarakter {
    public static void main(String[] args) throws 
            IOException { 
        System.out.print("Masukkan sebuah karakter: "); 
        char KarakterInput; 
        InputStreamReader isr = new 
InputStreamReader(System.in); 
        BufferedReader br = new 
BufferedReader(isr); 
        KarakterInput = (char) br.read(); 
        System.out.println("Karakter yang dimasukkan adalah \'" + KarakterInput + "\'"); 
    } 
} 

    

