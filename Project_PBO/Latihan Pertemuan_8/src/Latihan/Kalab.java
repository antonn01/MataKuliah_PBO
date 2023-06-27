/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author Human
 */
public class Kalab extends Dosen {
    private String laboratorium;
     
    Kalab (String namaX, String nikX, String jurX, String labX)
    {
       super(namaX, nikX, jurX);
       laboratorium = labX; 
    }
     
    public void viewKalab()
    {
        System.out.println("Laboratorium : " + laboratorium);
    }         
    
}
