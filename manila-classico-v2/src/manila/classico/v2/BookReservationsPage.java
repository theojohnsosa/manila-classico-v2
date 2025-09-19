package manila.classico.v2;

import java.util.Random;
import java.util.logging.Logger;

public class BookReservationsPage extends javax.swing.JFrame {
    
    private static final Logger logger = Logger.getLogger(BookReservationsPage.class.getName());

    public BookReservationsPage() {
        initComponents();
        loadServicesIntoComboBox();
        loadBarbersIntoComboBox();
        
        bookNowButton.addMouseListener(new java.awt.event.MouseAdapter() {
           public void mouseEntered(java.awt.event.MouseEvent evt) {
               bookNowButton.setBackground(new java.awt.Color(114, 74, 49));
           }
           
           public void mouseExited(java.awt.event.MouseEvent evt) {
               bookNowButton.setBackground(new java.awt.Color(164, 145, 129));
           } 
        });
        
        fullNameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
           public void mouseEntered(java.awt.event.MouseEvent evt) {
               fullNameTextField.setBackground(new java.awt.Color(239, 239, 239));
           }
           
           public void mouseExited(java.awt.event.MouseEvent evt) {
               fullNameTextField.setBackground(new java.awt.Color(253, 253, 254));
           } 
        });
        
        contactNumberTextField.addMouseListener(new java.awt.event.MouseAdapter() {
           public void mouseEntered(java.awt.event.MouseEvent evt) {
               contactNumberTextField.setBackground(new java.awt.Color(239, 239, 239));
           }
           
           public void mouseExited(java.awt.event.MouseEvent evt) {
               contactNumberTextField.setBackground(new java.awt.Color(253, 253, 254));
           } 
        });
    }
    
    private void loadServicesIntoComboBox() {
        serviceComboBox.removeAllItems(); 
        for (Service service : ServiceManager.getServices()) {
            serviceComboBox.addItem(service.getName() + " – ₱" + service.getPrice());
        }
    }
    
    public void loadBarbersIntoComboBox() {
        barberComboBox.removeAllItems();
        for (Barber barber : BarberManager.getBarbers()) {
            barberComboBox.addItem(barber.getName());
        }
    }
    
    private String generateUniqueReferenceNumber() {
        Random random = new Random();
        String reference;
        do {
            reference = String.valueOf(100000 + random.nextInt(900000));
        } while (CustomerManager.referenceExists(reference));
        return reference;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        fullNameTextField = new javax.swing.JTextField();
        contactNumberTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        serviceComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        barberComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        dateDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        timeComboBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        bookNowButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(253, 253, 254));

        jLabel7.setFont(new java.awt.Font("SF Pro Display", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("<html><div style=\"text-align: center;\">Book Reservation</div></html>");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel8.setFont(new java.awt.Font("SF Pro Display", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("<html><div style=\"text-align: center;\">Fill in your details to schedule your appointment</div></html>");

        backButton.setBackground(new java.awt.Color(253, 253, 254));
        backButton.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        backButton.setForeground(new java.awt.Color(0, 0, 0));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-left-arrow-20.png"))); // NOI18N
        backButton.setText("Back");
        backButton.setBorder(null);
        backButton.setFocusPainted(false);
        backButton.setFocusable(false);
        backButton.setOpaque(true);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(253, 253, 254));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(155, 164, 177), 1, true));

        fullNameTextField.setBackground(new java.awt.Color(253, 253, 254));
        fullNameTextField.setFont(new java.awt.Font("SF Pro Display", 1, 16)); // NOI18N
        fullNameTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(155, 164, 177), 1, true));
        fullNameTextField.setOpaque(true);
        fullNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fullNameTextFieldKeyTyped(evt);
            }
        });

        contactNumberTextField.setBackground(new java.awt.Color(253, 253, 254));
        contactNumberTextField.setFont(new java.awt.Font("SF Pro Display", 1, 16)); // NOI18N
        contactNumberTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(155, 164, 177), 1, true));
        contactNumberTextField.setOpaque(true);
        contactNumberTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contactNumberTextFieldKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Full Name");

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Contact Number");

        serviceComboBox.setBackground(new java.awt.Color(253, 253, 254));
        serviceComboBox.setFont(new java.awt.Font("SF Pro Display", 1, 16)); // NOI18N
        serviceComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Haircut – ₱150", "Haircut & Shampoo – ₱300", "Haircut and Shave – ₱300 ", "Haircut Delux – ₱380", "Classico Signature – ₱400", "Beard Trim – ₱200" }));
        serviceComboBox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(155, 164, 177), 1, true));
        serviceComboBox.setOpaque(true);

        jLabel3.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Service");

        barberComboBox.setBackground(new java.awt.Color(253, 253, 254));
        barberComboBox.setFont(new java.awt.Font("SF Pro Display", 1, 16)); // NOI18N
        barberComboBox.setForeground(new java.awt.Color(0, 0, 0));
        barberComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carlos Mendoza", "Roberto Silva", "Raffy Tulfo" }));
        barberComboBox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(155, 164, 177), 1, true));
        barberComboBox.setOpaque(true);

        jLabel4.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Barber");

        dateDateChooser.setBackground(new java.awt.Color(253, 253, 254));
        dateDateChooser.setForeground(new java.awt.Color(155, 164, 177));

        jLabel5.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Date");

        timeComboBox.setBackground(new java.awt.Color(253, 253, 254));
        timeComboBox.setFont(new java.awt.Font("SF Pro Display", 1, 16)); // NOI18N
        timeComboBox.setForeground(new java.awt.Color(0, 0, 0));
        timeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM" }));
        timeComboBox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(155, 164, 177), 1, true));
        timeComboBox.setOpaque(true);

        jLabel6.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Time");

        bookNowButton.setBackground(new java.awt.Color(164, 145, 129));
        bookNowButton.setFont(new java.awt.Font("SF Pro Display", 1, 15)); // NOI18N
        bookNowButton.setForeground(new java.awt.Color(255, 255, 255));
        bookNowButton.setText("Book Now");
        bookNowButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bookNowButton.setFocusPainted(false);
        bookNowButton.setFocusable(false);
        bookNowButton.setOpaque(true);
        bookNowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookNowButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bookNowButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(serviceComboBox, 0, 290, Short.MAX_VALUE)
                                .addComponent(fullNameTextField)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel3)
                            .addComponent(dateDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2)
                                .addComponent(contactNumberTextField)
                                .addComponent(barberComboBox, 0, 290, Short.MAX_VALUE)
                                .addComponent(timeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(35, 35, 35))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fullNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(contactNumberTextField))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(barberComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(serviceComboBox))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(timeComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(dateDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(bookNowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(366, 366, 366))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(backButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(178, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
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

    private void bookNowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookNowButtonActionPerformed
        String fullName = fullNameTextField.getText().trim();
        String contactNumber = contactNumberTextField.getText().trim();
        String service = (String) serviceComboBox.getSelectedItem();
        String barber = (String) barberComboBox.getSelectedItem();
        java.util.Date chosenDate = dateDateChooser.getDate();
        String time = (String) timeComboBox.getSelectedItem();

        if (fullName.isEmpty() || contactNumber.isEmpty() || chosenDate == null || time == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please complete all fields.");
            return;
        }

        String serviceName = service;
        String pesoString = null;
        int index = service.indexOf("–");
        if (index > -1) {
            serviceName = service.substring(0, index).trim();
            String right = service.substring(index + 1).trim();
            pesoString = right;
        }

        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(chosenDate);

        String price = (pesoString != null) ? pesoString : "₱0";
        String totalAmount = price;

        PaymentDetailsPage paymentDetails = new PaymentDetailsPage(fullName, contactNumber, serviceName, barber, date, time, price, totalAmount);
        paymentDetails.setLocationRelativeTo(null);
        paymentDetails.setResizable(false);
        paymentDetails.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bookNowButtonActionPerformed

    private void fullNameTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fullNameTextFieldKeyTyped
    char c = evt.getKeyChar();
   
        if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
            evt.consume(); // reject input
        }

        if (fullNameTextField.getText().length() >= 30) {
            evt.consume(); 
        }
    }//GEN-LAST:event_fullNameTextFieldKeyTyped

    private void contactNumberTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactNumberTextFieldKeyTyped
    char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
            return;
        }

        String currentText = contactNumberTextField.getText();

        if (currentText.length() >= 11) {
            evt.consume();
            return;
        }


        if (currentText.length() == 3) {
            String prefix = currentText + c; 
            int prefixNum = Integer.parseInt(prefix);

        if (prefixNum < 895 || prefixNum > 999) {
            javax.swing.JOptionPane.showMessageDialog(
                this,
                "Invalid phone number. Must start from 0895 to 0999."
            );
            contactNumberTextField.setText("");
            evt.consume();
        }
    }
    }//GEN-LAST:event_contactNumberTextFieldKeyTyped

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

        java.awt.EventQueue.invokeLater(() -> new BookReservationsPage().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox<String> barberComboBox;
    private javax.swing.JButton bookNowButton;
    private javax.swing.JTextField contactNumberTextField;
    private com.toedter.calendar.JDateChooser dateDateChooser;
    private javax.swing.JTextField fullNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JComboBox<String> serviceComboBox;
    private javax.swing.JComboBox<String> timeComboBox;
    // End of variables declaration//GEN-END:variables
}
