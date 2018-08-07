/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Basti
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
public class MySqlConnect {
     public Connection con;
     private PreparedStatement ps = null;
     private ResultSet rs = null;
    
      public static Connection ConnectDB(){
              
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ims_db?zeroDateTimeBehavior=convertToNull","root","");
            return con;
            
        }
        catch(Exception e ){
            
            JOptionPane.showMessageDialog(null,"Not connected");
            return null;
        }
  }
      

}

