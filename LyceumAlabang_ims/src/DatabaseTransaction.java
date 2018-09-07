
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
public class DatabaseTransaction {

    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    //For user table
    ArrayList<String> user_id = new ArrayList<>();
    ArrayList<String> user_username = new ArrayList<>();
    ArrayList<String> user_password = new ArrayList<>();
    ArrayList<String> user_name = new ArrayList<>();
    ArrayList<String> user_lastname = new ArrayList<>();
    ArrayList<String> user_access = new ArrayList<>();
    ArrayList<String> user_department = new ArrayList<>();

    // For product table
    ArrayList<String> prod_id = new ArrayList<>();
    ArrayList<String> prod_description = new ArrayList<>();
    ArrayList<String> prod_quantity = new ArrayList<>();
    ArrayList<String> prod_units = new ArrayList<>();
    ArrayList<String> prod_date = new ArrayList<>();
    ArrayList<String> prod_barcode = new ArrayList<>();
    ArrayList<String> prod_price = new ArrayList<>();
    ArrayList<String> prod_cost = new ArrayList<>();
    ArrayList<String> prod_remarks = new ArrayList<>();
    ArrayList<String> prod_department = new ArrayList<>();

    // For activity table
    ArrayList<String> log_id = new ArrayList<>();
    ArrayList<String> log_user_id = new ArrayList<>();
    ArrayList<String> log_name = new ArrayList<>();
    ArrayList<String> log_transaction = new ArrayList<>();
    ArrayList<String> log_date = new ArrayList<>();
    ArrayList<String> log_time = new ArrayList<>();
    ArrayList<String> log_access = new ArrayList<>();
    ArrayList<String> log_department = new ArrayList<>();
    ArrayList<String> log_dataName = new ArrayList<>();

    //for request table
    ArrayList<String> req_id = new ArrayList<>();
    ArrayList<String> req_particular = new ArrayList<>();
    ArrayList<String> req_quantity = new ArrayList<>();
    ArrayList<String> req_price = new ArrayList<>();
    ArrayList<String> req_cost = new ArrayList<>();
    ArrayList<String> req_department = new ArrayList<>();
    ArrayList<String> req_status = new ArrayList<>();

    public boolean login(String user, String password) {
        con = DatabaseConnection.connectDB();
        try {
            ps = con.prepareStatement("Select * From user where BINARY username =? and BINARY password =?");
            ps.setString(1, user);
            ps.setString(2, password);
            rs = ps.executeQuery();

            if (rs.next()) {

                System.out.println("LOGIN Successful:" + rs.getString("access"));
                user_id.add(rs.getString("user_id"));
                user_username.add(rs.getString("username"));
                user_password.add(rs.getString("password"));
                user_name.add(rs.getString("name"));
                user_lastname.add(rs.getString("lastname"));
                user_department.add(rs.getString("department"));
                user_access.add(rs.getString("access"));

                return true;

            } else {
                System.out.println("No User found:");
                return false;
            }

        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("ERROR @DatabaseTrasaction:login();");

        }
        closeStatement();
        return false;
    }

    public void displayStock(String remarks, String department) {
        con = DatabaseConnection.connectDB();
        clearProductArray();

        try {
            if (department.equals("All") && remarks.equals("All")) {
                ps = con.prepareStatement("Select * from product");

            } else if (department.equals("All") && (remarks.equals("All")) == false) {

                ps = con.prepareStatement("Select * from product where remarks = ?");
                ps.setString(1, remarks);

            } else if (remarks.equals("All") && (department.equals("All")) == false) {

                ps = con.prepareStatement("Select * from product where department = ?");
                ps.setString(1, department);
            } else {
                ps = con.prepareStatement("Select * from product where department = ? && remarks =?");
                ps.setString(1, department);
                ps.setString(2, remarks);
            }

            rs = ps.executeQuery();

            while (rs.next()) {
                prod_id.add(rs.getString("prod_id"));
                prod_description.add(rs.getString("description"));
                prod_quantity.add(rs.getString("quantity"));
                prod_units.add(rs.getString("units"));
                prod_date.add(rs.getString("date"));
                prod_barcode.add(rs.getString("barcode"));
                prod_price.add(rs.getString("unit_price"));
                prod_cost.add(rs.getString("cost_price"));
                prod_remarks.add(rs.getString("remarks"));
                prod_department.add(rs.getString("department"));

            }

        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("Unable to fetch database statement at DatabaseTrasanction: displayStock();");
        }
        closeStatement();

    }

    public boolean editItem(String id,String description, int quantity, String units, String date, String barcode, Double unit_price, Double cost_price, String remarks, String department) {
        con = DatabaseConnection.connectDB();

        try {
            ps = con.prepareStatement("update product set description =? ,quantity = ? , units =? , date = ?, barcode =?,unit_price = ?, cost_price = ? ,remarks =?,department=?  where prod_id =?");
            ps.setString(1, description);
            ps.setInt(2, quantity);
            ps.setString(3, units);
            ps.setString(4, date);
            ps.setString(5, barcode);
            ps.setDouble(6, unit_price);
            ps.setDouble(7, cost_price);
            ps.setString(8, remarks);
            ps.setString(9, department);
            ps.setString(10, id);
            ps.execute();
            ps.close();
            con.close();
            return true;

        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("Unable to edit product database at DatabaseTransaction: editItem();");
            JOptionPane.showMessageDialog(null, "Error saving");
            return false;
        }

    }

    public void searchItem(String desc, String remarks, String department) {
        con = DatabaseConnection.connectDB();
        clearProductArray();
        try {

            if (remarks.equals("All") && department.equals("All")) {

                ps = con.prepareStatement("Select * from product where description = ?");
                ps.setString(1, desc);

            } else if (department.equals("All") && (remarks.equals("All")) == false) {

                ps = con.prepareStatement("Select * from product where remarks = ? && description =?");
                ps.setString(1, remarks);
                ps.setString(2, desc);

            } else if (remarks.equals("All") && (department.equals("All")) == false) {

                ps = con.prepareStatement("Select * from product where department = ?  && description =?");
                ps.setString(1, department);
                ps.setString(2, desc);

            } else {

                ps = con.prepareStatement("Select * from product where description = ? && remarks = ? && department = ?");
                ps.setString(1, desc);
                ps.setString(2, remarks);
                ps.setString(3, department);

            }

            rs = ps.executeQuery();

            while (rs.next()) {
                prod_id.add(rs.getString("prod_id"));
                prod_description.add(rs.getString("description"));
                prod_quantity.add(rs.getString("quantity"));
                prod_units.add(rs.getString("units"));
                prod_date.add(rs.getString("date"));
                prod_barcode.add(rs.getString("barcode"));
                prod_price.add(rs.getString("unit_price"));
                prod_cost.add(rs.getString("cost_price"));
                prod_remarks.add(rs.getString("remarks"));
                prod_department.add(rs.getString("department"));

            }

        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("Unable to fetch database statement at DatabaseTrasanction: searchItem();");
        }
        closeStatement();

    }

    public void getProduct(String id) {
        con = DatabaseConnection.connectDB();
        clearProductArray();
        try {
            ps = con.prepareStatement("Select * from product where prod_id = ? ");
            ps.setString(1, id);
            rs = ps.executeQuery();

            if (rs.next()) {
                prod_id.add(rs.getString("prod_id"));
                prod_description.add(rs.getString("description"));
                prod_quantity.add(rs.getString("quantity"));
                prod_price.add(rs.getString("unit_price"));
                prod_cost.add(rs.getString("cost_price"));
                prod_remarks.add(rs.getString("remarks"));
                prod_department.add(rs.getString("department"));
                prod_barcode.add(rs.getString("barcode"));
                prod_date.add(rs.getString("date"));
                prod_units.add(rs.getString("units"));

            }

        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("Unable to get user database at DatabaseTransaction: getProduct();");
        }
        closeStatement();
    }

    public void seachCategory(String department, String remarks) {
        con = DatabaseConnection.connectDB();
        clearProductArray();
        try {
            if (remarks.equals("All") && department.equals("All")) {
                ps = con.prepareStatement("Select * from product");

            } else {
                ps = con.prepareStatement("Select * from product department= ? && remarks= ?");
                ps.setString(1, department);
                ps.setString(2, remarks);

            }

            rs = ps.executeQuery();

            while (rs.next()) {
                prod_id.add(rs.getString("prod_id"));
                prod_description.add(rs.getString("description"));
                prod_quantity.add(rs.getString("quantity"));
                prod_units.add(rs.getString("units"));
                prod_date.add(rs.getString("date"));
                prod_barcode.add(rs.getString("barcode"));
                prod_price.add(rs.getString("unit_price"));
                prod_cost.add(rs.getString("cost_price"));
                prod_remarks.add(rs.getString("remarks"));
                prod_department.add(rs.getString("department"));

            }

        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("Unable to fetch database statement at DatabaseTrasanction: searchItem();");
        }
        closeStatement();

    }

    public void displayUser(String access, String department) {
        con = DatabaseConnection.connectDB();
        clearUserArray();
        try {
            if (department.equals("All") && access.equals("All")) {
                ps = con.prepareStatement("Select * from user");

            } else if (department.equals("All") && (access.equals("All")) == false) {

                ps = con.prepareStatement("Select * from user where access = ?");
                ps.setString(1, access);

            } else if (access.equals("All") && (department.equals("All")) == false) {

                ps = con.prepareStatement("Select * from user where department = ?");
                ps.setString(1, department);
            } else {
                ps = con.prepareStatement("Select * from user where department = ? && access =?");
                ps.setString(1, department);
                ps.setString(2, access);
            }

            rs = ps.executeQuery();

            while (rs.next()) {
                user_id.add(rs.getString("user_id"));
                user_username.add(rs.getString("username"));
                user_name.add(rs.getString("name"));
                user_lastname.add(rs.getString("lastname"));
                user_password.add(rs.getString("password"));
                user_access.add(rs.getString("access"));
                user_department.add(rs.getString("department"));
            }

        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("Unable to display user database at DatabaseTransaction: displayUser();");
        }
        closeStatement();

    }

    public boolean addUser(String username, String password, String access, String department, String name, String lastname) {
        con = DatabaseConnection.connectDB();
        try {

            ps = con.prepareStatement("Select * from user where username =? ");
            ps.setString(1, username);
            rs = ps.executeQuery();
            if (rs.next()) {
                return false;

            } else {
                ps = con.prepareStatement("insert into user(username,password,access,department,name,lastname)values(?,?,?,?,?,?) ");
                ps.setString(1, username);
                ps.setString(2, password);
                ps.setString(3, access);
                ps.setString(4, department);
                ps.setString(5, name);
                ps.setString(6, lastname);
                ps.execute();
                return true;
            }

        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("Unable to insert user database at DatabaseTransaction: addUser();");
        }
        closeStatement();
        return false;
    }

    public void getUser(String id) {
        con = DatabaseConnection.connectDB();
        clearUserArray();
        try {
            ps = con.prepareStatement("Select * from user where user_id = ? ");
            ps.setString(1, id);
            rs = ps.executeQuery();

            if (rs.next()) {
                user_username.add(rs.getString("username"));
                user_password.add(rs.getString("password"));
                user_access.add(rs.getString("access"));
                user_department.add(rs.getString("department"));
                user_name.add(rs.getString("name"));
                user_lastname.add(rs.getString("lastname"));

            }

        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("Unable to get user database at DatabaseTransaction: getuser();");
        }
        closeStatement();
    }

    public void editUser(String id, String name, String lastname, String access, String department, String password) {
        con = DatabaseConnection.connectDB();

        try {
            ps = con.prepareStatement("update user set name =? ,lastname = ? , access =? , department = ?, password =? where user_id =?");
            ps.setString(1, name);
            ps.setString(2, lastname);
            ps.setString(3, access);
            ps.setString(4, department);
            ps.setString(5, password);
            ps.setString(6, id);
            ps.execute();
            ps.close();
            con.close();

        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("Unable to edit user database at DatabaseTransaction: editUser();");
            JOptionPane.showMessageDialog(null, "Error saving");
        }

    }

    public void getItem(String id) {
        con = DatabaseConnection.connectDB();
        clearProductArray();
        try {
            ps = con.prepareStatement("Select * from product where id = ? ");
            ps.setString(1, id);
            rs = ps.executeQuery();

            if (rs.next()) {
                prod_id.add(rs.getString("prod_id"));
                prod_description.add(rs.getString("description"));
                prod_quantity.add(rs.getString("quantity"));
                prod_units.add(rs.getString("units"));
                prod_date.add(rs.getString("date"));
                prod_barcode.add(rs.getString("barcode"));
                prod_price.add(rs.getString("unit_price"));
                prod_cost.add(rs.getString("unnit_cost"));
                prod_remarks.add(rs.getString("remarks"));
                prod_department.add(rs.getString("department"));

            }

        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("Unable to get user database at DatabaseTransaction: getuser();");
        }
        closeStatement();
    }

    public boolean addNewItem(String description, int quantity, String units, String date, String barcode, Double unit_price, Double cost_price, String remarks, String department) {
        con = DatabaseConnection.connectDB();

        try {
            ps = con.prepareStatement("insert into product(description,quantity,units,date,barcode,unit_price,cost_price,remarks,department)values(?,?,?,?,?,?,?,?,?) ");
            ps.setString(1, description);
            ps.setInt(2, quantity);
            ps.setString(3, units);
            ps.setString(4, date);
            ps.setString(5, barcode);
            ps.setDouble(6, unit_price);
            ps.setDouble(7, cost_price);
            ps.setString(8, remarks);
            ps.setString(9, department);
            ps.execute();

            con.close();
            ps.close();

            return true;
        } catch (SQLException e) {
            System.out.println("Error saving item at addNewItem();");
            JOptionPane.showMessageDialog(null, "Error saving item");
            return false;
        }

    }

    public boolean addRequest(String particular, String quantity, String unitPrice, String unitCost, String department) {
        con = DatabaseConnection.connectDB();

        try {
            ps = con.prepareStatement("insert into request(particular,quantity,unit_price,unit_cost,department)values(?,?,?,?,?) ");
            ps.setString(1, particular);
            ps.setString(2, quantity);
            ps.setString(3, unitPrice);
            ps.setString(4, unitCost);
            ps.setString(5, department);
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.println("Error saving request");
            JOptionPane.showMessageDialog(null, "Error sending request");
            return false;
        }
    }

    public void getRequest(String department, String status) {
        con = DatabaseConnection.connectDB();
        try {
            clearReqArray();

            if (department.equals("All") && status.equals("All")) {
                ps = con.prepareStatement("Select * from request");

            } else if (department.equals("All") && (status.equals("All")) == false) {

                ps = con.prepareStatement("Select * from request where status = ?");
                ps.setString(1, status);

            } else if (status.equals("All") && (department.equals("All")) == false) {

                ps = con.prepareStatement("Select * from request where department = ?");
                ps.setString(1, department);
            } else {
                ps = con.prepareStatement("Select * from request where department = ? && status =?");
                ps.setString(1, department);
                ps.setString(2, status);
            }

            rs = ps.executeQuery();

            while (rs.next()) {
                req_id.add(rs.getString("id"));
                req_particular.add(rs.getString("particular"));
                req_quantity.add(rs.getString("quantity"));
                req_price.add(rs.getString("unit_price"));
                req_cost.add(rs.getString("unit_cost"));
                req_department.add(rs.getString("department"));
                req_status.add(rs.getString("status"));
            }

        } catch (SQLException e) {
            System.out.println("Error getting request");
            JOptionPane.showMessageDialog(null, "Error getting  request");
        }
    }

    public void updateRequest(String id, String status) {
        con = DatabaseConnection.connectDB();
        try {

            ps = con.prepareStatement("update request set status =? where id =?");
            ps.setString(1, status);
            ps.setString(2, id);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Request successfully " + status);
            ps.close();
            con.close();

        } catch (HeadlessException | SQLException e) {
            System.out.println("Error updating request");
            JOptionPane.showMessageDialog(null, "Error updating request");
        }
    }

    public void activityLogs(String user_id, String name, String access, String transaction, String dataName, String date, String time, String department) {
        con = DatabaseConnection.connectDB();

        try {
            int id = Integer.parseInt(user_id);
            ps = con.prepareStatement("insert into activity(user_id,name,access,transaction,dataName,date,time,department)values(?,?,?,?,?,?,?,?) ");
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, access);
            ps.setString(4, transaction);
            ps.setString(5, dataName);
            ps.setString(6, date);
            ps.setString(7, time);
            ps.setString(8, department);
            ps.execute();

        } catch (NumberFormatException | SQLException e) {
            System.out.println("Error saving logs");
            JOptionPane.showMessageDialog(null, "Error saving activity");
        }
    }

    public void displayLog(String department, String access) {
        con = DatabaseConnection.connectDB();
        try {

            if (department.equals("All") && access.equals("All")) {
                ps = con.prepareStatement("Select * from activity");

            } else if (department.equals("All") && (access.equals("All")) == false) {

                ps = con.prepareStatement("Select * from activity where access = ?");
                ps.setString(1, access);

            } else if (access.equals("All") && (department.equals("All")) == false) {

                ps = con.prepareStatement("Select * from activity where department = ?");
                ps.setString(1, department);
            } else {
                ps = con.prepareStatement("Select * from activity where department = ? && access =?");
                ps.setString(1, department);
                ps.setString(2, access);
            }

            rs = ps.executeQuery();

            while (rs.next()) {

                log_id.add(rs.getString("id"));
                log_user_id.add(rs.getString("user_id"));
                log_name.add(rs.getString("name"));
                log_transaction.add(rs.getString("transaction"));
                log_date.add(rs.getString("date"));
                log_time.add(rs.getString("time"));
                log_access.add(rs.getString("access"));
                log_department.add(rs.getString("department"));
                log_dataName.add(rs.getString("dataName"));

            }

        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("Unable to display Log database at DatabaseTransaction: displayLog();");
        }
        closeStatement();
    }

    void closeStatement() {

        try {
            ps.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("Unable to close database at DatabaseTransaction: displayUser();");
        }
    }

    void clearProductArray() {
        prod_description.removeAll(prod_description);
        prod_date.removeAll(prod_date);
        prod_quantity.removeAll(prod_quantity);
        prod_units.removeAll(prod_date);
        prod_barcode.removeAll(prod_barcode);
        prod_price.removeAll(prod_price);
        prod_cost.removeAll(prod_cost);
        prod_remarks.removeAll(prod_remarks);
        prod_department.removeAll(prod_department);
    }

    void clearUserArray() {
        user_department.removeAll(user_department);
        user_access.removeAll(user_access);
        user_username.removeAll(user_username);
        user_password.removeAll(user_password);
        user_name.removeAll(user_name);
        user_lastname.removeAll(user_lastname);

    }

    void clearLogsArray() {

        log_id.removeAll(log_id);
        log_user_id.removeAll(log_user_id);
        log_name.removeAll(log_name);
        log_transaction.removeAll(log_transaction);
        log_date.removeAll(log_date);
        log_time.removeAll(log_time);
        log_access.removeAll(log_access);
        log_department.removeAll(log_department);
        log_dataName.removeAll(log_dataName);

    }

    void clearReqArray() {

        req_id.removeAll(req_id);
        req_particular.removeAll(req_particular);
        req_quantity.removeAll(req_quantity);
        req_price.removeAll(req_price);
        req_cost.removeAll(req_cost);
        req_department.removeAll(req_department);
        req_status.removeAll(req_status);

    }

}
