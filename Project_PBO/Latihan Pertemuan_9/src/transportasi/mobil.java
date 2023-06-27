/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportasi;

/**
 *
 * @author GESIT
 */
public class mobil extends kendaraan {
    private String nama;
    private String jenis;
    
    public mobil(String nama){
        super("Mobil");
        this.nama = nama;
        jenis = "Belum teridentifikasi";
    }
    
    public mobil(String nama, String jenis){
        super("Mobil");
        this.nama = nama;
        this.jenis = jenis;
    }
    
    public void informasi(){
        System.out.println("Nama mobil adalah " + nama);
        System.out.println("Jenis mobil adalah " + jenis);
    }
}
