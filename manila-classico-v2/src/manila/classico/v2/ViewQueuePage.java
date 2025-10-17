package manila.classico.v2;

import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;
import javax.swing.Timer;

public class ViewQueuePage extends javax.swing.JFrame {

    public ViewQueuePage() {
        initComponents();
        refreshQueueDisplay();
        startAutoRefresh();
    }

    public void refreshQueueDisplay() {
        List<Reservation> reservationsToday = ReservationsData.getFutureReservations().stream().filter(r -> r.getDate().equals(LocalDate.now().toString())).collect(Collectors.toList());

        if (reservationsToday.isEmpty()) {
            setQueueDisplay("—", "No reservations", "—", "—");
            return;
        }

        List<Reservation> queueReservations = ReservationsData.getReservations().stream()
                .filter(r -> r.getDate().equals(LocalDate.now().toString()))
                .collect(Collectors.toList());
        
        
        Reservation current = reservationsToday.get(0);
        int queueNumber = queueReservations.indexOf(current) + 1;
        
        queueNumberTextField.setText(String.format("%03d",queueNumber));
        customerNameTextField.setText(current.getFullName());

        
        if (reservationsToday.size() > 1) {
            Reservation next = reservationsToday.get(1);
            int nextQueueNumber = queueReservations.indexOf(next) + 1;
            
            nextQueueTextField.setText(String.format("%03d",nextQueueNumber));
            nextCustomerTextField.setText(next.getFullName());
        } else {
            setQueueDisplay(null, null, "—", "—");
        }
    }
    
    private void setQueueDisplay(String q1, String c1, String q2, String c2) {
        if (q1 != null) queueNumberTextField.setText(q1);
        if (c1 != null) customerNameTextField.setText(c1);
        nextQueueTextField.setText(q2);
        nextCustomerTextField.setText(c2);
    }

    private void startAutoRefresh() {
        autoRefreshTimer = new Timer(1000, e -> refreshQueueDisplay());
        autoRefreshTimer.start();
    }

    @Override
    public void dispose() {
        if (autoRefreshTimer != null) autoRefreshTimer.stop();
        super.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        queueNumberTextField = new javax.swing.JTextField();
        customerNameTextField = new javax.swing.JTextField();
        nextQueueTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nextCustomerTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(253, 253, 254));

        jLabel7.setFont(new java.awt.Font("SF Pro Display", 1, 30)); // NOI18N
        jLabel7.setText("<html><div style=\"text-align: center;\">Slot Status</div></html>");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel8.setFont(new java.awt.Font("SF Pro Display", 0, 15)); // NOI18N
        jLabel8.setText("<html><div style=\"text-align: center;\">Current barbershop slot information</div></html>");

        backButton.setBackground(new java.awt.Color(253, 253, 254));
        backButton.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
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

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 0, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html><div style=\"text-align: center;\">Currently Being Served</div></html>");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        queueNumberTextField.setBackground(new java.awt.Color(253, 253, 254));
        queueNumberTextField.setFont(new java.awt.Font("SF Pro Display", 1, 170)); // NOI18N
        queueNumberTextField.setForeground(new java.awt.Color(114, 74, 49));
        queueNumberTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        queueNumberTextField.setText("001");
        queueNumberTextField.setBorder(null);
        queueNumberTextField.setFocusable(false);
        queueNumberTextField.setOpaque(true);

        customerNameTextField.setBackground(new java.awt.Color(253, 253, 254));
        customerNameTextField.setFont(new java.awt.Font("SF Pro Display", 1, 15)); // NOI18N
        customerNameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        customerNameTextField.setBorder(null);
        customerNameTextField.setFocusable(false);

        nextQueueTextField.setBackground(new java.awt.Color(253, 253, 254));
        nextQueueTextField.setFont(new java.awt.Font("SF Pro Display", 1, 40)); // NOI18N
        nextQueueTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nextQueueTextField.setText("002");
        nextQueueTextField.setBorder(null);
        nextQueueTextField.setFocusable(false);

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        jLabel2.setText("Next in Line:");

        nextCustomerTextField.setBackground(new java.awt.Color(253, 253, 254));
        nextCustomerTextField.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        nextCustomerTextField.setForeground(new java.awt.Color(155, 164, 177));
        nextCustomerTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nextCustomerTextField.setBorder(null);
        nextCustomerTextField.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(backButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(434, 434, 434)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(388, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(nextQueueTextField)
                            .addComponent(nextCustomerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(customerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(queueNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(334, 334, 334))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(431, 431, 431))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(queueNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(nextQueueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nextCustomerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
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
                new AddServicePage().setVisible(true);
            }
        });
    }
        private Timer autoRefreshTimer;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTextField customerNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nextCustomerTextField;
    private javax.swing.JTextField nextQueueTextField;
    private javax.swing.JTextField queueNumberTextField;
    // End of variables declaration//GEN-END:variables
}
