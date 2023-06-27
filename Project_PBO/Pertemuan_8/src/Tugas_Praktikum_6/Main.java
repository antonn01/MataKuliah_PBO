/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Praktikum_6;

/**
 *
 * @author Human
 */
public class Main {
    
     public static void main(String[] args) {
        Motor  Mot = new Motor("Roda Dua","Yamaha","Hitam",2019,100);
        Mobil  Mob = new Mobil("Roda Empat","Toyota","Putih","Avanza","250 Juta");
        Sepeda Spd = new Sepeda("Roda Dua","Pacific Foster 5.0","Hitam Kombinasi Putih"," Sepeda Gunung Trail","5 Juta");
        
        Mot.view();
        Mot.viewMotor();
        
        Mob.view();
        Mob.viewMobil();
        
        Spd.view();
        Spd.viewSepeda();
       
    }
    
}
