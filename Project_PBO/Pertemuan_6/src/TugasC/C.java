/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasC;

/**
 *
 * @author Human
 */
import javax.swing.JOptionPane;
public class C {
    
    public static void main(String[] args) {
        String data_n = JOptionPane.showInputDialog("Masukan BIlangan = ");
        int N = Integer.parseInt(data_n);
        for(int i = 1; i <= N; i ++){
            if (i < 9){
                System.out.println(i);
            }
            else if(i > 9){
                System.out.print(i + " ");
            }
        }
    }
}
