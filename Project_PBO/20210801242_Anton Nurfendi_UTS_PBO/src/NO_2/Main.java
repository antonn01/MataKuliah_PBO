/* Nama : Anton Nurfendi
 * Nim : 20210801242
 * Fakultas : Ilmu Komputer
 * Prodi : Teknik Informatika
 */
package NO_2;
import java.util.Scanner;

class BangunRuang {
    private double panjang, lebar, tinggi;
    private double alas, tinggiSegitiga, tinggiPrisma;
    private double sisi;
    private double volume;
    private double luasPermukaan;
    private int pilihan;
    
    void menuOperasi() {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Balok");
        System.out.println("2. Kubus");
        System.out.println("3. PrismaSegitiga");
        System.out.println("4. Keluar");
        System.out.print("Masukkan pilihan anda: ");
        pilihan = input.nextInt();
        switch (pilihan) {
            case 1: {
                Balok balok = new Balok();
                balok.input();
                balok.hitung();
                balok.output();
                break;
            }
            case 2: {
                Kubus kubus = new Kubus();
                kubus.input();
                kubus.hitung();
                kubus.output();
                break;
            }
            case 3: {
                PrismaSegitiga prismaSegitiga = new PrismaSegitiga();
                prismaSegitiga.input();
                prismaSegitiga.hitung();
                prismaSegitiga.output();
                break;
            }
            case 4: {
                System.exit(0);
            }
        
        }
        menuOperasi();
    }
    
    public double getPanjang() {  
        return panjang;
    }

    public void setPanjang(int panjang) { 
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public double getTinggiSegitiga() {
        return tinggiSegitiga;
    }

    public void setTinggiSegitiga(int tinggiSegitiga) {
        this.tinggiSegitiga = tinggiSegitiga;
    }

    public double getTinggiPrisma() {
        return tinggiPrisma;
    }

    public void setTinggiPrisma(int tinggiPrisma) {
        this.tinggiPrisma = tinggiPrisma;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getLuasPermukaan() {
        return luasPermukaan;
    }

    public void setLuasPermukaan(int luasPermukaan) {
        this.luasPermukaan = luasPermukaan;
    }

    public double getPilihan() {
        return pilihan;
    }

    public void setPilihan(int pilihan) {
        this.pilihan = pilihan;
    }

}

class Balok extends BangunRuang {
    void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan panjang: ");
        setPanjang(input.nextInt());
        System.out.println("Masukkan lebar: ");
        setLebar(input.nextInt());
        System.out.println("Masukkan tinggi: ");
        setTinggi(input.nextInt());
    }
    
    void hitung() {
        setVolume((int) (getPanjang() * getLebar() * getTinggi()));
        setLuasPermukaan((int) (2 * (getPanjang() * getLebar() + getPanjang() * getTinggi() + getLebar() * getTinggi())));
    }
    
    void output() {
        System.out.println("Volume Balok: " + getVolume());
        System.out.println("Luas Permukaan Balok: " + getLuasPermukaan());
    }
}

class Kubus extends BangunRuang {
    void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan sisi: ");
        setSisi(input.nextInt());
    }
    
    void hitung() {
        setVolume((int) (getSisi() * getSisi() * getSisi()));
        setLuasPermukaan((int) (6 * (getSisi() * getSisi())));
    }
    
    void output() {
        System.out.println("Volume Kubus: " + getVolume());
        System.out.println("Luas Permukaan Kubus: " + getLuasPermukaan());
    }
}

class PrismaSegitiga extends BangunRuang {
    void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan alas: ");
        setAlas(input.nextInt());
        System.out.println("Masukkan tinggi segitiga: ");
        setTinggiSegitiga(input.nextInt());
        System.out.println("Masukkan tinggi prisma: ");
        setTinggiPrisma(input.nextInt());
    }
    
    void hitung() {
        setVolume((int) (getAlas() * getTinggiSegitiga() * getTinggiPrisma() / 2));
        setLuasPermukaan((int) (getAlas() * getTinggiSegitiga() + 2 * (getAlas() * getTinggiPrisma() / 2)));
    }
    
    void output() {
        System.out.println("Volume Prisma Segitiga: " + getVolume());
        System.out.println("Luas Permukaan Prisma Segitiga: " + getLuasPermukaan());
    }
}

public class Main {
    public static void main(String[] args) {
        BangunRuang bangunRuang = new BangunRuang();
        bangunRuang.menuOperasi();
    }
}