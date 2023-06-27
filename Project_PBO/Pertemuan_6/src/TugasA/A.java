/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasA;

/**
 *
 * @author Human
 */
import javax.swing.JOptionPane;
public class A {
    
    public static void main(String[] args) {
    
    String data_n = JOptionPane.showInputDialog("Masukan BIlangan = ");
        int N = Integer.parseInt(data_n);
    for (int i = N; i >= 16 ; i--) {
      System.out.print(i+" ");
    }  
     for (int i = 1; i <= 15 ; i++) {
      System.out.print(i+" ");   
  
     }
    }
     
}