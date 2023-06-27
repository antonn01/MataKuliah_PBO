/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author Human
 */
public class Dekan extends Dosen {
    private String fakultas;
    
    Dekan (String namaX, String nikX, String jurX, String fakX)
    {
         super(namaX, nikX, jurX);
         fakultas = fakX;
    }
    
    public void viewDekan()
    {
        System.out.println("Fakultas : "+ fakultas);
    }
}

