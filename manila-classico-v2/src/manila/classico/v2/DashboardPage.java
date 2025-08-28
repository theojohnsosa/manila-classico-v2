package manila.classico.v2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;

public class DashboardPage extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(DashboardPage.class.getName());

    public DashboardPage() {
        initComponents();
        updateDashboardStats();
        loadLiveQueueTable();
    }
    
    private void updateDashboardStats() {
        int customerCount = CustomerManager.getCustomers().size();
        totalCustomersTextField.setText(String.valueOf(customerCount));

        int totalBookings = ReservationsData.getReservations().size();
        totalBookingsTextField.setText(String.valueOf(totalBookings));

        long scheduledCount = ReservationsData.getReservations().stream()
            .filter(r -> {
                try {
                    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd h:mm a");
                    java.util.Date reservationDate = sdf.parse(r.getDate() + " " + r.getTime());
                    return reservationDate.after(new java.util.Date()); // future only
                } catch (Exception e) {
                    return false;
                }
            })
            .count();
        scheduledReservationTextField.setText(String.valueOf(scheduledCount));

        double totalSales = ReservationsData.getReservations().stream()
            .mapToDouble(r -> {
                try {
                    String amount = r.getTotalAmount()
                        .replace("₱", "")
                        .replace("Php", "")
                        .replace(",", "")
                        .trim();
                    return Double.parseDouble(amount);
                } catch (Exception e) {
                    return 0.0;
                }
            })
            .sum();
        totalSalesTextField.setText("₱" + totalSales);
    }
    
    private void loadLiveQueueTable() {
        DefaultTableModel model = (DefaultTableModel) liveQueueTable.getModel();
        model.setRowCount(0); 

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd h:mm a", Locale.ENGLISH);

        ReservationsData.getReservations().stream()
            .sorted(Comparator.comparing(r -> 
                LocalDateTime.parse(r.getDate() + " " + r.getTime(), formatter)))
            .forEach(r -> model.addRow(new Object[] {
                r.getFullName(),
                r.getService(),
                r.getBarber(),
                r.getDate(),
                r.getTime(),
                r.getPaymentMethod(),
                r.getTotalAmount()
            }));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        signOutButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        reservationsButton = new javax.swing.JButton();
        servicesButton = new javax.swing.JButton();
        salesHistoryButton = new javax.swing.JButton();
        customersButton = new javax.swing.JButton();
        profilesButton = new javax.swing.JButton();
        supportButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        liveQueueTable = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        totalBookingsTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        totalSalesTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        scheduledReservationTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        totalCustomersTextField = new javax.swing.JTextField();
        totalCustomerTextField = new javax.swing.JLabel();

        jPanel6.setBackground(new java.awt.Color(254, 243, 225));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(155, 164, 177), 1, true));
        jPanel6.setForeground(new java.awt.Color(254, 243, 225));

        jTextField2.setBackground(new java.awt.Color(254, 243, 225));
        jTextField2.setFont(new java.awt.Font("SF Pro Display", 1, 70)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("0");
        jTextField2.setBorder(null);
        jTextField2.setFocusable(false);
        jTextField2.setOpaque(true);

        jLabel7.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("<html><div style=\"text-align: center;\">Total Bookings</div></html>");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

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

        jButton1.setBackground(new java.awt.Color(164, 145, 129));
        jButton1.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-dashboard-100 (1).png"))); // NOI18N
        jButton1.setText("Dashboard");
        jButton1.setBorder(null);
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.setOpaque(true);

        reservationsButton.setBackground(new java.awt.Color(253, 253, 254));
        reservationsButton.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        reservationsButton.setForeground(new java.awt.Color(154, 164, 177));
        reservationsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-calendar-100-2.png"))); // NOI18N
        reservationsButton.setText("Reservations");
        reservationsButton.setBorder(null);
        reservationsButton.setFocusPainted(false);
        reservationsButton.setFocusable(false);
        reservationsButton.setOpaque(true);
        reservationsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservationsButtonActionPerformed(evt);
            }
        });

        servicesButton.setBackground(new java.awt.Color(253, 253, 254));
        servicesButton.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        servicesButton.setForeground(new java.awt.Color(154, 164, 177));
        servicesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-scissors-100-2.png"))); // NOI18N
        servicesButton.setText("Services");
        servicesButton.setBorder(null);
        servicesButton.setFocusPainted(false);
        servicesButton.setFocusable(false);
        servicesButton.setOpaque(true);
        servicesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servicesButtonActionPerformed(evt);
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

        customersButton.setBackground(new java.awt.Color(253, 253, 254));
        customersButton.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        customersButton.setForeground(new java.awt.Color(154, 164, 177));
        customersButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-people-100.png"))); // NOI18N
        customersButton.setText("Customers");
        customersButton.setBorder(null);
        customersButton.setFocusPainted(false);
        customersButton.setFocusable(false);
        customersButton.setOpaque(true);
        customersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customersButtonActionPerformed(evt);
            }
        });

        profilesButton.setBackground(new java.awt.Color(253, 253, 254));
        profilesButton.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        profilesButton.setForeground(new java.awt.Color(154, 164, 177));
        profilesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-user-100-2.png"))); // NOI18N
        profilesButton.setText("Profiles");
        profilesButton.setBorder(null);
        profilesButton.setFocusPainted(false);
        profilesButton.setFocusable(false);
        profilesButton.setOpaque(true);
        profilesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profilesButtonActionPerformed(evt);
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
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reservationsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(servicesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salesHistoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(customersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(profilesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(supportButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reservationsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(servicesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profilesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salesHistoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(supportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel3.setFont(new java.awt.Font("SF Pro Display", 1, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(114, 74, 49));
        jLabel3.setText("Dashboard");

        jLabel4.setFont(new java.awt.Font("SF Pro Display", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(154, 164, 177));
        jLabel4.setText("Welcome back. Here’s what’s happening at Manila Classico");

        jLabel5.setFont(new java.awt.Font("SF Pro Display", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Live Queue");

        liveQueueTable.setBackground(new java.awt.Color(253, 253, 254));
        liveQueueTable.setFont(new java.awt.Font("SF Pro Display", 0, 13)); // NOI18N
        liveQueueTable.setForeground(new java.awt.Color(0, 0, 0));
        liveQueueTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Full Name", "Contact", "Service", "Barber", "Date", "Time", "Payment Method", "Total"
            }
        ));
        jScrollPane1.setViewportView(liveQueueTable);

        jPanel5.setBackground(new java.awt.Color(254, 243, 225));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(155, 164, 177), 1, true));
        jPanel5.setForeground(new java.awt.Color(254, 243, 225));

        totalBookingsTextField.setBackground(new java.awt.Color(254, 243, 225));
        totalBookingsTextField.setFont(new java.awt.Font("SF Pro Display", 1, 70)); // NOI18N
        totalBookingsTextField.setForeground(new java.awt.Color(0, 0, 0));
        totalBookingsTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalBookingsTextField.setText("0");
        totalBookingsTextField.setBorder(null);
        totalBookingsTextField.setFocusable(false);
        totalBookingsTextField.setOpaque(true);

        jLabel6.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("<html><div style=\"text-align: center;\">Total Bookings</div></html>");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalBookingsTextField)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(totalBookingsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(254, 243, 225));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(155, 164, 177), 1, true));
        jPanel7.setForeground(new java.awt.Color(254, 243, 225));

        totalSalesTextField.setBackground(new java.awt.Color(254, 243, 225));
        totalSalesTextField.setFont(new java.awt.Font("SF Pro Display", 1, 25)); // NOI18N
        totalSalesTextField.setForeground(new java.awt.Color(0, 0, 0));
        totalSalesTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalSalesTextField.setText("0");
        totalSalesTextField.setBorder(null);
        totalSalesTextField.setFocusable(false);
        totalSalesTextField.setOpaque(true);

        jLabel8.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("<html><div style=\"text-align: center;\">Total Sales</div></html>");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalSalesTextField)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(totalSalesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(254, 243, 225));
        jPanel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(155, 164, 177), 1, true));
        jPanel12.setForeground(new java.awt.Color(254, 243, 225));

        scheduledReservationTextField.setBackground(new java.awt.Color(254, 243, 225));
        scheduledReservationTextField.setFont(new java.awt.Font("SF Pro Display", 1, 70)); // NOI18N
        scheduledReservationTextField.setForeground(new java.awt.Color(0, 0, 0));
        scheduledReservationTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        scheduledReservationTextField.setText("0");
        scheduledReservationTextField.setBorder(null);
        scheduledReservationTextField.setFocusable(false);
        scheduledReservationTextField.setOpaque(true);

        jLabel13.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("<html><div style=\"text-align: center;\">Scheduled Reservation</div></html>");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scheduledReservationTextField)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scheduledReservationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(254, 243, 225));
        jPanel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(155, 164, 177), 1, true));
        jPanel13.setForeground(new java.awt.Color(254, 243, 225));

        totalCustomersTextField.setBackground(new java.awt.Color(254, 243, 225));
        totalCustomersTextField.setFont(new java.awt.Font("SF Pro Display", 1, 70)); // NOI18N
        totalCustomersTextField.setForeground(new java.awt.Color(0, 0, 0));
        totalCustomersTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalCustomersTextField.setText("0");
        totalCustomersTextField.setBorder(null);
        totalCustomersTextField.setFocusable(false);
        totalCustomersTextField.setOpaque(true);

        totalCustomerTextField.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        totalCustomerTextField.setForeground(new java.awt.Color(0, 0, 0));
        totalCustomerTextField.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalCustomerTextField.setText("<html><div style=\"text-align: center;\">Total Customers</div></html>");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalCustomersTextField)
                    .addComponent(totalCustomerTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(totalCustomersTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalCustomerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void servicesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servicesButtonActionPerformed
        ServicesPage servicesPage = new ServicesPage();
        servicesPage.setLocationRelativeTo(null);
        servicesPage.setResizable(false);
        servicesPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_servicesButtonActionPerformed

    private void profilesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profilesButtonActionPerformed
        ProfilesPage profilesPage = new ProfilesPage();
        profilesPage.setLocationRelativeTo(null);
        profilesPage.setResizable(false);
        profilesPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_profilesButtonActionPerformed

    private void customersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customersButtonActionPerformed
        CustomersPage customersPage = new CustomersPage();
        customersPage.setLocationRelativeTo(null);
        customersPage.setResizable(false);
        customersPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_customersButtonActionPerformed

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

    private void reservationsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservationsButtonActionPerformed
        ReservationsPage reservationsPage = new ReservationsPage();
        reservationsPage.setLocationRelativeTo(null);
        reservationsPage.setResizable(false);
        reservationsPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_reservationsButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info :
                    javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new DashboardPage().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton customersButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTable liveQueueTable;
    private javax.swing.JButton profilesButton;
    private javax.swing.JButton reservationsButton;
    private javax.swing.JButton salesHistoryButton;
    private javax.swing.JTextField scheduledReservationTextField;
    private javax.swing.JButton servicesButton;
    private javax.swing.JButton signOutButton;
    private javax.swing.JButton supportButton;
    private javax.swing.JTextField totalBookingsTextField;
    private javax.swing.JLabel totalCustomerTextField;
    private javax.swing.JTextField totalCustomersTextField;
    private javax.swing.JTextField totalSalesTextField;
    // End of variables declaration//GEN-END:variables
}
