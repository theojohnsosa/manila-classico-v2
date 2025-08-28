package manila.classico.v2;

import java.util.List;
import javax.swing.table.DefaultTableModel;

public class CustomersPage extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CustomersPage.class.getName());

    public CustomersPage() {
        initComponents();
        initCustom();
    }
    
    private void initCustom() {
        if (customersTable.getModel().getColumnCount() != 3) {
            customersTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[]{"Name", "Contact", "Reference Number"}, 0
            ));
        }
        refreshCustomersTable();
    }

    private void loadCustomersToTable(List<Customer> list) {
        DefaultTableModel model = (DefaultTableModel) customersTable.getModel();
        model.setRowCount(0);

        for (Customer c : list) {
            model.addRow(new Object[]{ c.getName(), c.getContact(), c.getReference() });
        }
    }
    
    public void refreshCustomersTable() {
        List<Customer> customers = CustomerManager.getCustomers();
        loadCustomersToTable(customers);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        signOutButton = new javax.swing.JButton();
        dashboardButton = new javax.swing.JButton();
        reservationsPage = new javax.swing.JButton();
        servicesPage = new javax.swing.JButton();
        salesHistoryButton = new javax.swing.JButton();
        customersButton = new javax.swing.JButton();
        profilesPage = new javax.swing.JButton();
        supportButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        searchTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customersTable = new javax.swing.JTable();
        searchButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(253, 253, 254));

        jPanel2.setBackground(new java.awt.Color(253, 253, 254));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(155, 164, 177)));

        jPanel3.setBackground(new java.awt.Color(253, 253, 254));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(155, 164, 177)));

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 35)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(114, 74, 49));
        jLabel1.setText("<html><div style=\"text-align: center;\">Manila Classico</div></html>");

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(155, 164, 177));
        jLabel2.setText("<html><div style=\"text-align: center;\">Traditional FIlipino Barbershop</div></html>");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(253, 253, 254));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(155, 164, 177)));

        signOutButton.setBackground(new java.awt.Color(253, 253, 254));
        signOutButton.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        signOutButton.setForeground(new java.awt.Color(154, 164, 177));
        signOutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-logout-100.png"))); // NOI18N
        signOutButton.setText("Sign Out");
        signOutButton.setBorder(null);
        signOutButton.setFocusPainted(false);
        signOutButton.setFocusable(false);
        signOutButton.setOpaque(true);
        signOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(signOutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(signOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        dashboardButton.setBackground(new java.awt.Color(253, 253, 254));
        dashboardButton.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        dashboardButton.setForeground(new java.awt.Color(154, 164, 177));
        dashboardButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-dashboard-100.png"))); // NOI18N
        dashboardButton.setText("Dashboard");
        dashboardButton.setBorder(null);
        dashboardButton.setFocusPainted(false);
        dashboardButton.setFocusable(false);
        dashboardButton.setOpaque(true);
        dashboardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardButtonActionPerformed(evt);
            }
        });

        reservationsPage.setBackground(new java.awt.Color(253, 253, 254));
        reservationsPage.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        reservationsPage.setForeground(new java.awt.Color(154, 164, 177));
        reservationsPage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-calendar-100-2.png"))); // NOI18N
        reservationsPage.setText("Reservations");
        reservationsPage.setBorder(null);
        reservationsPage.setFocusPainted(false);
        reservationsPage.setFocusable(false);
        reservationsPage.setOpaque(true);
        reservationsPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservationsPageActionPerformed(evt);
            }
        });

        servicesPage.setBackground(new java.awt.Color(253, 253, 254));
        servicesPage.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        servicesPage.setForeground(new java.awt.Color(154, 164, 177));
        servicesPage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-scissors-100-2.png"))); // NOI18N
        servicesPage.setText("Services");
        servicesPage.setBorder(null);
        servicesPage.setFocusPainted(false);
        servicesPage.setFocusable(false);
        servicesPage.setOpaque(true);
        servicesPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servicesPageActionPerformed(evt);
            }
        });

        salesHistoryButton.setBackground(new java.awt.Color(253, 253, 254));
        salesHistoryButton.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        salesHistoryButton.setForeground(new java.awt.Color(154, 164, 177));
        salesHistoryButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-dollar-100.png"))); // NOI18N
        salesHistoryButton.setText("Sales History");
        salesHistoryButton.setBorder(null);
        salesHistoryButton.setFocusPainted(false);
        salesHistoryButton.setFocusable(false);
        salesHistoryButton.setOpaque(true);
        salesHistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesHistoryButtonActionPerformed(evt);
            }
        });

        customersButton.setBackground(new java.awt.Color(164, 145, 129));
        customersButton.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        customersButton.setForeground(new java.awt.Color(255, 255, 255));
        customersButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-people-100-2.png"))); // NOI18N
        customersButton.setText("Customers");
        customersButton.setBorder(null);
        customersButton.setFocusPainted(false);
        customersButton.setFocusable(false);
        customersButton.setOpaque(true);

        profilesPage.setBackground(new java.awt.Color(253, 253, 254));
        profilesPage.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        profilesPage.setForeground(new java.awt.Color(155, 164, 177));
        profilesPage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-user-100-2.png"))); // NOI18N
        profilesPage.setText("Profiles");
        profilesPage.setBorder(null);
        profilesPage.setFocusPainted(false);
        profilesPage.setFocusable(false);
        profilesPage.setOpaque(true);
        profilesPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profilesPageActionPerformed(evt);
            }
        });

        supportButton.setBackground(new java.awt.Color(253, 253, 254));
        supportButton.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        supportButton.setForeground(new java.awt.Color(154, 164, 177));
        supportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-question-mark-100.png"))); // NOI18N
        supportButton.setText("Support");
        supportButton.setBorder(null);
        supportButton.setFocusPainted(false);
        supportButton.setFocusable(false);
        supportButton.setOpaque(true);
        supportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supportButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dashboardButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reservationsPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(servicesPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salesHistoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(customersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(profilesPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(supportButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dashboardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reservationsPage, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(servicesPage, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profilesPage, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salesHistoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(supportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel3.setFont(new java.awt.Font("SF Pro Display", 1, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(114, 74, 49));
        jLabel3.setText("Customers");

        jLabel4.setFont(new java.awt.Font("SF Pro Display", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(154, 164, 177));
        jLabel4.setText("Manage customer information and history");

        searchTextField.setBackground(new java.awt.Color(253, 253, 254));
        searchTextField.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        searchTextField.setForeground(new java.awt.Color(154, 164, 177));
        searchTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(154, 164, 177), 1, true));
        searchTextField.setFocusable(false);
        searchTextField.setOpaque(true);

        jLabel5.setFont(new java.awt.Font("SF Pro Display", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("List of Customers");

        customersTable.setBackground(new java.awt.Color(253, 253, 254));
        customersTable.setFont(new java.awt.Font("SF Pro Display", 0, 13)); // NOI18N
        customersTable.setForeground(new java.awt.Color(0, 0, 0));
        customersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Contact", "Reference Number"
            }
        ));
        jScrollPane1.setViewportView(customersTable);

        searchButton.setBackground(new java.awt.Color(164, 145, 129));
        searchButton.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-search-20.png"))); // NOI18N
        searchButton.setText("Search");
        searchButton.setBorder(null);
        searchButton.setFocusPainted(false);
        searchButton.setFocusable(false);
        searchButton.setOpaque(true);
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
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

    private void signOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutButtonActionPerformed
        LandingPage landingPage = new LandingPage();
        landingPage.setLocationRelativeTo(null);
        landingPage.setResizable(false);
        landingPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signOutButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String keyword = searchTextField.getText().trim();
        List<Customer> results = CustomerManager.searchCustomers(keyword);
        loadCustomersToTable(results);
    }//GEN-LAST:event_searchButtonActionPerformed

    private void reservationsPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservationsPageActionPerformed
        ReservationsPage reservationsPage = new ReservationsPage();
        reservationsPage.setLocationRelativeTo(null);
        reservationsPage.setResizable(false);
        reservationsPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_reservationsPageActionPerformed

    private void servicesPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servicesPageActionPerformed
        ServicesPage servicesPage = new ServicesPage();
        servicesPage.setLocationRelativeTo(null);
        servicesPage.setResizable(false);
        servicesPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_servicesPageActionPerformed

    private void profilesPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profilesPageActionPerformed
        ProfilesPage profilesPage = new ProfilesPage();
        profilesPage.setLocationRelativeTo(null);
        profilesPage.setResizable(false);
        profilesPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_profilesPageActionPerformed

    private void salesHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesHistoryButtonActionPerformed
        SalesHistoryPage salesHistoryPage = new SalesHistoryPage();
        salesHistoryPage.setLocationRelativeTo(null);
        salesHistoryPage.setResizable(false);
        salesHistoryPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_salesHistoryButtonActionPerformed

    private void supportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supportButtonActionPerformed
        SupportPage supportPage = new SupportPage();
        supportPage.setLocationRelativeTo(null);
        supportPage.setResizable(false);
        supportPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_supportButtonActionPerformed

    private void dashboardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardButtonActionPerformed
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.setLocationRelativeTo(null);
        dashboardPage.setResizable(false);
        dashboardPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dashboardButtonActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomersPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton customersButton;
    private javax.swing.JTable customersTable;
    private javax.swing.JButton dashboardButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton profilesPage;
    private javax.swing.JButton reservationsPage;
    private javax.swing.JButton salesHistoryButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JButton servicesPage;
    private javax.swing.JButton signOutButton;
    private javax.swing.JButton supportButton;
    // End of variables declaration//GEN-END:variables
}
