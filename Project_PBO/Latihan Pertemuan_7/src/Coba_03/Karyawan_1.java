package LATIHAN_3;


// instansiasi objek dan pengaksesan data pada objek.

public class Karyawan_1 {
public static void main(String[] args)
{
//membuat objek karyawan dengan nama Aurel
Karyawan_1 Aurel = new Karyawan_1();
//mengisi nilai kedalam data-data Objek Karyawan
Aurel.ID = "K001";
Aurel.divisi = "Aurel DIan";
Aurel.nama = "Marketing";
Aurel.gaji = "2500000";
//mencetak data-data object karyawan
System.out.println("Data KAryawan");
System.out.println("ID      : " + Aurel.ID);
System.out.println("Nama    : " + Aurel.nama);
System.out.println("Divisi  : " + Aurel.divisi);
System.out.println("Gaji    : " + Aurel.gaji);
}
    private String ID;
    private String divisi;
    private String nama;
    private String gaji;
}
    
    
