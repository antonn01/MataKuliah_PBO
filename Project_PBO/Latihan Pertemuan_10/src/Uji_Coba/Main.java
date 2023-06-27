/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uji_Coba;

/**
 *
 * @author Human
 */
public class Main {
     public static void main(String[] args) {
        hewan p;
        singa S = new singa(" rawr ", " menggunakan ke 4 kaki");
        elang E = new elang(" aawww ", " menggunakann 2 kaki dan 2 sayap");
        lebah L = new lebah(" ngengg ", " mengunnakann 6 kaki dan 2 sayap");
        paus  P = new paus(" auuuuu ", " menggunakann sirip dan ekornya");
        
        p = S;
        p.informasi();
        p = E;
        p.informasi();
        p = L;
        p.informasi();
        p = P;
        p.informasi();
        
    }

}