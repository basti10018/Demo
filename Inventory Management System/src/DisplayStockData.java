/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Basti
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
public class DisplayStockData {
    
     private Connection con =null;
     private PreparedStatement ps = null;
     private ResultSet rs = null;
     public static String no=" ",desc=" ",name=" ",vname=" ",contact="",type="",price="",rPrice="",empFname,empLname,fullname=" ",quantity="";
     public static int pno=0;
     public static String empId="",status="";
    
    
      public void displayStockData(String id){
         con = MySqlConnect.ConnectDB();
         try 
         
         {
             ps = con.prepareStatement("Select * from product where id =?");
             ps.setString(1, id);
             rs =ps.executeQuery();
             
               while(rs.next())
               {
                 name = rs.getString("name");
                 type = rs.getString("type");
                 desc = rs.getString("description");
                 vname = rs.getString("v_name");
                 quantity = rs.getString("quantity");
                 contact = rs.getString("v_contact");
                 price = rs.getString("unit_price");
                 rPrice = rs.getString("retail_price");
                 
               }
         } catch (SQLException ex) {
             Logger.getLogger(Stock_frame.class.getName()).log(Level.SEVERE, null, ex);
         }
            finally
          {
                try 
                {
                    rs.close();
                    ps.close();
                    con.close();
                } catch(Exception e ){
            
               
            
           }
        }
        
        
        
    }
      
    public void displayEmpData(String id){
        
        con = MySqlConnect.ConnectDB();
         
        try 
         
         {
             ps = con.prepareStatement("Select * from employee where id =?");
             ps.setString(1, id);
             rs =ps.executeQuery();
             
             
              if(rs.next())
               {
                 empFname = rs.getString("FirstName");
                 empLname = rs.getString("LastName");
                 fullname = empFname +" "+empLname;
                 
               }
             
         } catch(Exception e ){
            
            JOptionPane.showMessageDialog(null, "error saving!");
            
        }
         finally
          {
                try 
                {
                    rs.close();
                    ps.close();
                    con.close();
                } catch(Exception e ){
            
                 JOptionPane.showMessageDialog(null, "error saving!");
            
           }
        }
        
        
        
        
    } 
    
    public void insertOrder( String pNo){
         Order_frame order = new Order_frame();
         IMS_UserLogin login = new IMS_UserLogin();
         con = MySqlConnect.ConnectDB();
         try 
         
         {
                          String pId = pNo;
                          String sql = "insert into prod_order(prod_id,emp_id,quantity,date_created,total)values(?,?,?,?,?)";
                          ps = con.prepareStatement(sql);
                          ps.setString(1,pId);
                          ps.setString(2,login.id);
                          ps.setString(3,order.qty);
                          ps.setString(4,order.date);
                          ps.setString(5,order.totalAmount);
                          ps.execute();
                       
                         order.show(false);
             
             
          
             
         } catch(Exception e ){
            
         JOptionPane.showMessageDialog(null, "error saving!");
            
        }
         finally
          {
                try 
                {
                    rs.close();
                    ps.close();
                    con.close();
                } catch(Exception e ){
            
                 
            
           }
        }
        
        
        
    }
    public void deleteStoc(String a ){
        
         con = MySqlConnect.ConnectDB();
         
        try 
         
         {   String id = a;
             String sql = "Delete from product where id =?";
             ps = con.prepareStatement(sql);
             ps.setString(1, id);
             ps.execute();
  
              JOptionPane.showMessageDialog(null, "Deleted!");
                 
             
             
         } catch(Exception e ){
            
            JOptionPane.showMessageDialog(null, "error!");
            
        }
         finally
          {
                try 
                {
                    rs.close();
                    ps.close();
                    con.close();
                } catch(Exception e ){
            
               
            
           }
        }
    }
    
    public void alterProductQty(String qty,String id){
        
         con = MySqlConnect.ConnectDB();
         
        try 
         
         {   
             String prodQty = qty;
             String empId = id;
             String sql = "update product set quantity =? where id =?";
             ps = con.prepareStatement(sql);
             ps.setString(1, prodQty);
             ps.setString(2, id);
             ps.execute();
             
             
            
            
               
             
         } catch(Exception e ){
            
            JOptionPane.showMessageDialog(null, "Error to modify table!");
            
        }
         finally
          {
                try 
                {
                    rs.close();
                    ps.close();
                    con.close();
                } catch(Exception e ){
            
                
            
           }
        }
        
        
    }
    public void insertLog(String emp,String prod,String date,String type)
    {
           con = MySqlConnect.ConnectDB();
           Activities_frame a = new Activities_frame();
           Order_frame order = new Order_frame();
          Invoice_form invoice = new Invoice_form();
          IMS_UserLogin login = new IMS_UserLogin();
           try 
         
           {             
                          String sql = "insert into activity(emp_id,prod_id,date_created,transaction_type)values(?,?,?,?)";
                          ps = con.prepareStatement(sql);
                          ps.setString(1,emp);
                          ps.setString(2,prod);
                          ps.setString(3,date);
                          ps.setString(4,type);
                          ps.execute();
                         
                         
                         
             
             
          
             
         } catch(Exception e ){
            
         JOptionPane.showMessageDialog(null, "error saving logs!"+prod);
            
        }
         finally
          {
                try 
                {
                    rs.close();
                    ps.close();
                    con.close();
                } catch(Exception e ){
            
                 
            
           }
        }
        
        
    }
    public void empStatus(String id )
    {
        
      con = MySqlConnect.ConnectDB();
          try 
         
         {
             ps = con.prepareStatement("Select * from employee where id =?");
             ps.setString(1, id);
             rs =ps.executeQuery();
             
               while(rs.next())
               {
                
                 empId = rs.getString("ID");
                 status = rs.getString("access");
                 
               }
         } catch (SQLException ex) {
             Logger.getLogger(Stock_frame.class.getName()).log(Level.SEVERE, null, ex);
         }
            finally
          {
                try 
                {
                    rs.close();
                    ps.close();
                    con.close();
                } catch(Exception e ){
            
               
            
           }
  
    }
}
    
    public void changeEmpStatus(String id,String accessLvl)
    {
        try 
         
         {
             String sql = "update employee set access =? where id =?";
             ps = con.prepareStatement(sql);
             ps.setString(1, accessLvl);
             ps.setString(2, id);
             ps.execute();
             
         } catch(Exception e ){
            
            JOptionPane.showMessageDialog(null, "error saving!");
            
        }
         finally
          {
                try 
                {
                    rs.close();
                    ps.close();
                    con.close();
                } catch(Exception e ){
            
                 JOptionPane.showMessageDialog(null, "error saving!");
            
           }
        }
    }
}
     
      
      

