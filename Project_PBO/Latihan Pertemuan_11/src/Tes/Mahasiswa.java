/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tes;

/**
 *
 * @author Human
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    public void setNIM(String inputNIM) {

        try {
            nim = inputNIM;
            if (inputNIM == null) {
                throw new NullPointerException();
}
        } 
        catch (NullPointerException npe) {
            System.out.println("KESALAHAN: "
                    + "NIM tidak boleh null");
}
    }public String getNIM() {
        return nim;
    }
    
    public void setNama(String inputNama) {
        try {
            nama = inputNama;
            if (nama == null) {
                throw new NullPointerException();
            }
        } catch (NullPointerException npe)
        {
            System.out.println("KESALAHAN: " + "Nama Mahasiswa tidak boleh null");
}
}
public String getNama() {
return nama;
}
}
class DemoThrow {
public static void main(String[] args) {
Mahasiswa mhs = new Mahasiswa();
mhs.setNIM(null);
mhs.setNama("Nadilla");
System.out.println("\nNIM : " + mhs.getNIM());
System.out.println("Nama : " + mhs.getNama());
}
}


