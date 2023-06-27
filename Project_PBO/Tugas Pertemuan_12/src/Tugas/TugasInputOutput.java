/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author USER
 */
import java.util.Scanner;
import java.io.*;
public class TugasInputOutput {
    
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String tempatFile = null;
        String namaFile = null;
        String namaFileBaru = null;
        String fileData = null;

        File direktoriFile = null;
        File fileLama = null;
        File fileBaru = null;
        File hapusFile = null;
        FileInputStream finput = null;
        int data;
        FileOutputStream foutput = null;

        boolean loop = true;
        while (loop == true) {
            System.out.println();
            System.out.println("|>>>>>>>> MENU <<<<<<<<|");
            System.out.println("1.  Buat file dengan dua ekstensi .txt dan .dat");
            System.out.println("2.  Mengecek file dalam direktory tertentu");
            System.out.println("3.  Mengisi file");
            System.out.println("4.  Menampilkan isi file");
            System.out.println("5.  Mengubah nama file");
            System.out.println("6.  Menghapus file");
            System.out.println("99.  Keluar");
            System.out.print("Pilih opsi: ");
            int opsi = input.nextInt();

            switch (opsi) {
                case 1:

                    //MEMBUAT FILE DENGAN DUA EKSTENSI TXT DAN DAT==============
                    System.out.print("Masukan direktori: ");
                    input.nextLine(); //agar dapat menggunakan next line lagi
                    tempatFile = input.nextLine();

                    direktoriFile = new File(tempatFile);

                    if (direktoriFile.exists()) {
                        System.out.print("Masukan nama file: ");
                        namaFile = input.nextLine();

                        File fileTxt = new File(tempatFile, namaFile + ".txt");
                        File fileDat = new File(tempatFile, namaFile + ".dat");

                        try {
                            fileTxt.createNewFile();
                            fileDat.createNewFile();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    } else {
                        System.out.println("Direktori tidak ada");
                    }

                    break;
                //==========================================================
                case 2:

                    //MENGECEK FILE DALAM DIREKTORI=============================
                    System.out.print("Masukan direktori: ");
                    input.nextLine(); //agar dapat menggunakan next line lagi
                    tempatFile = input.nextLine();

                    direktoriFile = new File(tempatFile);
                    if (direktoriFile.exists()) {
                        String[] files = direktoriFile.list();

                        if (files.length == 0) {
                            System.out.println("Direktori tersebut kosong");
                        } else {
                            for (String file : files) {
                                System.out.println("<> " + file);
                            }
                        }

                    } else {
                        System.out.println("Direktori tidak ada");
                    }

                    break;
                //==============================================================
                case 3:
                    //MEMNGISI FILE DALAM DIREKTORI=============================
                    System.out.print("Masukan direktori: ");
                    input.nextLine(); //agar dapat menggunakan next line lagi
                    tempatFile = input.nextLine();

                    direktoriFile = new File(tempatFile);
                    if (direktoriFile.exists()) {

                        System.out.print("Nama file beserta formatnya: ");
                        namaFile = input.nextLine();

                        File file = new File(direktoriFile + "/" + namaFile);

                        if (file.exists()) {

                            try {
                                foutput = new FileOutputStream(direktoriFile + "/" + namaFile);
                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                                return;
                            }
                            System.out.print("Isi File : ");
                            fileData = input.nextLine();

                            try {
                                for (int i = 0; i < fileData.length(); i++) {
                                    foutput.write((int) fileData.charAt(i));
                                }
                            } catch (IOException ioe) {
                                System.out.println(ioe.getMessage());
                                return;
                            }

                            try {
                                foutput.close();
                            } catch (IOException ioe) {

                            }

                        } else {
                            System.out.println("File tidak ditemukan");
                        }

                    }
                    break;

                case 4:
                    //MENAMPILKAN FILE DALAM DIREKTORI=============================
                    System.out.print("Masukan direktori: ");
                    input.nextLine(); //agar dapat menggunakan next line lagi
                    tempatFile = input.nextLine();

                    direktoriFile = new File(tempatFile);

                    direktoriFile = new File(tempatFile);
                    if (direktoriFile.exists()) {

                        System.out.print("Nama file beserta formatnya: ");
                        namaFile = input.nextLine();
                        
                        File file = new File(direktoriFile + "/" + namaFile);

                        if (file.exists()) {

                            try {
                                finput = new FileInputStream(direktoriFile + "/" + namaFile);
                            } catch (FileNotFoundException fnfe) {
                                System.out.println("File Tidak Ditemukan. ");
                                return; //keluar dari method
                            }
                            
                            try {
                                while ((data = finput.read()) != -1) {
                                    // ketika di tampilkan, data dikonversi ke tipe char
                                    System.out.print((char) data);
                                }
                            } catch (IOException ioe) {
                                System.out.println(ioe.getMessage());
                                return;
                            }
                            // menutup file
                            try {
                                finput.close();
                            } catch (IOException ioe) {

                            }
                            
                        } else {
                            System.out.println("File tidak ditemukan");
                        }

                    }
                    
                    break;
                case 5:

                    //MERENAME FILE=================================================
                    System.out.print("Masukan direktori: ");
                    input.nextLine(); //agar dapat menggunakan next line lagi
                    tempatFile = input.nextLine();

                    direktoriFile = new File(tempatFile);
                    if (direktoriFile.exists()) {

                        System.out.print("Masukan nama file beserta formatnya: ");
                        namaFile = input.nextLine();

                        File file = new File(direktoriFile + "/" + namaFile);

                        if (file.exists()) {
                            System.out.print("Nama baru: ");
                            namaFileBaru = input.nextLine();
                            fileLama = new File(direktoriFile + "/" + namaFile);
                            fileBaru = new File(direktoriFile + "/" + namaFileBaru);

                            fileLama.renameTo(fileBaru);
                        } else {
                            System.out.println("File tidak ditemukan");
                        }

                    } else {
                        System.out.println("Direktori tidak ada");
                    }

                    break;
                //==============================================================
                case 6:
                    //MENGHAPUS FILE================================================
                    System.out.print("Masukan direktori: ");
                    input.nextLine(); //agar dapat menggunakan next line lagi
                    tempatFile = input.nextLine();

                    direktoriFile = new File(tempatFile);
                    if (direktoriFile.exists()) {

                        System.out.print("Nama file beserta formatnya: ");
                        namaFile = input.nextLine();

                        hapusFile = new File(direktoriFile + "/" + namaFile);
                        if (hapusFile.exists()) {

                            File deleteFile = new File(direktoriFile + "/" + namaFile);

                            deleteFile.delete();

                        } else {
                            System.out.println("File tidak ditemukan");
                        }

                    } else {
                        System.out.println("Direktori tidak ada");
                    }
                    break;
                //
                default:
                    System.out.println("Keluar");
                    loop = false;
                    break;
            }
        }
    }
}
    
