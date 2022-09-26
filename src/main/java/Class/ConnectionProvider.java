/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;
import java.sql.*;
/**
 *
 * @author color
 */
public class ConnectionProvider {
    public static Connection getCon() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root" , "blackhatsanta@123");
            return con;
        } catch(Exception err) {
            return null; 
        }
    } 
}
