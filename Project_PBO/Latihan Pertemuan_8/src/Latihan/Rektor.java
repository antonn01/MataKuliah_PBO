/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author Human
 */
public class Rektor extends Dosen {
    private int th_mulai;
    private int jabatan_ke;
    
    //inisialisasi
    Rektor (String namaX, String nikX, String jurX, int thX, int keX )
    {
        super(namaX, nikX, jurX);
        th_mulai = thX;
        jabatan_ke = keX;
    }    

    
    //Menampilkan informasi
    public void viewRektor()
    
    {
        System.out.println("Th mulai jabatan: "+ th_mulai);
        System.out.println("Jabatan rektor ke- : "+ jabatan_ke);
    }
}
