//NAMA      : ANTON NURFENDI
//NIM       : 20210801242
//FAKULTAS  : ILMU  KOMPUTER
//PRODI     : TEKNIK INFORMATIKA
package Toko;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author PY7
 */
public class koneksi {
    private static Connection koneksi;
    
    public static Connection getKoneksi(){
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/toko";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Berhasil");
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
        return koneksi;
    }
    public static void main(String args[]){
        getKoneksi();
    }  
}
