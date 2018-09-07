
import com.sun.xml.internal.ws.util.StringUtils;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
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
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();

        jPanel1.setBackground(new Color(0, 0, 0, 0));
        logo.setBackground(new Color(0, 0, 0, 0));
        passwordTF.setEchoChar((char) 0);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        usernameTF = new javax.swing.JTextField();
        loginB = new javax.swing.JButton();
        passwordTF = new javax.swing.JPasswordField();
        background = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        setIconImages(null);
        setName("Inventory Management System"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Inventory Management System");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 550, 60));

        usernameTF.setText("Username");
        usernameTF.setSelectionStart(0);
        usernameTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameTFFocusLost(evt);
            }
        });
        usernameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTFActionPerformed(evt);
            }
        });
        usernameTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameTFKeyPressed(evt);
            }
        });

        loginB.setBackground(new java.awt.Color(0, 51, 153));
        loginB.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        loginB.setForeground(new java.awt.Color(255, 255, 255));
        loginB.setText("Log in");
        loginB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBActionPerformed(evt);
            }
        });
        loginB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginBKeyPressed(evt);
            }
        });

        passwordTF.setText("Password");
        passwordTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordTFFocusLost(evt);
            }
        });
        passwordTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordTFKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginB, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                    .addComponent(usernameTF, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordTF))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordTF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(loginB, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        usernameTF.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 360, 170));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/bg.png"))); // NOI18N
        background.setText("x");
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 560));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logo.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 240, 230));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTFActionPerformed

    private void passwordTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTFFocusGained
        // TODO add your handling code here:

        if (passwordTF.getText().equals("Password")) {

        }

    }//GEN-LAST:event_passwordTFFocusGained

    private void passwordTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTFFocusLost
        // TODO add your handling code here:{

        if (passwordTF.getText().equals("Password") || passwordTF.getText().isEmpty() || passwordTF.getText().equals(" ")) {
            passwordTF.setText("Password");
            passwordTF.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_passwordTFFocusLost

    private void usernameTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTFFocusGained
        // TODO add your handling code here:
        if (usernameTF.getText().equals("Username")) {

        }
    }//GEN-LAST:event_usernameTFFocusGained

    private void usernameTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTFFocusLost
        // TODO add your handling code here:

        if (usernameTF.getText().equals("Username") || usernameTF.getText().isEmpty() || usernameTF.getText().equals(" ")) {
            usernameTF.setText("Username");

        }
    }//GEN-LAST:event_usernameTFFocusLost

    private void usernameTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameTFKeyPressed
        // TODO add your handling code here:
        if (usernameTF.getText().equals("Username") || usernameTF.getText().isEmpty()) {
            usernameTF.setText("");

        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            submit();
        }
    }//GEN-LAST:event_usernameTFKeyPressed

    private void passwordTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordTFKeyPressed
        // TODO add your handling code here:
        if (passwordTF.getText().equals("Password")) {
            passwordTF.setText("");
            passwordTF.setEchoChar('*');
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            submit();
        }
    }//GEN-LAST:event_passwordTFKeyPressed

    private void loginBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBActionPerformed
        // TODO add your handling code here:
        submit();


    }//GEN-LAST:event_loginBActionPerformed

    private void loginBKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginBKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_loginBKeyPressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);

            }
        });
    }

    public void submit() {
        if ((usernameTF.getText().isEmpty() || passwordTF.getText().isEmpty())
                || (usernameTF.getText().equals("Username") | passwordTF.getText().equals("Password"))) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please fill out all tab!");
        } else {
            DatabaseTransaction dt = new DatabaseTransaction();
            if (dt.login(usernameTF.getText(), passwordTF.getText())) {

                if (dt.user_access.get(0).toString().equals("SuperAdmin")) {
                    new SuperUserFrame(dt.user_id.get(0), dt.user_name.get(0), dt.user_lastname.get(0), dt.user_department.get(0), passwordTF.getText()).show();
                    dispose();
                } else if (dt.user_access.get(0).toString().equals("Admin")) {
                    new AdminFrame(dt.user_id.get(0), dt.user_name.get(0), dt.user_lastname.get(0), dt.user_department.get(0), passwordTF.getText()).show();
                    dispose();
                } else if (dt.user_access.get(0).toString().equals("Encoder")) {
                    new UserFrame(dt.user_id.get(0), dt.user_name.get(0), dt.user_lastname.get(0), dt.user_department.get(0), passwordTF.getText()).show();
                    dispose();

                } else if (dt.user_access.get(0).toString().equals("InActive")) {
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(null, "Your account is currently disabled please contact your department admin");
                }
            } else {

                JOptionPane.showMessageDialog(null, "No user found");
            }

        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginB;
    private javax.swing.JLabel logo;
    private javax.swing.JPasswordField passwordTF;
    private javax.swing.JTextField usernameTF;
    // End of variables declaration//GEN-END:variables
}
