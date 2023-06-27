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
public class DemoInputString {
    public static void main(String[] args) throws 
            IOException { 
        System.out.print("Masukkan nama Anda: "); 
        String namaInput; 
        InputStreamReader isr = new 
InputStreamReader(System.in); 
        BufferedReader br = new 
BufferedReader(isr); 
        namaInput = br.readLine(); 
        System.out.println("Halo " + namaInput + "..."); 
        System.out.println("Semoga Anda Sukses Selalu.."); 
    
    }
}
