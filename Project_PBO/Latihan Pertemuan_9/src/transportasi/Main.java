/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportasi;

/**
 *
 * @author GESIT
 */
public class Main {
    public static void main(String[] args) {
        kendaraan p;
        pesawat psw = new pesawat("Boeing 707", "Pesawat Komersial");
        mobil mbl1 = new mobil("Toyota Kijang", "Jeep");
        mobil mbl2 = new mobil("Suzuki Baleno", "Sedan");
        mobil mbl3 = new mobil("VW Combi");
        kapal kpl = new kapal("Queen Mary 2", "Kapal Pesiar");
        
        p = psw;
        p.informasi();
        p = mbl1;
        p.informasi();
        p = mbl2;
        p.informasi();
        p = mbl3;
        p.informasi();
        p = kpl;
        p.informasi();
    }
}
