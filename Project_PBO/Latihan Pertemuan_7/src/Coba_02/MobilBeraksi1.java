/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LATIHAN_2;

import LATIHAN_2.Mobil1;

/**
 *
 * @author Human
 */
public  class  MobilBeraksi1{
public  static  void  main(String[] args){
// Membuat object
Mobil1  mobilku = new Mobil1();
/* memanggil atribut  dan memberi nilai */
mobilku.warna = "Hitam";
mobilku.tahunProduksi = 2006;
System.out.println("Warna: " + mobilku.warna);
System.out.println("Tahun: " + mobilku.tahunProduksi);
}
}
