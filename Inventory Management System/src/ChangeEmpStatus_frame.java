/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Basti Pogi
 */
public class ChangeEmpStatus_frame extends javax.swing.JFrame {

    /**
     * Creates new form ChangeEmpStatus_frame
     */
    public ChangeEmpStatus_frame() {
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

        addPanel4 = new javax.swing.JPanel();
        empNoL = new javax.swing.JLabel();
        employeeNoTF = new javax.swing.JTextField();
        employeeAccessCB = new javax.swing.JComboBox<>();
        saveB = new javax.swing.JButton();
        cancelB4 = new javax.swing.JButton();
        empNameL = new javax.swing.JLabel();
        employeeNameTF = new javax.swing.JTextField();
        accessL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        addPanel4.setBackground(new java.awt.Color(204, 204, 204));
        addPanel4.setBorder(new javax.swing.border.MatteBorder(null));

        empNoL.setText("Employee No.");

        employeeNoTF.setEditable(false);
        employeeNoTF.setBackground(new java.awt.Color(204, 204, 255));

        employeeAccessCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Admin", "Inactive" }));

        saveB.setBackground(new java.awt.Color(255, 255, 153));
        saveB.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        saveB.setText("Save");
        saveB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBActionPerformed(evt);
            }
        });

        cancelB4.setBackground(new java.awt.Color(255, 255, 153));
        cancelB4.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        cancelB4.setText("Cancel");
        cancelB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelB4ActionPerformed(evt);
            }
        });

        empNameL.setText("Name:");

        employeeNameTF.setEditable(false);
        employeeNameTF.setBackground(new java.awt.Color(204, 204, 255));

        accessL.setText("Access:");

        javax.swing.GroupLayout addPanel4Layout = new javax.swing.GroupLayout(addPanel4);
        addPanel4.setLayout(addPanel4Layout);
        addPanel4Layout.setHorizontalGroup(
            addPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addPanel4Layout.createSequentialGroup()
                            .addComponent(empNoL)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(employeeNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(addPanel4Layout.createSequentialGroup()
                            .addGroup(addPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(empNameL)
                                .addComponent(accessL))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(addPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(employeeAccessCB, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(employeeNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(addPanel4Layout.createSequentialGroup()
                        .addComponent(saveB, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelB4)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        addPanel4Layout.setVerticalGroup(
            addPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empNoL)
                    .addComponent(employeeNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(addPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empNameL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accessL)
                    .addComponent(employeeAccessCB, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(addPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveB)
                    .addComponent(cancelB4))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(addPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(addPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBActionPerformed
        

    }//GEN-LAST:event_saveBActionPerformed

    private void cancelB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelB4ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_cancelB4ActionPerformed

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
            java.util.logging.Logger.getLogger(ChangeEmpStatus_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeEmpStatus_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeEmpStatus_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeEmpStatus_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeEmpStatus_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accessL;
    private javax.swing.JPanel addPanel4;
    private javax.swing.JButton cancelB4;
    private javax.swing.JLabel empNameL;
    private javax.swing.JLabel empNoL;
    private javax.swing.JComboBox<String> employeeAccessCB;
    private javax.swing.JTextField employeeNameTF;
    private javax.swing.JTextField employeeNoTF;
    private javax.swing.JButton saveB;
    // End of variables declaration//GEN-END:variables
}
