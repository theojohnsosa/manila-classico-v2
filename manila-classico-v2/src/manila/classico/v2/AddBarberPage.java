package manila.classico.v2;

import javax.swing.JOptionPane;

public class AddBarberPage extends javax.swing.JFrame {
    
    private BookReservationsPage bookPage;

    public AddBarberPage() {
        initComponents();
        
        addNewBarberButton.addMouseListener(new java.awt.event.MouseAdapter() {
           public void mouseEntered(java.awt.event.MouseEvent evt) {
               addNewBarberButton.setBackground(new java.awt.Color(114, 74, 49));
           }
           
           public void mouseExited(java.awt.event.MouseEvent evt) {
               addNewBarberButton.setBackground(new java.awt.Color(164, 145, 129));
           } 
        });
        
        barberNameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
           public void mouseEntered(java.awt.event.MouseEvent evt) {
               barberNameTextField.setBackground(new java.awt.Color(239, 239, 239));
           }
           
           public void mouseExited(java.awt.event.MouseEvent evt) {
               barberNameTextField.setBackground(new java.awt.Color(253, 253, 254));
           } 
        });
        
        barberContactTextField.addMouseListener(new java.awt.event.MouseAdapter() {
           public void mouseEntered(java.awt.event.MouseEvent evt) {
               barberContactTextField.setBackground(new java.awt.Color(239, 239, 239));
           }
           
           public void mouseExited(java.awt.event.MouseEvent evt) {
               barberContactTextField.setBackground(new java.awt.Color(253, 253, 254));
           } 
        });
        
        barberEmailTextField.addMouseListener(new java.awt.event.MouseAdapter() {
           public void mouseEntered(java.awt.event.MouseEvent evt) {
               barberEmailTextField.setBackground(new java.awt.Color(239, 239, 239));
           }
           
           public void mouseExited(java.awt.event.MouseEvent evt) {
               barberEmailTextField.setBackground(new java.awt.Color(253, 253, 254));
           } 
        });
        
        jDateChooser1.addMouseListener(new java.awt.event.MouseAdapter() {
           public void mouseEntered(java.awt.event.MouseEvent evt) {
               jDateChooser1.setBackground(new java.awt.Color(239, 239, 239));
           }
           
           public void mouseExited(java.awt.event.MouseEvent evt) {
               jDateChooser1.setBackground(new java.awt.Color(253, 253, 254));
           } 
        });
    }
    
    public AddBarberPage(BookReservationsPage bookPage) {
        initComponents();
        this.bookPage = bookPage;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addNewBarberButton = new javax.swing.JButton();
        barberNameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        barberContactTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        barberEmailTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(253, 253, 254));

        backButton.setBackground(new java.awt.Color(253, 253, 254));
        backButton.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        backButton.setForeground(new java.awt.Color(0, 0, 0));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-left-arrow-20.png"))); // NOI18N
        backButton.setText("Back to Profiles");
        backButton.setBorder(null);
        backButton.setFocusPainted(false);
        backButton.setFocusable(false);
        backButton.setOpaque(true);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html><div style=\"text-align: center;\">Add Barber</div></html>");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(155, 164, 177));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<html><div style=\"text-align: center;\">Fill in service info</div></html>");

        addNewBarberButton.setBackground(new java.awt.Color(164, 145, 129));
        addNewBarberButton.setFont(new java.awt.Font("SF Pro Display", 1, 15)); // NOI18N
        addNewBarberButton.setForeground(new java.awt.Color(255, 255, 255));
        addNewBarberButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-plus-100 7.png"))); // NOI18N
        addNewBarberButton.setText("Add New Barber");
        addNewBarberButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addNewBarberButton.setFocusable(false);
        addNewBarberButton.setOpaque(true);
        addNewBarberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewBarberButtonActionPerformed(evt);
            }
        });

        barberNameTextField.setBackground(new java.awt.Color(253, 253, 254));
        barberNameTextField.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        barberNameTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(154, 164, 177), 1, true));
        barberNameTextField.setOpaque(true);
        barberNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barberNameTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Name");

        barberContactTextField.setBackground(new java.awt.Color(253, 253, 254));
        barberContactTextField.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        barberContactTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(154, 164, 177), 1, true));
        barberContactTextField.setOpaque(true);
        barberContactTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barberContactTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Contact Number");

        barberEmailTextField.setBackground(new java.awt.Color(253, 253, 254));
        barberEmailTextField.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        barberEmailTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(154, 164, 177), 1, true));
        barberEmailTextField.setOpaque(true);

        jLabel5.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Email");

        jLabel6.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Date Joined");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(470, 470, 470)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(backButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(411, 411, 411))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addNewBarberButton, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(barberNameTextField)
                                        .addComponent(jLabel3)
                                        .addComponent(barberEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(barberContactTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(109, 109, 109))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton)
                .addGap(62, 62, 62)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(barberContactTextField)
                    .addComponent(barberNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(barberEmailTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(addNewBarberButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
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
        ProfilesPage profilesPage = new ProfilesPage();
        profilesPage.setLocationRelativeTo(null);
        profilesPage.setResizable(false);
        profilesPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void addNewBarberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewBarberButtonActionPerformed
        String barberName = barberNameTextField.getText().trim();
        String barberContact = barberContactTextField.getText().trim();
        String barberEmail = barberEmailTextField.getText().trim();
        java.util.Date dateJoined = jDateChooser1.getDate();

        if (barberName.isEmpty() || barberContact.isEmpty() || barberEmail.isEmpty() || dateJoined == null) {
            JOptionPane.showMessageDialog(null, "Please fill up all fields.");
            return;
        }

        BarberManager.addBarber(new Barber(barberName, barberContact, barberEmail, dateJoined));

        if (bookPage != null) {
            bookPage.loadBarbersIntoComboBox();
        }

        JOptionPane.showMessageDialog(null, "New barber added successfully.");
        
        ProfilesPage profilesPage = new ProfilesPage();
        profilesPage.setLocationRelativeTo(null);
        profilesPage.setResizable(false);
        profilesPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addNewBarberButtonActionPerformed

    private void barberNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barberNameTextFieldActionPerformed
        
    }//GEN-LAST:event_barberNameTextFieldActionPerformed

    private void barberContactTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barberContactTextFieldActionPerformed
        
    }//GEN-LAST:event_barberContactTextFieldActionPerformed
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
//            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBarberPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewBarberButton;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField barberContactTextField;
    private javax.swing.JTextField barberEmailTextField;
    private javax.swing.JTextField barberNameTextField;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
