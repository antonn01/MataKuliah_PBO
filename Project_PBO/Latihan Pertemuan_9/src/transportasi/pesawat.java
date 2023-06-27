/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportasi;

/**
 *
 * @author GESIT
 */
public class pesawat extends kendaraan {
    private String nama;
    private String jenis;
    
    public pesawat(String nama){
        super("Pesawat ");
        this.nama = nama;
        jenis = "Belum teridentifikasi";
    }
    
    public pesawat(String nama, String jenis){
        super("Pesawat");
        this.nama = nama;
        this.jenis = jenis;
    }
    
    public void informasi(){
        System.out.println("Nama pesawat adalah " + nama);
        System.out.println("Jenis pesawat adalah " + jenis);
    }
}
