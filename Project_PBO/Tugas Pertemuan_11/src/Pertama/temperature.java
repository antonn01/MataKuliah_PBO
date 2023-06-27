package Pertama;

import java.util.Scanner;
public class temperature {
    public static void CheckCoding() throws NumberFormatException {
        Scanner input = new Scanner(System.in);
        float suhu, hasil;
        int pil;
        
        System.out.println("Konversi Data");
        System.out.println();
        System.out.println("1. Dari Farenheit Ke Celcius");
        System.out.println("2. Dari Celcius Ke Farenheit");
        System.out.println();
        System.out.print("Pilih dan input salah satu :");
        pil = Integer.parseInt(input.next());
        
        if(pil == 1){
            System.out.println();
            System.out.print("Masukan Nilai dari Suhu : "); //print biasa
            suhu = Float.parseFloat(input.next());
            hasil = (suhu - 32.0f) * 5.0f / 9.0f;
            System.out.println(suhu + " F" + " is " + hasil + " C" );
        }
        else if(pil == 2){
            System.out.print("Masukan Nilai dari Suhu : "); //print biasa
            suhu = Float.parseFloat(input.next());
            hasil = (9.0f * suhu) / 5.0f + 32.0f;
            System.out.println(suhu + " C" + " is " + hasil + " F" );
        }
    }
    
    public static void main(String[] args) {
        try{
            CheckCoding();
        }
        catch (NumberFormatException e){
            System.out.println();
            System.out.println("Program yang di jalankan EROR !");
            System.out.println(e.getMessage());
        }
    }
}