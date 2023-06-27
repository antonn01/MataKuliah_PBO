package LATIHAN_3;


// pengaruh referensi objek (2)

public class Karyawan_4 {

public static void main(String[] args) {
/*Instansiasi 2 objek referensi yang mengacu pada 1 objek karyawan
*/
Karyawan Karyawan001 = new Karyawan();
Karyawan Karyawan002 = Karyawan001;
//mengisi data Objek Karyawan melalui objek referensi 1
Karyawan001.nama = "Mischella";
Karyawan001.divisi = "HRD";
//mencetak data object karyawan yang di acu 2 objek referensi
System.out.println("Data Karyawan001");
System.out.println("Nama    : " + Karyawan001.nama);
System.out.println("Divisi  : " + Karyawan001.divisi);
System.out.println("  ");
System.out.println("Data Karyawan002");
System.out.println("Nama    : " + Karyawan002.nama);
System.out.println("Divisi  : " + Karyawan002.divisi);
//memindahkan objek referensi ke-2 untuk mengacu objek baru
Karyawan002 = new Karyawan();
Karyawan002.nama="Yahya Al-Mahandis";
Karyawan002.divisi="Produksi";
//mencetak data objek setelah perubahan referensi
System.out.println(" ");
System.out.println("Setelah Perubahan Referensi");
System.out.println(" ");
System.out.println("Data Karyawan001");
System.out.println("Nama    : " + Karyawan001.nama);
System.out.println("Divisi  : " + Karyawan001.divisi);
System.out.println("  ");
System.out.println("Data Karyawan002");
System.out.println("Nama    : " + Karyawan002.nama);
System.out.println("Divisi  : " + Karyawan002.divisi);
}

    private static class Karyawan {

        private String nama;
        private String divisi;

        public Karyawan() {
        }
    }
}

