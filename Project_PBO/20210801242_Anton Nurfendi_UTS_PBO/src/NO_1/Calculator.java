/* Nama : Anton Nurfendi
 * Nim : 20210801242
 * Fakultas : Ilmu Komputer
 * Prodi : Teknik Informatika
 */
package NO_1;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Calculator {
    DecimalFormat format = new DecimalFormat("0.#");

    private double input1;
    private double input2;
    private int pilihan;

    

    public double getInput1() {
        return input1;
    }

    public double getInput2() {
        return input2;
    }

    public void menuOperasi() {
        
        int pilihan;
        boolean pilih =true ; 

        while (pilih == true) {
            Scanner myObj = new Scanner(System.in);
            System.out.println("<===== OPERASI =====>");
            System.out.println("1.  Pertambahan");
            System.out.println("2.  Pengurangan");
            System.out.println("3.  Perkalian");
            System.out.println("4.  Modulus");
            System.out.println("0.  Exit");
            System.out.print("Pilihan : ");
            pilihan = myObj.nextInt();
            
            if(pilihan == 1){
                System.out.print(format.format(getInput1()) + " + " + format.format(getInput2())+ " = " + format.format(pertambahan()));
                System.out.println();
            }
            else if(pilihan == 2){
                System.out.print(format.format(getInput1()) + " - " + format.format(getInput2())+ " = " + format.format(pengurangan()));
                System.out.println();
            }
            else if(pilihan == 3){
                System.out.print(format.format(getInput1()) + " x " + format.format(getInput2())+ " = " + format.format(perkalian()));
                System.out.println();
            }
            else if(pilihan == 4){
                System.out.print(format.format(getInput1()) + " % " + format.format(getInput2())+ " = " + format.format(modulus()));
                System.out.println();
            }    
            else { 
                
                   pilih = false ; 
            
            }
        }
    }

    public Calculator(double input1, double input2) {
        this.input1 = input1;
        this.input2 = input2;
    }

    double pertambahan() {
        return input1 + input2;
    }

    double pengurangan() {
        return input1 - input2;
    }

    double perkalian() {
        return input1 * input2;
    }

    double modulus() {
        return input1 % input2;
    }

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.print("Masukan Angka Pertama 1: ");
        double angka1 = myObj.nextDouble();
        System.out.print("Masukan Angka Kedua 2: ");
        double angka2 = myObj.nextDouble();

        Calculator calculator = new Calculator(angka1, angka2);
        calculator.menuOperasi();
    }
}