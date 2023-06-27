/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasB;

import javax.swing.JOptionPane;

/**
 *
 * @author Human
 */
public class B {
    public static void main(String[] args) {
    
    String data_N = JOptionPane.showInputDialog("Masukan jumlah angka = ");
        int N = Integer.parseInt(data_N);
        
        int angkaGanjil;
        int hasilGanjil = 0;
        int angkaGenap;
        int hasilGenap = 0;
        
        //Menampilkan ganjil
        for(int i=0; i<N; i++){
            angkaGanjil = i + 1;
            
            if(angkaGanjil % 2 != 0){
                System.out.print(" " + angkaGanjil);
                hasilGanjil += angkaGanjil;
            }   
        }
        System.out.print(" = " + hasilGanjil);
        
        System.out.println("");
        
        //Menampilkan genap
        for(int i=0; i<N; i++){
            angkaGenap = i + 1;
            
            if(angkaGenap % 2 == 0){
                System.out.print(" " + angkaGenap);
                hasilGenap += angkaGenap;
            }   
        }
        System.out.print(" = " + hasilGenap);
        
        System.out.println("");
    }
    
}
