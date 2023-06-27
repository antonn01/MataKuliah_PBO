/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tes;

/**
 *
 * @author Human
 */
public class Coba {
    
    public static void main (String args[]) {
        int bil = 10;
        String b[] ={"a", "b", "c"};
        try {
            System.out.println(bil / 0);
            System.out.println(b[77]);
        } catch (ArithmeticException ai) {
            System.out.println("Error Aritmeetik");
            System.out.println(ai.getMessage());   
        }
        
        try {
            System.out.println(b[77]);
        } catch (ArrayIndexOutOfBoundsException n){
             System.out.println("Eror karena melebihi kapasitas array");
             System.out.println(n.getMessage());
        }
    }
    
}
