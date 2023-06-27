package LATIHAN_3;


// instansiasilebih dari satu objek dari satu kelasyang sama

public class Karyawan_2 {

public static void main(String[] args) {
//membuat objek karyawan dengan nama Aurel
Karyawan Aurel = new Karyawan();
//membuat objek karyawan dengan nama Dhennis
Karyawan Dhennis = new Karyawan();
//mengisi nilai kedalam data-data Objek Karyawan2
Aurel.ID = "K001";
Aurel.nama = "Marketing";
Aurel.divisi = "Aurel Dian";
Aurel.gaji = "2500000";
//mengisi nilai kedalam data-data Objek Karyawan2
Dhennis.ID = "K002";
Dhennis.nama = "Keuangan";
Dhennis.divisi = "Muhamad Dhennis";
Dhennis.gaji = "2250000";
//mencetak data-data object karyawan ke-1
System.out.println("ID      : " + Aurel.ID);
System.out.println("Nama    : " + Aurel.nama);
System.out.println("Divisi  : " + Aurel.divisi);
System.out.println("Gaji    : " + Aurel.gaji);
//mencetak data-data object karyawan ke-2
System.out.println("ID      : " + Dhennis.ID);
System.out.println("Nama    : " + Dhennis.nama);
System.out.println("Divisi  : " + Dhennis.divisi);
System.out.println("Gaji    : " + Dhennis.gaji);
}

    private static class Karyawan {

        private String ID;
        private String nama;
        private String divisi;
        private String gaji;

        public Karyawan() {
        }
    }
}

    

