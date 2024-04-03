/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apkkasir_rera;

import java.sql.Connection;
import java.sql.DriverManager; 
import javax.swing.JOptionPane;

/**
 *
 * @author OWNER
 */
public class koneksi {
    Connection koneksi = null;
    
    public static Connection koneksiDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/kasir_rera","root","");
            return koneksi;
        } catch (Exception e) {
            JOptionPane.showMessageDialog (null ,e);
            return null;
        }
        
    }
}
