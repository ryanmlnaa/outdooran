/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import java.sql.DriverManager;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ryzane
 */
public class Koneksi {
     public Connection koneksi;
    
   
    public void getKoneksi(){
        try {
            String url = "jdbc:mysql://localhost:3306/rental_outdoor";
            String user = "root";
            String password = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            koneksi = DriverManager.getConnection(url, user, password);
            System.out.println("Berhasil Terhubung");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
    public void main(String args[]){
        getKoneksi();
    }   
}
