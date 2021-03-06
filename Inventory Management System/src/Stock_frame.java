
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Basti
 */
public class Stock_frame extends javax.swing.JInternalFrame
{

     private Connection con =null;
     private PreparedStatement ps = null;
     private ResultSet rs = null;
     DefaultTableModel model;
     DisplayStockData d = new DisplayStockData();
     public static String no=" ",desc=" ",name=" ",vname=" ",contact="",type="",lastProductNo="",prodNo="";
     public Stock_frame() {
        initComponents();
         setTitle("Stock");
         
         con = MySqlConnect.ConnectDB();
         model =(DefaultTableModel) stockTable.getModel();
         getData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        invoicePanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        stockTable = new javax.swing.JTable();
        productNoL = new javax.swing.JLabel();
        productNoTF = new javax.swing.JTextField();
        productNameL = new javax.swing.JLabel();
        productNameTF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        vnameTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        contactTF = new javax.swing.JTextField();
        descriptionL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionTF = new javax.swing.JTextArea();
        deleteB = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);

        invoicePanel.setBackground(new java.awt.Color(204, 204, 204));

        stockTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product No.", "Product Name", "Quantity", "Unit Price", "Retail Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        stockTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stockTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(stockTable);

        productNoL.setText("Product No.");

        productNoTF.setEditable(false);
        productNoTF.setBackground(new java.awt.Color(204, 204, 255));

        productNameL.setText("Product Name");

        productNameTF.setEditable(false);
        productNameTF.setBackground(new java.awt.Color(204, 204, 255));

        jLabel11.setText("Vendor Name");

        vnameTF.setEditable(false);
        vnameTF.setBackground(new java.awt.Color(204, 204, 255));
        vnameTF.setText(" ");

        jLabel1.setText("Contact No.");

        contactTF.setEditable(false);
        contactTF.setBackground(new java.awt.Color(204, 204, 255));
        contactTF.setText(" ");

        descriptionL.setText("Description");

        descriptionTF.setEditable(false);
        descriptionTF.setBackground(new java.awt.Color(204, 204, 255));
        descriptionTF.setColumns(20);
        descriptionTF.setRows(5);
        jScrollPane1.setViewportView(descriptionTF);

        deleteB.setBackground(new java.awt.Color(255, 255, 153));
        deleteB.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        deleteB.setText("Delete");
        deleteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout invoicePanelLayout = new javax.swing.GroupLayout(invoicePanel);
        invoicePanel.setLayout(invoicePanelLayout);
        invoicePanelLayout.setHorizontalGroup(
            invoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(invoicePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(invoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(invoicePanelLayout.createSequentialGroup()
                        .addGroup(invoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productNameL)
                            .addComponent(productNoL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(invoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(productNameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(productNoTF))
                        .addGap(118, 118, 118)
                        .addGroup(invoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel1)
                            .addComponent(descriptionL))
                        .addGap(24, 24, 24)
                        .addGroup(invoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contactTF, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(deleteB))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        invoicePanelLayout.setVerticalGroup(
            invoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(invoicePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(invoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(invoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(productNoL)
                        .addComponent(productNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(vnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(invoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productNameL)
                    .addComponent(productNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(contactTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(invoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descriptionL)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteB)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(invoicePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(invoicePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(300, 0, 798, 454);
    }// </editor-fold>//GEN-END:initComponents

    private void stockTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockTableMouseClicked
        // TODO add your handling code here:
        DisplayStockData s = new   DisplayStockData();
        int index =  stockTable.getSelectedRow();
        no = model.getValueAt(index, 0).toString();

        s.displayStockData(no);
        productNoTF.setText(no);
        productNameTF.setText(s.name);
        vnameTF.setText(s.vname);
        contactTF.setText(s.contact);
        descriptionTF.setText(s.desc);

    }//GEN-LAST:event_stockTableMouseClicked

    private void deleteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBActionPerformed
        // TODO add your handling code here:
      
        IMS_UserLogin log= new IMS_UserLogin();
        DisplayStockData s = new DisplayStockData();
        
         if(log.access.equals("admin"))
        {
            int index =  stockTable.getSelectedRow();
            no = model.getValueAt(index, 0).toString();
            int a = JOptionPane.showConfirmDialog(null,"Are you sure you want to delete this row from your database?","Delete",JOptionPane.YES_NO_OPTION);
            if(a==0)
            s.deleteStoc(no);
           
           
        
        
       
        
     
        
        }
         else
            JOptionPane.showMessageDialog(null, "Need administrator access to delete item!");
        
        
        
        
        
        
        
    }//GEN-LAST:event_deleteBActionPerformed
   
    
  
    
    
    
    
    public void getData()
   {
          con = MySqlConnect.ConnectDB();
        try
        {    
    
             ps = con.prepareStatement("Select * from product");
             
             rs =ps.executeQuery();
             
             while(rs.next())
             {
                
                prodNo= rs.getString("id");
                String quantity = rs.getString("quantity");
                String p_name = rs.getString("name");
                String price = rs.getString("unit_price");
                String r_price = rs.getString("retail_price");
               
                
             
                 model.insertRow( model.getRowCount(), new Object[]{prodNo,p_name,quantity,price,r_price});
                 
                
             }
             lastProductNo = prodNo;
             
        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(null, "Error Loading database!");
        }
        finally
        {
                try 
                {
                    rs.close();
                    ps.close();
                    con.close();
                } catch (SQLException ex) 
                {
                    Logger.getLogger(Inbox_frame.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        
            
       
        
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contactTF;
    private javax.swing.JButton deleteB;
    private javax.swing.JLabel descriptionL;
    private javax.swing.JTextArea descriptionTF;
    private javax.swing.JPanel invoicePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel productNameL;
    private javax.swing.JTextField productNameTF;
    private javax.swing.JLabel productNoL;
    private javax.swing.JTextField productNoTF;
    private javax.swing.JTable stockTable;
    private javax.swing.JTextField vnameTF;
    // End of variables declaration//GEN-END:variables
}
