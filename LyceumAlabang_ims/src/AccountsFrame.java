
import java.awt.Toolkit;
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
public class AccountsFrame extends javax.swing.JFrame {

    /**
     * Creates new form AccountsFrame
     */
    private String id;
    private String username;
    private String password;
    private String name;
    private String lastname;
    private String access;
    private String department;
    DefaultTableModel user;
    DatabaseTransaction dt = new DatabaseTransaction();
    AccountInfoFrame af = new AccountInfoFrame();
    addUserFrame auf = new addUserFrame();
    int click = 0, x;

    public AccountsFrame() {
        initComponents();
        user = (DefaultTableModel) userTable.getModel();
        getUser();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        userList = new javax.swing.JComboBox<>();
        departmentList = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        selectB = new javax.swing.JButton();
        addNewB = new javax.swing.JButton();
        closeB = new javax.swing.JButton();
        refreshB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Accounts");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        userTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        userTable.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Lastname", "Username", "Department", "Access"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        userTable.setGridColor(new java.awt.Color(255, 255, 255));
        userTable.setRowHeight(40);
        userTable.setSelectionBackground(new java.awt.Color(255, 255, 204));
        userTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        userTable.getTableHeader().setReorderingAllowed(false);
        userTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(userTable);

        userList.setBackground(new java.awt.Color(255, 255, 204));
        userList.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        userList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Admin", "Encoder", "InActive" }));
        userList.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                userListItemStateChanged(evt);
            }
        });
        userList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userListActionPerformed(evt);
            }
        });

        departmentList.setBackground(new java.awt.Color(255, 255, 204));
        departmentList.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        departmentList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "HRM", "Chem lab", "Supplies", "Bookstore", "Electronics lab" }));
        departmentList.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                departmentListItemStateChanged(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 204));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Department");

        jLabel2.setBackground(new java.awt.Color(255, 255, 204));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Access:");

        selectB.setBackground(new java.awt.Color(255, 255, 204));
        selectB.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        selectB.setText("Select");
        selectB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBActionPerformed(evt);
            }
        });

        addNewB.setBackground(new java.awt.Color(255, 255, 204));
        addNewB.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        addNewB.setText("Add New");
        addNewB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewBActionPerformed(evt);
            }
        });

        closeB.setBackground(new java.awt.Color(255, 255, 204));
        closeB.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        closeB.setText("Close");
        closeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBActionPerformed(evt);
            }
        });

        refreshB.setBackground(new java.awt.Color(255, 255, 204));
        refreshB.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        refreshB.setText("Refresh");
        refreshB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(refreshB, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 305, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(userList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(departmentList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(selectB, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addNewB, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(closeB, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(userList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(departmentList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addComponent(refreshB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectB)
                    .addComponent(addNewB)
                    .addComponent(closeB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTableMouseClicked
        // TODO add your handling code here:
        int index = userTable.getSelectedRow();

        x++;
        if (x == 2) {

            if (af.isVisible() != true) {
                editUser();
            } else {
                af.dispose();
                editUser();

            }

            x = 0;
        }


    }//GEN-LAST:event_userTableMouseClicked

    private void closeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_closeBActionPerformed

    private void addNewBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewBActionPerformed
        // TODO add your handling code here:
        auf.getDept(department);
        if (auf.isVisible() != true) {

            auf.show();
        } else {
            auf.dispose();
            auf.show();

        }

    }//GEN-LAST:event_addNewBActionPerformed

    private void selectBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBActionPerformed
        // TODO add your handling code here:
        try {

            if (af.isVisible() != true) {
                editUser();
            } else {
                af.dispose();
                editUser();

            }
        } catch (Exception e) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please select user");
        }
    }//GEN-LAST:event_selectBActionPerformed

    private void userListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userListActionPerformed

    private void userListItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_userListItemStateChanged
        // TODO add your handling code here:
        dt.user_id.removeAll(dt.user_id);
        getUser();
    }//GEN-LAST:event_userListItemStateChanged

    private void departmentListItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_departmentListItemStateChanged
        // TODO add your handling code here:
        dt.user_id.removeAll(dt.user_id);
        getUser();
    }//GEN-LAST:event_departmentListItemStateChanged

    private void refreshBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBActionPerformed
        // TODO add your handling code here:
        getUser();
    }//GEN-LAST:event_refreshBActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        getUser();
    }//GEN-LAST:event_formWindowClosed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        getUser();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(AccountsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountsFrame().setVisible(true);
            }
        });
    }

    public void getUser() {
        dt.displayUser(userList.getSelectedItem().toString(), departmentList.getSelectedItem().toString());
        populateUserTable();
    }

    void populateUserTable() {
        int a = user.getRowCount();

        while (a > 0) {
            user.removeRow(a - 1);
            a--;
        }

        for (int x = 0; x < dt.user_name.size(); x++) {
            user.insertRow(user.getRowCount(),
                    new Object[]{dt.user_name.get(x), dt.user_lastname.get(x), dt.user_username.get(x), dt.user_department.get(x), dt.user_access.get(x)});
        }
        

    }

    void editUser() {
        int index = userTable.getSelectedRow();
        dt.getUser(dt.user_id.get(index));
        af.initializeFields(dt.user_id.get(index), dt.user_username.get(0),dt.user_name.get(0),dt.user_lastname.get(0),dt.user_password.get(0), dt.user_access.get(0), dt.user_department.get(0),access);
        af.show();
        dt.clearUserArray();
    }

    void getUserId(String id) {

        this.id = id;
        auf.getUserId(id);
        dt.getUser(id);

        this.username = dt.user_username.get(0);
        this.name = dt.user_name.get(0);
        this.lastname = dt.user_lastname.get(0);
        this.access = dt.user_access.get(0);
        this.department = dt.user_department.get(0);
        
    }

    void getDept(String department) {
        if (department.equals("HRM")) {
            departmentList.setSelectedIndex(1);

        } else if (department.equals("Chem lab")) {
            departmentList.setSelectedIndex(2);

        } else if (department.equals("Supplies")) {
            departmentList.setSelectedIndex(3);

        } else if (department.equals("Bookstore")) {
            departmentList.setSelectedIndex(4);

        } else if (department.equals("Electronics lab")) {
            departmentList.setSelectedIndex(5);

        }
        departmentList.setEnabled(false);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewB;
    private javax.swing.JButton closeB;
    private javax.swing.JComboBox<String> departmentList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton refreshB;
    private javax.swing.JButton selectB;
    private javax.swing.JComboBox<String> userList;
    private javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables
}
