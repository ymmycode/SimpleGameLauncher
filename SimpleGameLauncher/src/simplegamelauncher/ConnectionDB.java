/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplegamelauncher;

/**
 *
 * @author achma
 */

import java.sql.*;
//import javax.swing.JOptionPane;
public class ConnectionDB {
    Connection connect;
    Statement stmt;
    
    String offlineUrl = "jdbc:mysql://127.0.0.1/gamedatabase";
    String user = "root";
    String pass = "";
    
    String onlineUrl = "jdbc:mysql://167.XX.120.199/gamedatabases";
    String onUser = "ymmycode_XXXX";
    String onPass = "XXXXXXX";
    
    public void Config()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection(offlineUrl, user, pass);
            stmt = connect.createStatement();
            System.out.print("Connection Success");
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.print("Koneksi Gagal" +e.getMessage());
        }
    }
}