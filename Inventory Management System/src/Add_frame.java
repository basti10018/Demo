
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Basti
 */
public class Add_frame extends javax.swing.JInternalFrame {

    /**
     * Creates new form Add_frame
     */
     public static String prod_id,prod_name,prod_type,date,description,quantity,unitPrice,retail,v_name,v_contact,v_email;
     private Connection con =null;
     private PreparedStatement ps = null;
     private ResultSet rs = null;
     DisplayStockData dis = new DisplayStockData();
     Stock_frame f = new Stock_frame();
    public Add_frame() {
        
         initComponents();
         con = MySqlConnect.ConnectDB();
         f.getData();
         prod_id = f.lastProductNo;
         int x = Integer.parseInt(prod_id);
         x= x +1;
         productNoTF.setText(""+x);
         prod_id = ""+x;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addPanel = new javax.swing.JPanel();
        productNoL = new javax.swing.JLabel();
        productNameL = new javax.swing.JLabel();
        descriptionL = new javax.swing.JLabel();
        typeL = new javax.swing.JLabel();
        productNoTF = new javax.swing.JTextField();
        productNameTF = new javax.swing.JTextField();
        productTypeCB = new javax.swing.JComboBox<>();
        quantityL = new javax.swing.JLabel();
        quantityTF = new javax.swing.JTextField();
        unitPriceL = new javax.swing.JLabel();
        unitPriceTF = new javax.swing.JTextField();
        retailPriceL = new javax.swing.JLabel();
        retailPriceTF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        vendorTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        vendorContactTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        vendorEmailTF = new javax.swing.JTextField();
        addB = new javax.swing.JButton();
        cancelB = new javax.swing.JButton();
        plusB = new javax.swing.JButton();
        minusB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionTF = new javax.swing.JTextArea();
        exDateL = new javax.swing.JLabel();
        dayCB = new javax.swing.JComboBox<>();
        monthCB = new javax.swing.JComboBox<>();
        yearTF = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("ADD ITEM");

        addPanel.setBackground(new java.awt.Color(204, 204, 204));
        addPanel.setBorder(new javax.swing.border.MatteBorder(null));

        productNoL.setText("Product No.");

        productNameL.setText("Product Name");

        descriptionL.setText("Description");

        typeL.setText("Type");

        productNoTF.setEditable(false);
        productNoTF.setBackground(new java.awt.Color(204, 204, 255));

        productNameTF.setBackground(new java.awt.Color(255, 255, 153));

        productTypeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Regular", "Fragile" }));

        quantityL.setText("Quantity");

        quantityTF.setBackground(new java.awt.Color(255, 255, 153));
        quantityTF.setText("1");

        unitPriceL.setText("Unit Price");

        unitPriceTF.setBackground(new java.awt.Color(255, 255, 153));
        unitPriceTF.setText("0.00");

        retailPriceL.setText("Retail Price");

        retailPriceTF.setBackground(new java.awt.Color(255, 255, 153));
        retailPriceTF.setText("0.00");

        jLabel11.setText("Vendor Name");

        vendorTF.setBackground(new java.awt.Color(255, 255, 153));
        vendorTF.setText(" ");

        jLabel1.setText("Contact No.");

        vendorContactTF.setBackground(new java.awt.Color(255, 255, 153));
        vendorContactTF.setText(" ");

        jLabel3.setText("Email");

        vendorEmailTF.setBackground(new java.awt.Color(255, 255, 153));
        vendorEmailTF.setText(" ");

        addB.setBackground(new java.awt.Color(255, 255, 153));
        addB.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        addB.setText("Add");
        addB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBActionPerformed(evt);
            }
        });

        cancelB.setBackground(new java.awt.Color(255, 255, 153));
        cancelB.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        cancelB.setText("Cancel");
        cancelB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBActionPerformed(evt);
            }
        });

        plusB.setBackground(new java.awt.Color(255, 255, 153));
        plusB.setText("+");
        plusB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusBActionPerformed(evt);
            }
        });

        minusB.setBackground(new java.awt.Color(255, 255, 153));
        minusB.setText("-");
        minusB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusBActionPerformed(evt);
            }
        });

        descriptionTF.setBackground(new java.awt.Color(255, 255, 153));
        descriptionTF.setColumns(20);
        descriptionTF.setRows(5);
        jScrollPane1.setViewportView(descriptionTF);

        exDateL.setText("Expiration Date");

        dayCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        monthCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", " ", " " }));

        yearTF.setBackground(new java.awt.Color(255, 255, 153));
        yearTF.setText("2017");
        yearTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addPanelLayout = new javax.swing.GroupLayout(addPanel);
        addPanel.setLayout(addPanelLayout);
        addPanelLayout.setHorizontalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addComponent(descriptionL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(exDateL)
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productNoL)
                            .addComponent(productNameL)
                            .addComponent(typeL))
                        .addGap(24, 24, 24)
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productTypeCB, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addComponent(monthCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dayCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yearTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(unitPriceL)
                            .addComponent(quantityL)
                            .addComponent(retailPriceL)
                            .addComponent(jLabel11)
                            .addComponent(jLabel3))
                        .addGap(23, 23, 23)
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(unitPriceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(addPanelLayout.createSequentialGroup()
                                .addComponent(quantityTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(plusB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(minusB))
                            .addComponent(retailPriceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(vendorTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                .addComponent(vendorEmailTF, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(vendorContactTF, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(addB, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelB)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        addPanelLayout.setVerticalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productNoL)
                    .addComponent(productNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityL)
                    .addComponent(quantityTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plusB)
                    .addComponent(minusB))
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(addB)
                                .addComponent(cancelB))
                            .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(descriptionL)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33))
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productNameL)
                            .addComponent(productNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(typeL)
                            .addComponent(productTypeCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(unitPriceL)
                            .addComponent(unitPriceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(retailPriceL)
                            .addComponent(retailPriceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(vendorTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exDateL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(vendorContactTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(monthCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dayCB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(vendorEmailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(280, 0, 614, 442);
    }// </editor-fold>//GEN-END:initComponents

    private void yearTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearTFActionPerformed

    private void minusBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusBActionPerformed
        // TODO add your handling code here:
        int count = Integer.parseInt(quantityTF.getText());
        if(count>0)
        count--;
        quantityTF.setText(""+count);
    }//GEN-LAST:event_minusBActionPerformed

    private void plusBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusBActionPerformed
        // TODO add your handling code here:
        int count = Integer.parseInt(quantityTF.getText());
        try{
            count++;
            quantityTF.setText(""+count);
        }
        catch(InputMismatchException e){
            JOptionPane.showMessageDialog(null,"SYSTEM ERROR! /n Numbers Only ");
        }
    }//GEN-LAST:event_plusBActionPerformed

    private void cancelBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBActionPerformed
        // TODO add your handling code here:
        int a =JOptionPane.showConfirmDialog(null,"All unsaved data will be lost","INVENTORY MANAGEMENT SYSTEM",JOptionPane.YES_NO_OPTION);

        if(a ==0)
        {
            setVisible(false);
        }
    }//GEN-LAST:event_cancelBActionPerformed

    private void addBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBActionPerformed
        try
        {

            // TODO add your handling code here:

            prod_name  = productNameTF.getText().toString();
            prod_type = productTypeCB.getSelectedItem().toString();
            int month = monthCB.getSelectedIndex()+1;
            date = ""+yearTF.getText()+"-"+month+"-"+dayCB.getSelectedItem().toString();
            description = descriptionTF.getText();
            quantity = quantityTF.getText();
            unitPrice = unitPriceTF.getText();
            retail = retailPriceTF.getText();
            v_name = vendorTF.getText();
            v_contact = vendorContactTF.getText();
            v_email = vendorEmailTF.getText();

            String sql = "insert into product(id,name,type,expiration_date,description,quantity,unit_price,retail_price,v_name,v_contact,v_email)values(?,?,?,?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1,prod_id);
            ps.setString(2,prod_name);
            ps.setString(3,prod_type);
            ps.setString(4,date);
            ps.setString(5,description);
            ps.setString(6,quantity);
            ps.setString(7,unitPrice);
            ps.setString(8,retail);
            ps.setString(9,v_name);
            ps.setString(10,v_contact);
            ps.setString(11,v_email);

            ps.execute();
            JOptionPane.showMessageDialog(null, "Data Saved!");

            productNameTF.setText("");
            productTypeCB.setSelectedIndex(0);
            monthCB.setSelectedIndex(0);
            dayCB.setSelectedIndex(0);
            yearTF.setText("2017");
            descriptionTF.setText("");
            quantityTF.setText("1");
            unitPriceTF.setText("0.00");
            retailPriceTF.setText("0.00");
            vendorTF.setText("");
            vendorContactTF.setText("");
            vendorEmailTF.setText("");
            show(false);

        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "error saving!");
            Logger.getLogger(Add_frame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_addBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addB;
    private javax.swing.JPanel addPanel;
    private javax.swing.JButton cancelB;
    private javax.swing.JComboBox<String> dayCB;
    private javax.swing.JLabel descriptionL;
    private javax.swing.JTextArea descriptionTF;
    private javax.swing.JLabel exDateL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton minusB;
    private javax.swing.JComboBox<String> monthCB;
    private javax.swing.JButton plusB;
    private javax.swing.JLabel productNameL;
    private javax.swing.JTextField productNameTF;
    private javax.swing.JLabel productNoL;
    private javax.swing.JTextField productNoTF;
    private javax.swing.JComboBox<String> productTypeCB;
    private javax.swing.JLabel quantityL;
    private javax.swing.JTextField quantityTF;
    private javax.swing.JLabel retailPriceL;
    private javax.swing.JTextField retailPriceTF;
    private javax.swing.JLabel typeL;
    private javax.swing.JLabel unitPriceL;
    private javax.swing.JTextField unitPriceTF;
    private javax.swing.JTextField vendorContactTF;
    private javax.swing.JTextField vendorEmailTF;
    private javax.swing.JTextField vendorTF;
    private javax.swing.JTextField yearTF;
    // End of variables declaration//GEN-END:variables
}
