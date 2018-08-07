

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
public class Inbox_frame extends javax.swing.JInternalFrame {

    
     public String fullname =" ",sender = "",message = "",date = "",time = "";
     private Connection con =null;
     private PreparedStatement ps = null;
     private ResultSet rs = null;
     DefaultTableModel model;
     IMS_UserLogin ims = new IMS_UserLogin();
     String userId = ims.id;
 
    public Inbox_frame() {
        initComponents();
         setTitle("Inbox");
         
         con = MySqlConnect.ConnectDB();
        
         
         model =(DefaultTableModel) inboxTable.getModel();
          getData();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        messagePanel = new javax.swing.JPanel();
        replyB = new javax.swing.JButton();
        deleteB = new javax.swing.JButton();
        closeB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        inboxTable = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);

        messagePanel.setBackground(new java.awt.Color(204, 204, 204));

        replyB.setBackground(new java.awt.Color(255, 255, 153));
        replyB.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        replyB.setText("Reply");
        replyB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                replyBActionPerformed(evt);
            }
        });

        deleteB.setBackground(new java.awt.Color(255, 255, 153));
        deleteB.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        deleteB.setText("Delete");
        deleteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBActionPerformed(evt);
            }
        });

        closeB.setBackground(new java.awt.Color(255, 255, 153));
        closeB.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        closeB.setText("Close");
        closeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBActionPerformed(evt);
            }
        });

        inboxTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "From", "Message", "Date", "Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(inboxTable);

        javax.swing.GroupLayout messagePanelLayout = new javax.swing.GroupLayout(messagePanel);
        messagePanel.setLayout(messagePanelLayout);
        messagePanelLayout.setHorizontalGroup(
            messagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, messagePanelLayout.createSequentialGroup()
                .addGroup(messagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(messagePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(replyB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                        .addComponent(closeB)))
                .addContainerGap())
        );
        messagePanelLayout.setVerticalGroup(
            messagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, messagePanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(messagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(replyB)
                    .addComponent(deleteB)
                    .addComponent(closeB))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(messagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(messagePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(300, 0, 410, 308);
    }// </editor-fold>//GEN-END:initComponents

    private void replyBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replyBActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_replyBActionPerformed

    private void deleteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_deleteBActionPerformed

    private void closeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBActionPerformed
        // TODO add your handling code here:
      
      setVisible(false);
          
    }//GEN-LAST:event_closeBActionPerformed

    public void getData(){
         DisplayStockData s = new   DisplayStockData();
        try
        {    
    
             ps = con.prepareStatement("Select * from messagebox where emp_id  =? order by date");
             ps.setString(1,userId);
             rs =ps.executeQuery();
             while(rs.next()){
                
              
                  message = rs.getString("message");
                  sender = rs.getString("sender_id");
                  s.displayEmpData(sender);
                  sender = s.fullname;
                  date = rs.getString("date");
                  time = rs.getString("time");
             
                 model.insertRow( model.getRowCount(), new Object[]{sender,message,date,time});
             }
             
        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(null, "Error Loading database!");
        }
        finally{
                try {
                    rs.close();
                    ps.close();
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Inbox_frame.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        
            
       
        
        
        
        
    }




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeB;
    private javax.swing.JButton deleteB;
    private javax.swing.JTable inboxTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel messagePanel;
    private javax.swing.JButton replyB;
    // End of variables declaration//GEN-END:variables
}
