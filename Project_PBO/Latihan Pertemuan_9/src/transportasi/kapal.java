/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportasi;

/**
 *
 * @author GESIT
 */
public class kapal extends kendaraan {
    private String nama;
    private String jenis;
    
    public kapal(String nama){
        super("Kapal");
        this.nama = nama;
        jenis = "Belum teridentifikasi";
    }
    
    public kapal(String nama, String jenis){
        super("Kapal");
        this.nama = nama;
        this.jenis = jenis;
    }
    
    public void informasi(){
        System.out.println("Nama kapal adalah " + nama);
        System.out.println("Jenis kapal adalah " + jenis);
    }

}
