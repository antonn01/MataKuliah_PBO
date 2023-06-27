/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_b;

/**
 *
 * @author Human
 */
import java.util.Scanner;
public class Tugas_b {    
  
public static void main(String[]args)
{
   
    
    int bilangan;
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Tugas Praktikum 3");
    System.out.println("Nama : Anton Nurfendi");
    System.out.println("Nim  : 20210801242");
    System.out.println(" ");
    System.out.println("Program Pengecekan  Bilangan Positif,Negative atau Nol"); 
    System.out.println(""); 
    System.out.println("Masukkan Bilangan : ");
    bilangan=sc.nextInt();
    if (bilangan<0){
        System.out.println("bilangan " +bilangan+ " adalah bilangan negatif");
    }
    if (bilangan>0){
        System.out.println("bilangan " +bilangan+ " adalah bilangan positif");
    }
    if (bilangan==0){
        System.out.println("bilangan " +bilangan+ " adalah bukan positif atau negatif");
    }
  }
}


