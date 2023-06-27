/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_a;

/**
 *
 * @author Human
 */
import java.util.Scanner;
public class Tugas_a {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
  System.out.println("Tugas Praktikum 3");
  System.out.println("Nama : Anton Nurfendi");
  System.out.println("Nim  : 20210801242");
  System.out.println(" ");
  System.out.println("Program Konversi Nilai Ke Huruf Mahasiswa");
  System.out.println(""); 
  System.out.println("Masukkan Sebuah Nilai = ");
  int a = x.nextInt();
  if (a>=85&&a<=100){
   System.out.println("Nilai Anda A");
  }
  else if (a>=70&&a<=84){
   System.out.println("Nilai Anda B");
  }
  else if (a>=60&&a<=70){
   System.out.println("Nilai Anda C");
  }
  else if (a>=50&&a<=60){
   System.out.println("Nilai Anda D");
  }
  else {
   System.out.println("Nilai Anda E");
  }
    }
}
    

