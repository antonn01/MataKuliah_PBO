/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author Human
 */
public class Dosen {
   protected String nama;
   protected String nik;
   protected String jurusan;
   
   ///Membuat konstruktor
   Dosen (String namaX, String nikX, String jurX)
   {
       nama = namaX;
       nik  = nikX;
       jurusan = jurX;
   }
   
   //Menampilkan informasi
   public void view()
   {
       System.out.println("Nama : "+ nama);
       System.out.println("Nik : "+ nik);
       System.out.println("Jurusan : "+ jurusan);
   }
}
