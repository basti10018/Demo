
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Basti
 */
public class IMS_SuperUser extends javax.swing.JFrame {

    /**
     * Creates new form IMS_SuperUser
     */
    IMS_UserLogin s = new IMS_UserLogin();
    public IMS_SuperUser() {
        initComponents();
         displayNameL.setText(" "+s.name+" "+s.lname);
         displayEmpNoL.setText(" "+s.id);
          setTitle("INVENTORY MANAGEMENT SYSTEM");
       
         DateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a");
         DateFormat fullDf = DateFormat.getDateInstance(DateFormat.FULL);
         ActionListener timerListener = new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
               
                Date date = new Date();
                String d = fullDf.format(new Date());
                String t =timeFormat.format(date);
                timeL.setText(t);
                dateL.setText(d);
            }
        };
        Timer timer = new Timer(1000, timerListener);
        // to make sure it doesn't wait one second at the start
        timer.setInitialDelay(0);
        timer.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerP = new javax.swing.JPanel();
        avatarL = new javax.swing.JLabel();
        nameL = new javax.swing.JLabel();
        empNoL = new javax.swing.JLabel();
        displayNameL = new javax.swing.JLabel();
        displayEmpNoL = new javax.swing.JLabel();
        logoutL = new javax.swing.JLabel();
        logoutB = new javax.swing.JLabel();
        mainFormP = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        Accounts = new javax.swing.JButton();
        actB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        stockB = new javax.swing.JButton();
        addB = new javax.swing.JButton();
        orderB = new javax.swing.JButton();
        invoiceB = new javax.swing.JButton();
        dateL = new javax.swing.JLabel();
        timeL = new javax.swing.JLabel();
        mainDP = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerP.setBackground(new java.awt.Color(255, 255, 255));
        headerP.setBorder(new javax.swing.border.MatteBorder(null));
        headerP.setPreferredSize(new java.awt.Dimension(1408, 620));

        avatarL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/avatar.png"))); // NOI18N

        nameL.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        nameL.setText("Name:");

        empNoL.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        empNoL.setText("Employee No:");

        displayNameL.setText("Sebasthian Pacudan");

        displayEmpNoL.setText("201402510");

        logoutL.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        logoutL.setText("Logout");

        logoutB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit.png"))); // NOI18N
        logoutB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutBMouseClicked(evt);
            }
        });

        mainFormP.setBackground(new java.awt.Color(153, 153, 153));
        mainFormP.setBorder(new javax.swing.border.MatteBorder(null));

        menuPanel.setBackground(new java.awt.Color(255, 255, 153));
        menuPanel.setBorder(new javax.swing.border.MatteBorder(null));

        Accounts.setBackground(new java.awt.Color(255, 255, 255));
        Accounts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personalCard.png"))); // NOI18N
        Accounts.setText("Accounts");
        Accounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountsActionPerformed(evt);
            }
        });

        actB.setBackground(new java.awt.Color(255, 255, 255));
        actB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/status.png"))); // NOI18N
        actB.setText("Activities");
        actB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actBActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menu");

        stockB.setBackground(new java.awt.Color(255, 255, 255));
        stockB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/commerce.png"))); // NOI18N
        stockB.setText("Stock");
        stockB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockBActionPerformed(evt);
            }
        });

        addB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/box.png"))); // NOI18N
        addB.setText("New Item");
        addB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBActionPerformed(evt);
            }
        });

        orderB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telephone.png"))); // NOI18N
        orderB.setText("Add Item");
        orderB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderBActionPerformed(evt);
            }
        });

        invoiceB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/verification-of-delivery-list-clipboard-symbol.png"))); // NOI18N
        invoiceB.setText("Invoice");
        invoiceB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(actB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Accounts, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
            .addComponent(stockB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(addB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(orderB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(invoiceB, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Accounts, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(actB, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(orderB)
                .addGap(18, 18, 18)
                .addComponent(addB)
                .addGap(18, 18, 18)
                .addComponent(stockB, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuPanelLayout.createSequentialGroup()
                    .addGap(235, 235, 235)
                    .addComponent(invoiceB)
                    .addContainerGap(235, Short.MAX_VALUE)))
        );

        dateL.setText("MM/DD/YYYY");

        timeL.setText("HH:MM:SS");

        mainDP.setBackground(new java.awt.Color(153, 153, 153));
        mainDP.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout mainDPLayout = new javax.swing.GroupLayout(mainDP);
        mainDP.setLayout(mainDPLayout);
        mainDPLayout.setHorizontalGroup(
            mainDPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        mainDPLayout.setVerticalGroup(
            mainDPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout mainFormPLayout = new javax.swing.GroupLayout(mainFormP);
        mainFormP.setLayout(mainFormPLayout);
        mainFormPLayout.setHorizontalGroup(
            mainFormPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainFormPLayout.createSequentialGroup()
                .addGroup(mainFormPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainFormPLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(mainFormPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateL)
                            .addComponent(timeL)))
                    .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainDP))
        );
        mainFormPLayout.setVerticalGroup(
            mainFormPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainFormPLayout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(timeL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(mainDP, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout headerPLayout = new javax.swing.GroupLayout(headerP);
        headerP.setLayout(headerPLayout);
        headerPLayout.setHorizontalGroup(
            headerPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPLayout.createSequentialGroup()
                .addComponent(avatarL)
                .addGap(39, 39, 39)
                .addGroup(headerPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerPLayout.createSequentialGroup()
                        .addComponent(nameL)
                        .addGap(18, 18, 18)
                        .addComponent(displayNameL))
                    .addGroup(headerPLayout.createSequentialGroup()
                        .addComponent(empNoL)
                        .addGap(18, 18, 18)
                        .addComponent(displayEmpNoL)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1050, Short.MAX_VALUE)
                .addGroup(headerPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPLayout.createSequentialGroup()
                        .addComponent(logoutL)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPLayout.createSequentialGroup()
                        .addComponent(logoutB)
                        .addGap(20, 20, 20))))
            .addComponent(mainFormP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        headerPLayout.setVerticalGroup(
            headerPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPLayout.createSequentialGroup()
                .addGroup(headerPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerPLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(headerPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(empNoL)
                            .addComponent(displayEmpNoL))
                        .addGap(81, 81, 81))
                    .addGroup(headerPLayout.createSequentialGroup()
                        .addGroup(headerPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(headerPLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(logoutB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(logoutL))
                            .addComponent(avatarL)
                            .addGroup(headerPLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(headerPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(displayNameL)
                                    .addComponent(nameL))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)))
                .addComponent(mainFormP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1486, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerP, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBActionPerformed
        // TODO add your handling code here:
        Add_frame add = new Add_frame();

        this.mainDP.add(add);

        add.show();
    }//GEN-LAST:event_addBActionPerformed

    private void stockBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockBActionPerformed
        // TODO add your handling code here:
        Stock_frame stock = new Stock_frame();

        this.mainDP.add(stock);
        stock.show();
    }//GEN-LAST:event_stockBActionPerformed

    private void actBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actBActionPerformed
        // TODO add your handling code here:

        Activities_frame log = new Activities_frame();

        this.mainDP.add(log);
        log.show();
    }//GEN-LAST:event_actBActionPerformed

    private void AccountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountsActionPerformed
        Account_frame acc = new Account_frame();

        this.mainDP.add(acc);
        acc.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_AccountsActionPerformed

    private void logoutBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBMouseClicked
        // TODO add your handling code here:
        int a =JOptionPane.showConfirmDialog(null,"LOGOUT?","INVENTORY MANAGEMENT SYSTEM",JOptionPane.YES_NO_OPTION);

        if(a ==0){
            setVisible(false);
            IMS_UserLogin s = new IMS_UserLogin();
            s.setVisible(true);

        }
    }//GEN-LAST:event_logoutBMouseClicked

    private void orderBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderBActionPerformed
        Order_frame order = new Order_frame();

        this.mainDP.add(order);
        order.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_orderBActionPerformed

    private void invoiceBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceBActionPerformed
        // TODO add your handling code here:

        Invoice_form invoice = new Invoice_form();

        this.mainDP.add(invoice);
        invoice.show();
    }//GEN-LAST:event_invoiceBActionPerformed

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Accounts;
    private javax.swing.JButton actB;
    private javax.swing.JButton addB;
    private javax.swing.JLabel avatarL;
    private javax.swing.JLabel dateL;
    private javax.swing.JLabel displayEmpNoL;
    private javax.swing.JLabel displayNameL;
    private javax.swing.JLabel empNoL;
    private javax.swing.JPanel headerP;
    private javax.swing.JButton invoiceB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel logoutB;
    private javax.swing.JLabel logoutL;
    private javax.swing.JDesktopPane mainDP;
    private javax.swing.JPanel mainFormP;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel nameL;
    private javax.swing.JButton orderB;
    private javax.swing.JButton stockB;
    private javax.swing.JLabel timeL;
    // End of variables declaration//GEN-END:variables

}
