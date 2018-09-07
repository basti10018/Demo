
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Basti Pogi
 */
public class DatabaseConnection {
     public Connection con;
     private PreparedStatement ps = null;
     private ResultSet rs = null;
     
     
     public static Connection connectDB(){
              
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/loa_ims?zeroDateTimeBehavior=convertToNull","root","");
            
            
            return con;
            
        }
        catch(Exception e ){
            
            JOptionPane.showMessageDialog(null,"Not connected to database");
            e.printStackTrace();
            System.out.println("Not connected to database\n ERROR @DatabaseConnection: ConnectDB();");
            return null;
        }
        
        
  }
    
}
