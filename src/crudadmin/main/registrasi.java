package crudadmin.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;

public class registrasi {
    private static Connection koneksi;
    
    public static Connection getKoneksi(){
        if(koneksi==null){
            try{
                String url = "jdbc:mysql://localhost:3306/admin";
                String user = "root";
                String password = "";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url,user,password);
            }catch(SQLException t){
                System.out.println("Error membuat koneksi");
            }
        }
        
        return koneksi;
    }
    
}
