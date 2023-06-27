/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_c;

/**
 *
 * @author Human
 */
import java.util.Scanner;
public class Tugas_c {
   
public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int bil;
        System.out.println("Tugas Praktikum 3");
        System.out.println("Nama : Anton Nurfendi");
        System.out.println("Nim  : 20210801242");
        System.out.println(" ");
        System.out.println("Program Menentukan Bilangan Genap Atau Ganjil");
        System.out.println("");
        System.out.print("Masukan Bilangan : ");
        bil=input.nextInt();
        
        if (bil%2==0){
            System.out.println("Bilangan "+bil+" adalah bilangan genap");
        }else {
             System.out.println("Bilangan "+bil+" adalah bilangan ganjil");
        }
    
  }
}
    

