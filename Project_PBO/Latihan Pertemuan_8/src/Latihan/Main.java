/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author Human
 */
public class Main {
    
    public static void main(String[] args) {
        Rektor rek = new Rektor("A","01","T.Informatika",2001,1);
        Dekan  dek = new Dekan ("B","02","T.Informatika","Ilmu Komputer");
        Kalab  lab = new Kalab ("C","03","T.Informatika"," Ruangan 1");
        
        rek.view();
        rek.viewRektor();
        
        dek.view();
        dek.viewDekan();
        
        lab.view();
        lab.viewKalab();
       
    }
    
}
