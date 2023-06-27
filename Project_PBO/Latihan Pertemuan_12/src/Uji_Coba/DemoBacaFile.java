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
public class DemoBacaFile {
  
    public static void main(String[] args) { 
        FileInputStream finput = null; 
        int data; 
// membuka file 
 try { 
            finput = new 
FileInputStream("H:/Biodata Mahasiswa.txt "); 
 
        } catch (FileNotFoundException fnfe) { 
            System.out.println("File tidak ditemukan."); 
            return; // keluar dari method 
        } 
// membaca data dari dalam file 
// dan menampilkan hasilnya ke layar console 
        try { 
            while ((data = finput.read()) != -1) { 
// ketika ditampilkan, data dikonversi ke tipe char 
                System.out.print((char) data); 
            } 
        } catch (IOException ioe) { 
            System.out.println(ioe.getMessage()); 
            return; 
        } 
// menutup file 
        try { 
            finput.close(); 
        } catch (IOException ioe) { 
        } 
    } 
} 

