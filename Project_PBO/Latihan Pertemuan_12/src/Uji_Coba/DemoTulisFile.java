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
public class DemoTulisFile {
    public static void main(String[] args) { 
        FileOutputStream foutput = null; 
        String data = " Nama : Anton Nurfendi  \n Nim : 20210801242  \n Fakultas : Ilmu Komputer \n Prodi : Teknik Informatika \n \n"; 
// membuka file 
        try { 
            foutput = new 
FileOutputStream("H:/Biodata Mahasiswa.txt"); 
        } catch (FileNotFoundException fnfe) { 
            System.out.println("File tidak dapat terbentuk."); 
            return; // keluar dari method 
        } 
// menulis data ke dalam file 
        try { 
            for (int i = 0; i < data.length(); i++) 
{ 
// data akan dikonversi per karakter 
                foutput.write((int) data.charAt(i)); 
            } 
        } catch (IOException ioe) { 
            System.out.println(ioe.getMessage()); 
            return; 
        } 
// menutup file 
try { foutput.close(); 
} catch (IOException ioe) { 
        } 
    } 
} 

