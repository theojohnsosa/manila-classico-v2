package manila.classico.v2;

import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class PaymentDetailsPage extends javax.swing.JFrame {
    
    private static final Logger logger = Logger.getLogger(PaymentDetailsPage.class.getName());
    
    private boolean payNowProcessed = false;
    
    public PaymentDetailsPage(String fullName, String contact, String service, String barber, String date, String time, String price, String totalAmount) {
        initComponents();

        customerTextField.setText(fullName);
        contactTextField.setText(contact);
        serviceTextField.setText(service);
        barberTextField.setText(barber);
        dateTextField.setText(date);
        timeTextField.setText(time);
        totalAmountTextField.setText(totalAmount);

        payNowButton.setEnabled(false);

        ButtonGroup group = new ButtonGroup();
        group.add(cashToggleButton);
        group.add(gcashToggleButton);

        cashToggleButton.setSelected(false);
        gcashToggleButton.setSelected(false);

        Runnable validate = () -> {
            String amountInput = paymentAmountTextField.getText().trim();
            String total = totalAmountTextField.getText().replace("₱", "").trim();
            String contactInput = contactTextField.getText().trim();

            boolean methodSelected = cashToggleButton.isSelected() || gcashToggleButton.isSelected();
            boolean hasContact = !contactInput.isEmpty();
            boolean correctAmount = !amountInput.isEmpty() && amountInput.equals(total);

            payNowButton.setEnabled(methodSelected && hasContact && correctAmount);
        };

        paymentAmountTextField.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) { 
                validate.run(); 
            }
            
            public void removeUpdate(DocumentEvent e) { 
                validate.run(); 
            }
            
            public void changedUpdate(DocumentEvent e) { 
                validate.run(); 
            }
        });

        contactTextField.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) { 
                validate.run(); 
            }
            
            public void removeUpdate(DocumentEvent e) { 
                validate.run(); 
            }
            
            public void changedUpdate(DocumentEvent e) { 
                validate.run(); 
            }
        });

        cashToggleButton.addActionListener(e -> validate.run());
        gcashToggleButton.addActionListener(e -> validate.run());

        payNowButton.addActionListener(e -> {
            String paymentMethod = cashToggleButton.isSelected() ? "Cash" : "GCash";
            String full = customerTextField.getText().trim();
            String cont = contactTextField.getText().trim();
            String serv = serviceTextField.getText().trim();
            String bar = barberTextField.getText().trim();
            String d = dateTextField.getText().trim();
            String t = timeTextField.getText().trim();
            String total = totalAmountTextField.getText().trim();

            ReservationsData.addReservation(full, cont, serv, bar, d, t, paymentMethod, total);

            UserSelectPage userSelectPage = new UserSelectPage();
            userSelectPage.setLocationRelativeTo(null);
            userSelectPage.setResizable(false);
            userSelectPage.setVisible(true);

            this.dispose();
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        customerTextField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        cashToggleButton = new javax.swing.JToggleButton();
        gcashToggleButton = new javax.swing.JToggleButton();
        jLabel12 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        paymentAmountTextField = new javax.swing.JTextField();
        payNowButton = new javax.swing.JButton();
        contactTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        serviceTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        dateTextField = new javax.swing.JTextField();
        barberTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        timeTextField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        totalAmountTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(253, 253, 254));

        backButton.setBackground(new java.awt.Color(253, 253, 254));
        backButton.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        backButton.setForeground(new java.awt.Color(0, 0, 0));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-left-arrow-20.png"))); // NOI18N
        backButton.setText("Back to Booking");
        backButton.setBorder(null);
        backButton.setFocusPainted(false);
        backButton.setFocusable(false);
        backButton.setOpaque(true);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Payment Details");

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(154, 164, 177));
        jLabel2.setText("Complete your reservation payment");

        jLabel3.setFont(new java.awt.Font("SF Pro Display", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Reservation Summary");

        jLabel4.setFont(new java.awt.Font("SF Pro Display", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(154, 164, 177));
        jLabel4.setText("Customer:");

        customerTextField.setBackground(new java.awt.Color(253, 253, 254));
        customerTextField.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        customerTextField.setForeground(new java.awt.Color(0, 0, 0));
        customerTextField.setBorder(null);
        customerTextField.setFocusable(false);

        jPanel2.setBackground(new java.awt.Color(253, 253, 254));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(154, 164, 177)));

        jLabel11.setFont(new java.awt.Font("SF Pro Display", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Payment Method");

        cashToggleButton.setBackground(new java.awt.Color(164, 145, 129));
        cashToggleButton.setFont(new java.awt.Font("SF Pro Display", 1, 15)); // NOI18N
        cashToggleButton.setForeground(new java.awt.Color(255, 255, 255));
        cashToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-money-20.png"))); // NOI18N
        cashToggleButton.setText("Cash Payment");
        cashToggleButton.setBorder(null);
        cashToggleButton.setFocusPainted(false);
        cashToggleButton.setFocusable(false);
        cashToggleButton.setOpaque(true);

        gcashToggleButton.setBackground(new java.awt.Color(164, 145, 129));
        gcashToggleButton.setFont(new java.awt.Font("SF Pro Display", 1, 15)); // NOI18N
        gcashToggleButton.setForeground(new java.awt.Color(255, 255, 255));
        gcashToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-mobile-phone-20.png"))); // NOI18N
        gcashToggleButton.setText("GCash");
        gcashToggleButton.setBorder(null);
        gcashToggleButton.setFocusPainted(false);
        gcashToggleButton.setFocusable(false);
        gcashToggleButton.setOpaque(true);

        jLabel12.setFont(new java.awt.Font("SF Pro Display", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Payment Details");

        jTextField2.setBackground(new java.awt.Color(253, 253, 254));
        jTextField2.setFont(new java.awt.Font("SF Pro Display", 0, 13)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(154, 164, 177)));

        jLabel13.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Phone Number");

        jLabel14.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Your Payment Amount");

        paymentAmountTextField.setBackground(new java.awt.Color(253, 253, 254));
        paymentAmountTextField.setFont(new java.awt.Font("SF Pro Display", 0, 13)); // NOI18N
        paymentAmountTextField.setForeground(new java.awt.Color(0, 0, 0));
        paymentAmountTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(154, 164, 177)));

        payNowButton.setBackground(new java.awt.Color(164, 145, 129));
        payNowButton.setFont(new java.awt.Font("SF Pro Display", 1, 15)); // NOI18N
        payNowButton.setForeground(new java.awt.Color(255, 255, 255));
        payNowButton.setText("Pay Now");
        payNowButton.setBorder(null);
        payNowButton.setFocusable(false);
        payNowButton.setOpaque(true);
        payNowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payNowButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(cashToggleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gcashToggleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField2)
                    .addComponent(paymentAmountTextField)
                    .addComponent(jLabel14)
                    .addComponent(payNowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(cashToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gcashToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paymentAmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(payNowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        contactTextField.setBackground(new java.awt.Color(253, 253, 254));
        contactTextField.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        contactTextField.setForeground(new java.awt.Color(0, 0, 0));
        contactTextField.setBorder(null);
        contactTextField.setFocusable(false);

        jLabel5.setFont(new java.awt.Font("SF Pro Display", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(154, 164, 177));
        jLabel5.setText("Contact:");

        jLabel6.setFont(new java.awt.Font("SF Pro Display", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(154, 164, 177));
        jLabel6.setText("Service:");

        serviceTextField.setBackground(new java.awt.Color(253, 253, 254));
        serviceTextField.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        serviceTextField.setForeground(new java.awt.Color(0, 0, 0));
        serviceTextField.setBorder(null);
        serviceTextField.setFocusable(false);

        jLabel7.setFont(new java.awt.Font("SF Pro Display", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(154, 164, 177));
        jLabel7.setText("Date:");

        dateTextField.setBackground(new java.awt.Color(253, 253, 254));
        dateTextField.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        dateTextField.setForeground(new java.awt.Color(0, 0, 0));
        dateTextField.setBorder(null);
        dateTextField.setFocusable(false);

        barberTextField.setBackground(new java.awt.Color(253, 253, 254));
        barberTextField.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        barberTextField.setForeground(new java.awt.Color(0, 0, 0));
        barberTextField.setBorder(null);
        barberTextField.setFocusable(false);

        jLabel8.setFont(new java.awt.Font("SF Pro Display", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(154, 164, 177));
        jLabel8.setText("Barber:");

        jLabel9.setFont(new java.awt.Font("SF Pro Display", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(154, 164, 177));
        jLabel9.setText("Time");

        timeTextField.setBackground(new java.awt.Color(253, 253, 254));
        timeTextField.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        timeTextField.setForeground(new java.awt.Color(0, 0, 0));
        timeTextField.setBorder(null);
        timeTextField.setFocusable(false);

        jLabel10.setFont(new java.awt.Font("SF Pro Display", 1, 30)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Total Amount:");

        totalAmountTextField.setBackground(new java.awt.Color(253, 253, 254));
        totalAmountTextField.setFont(new java.awt.Font("SF Pro Display", 1, 30)); // NOI18N
        totalAmountTextField.setForeground(new java.awt.Color(0, 0, 0));
        totalAmountTextField.setBorder(null);
        totalAmountTextField.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(customerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 258, Short.MAX_VALUE)
                        .addComponent(contactTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 261, Short.MAX_VALUE)
                        .addComponent(serviceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 276, Short.MAX_VALUE)
                        .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 266, Short.MAX_VALUE)
                        .addComponent(barberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 278, Short.MAX_VALUE)
                        .addComponent(timeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(backButton))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(totalAmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(backButton)
                .addGap(67, 67, 67)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(customerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(contactTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(serviceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(barberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(timeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(totalAmountTextField)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        UserSelectPage userSelectPage = new UserSelectPage();
        userSelectPage.setLocationRelativeTo(null);
        userSelectPage.setResizable(false);
        userSelectPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void payNowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payNowButtonActionPerformed
        if (payNowProcessed) return;
        payNowProcessed = true;

        String paymentMethod = cashToggleButton.isSelected() ? "Cash" : "GCash";
        String full  = customerTextField.getText().trim();
        String cont  = contactTextField.getText().trim();
        String serv  = serviceTextField.getText().trim();
        String bar   = barberTextField.getText().trim();
        String d     = dateTextField.getText().trim();
        String t     = timeTextField.getText().trim();
        String total = totalAmountTextField.getText().trim();

        boolean successfulReservation = ReservationsData.addReservation(full, cont, serv, bar, d, t, paymentMethod, total);
        
        if (!successfulReservation) {
            JOptionPane.showMessageDialog(null, "Payment successful! Reservation confirmed.");
        }

        payNowButton.setEnabled(false);

        UserSelectPage userSelectPage = new UserSelectPage();
        userSelectPage.setLocationRelativeTo(null);
        userSelectPage.setResizable(false);
        userSelectPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_payNowButtonActionPerformed

    public static void main(String args[]) {
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new PaymentDetailsPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTextField barberTextField;
    private javax.swing.JToggleButton cashToggleButton;
    private javax.swing.JTextField contactTextField;
    private javax.swing.JTextField customerTextField;
    private javax.swing.JTextField dateTextField;
    private javax.swing.JToggleButton gcashToggleButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton payNowButton;
    private javax.swing.JTextField paymentAmountTextField;
    private javax.swing.JTextField serviceTextField;
    private javax.swing.JTextField timeTextField;
    private javax.swing.JTextField totalAmountTextField;
    // End of variables declaration//GEN-END:variables
}
