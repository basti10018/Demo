
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
public class IMS_Settings extends javax.swing.JFrame {

    /**
     * Creates new form IMS_Settings
     */
    public IMS_Settings() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        settingPanel = new javax.swing.JPanel();
        emailL = new javax.swing.JLabel();
        contactL = new javax.swing.JLabel();
        addressL = new javax.swing.JLabel();
        emailTF = new javax.swing.JTextField();
        contactTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressTF = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        emergencyPanel = new javax.swing.JPanel();
        eNameL = new javax.swing.JLabel();
        eContactL = new javax.swing.JLabel();
        eAddressL = new javax.swing.JLabel();
        eEmailL = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        eAddressTF = new javax.swing.JTextArea();
        eNameTF = new javax.swing.JTextField();
        eContactTF = new javax.swing.JTextField();
        eEmailTF = new javax.swing.JTextField();
        eRelationL = new javax.swing.JLabel();
        eRelationTF = new javax.swing.JTextField();
        saveB = new javax.swing.JButton();
        cancelB = new javax.swing.JButton();
        passwordL = new javax.swing.JLabel();
        newPasswordL = new javax.swing.JLabel();
        confrimPassL = new javax.swing.JLabel();
        passwordPF = new javax.swing.JPasswordField();
        newPasswordPF = new javax.swing.JPasswordField();
        confirmPassPF = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        settingPanel.setBackground(new java.awt.Color(204, 204, 204));

        emailL.setText("Email");

        contactL.setText("Contact No.");

        addressL.setText("Address");

        emailTF.setBackground(new java.awt.Color(255, 255, 153));

        contactTF.setBackground(new java.awt.Color(255, 255, 153));

        addressTF.setBackground(new java.awt.Color(255, 255, 153));
        addressTF.setColumns(20);
        addressTF.setRows(5);
        jScrollPane1.setViewportView(addressTF);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel1.setText("Incase of emergency person to notify");

        emergencyPanel.setBackground(new java.awt.Color(153, 153, 153));

        eNameL.setText("Name");

        eContactL.setText("Contact");

        eAddressL.setText("Address");

        eEmailL.setText("Email");

        eAddressTF.setBackground(new java.awt.Color(255, 255, 153));
        eAddressTF.setColumns(20);
        eAddressTF.setRows(5);
        jScrollPane2.setViewportView(eAddressTF);

        eNameTF.setBackground(new java.awt.Color(255, 255, 153));
        eNameTF.setText(" ");

        eContactTF.setBackground(new java.awt.Color(255, 255, 153));
        eContactTF.setText(" ");

        eEmailTF.setBackground(new java.awt.Color(255, 255, 153));
        eEmailTF.setText(" ");
        eEmailTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eEmailTFActionPerformed(evt);
            }
        });

        eRelationL.setText("Relation");

        eRelationTF.setBackground(new java.awt.Color(255, 255, 153));
        eRelationTF.setText(" ");

        saveB.setBackground(new java.awt.Color(255, 255, 153));
        saveB.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        saveB.setText("Save");
        saveB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBActionPerformed(evt);
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

        javax.swing.GroupLayout emergencyPanelLayout = new javax.swing.GroupLayout(emergencyPanel);
        emergencyPanel.setLayout(emergencyPanelLayout);
        emergencyPanelLayout.setHorizontalGroup(
            emergencyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, emergencyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(emergencyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(emergencyPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(saveB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelB))
                    .addGroup(emergencyPanelLayout.createSequentialGroup()
                        .addGroup(emergencyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(emergencyPanelLayout.createSequentialGroup()
                                .addComponent(eNameL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(eNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(emergencyPanelLayout.createSequentialGroup()
                                .addComponent(eRelationL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(eRelationTF, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(emergencyPanelLayout.createSequentialGroup()
                                .addComponent(eEmailL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(eEmailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(emergencyPanelLayout.createSequentialGroup()
                                .addComponent(eContactL)
                                .addGap(26, 26, 26)
                                .addComponent(eContactTF, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(192, 192, 192)
                        .addComponent(eAddressL)
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
        );
        emergencyPanelLayout.setVerticalGroup(
            emergencyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emergencyPanelLayout.createSequentialGroup()
                .addGroup(emergencyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(emergencyPanelLayout.createSequentialGroup()
                        .addGroup(emergencyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(emergencyPanelLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(emergencyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(eNameL)
                                    .addComponent(eNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(emergencyPanelLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(eAddressL)))
                        .addGap(18, 18, 18)
                        .addGroup(emergencyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eContactTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eContactL))
                        .addGap(18, 18, 18)
                        .addGroup(emergencyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eEmailL)
                            .addComponent(eEmailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(emergencyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eRelationL)
                            .addComponent(eRelationTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(emergencyPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(emergencyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelB)
                    .addComponent(saveB))
                .addGap(20, 20, 20))
        );

        passwordL.setText("Password");

        newPasswordL.setText("New Password");

        confrimPassL.setText("Re-enter New password");

        passwordPF.setBackground(new java.awt.Color(255, 255, 153));

        newPasswordPF.setBackground(new java.awt.Color(255, 255, 153));

        confirmPassPF.setBackground(new java.awt.Color(255, 255, 153));

        javax.swing.GroupLayout settingPanelLayout = new javax.swing.GroupLayout(settingPanel);
        settingPanel.setLayout(settingPanelLayout);
        settingPanelLayout.setHorizontalGroup(
            settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(emergencyPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(settingPanelLayout.createSequentialGroup()
                .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(settingPanelLayout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jLabel1))
                    .addGroup(settingPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contactL)
                            .addComponent(emailL))
                        .addGap(28, 28, 28)
                        .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(contactTF, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101)
                        .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, settingPanelLayout.createSequentialGroup()
                                .addComponent(confrimPassL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(confirmPassPF, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(settingPanelLayout.createSequentialGroup()
                                .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(settingPanelLayout.createSequentialGroup()
                                        .addComponent(newPasswordL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingPanelLayout.createSequentialGroup()
                                        .addComponent(passwordL)
                                        .addGap(79, 79, 79)))
                                .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordPF, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(newPasswordPF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(settingPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(addressL)
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        settingPanelLayout.setVerticalGroup(
            settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailL)
                    .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordL)
                    .addComponent(passwordPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactL)
                    .addComponent(contactTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newPasswordL)
                    .addComponent(newPasswordPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confrimPassL)
                    .addComponent(confirmPassPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emergencyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(settingPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(settingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBActionPerformed
        // TODO add your handling code here:
        int a =JOptionPane.showConfirmDialog(null,"Save Changes?","INVENTORY MANAGEMENT SYSTEM",JOptionPane.YES_NO_OPTION);

        if(a ==0){
              JOptionPane.showMessageDialog(null,"Saved!");
              setVisible(false);
        }
        
    }//GEN-LAST:event_saveBActionPerformed

    private void cancelBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBActionPerformed
        // TODO add your handling code here:
        int a =JOptionPane.showConfirmDialog(null,"All unsaved data will be lost","INVENTORY MANAGEMENT SYSTEM",JOptionPane.YES_NO_OPTION);

        if(a ==0){
              setVisible(false);
        }
    }//GEN-LAST:event_cancelBActionPerformed

    private void eEmailTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eEmailTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eEmailTFActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressL;
    private javax.swing.JTextArea addressTF;
    private javax.swing.JButton cancelB;
    private javax.swing.JPasswordField confirmPassPF;
    private javax.swing.JLabel confrimPassL;
    private javax.swing.JLabel contactL;
    private javax.swing.JTextField contactTF;
    private javax.swing.JLabel eAddressL;
    private javax.swing.JTextArea eAddressTF;
    private javax.swing.JLabel eContactL;
    private javax.swing.JTextField eContactTF;
    private javax.swing.JLabel eEmailL;
    private javax.swing.JTextField eEmailTF;
    private javax.swing.JLabel eNameL;
    private javax.swing.JTextField eNameTF;
    private javax.swing.JLabel eRelationL;
    private javax.swing.JTextField eRelationTF;
    private javax.swing.JLabel emailL;
    private javax.swing.JTextField emailTF;
    private javax.swing.JPanel emergencyPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel newPasswordL;
    private javax.swing.JPasswordField newPasswordPF;
    private javax.swing.JLabel passwordL;
    private javax.swing.JPasswordField passwordPF;
    private javax.swing.JButton saveB;
    private javax.swing.JPanel settingPanel;
    // End of variables declaration//GEN-END:variables
}
