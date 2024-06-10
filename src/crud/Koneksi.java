/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;
import java.sql.Connection;
import java.sql.DriverManager; //menghubungkan ke mysql
import java.sql.PreparedStatement; //untuk CRUD

/**
 *
 * @author Asus-Sc
 */
public class Koneksi {
    private String database_name = "khairurrizal_2210010065";
    private String username = "root";
    private String password = "";
    public Connection koneksiDB;
    
    public Koneksi(){
    
        try {  
            String lokasi = "jdbc:mysql://localhost/" + database_name;
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksiDB = DriverManager.getConnection(lokasi, username, password);
            
            System.out.println("Database Terkoneksi");
        } catch (Exception e) {
            System.out.println(e.getMessage());          
        }
        
    }
    
    // Tabel frekuensi_pamakaian
    public void Simpanfrekuensi_pamakaian(int no, String frekuensi_pemakaian, int frekuensi, int persentase ){
        try {
            String sql = "INSERT INTO frekuensi_pemakaian (no, frekuensi_pemakaian, frekuensi, persentase) VALUE (?,?,?,?)";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            
            perintah.setInt(1, no);
            perintah.setString(2, frekuensi_pemakaian);
            perintah.setInt(3, frekuensi);
            perintah.setInt(4, persentase);
            
            perintah.executeUpdate();
            System.out.println("Berhasil Disimpan");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void Ubahfrekuensi_pamakaian(int no, String frekuensi_pemakaian, int frekuensi, int persentase){
        try {
            String sql = "UPDATE frekuensi_pemakaian SET frekuensi_pemakaian=?, frekuensi=?, persentase=? where no=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            
            perintah.setString(1, frekuensi_pemakaian);
            perintah.setInt(2, frekuensi);
            perintah.setInt(3, persentase);
            perintah.setInt(4, no);
            
            perintah.executeUpdate();
            System.out.println("Berhasil Diubah");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void Hapusfrekuensi_pamakaian(int no){
        try {
            String sql = "DELETE FROM frekuensi_pemakaian where no=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);

            perintah.setInt(1, no);
            
            perintah.executeUpdate();
            System.out.println("Berhasil Dihapus");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }

    // Tabel hasil_koefisien
    public void Simpanhasil_koefisien(String jalur, int beta, int sig, int A, String ket ){
        try {
            String sql = "INSERT INTO hasil_koefisien (jalur, beta, sig, A, ket) VALUE (?,?,?,?,?)";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            
            perintah.setString(1, jalur);
            perintah.setInt(2, beta);
            perintah.setInt(3, sig);
            perintah.setInt(4, A);
            perintah.setString(5, ket);
            
            perintah.executeUpdate();
            System.out.println("Berhasil Disimpan");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void Ubahhasil_koefisien(String jalur, int beta, int sig, int A, String ket){
        try {
            String sql = "UPDATE hasil_koefisien SET beta=?, sig=?, A=?, ket=? where jalur=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            
            perintah.setInt(1, beta);
            perintah.setInt(2, sig);
            perintah.setInt(3, A);
            perintah.setString(4, ket);
            perintah.setString(5, jalur);
            
            perintah.executeUpdate();
            System.out.println("Berhasil Diubah");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void Hapushasil_koefisien(String jalur){
        try {
            String sql = "DELETE FROM hasil_koefisien where jalur=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);

            perintah.setString(1, jalur);
            
            perintah.executeUpdate();
            System.out.println("Berhasil Dihapus");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    // Tabel jenis_kelamin
    public void Simpanjenis_kelamin(int no, String jenis_kelamin, int frekuensi, int persentase ){
        try {
            String sql = "INSERT INTO jenis_kelamin (no, jenis_kelamin, frekuensi, persentase) VALUE (?,?,?,?)";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            
            perintah.setInt(1, no);
            perintah.setString(2, jenis_kelamin);
            perintah.setInt(3, frekuensi);
            perintah.setInt(4, persentase);
            
            perintah.executeUpdate();
            System.out.println("Berhasil Disimpan");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void Ubahjenis_kelamin(int no, String jenis_kelamin, int frekuensi, int persentase){
        try {
            String sql = "UPDATE jenis_kelamin SET jenis_kelamin=?, frekuensi=?, persentase=? where no=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            
            perintah.setString(1, jenis_kelamin);
            perintah.setInt(2, frekuensi);
            perintah.setInt(3, persentase);
            perintah.setInt(4, no);
            
            perintah.executeUpdate();
            System.out.println("Berhasil Diubah");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void Hapusjenis_kelamin(int no){
        try {
            String sql = "DELETE FROM jenis_kelamin where no=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);

            perintah.setInt(1, no);
            
            perintah.executeUpdate();
            System.out.println("Berhasil Dihapus");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    // Tabel usia
    public void Simpanusia(int no, String tahun, int frekuensi, int persentase ){
        try {
            String sql = "INSERT INTO usia (no, tahun, frekuensi, persentase) VALUE (?,?,?,?)";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            
            perintah.setInt(1, no);
            perintah.setString(2, tahun);
            perintah.setInt(3, frekuensi);
            perintah.setInt(4, persentase);
            
            perintah.executeUpdate();
            System.out.println("Berhasil Disimpan");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void Ubahusia(int no, String tahun, int frekuensi, int persentase){
        try {
            String sql = "UPDATE usia SET tahun=?, frekuensi=?, persentase=? where no=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            
            perintah.setString(1, tahun);
            perintah.setInt(2, frekuensi);
            perintah.setInt(3, persentase);
            perintah.setInt(4, no);
            
            perintah.executeUpdate();
            System.out.println("Berhasil Diubah");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void Hapususia(int no){
        try {
            String sql = "DELETE FROM usia where no=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);

            perintah.setInt(1, no);
            
            perintah.executeUpdate();
            System.out.println("Berhasil Dihapus");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
}
