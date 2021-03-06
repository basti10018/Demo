
import com.sun.xml.internal.ws.util.StringUtils;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Basti Pogi
 */
public class UserFrame extends javax.swing.JFrame {

    /**
     * Creates new form UserFrame
     */
    private String id;
    private String firstname;
    private String lastname;
    private String department = "All";
    private String password;
    DefaultTableModel listTable;

    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY", Locale.getDefault());
    AccountsFrame af = new AccountsFrame();
    ;
    DatabaseTransaction dt = new DatabaseTransaction();
    EditItemFrame eif = new EditItemFrame();
    AddNewItem ani = new AddNewItem();

    public UserFrame() {
        initComponents();
        listTable = (DefaultTableModel) list.getModel();
        getStock(optionList.getSelectedItem().toString(), department);
    }

    public UserFrame(String id, String firstname, String lastname, String department, String password) {
        initComponents();
        logo.setBackground(new Color(0, 0, 0, 0));
        this.firstname = firstname;
        this.lastname = lastname;
        this.department = department;
        this.password = password;
        af.getUserId(id);
        ani.getUserId(id);
        eif.getUserId(id);

        af.getDept(department);
        ani.getDept(department);
        eif.getDept(department);
        nameTF.setText(StringUtils.capitalize(firstname) + " " + StringUtils.capitalize(lastname));
        departmentTF.setText(department + " " + "Encoder");
        listTable = (DefaultTableModel) list.getModel();
        getStock(optionList.getSelectedItem().toString(), department);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPanel = new javax.swing.JPanel();
        logout = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JTable();
        menuPanel = new javax.swing.JPanel();
        homeB = new javax.swing.JButton();
        profilePanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        departmentTF = new javax.swing.JLabel();
        nameTF = new javax.swing.JLabel();
        addnewItem = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        optionList = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        searchB = new javax.swing.JButton();
        searchTF = new javax.swing.JTextField();
        refreshB = new javax.swing.JButton();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        bgPanel.setBackground(new java.awt.Color(255, 255, 255));
        bgPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logout.setBackground(new java.awt.Color(255, 255, 255));
        logout.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logout.png"))); // NOI18N
        logout.setToolTipText("Logout");
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.setDoubleBuffered(true);
        logout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        bgPanel.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1680, 0, 70, 90));

        list.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        list.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Particular", "Quantity", "Units", "Data Purchased", "Barcode", "Unit Price", "Cost Price", "Status/Remark"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        list.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        list.setGridColor(new java.awt.Color(255, 255, 255));
        list.setRowHeight(50);
        list.setSelectionBackground(new java.awt.Color(255, 255, 204));
        list.setSelectionForeground(new java.awt.Color(0, 0, 0));
        list.setShowHorizontalLines(false);
        list.setShowVerticalLines(false);
        list.getTableHeader().setReorderingAllowed(false);
        list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(list);

        bgPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 379, 1348, 420));

        menuPanel.setBackground(new java.awt.Color(255, 255, 204));
        menuPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        homeB.setBackground(new java.awt.Color(255, 255, 255));
        homeB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/home.png"))); // NOI18N
        homeB.setText("Home");
        homeB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        homeB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        homeB.setVerifyInputWhenFocusTarget(false);
        homeB.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        homeB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        homeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBActionPerformed(evt);
            }
        });

        profilePanel.setBackground(new java.awt.Color(0, 40, 90));
        profilePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/user (1).png"))); // NOI18N

        departmentTF.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        departmentTF.setForeground(new java.awt.Color(255, 255, 255));
        departmentTF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        departmentTF.setText("Encoder");

        nameTF.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        nameTF.setForeground(new java.awt.Color(255, 255, 255));
        nameTF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameTF.setText("Firstname Lastname");

        javax.swing.GroupLayout profilePanelLayout = new javax.swing.GroupLayout(profilePanel);
        profilePanel.setLayout(profilePanelLayout);
        profilePanelLayout.setHorizontalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                    .addComponent(departmentTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        profilePanelLayout.setVerticalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(nameTF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(departmentTF)
                .addGap(19, 19, 19))
        );

        addnewItem.setBackground(new java.awt.Color(255, 255, 255));
        addnewItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/new.png"))); // NOI18N
        addnewItem.setText("Add new item");
        addnewItem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addnewItem.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        addnewItem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addnewItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addnewItemActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logs.png"))); // NOI18N
        jButton8.setText("Reports");
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/delete-button.png"))); // NOI18N
        jButton9.setText("Delete Item");
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(profilePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                        .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addnewItem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                            .addComponent(homeB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addComponent(profilePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(homeB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addnewItem, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(314, Short.MAX_VALUE))
        );

        bgPanel.add(menuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 870));

        optionList.setBackground(new java.awt.Color(255, 255, 204));
        optionList.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        optionList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Functional", "Missing", "Usable", "Borrowed", "Breakage ", "Defective", " " }));
        optionList.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                optionListItemStateChanged(evt);
            }
        });
        bgPanel.add(optionList, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 340, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Remarks:");
        bgPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 340, -1, -1));

        searchB.setBackground(new java.awt.Color(255, 255, 204));
        searchB.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        searchB.setText("Search");
        searchB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBActionPerformed(evt);
            }
        });
        bgPanel.add(searchB, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 334, 125, -1));

        searchTF.setBackground(new java.awt.Color(255, 255, 204));
        searchTF.setText("Enter product name....");
        searchTF.setCaretPosition(0);
        searchTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchTFFocusLost(evt);
            }
        });
        searchTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTFActionPerformed(evt);
            }
        });
        searchTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchTFKeyPressed(evt);
            }
        });
        bgPanel.add(searchTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 335, 217, 31));

        refreshB.setBackground(new java.awt.Color(255, 255, 204));
        refreshB.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        refreshB.setText("Refresh");
        refreshB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBActionPerformed(evt);
            }
        });
        bgPanel.add(refreshB, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 334, 125, -1));

        logo.setBackground(new java.awt.Color(255, 255, 255));
        logo.setFont(new java.awt.Font("Cambria", 0, 30)); // NOI18N
        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logo.png"))); // NOI18N
        logo.setText("Inventory Management System");
        logo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        logo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logo.setOpaque(true);
        logo.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        bgPanel.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 1372, 282));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // TODO add your handling code here:

        int a = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?", "INVENTORY MANAGEMENT SYSTEM", JOptionPane.YES_NO_OPTION);

        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_logoutMouseClicked

    private void listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseClicked
        // TODO add your handling code here:
        editProduct();
    }//GEN-LAST:event_listMouseClicked

    private void homeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBActionPerformed
        // TODO add your handling code here:
        af.dispose();
    }//GEN-LAST:event_homeBActionPerformed

    private void addnewItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addnewItemActionPerformed
        // TODO add your handling code here:
        if (ani.isVisible()) {
            ani.dispose();
            ani.show();
        } else {
            ani.show();
        }
    }//GEN-LAST:event_addnewItemActionPerformed

    private void optionListItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_optionListItemStateChanged
        // TODO add your handling code here:
        dt.prod_id.removeAll(dt.prod_id);
        getStock(optionList.getSelectedItem().toString(), department);
        searchTF.setText("Enter product name....");
    }//GEN-LAST:event_optionListItemStateChanged

    private void searchBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBActionPerformed
        // TODO add your handling code here:
        String search = searchTF.getText();
        if (search.equals("Enter product name....")) {
            dt.prod_id.removeAll(dt.prod_id);
            getStock(optionList.getSelectedItem().toString(), department);
        } else {
            dt.prod_id.removeAll(dt.prod_id);
            dt.searchItem(search, optionList.getSelectedItem().toString(), department);
            populateProductTable();
        }
    }//GEN-LAST:event_searchBActionPerformed

    private void searchTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTFFocusLost
        // TODO add your handling code here:
        if (searchTF.getText().equals("Enter product name....") || searchTF.getText().isEmpty() || searchTF.getText().equals(" ")) {
            searchTF.setText("Enter product name....");

        }
    }//GEN-LAST:event_searchTFFocusLost

    private void searchTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTFActionPerformed

    private void searchTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTFKeyPressed
        // TODO add your handling code here
        if (searchTF.getText().equals("Enter product name....") || searchTF.getText().isEmpty()) {
            searchTF.setText("");

        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            searchB.doClick();
        }
    }//GEN-LAST:event_searchTFKeyPressed

    private void refreshBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBActionPerformed
        // TODO add your handling code here:
        searchTF.setText("Enter product name....");
        optionList.setSelectedIndex(0);
        getStock(optionList.getSelectedItem().toString(), department);
    }//GEN-LAST:event_refreshBActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserFrame().setVisible(true);
            }
        });
    }

    public void getStock(String remarks, String department) {
        dt.displayStock(remarks, department);
        populateProductTable();
    }

    void populateProductTable() {
        int a = listTable.getRowCount();

        while (a > 0) {
            listTable.removeRow(a - 1);
            a--;
        }

        for (int x = 0; x < dt.prod_description.size(); x++) {
            listTable.insertRow(listTable.getRowCount(),
                    new Object[]{dt.prod_description.get(x), dt.prod_quantity.get(x), dt.prod_units.get(x), dt.prod_date.get(x), dt.prod_barcode.get(x), dt.prod_price.get(x), dt.prod_cost.get(x), dt.prod_remarks.get(x)});
        }
        clearProductArray();

    }

    void clearProductArray() {
        dt.prod_description.removeAll(dt.prod_description);
        dt.prod_date.removeAll(dt.prod_date);
        dt.prod_quantity.removeAll(dt.prod_quantity);
        dt.prod_units.removeAll(dt.prod_date);
        dt.prod_barcode.removeAll(dt.prod_date);
        dt.prod_price.removeAll(dt.prod_price);
        dt.prod_cost.removeAll(dt.prod_cost);
        dt.prod_remarks.removeAll(dt.prod_remarks);
        dt.prod_department.removeAll(dt.prod_department);
    }

    void editProduct() {
        try {
            int index = list.getSelectedRow();
            eif.getProduct(dt.prod_id.get(index));
            // dt.getProduct(dt.prod_id.get(index));

        } catch (ParseException ex) {
            Logger.getLogger(SuperUserFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addnewItem;
    private javax.swing.JPanel bgPanel;
    private javax.swing.JLabel departmentTF;
    private javax.swing.JButton homeB;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable list;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logout;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel nameTF;
    private javax.swing.JComboBox<String> optionList;
    private javax.swing.JPanel profilePanel;
    private javax.swing.JButton refreshB;
    private javax.swing.JButton searchB;
    private javax.swing.JTextField searchTF;
    // End of variables declaration//GEN-END:variables
}
