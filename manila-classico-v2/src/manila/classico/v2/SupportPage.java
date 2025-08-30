package manila.classico.v2;

import javax.swing.JOptionPane;

public class SupportPage extends javax.swing.JFrame {

    public SupportPage() {
        initComponents();
        
        supportButton.addMouseListener(new java.awt.event.MouseAdapter() {
           public void mouseEntered(java.awt.event.MouseEvent evt) {
               supportButton.setBackground(new java.awt.Color(114, 74, 49));
           }
           
           public void mouseExited(java.awt.event.MouseEvent evt) {
               supportButton.setBackground(new java.awt.Color(164, 145, 129));
           } 
        });
        
        sendEmailButton.addMouseListener(new java.awt.event.MouseAdapter() {
           public void mouseEntered(java.awt.event.MouseEvent evt) {
               sendEmailButton.setBackground(new java.awt.Color(114, 74, 49));
           }
           
           public void mouseExited(java.awt.event.MouseEvent evt) {
               sendEmailButton.setBackground(new java.awt.Color(164, 145, 129));
           } 
        });
        
        callNowButton.addMouseListener(new java.awt.event.MouseAdapter() {
           public void mouseEntered(java.awt.event.MouseEvent evt) {
               callNowButton.setBackground(new java.awt.Color(114, 74, 49));
           }
           
           public void mouseExited(java.awt.event.MouseEvent evt) {
               callNowButton.setBackground(new java.awt.Color(164, 145, 129));
           } 
        });
        
        faq1.addMouseListener(new java.awt.event.MouseAdapter() {
           public void mouseEntered(java.awt.event.MouseEvent evt) {
               faq1.setBackground(new java.awt.Color(114, 74, 49));
           }
           
           public void mouseExited(java.awt.event.MouseEvent evt) {
               faq1.setBackground(new java.awt.Color(164, 145, 129));
           } 
        });
        
        faq2.addMouseListener(new java.awt.event.MouseAdapter() {
           public void mouseEntered(java.awt.event.MouseEvent evt) {
               faq2.setBackground(new java.awt.Color(114, 74, 49));
           }
           
           public void mouseExited(java.awt.event.MouseEvent evt) {
               faq2.setBackground(new java.awt.Color(164, 145, 129));
           } 
        });
        
        faq3.addMouseListener(new java.awt.event.MouseAdapter() {
           public void mouseEntered(java.awt.event.MouseEvent evt) {
               faq3.setBackground(new java.awt.Color(114, 74, 49));
           }
           
           public void mouseExited(java.awt.event.MouseEvent evt) {
               faq3.setBackground(new java.awt.Color(164, 145, 129));
           } 
        });
        
        faq4.addMouseListener(new java.awt.event.MouseAdapter() {
           public void mouseEntered(java.awt.event.MouseEvent evt) {
               faq4.setBackground(new java.awt.Color(114, 74, 49));
           }
           
           public void mouseExited(java.awt.event.MouseEvent evt) {
               faq4.setBackground(new java.awt.Color(164, 145, 129));
           } 
        });
        
        faq5.addMouseListener(new java.awt.event.MouseAdapter() {
           public void mouseEntered(java.awt.event.MouseEvent evt) {
               faq5.setBackground(new java.awt.Color(114, 74, 49));
           }
           
           public void mouseExited(java.awt.event.MouseEvent evt) {
               faq5.setBackground(new java.awt.Color(164, 145, 129));
           } 
        });
        
        faq6.addMouseListener(new java.awt.event.MouseAdapter() {
           public void mouseEntered(java.awt.event.MouseEvent evt) {
               faq6.setBackground(new java.awt.Color(114, 74, 49));
           }
           
           public void mouseExited(java.awt.event.MouseEvent evt) {
               faq6.setBackground(new java.awt.Color(164, 145, 129));
           } 
        });
        
        faq7.addMouseListener(new java.awt.event.MouseAdapter() {
           public void mouseEntered(java.awt.event.MouseEvent evt) {
               faq7.setBackground(new java.awt.Color(114, 74, 49));
           }
           
           public void mouseExited(java.awt.event.MouseEvent evt) {
               faq7.setBackground(new java.awt.Color(164, 145, 129));
           } 
        });
        
        faq8.addMouseListener(new java.awt.event.MouseAdapter() {
           public void mouseEntered(java.awt.event.MouseEvent evt) {
               faq8.setBackground(new java.awt.Color(114, 74, 49));
           }
           
           public void mouseExited(java.awt.event.MouseEvent evt) {
               faq8.setBackground(new java.awt.Color(164, 145, 129));
           } 
        });
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
        jLabel5 = new javax.swing.JLabel();
        sendEmailButton = new javax.swing.JButton();
        callNowButton = new javax.swing.JButton();
        faq1 = new javax.swing.JButton();
        faq2 = new javax.swing.JButton();
        faq3 = new javax.swing.JButton();
        faq4 = new javax.swing.JButton();
        faq7 = new javax.swing.JButton();
        faq8 = new javax.swing.JButton();
        faq5 = new javax.swing.JButton();
        faq6 = new javax.swing.JButton();

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

        profilesPage.setBackground(new java.awt.Color(253, 253, 254));
        profilesPage.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        profilesPage.setForeground(new java.awt.Color(154, 164, 177));
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

        supportButton.setBackground(new java.awt.Color(164, 145, 129));
        supportButton.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        supportButton.setForeground(new java.awt.Color(255, 255, 255));
        supportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-question-mark-100-2.png"))); // NOI18N
        supportButton.setText("Support");
        supportButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        supportButton.setFocusPainted(false);
        supportButton.setFocusable(false);
        supportButton.setOpaque(true);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel3.setFont(new java.awt.Font("SF Pro Display", 1, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(114, 74, 49));
        jLabel3.setText("Support Center");

        jLabel4.setFont(new java.awt.Font("SF Pro Display", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(154, 164, 177));
        jLabel4.setText("Get help and find answers to your questions");

        jLabel5.setFont(new java.awt.Font("SF Pro Display", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Frequently Asked Questions");

        sendEmailButton.setBackground(new java.awt.Color(164, 145, 129));
        sendEmailButton.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        sendEmailButton.setForeground(new java.awt.Color(255, 255, 255));
        sendEmailButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-email-100 4.png"))); // NOI18N
        sendEmailButton.setText("Send Email");
        sendEmailButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sendEmailButton.setFocusPainted(false);
        sendEmailButton.setFocusable(false);
        sendEmailButton.setOpaque(true);
        sendEmailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendEmailButtonActionPerformed(evt);
            }
        });

        callNowButton.setBackground(new java.awt.Color(164, 145, 129));
        callNowButton.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        callNowButton.setForeground(new java.awt.Color(255, 255, 255));
        callNowButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-trash-18.png"))); // NOI18N
        callNowButton.setText("Call Now");
        callNowButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        callNowButton.setFocusPainted(false);
        callNowButton.setFocusable(false);
        callNowButton.setOpaque(true);
        callNowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                callNowButtonActionPerformed(evt);
            }
        });

        faq1.setBackground(new java.awt.Color(164, 145, 129));
        faq1.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        faq1.setForeground(new java.awt.Color(255, 255, 255));
        faq1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-question-mark-100-2.png"))); // NOI18N
        faq1.setText("What is Manila Classico?");
        faq1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        faq1.setFocusable(false);
        faq1.setOpaque(true);
        faq1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faq1ActionPerformed(evt);
            }
        });

        faq2.setBackground(new java.awt.Color(164, 145, 129));
        faq2.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        faq2.setForeground(new java.awt.Color(255, 255, 255));
        faq2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-question-mark-100-2.png"))); // NOI18N
        faq2.setText("Who can use this system?");
        faq2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        faq2.setFocusable(false);
        faq2.setOpaque(true);
        faq2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faq2ActionPerformed(evt);
            }
        });

        faq3.setBackground(new java.awt.Color(164, 145, 129));
        faq3.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        faq3.setForeground(new java.awt.Color(255, 255, 255));
        faq3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-question-mark-100-2.png"))); // NOI18N
        faq3.setText("What technologies power the application?");
        faq3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        faq3.setFocusable(false);
        faq3.setOpaque(true);
        faq3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faq3ActionPerformed(evt);
            }
        });

        faq4.setBackground(new java.awt.Color(164, 145, 129));
        faq4.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        faq4.setForeground(new java.awt.Color(255, 255, 255));
        faq4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-question-mark-100-2.png"))); // NOI18N
        faq4.setText("How can the system be installed?");
        faq4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        faq4.setFocusable(false);
        faq4.setOpaque(true);
        faq4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faq4ActionPerformed(evt);
            }
        });

        faq7.setBackground(new java.awt.Color(164, 145, 129));
        faq7.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        faq7.setForeground(new java.awt.Color(255, 255, 255));
        faq7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-question-mark-100-2.png"))); // NOI18N
        faq7.setText("What is the current development status?");
        faq7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        faq7.setFocusable(false);
        faq7.setOpaque(true);
        faq7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faq7ActionPerformed(evt);
            }
        });

        faq8.setBackground(new java.awt.Color(164, 145, 129));
        faq8.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        faq8.setForeground(new java.awt.Color(255, 255, 255));
        faq8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-question-mark-100-2.png"))); // NOI18N
        faq8.setText("Can developers contribute to the project?");
        faq8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        faq8.setFocusable(false);
        faq8.setOpaque(true);
        faq8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faq8ActionPerformed(evt);
            }
        });

        faq5.setBackground(new java.awt.Color(164, 145, 129));
        faq5.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        faq5.setForeground(new java.awt.Color(255, 255, 255));
        faq5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-question-mark-100-2.png"))); // NOI18N
        faq5.setText("What functionality does the system provide?");
        faq5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        faq5.setFocusable(false);
        faq5.setOpaque(true);
        faq5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faq5ActionPerformed(evt);
            }
        });

        faq6.setBackground(new java.awt.Color(164, 145, 129));
        faq6.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        faq6.setForeground(new java.awt.Color(255, 255, 255));
        faq6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-question-mark-100-2.png"))); // NOI18N
        faq6.setText("How is the database structured?");
        faq6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        faq6.setFocusable(false);
        faq6.setOpaque(true);
        faq6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faq6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(79, 79, 79)
                        .addComponent(sendEmailButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(callNowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(faq1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(faq2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(faq3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(faq4, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(faq7, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(faq8, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(faq5, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(faq6, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(callNowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sendEmailButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faq1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faq2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faq3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faq4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faq5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faq6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faq7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faq8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void sendEmailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendEmailButtonActionPerformed
        SendEmailPage sendEmailPage = new SendEmailPage();
        sendEmailPage.setLocationRelativeTo(null);
        sendEmailPage.setResizable(false);
        sendEmailPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sendEmailButtonActionPerformed

    private void callNowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_callNowButtonActionPerformed
        
    }//GEN-LAST:event_callNowButtonActionPerformed

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

    private void profilesPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profilesPageActionPerformed
        ProfilesPage profilesPage = new ProfilesPage();
        profilesPage.setLocationRelativeTo(null);
        profilesPage.setResizable(false);
        profilesPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_profilesPageActionPerformed

    private void faq1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faq1ActionPerformed
        JOptionPane.showMessageDialog(null,"<html>Manila Classico is a Java Swing-based desktop application designed to streamline barbershop operations<br>"
                + "                               by providing tools for managing reservations, queues, services, customers, and sales. It combines<br>"
                + "                               functionality with a clean, Apple-inspired user interface to create a premium experience<br>"
                + "                               for both administrators and barbers.</html>");
    }//GEN-LAST:event_faq1ActionPerformed

    private void faq2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faq2ActionPerformed
        JOptionPane.showMessageDialog(null, "<html>The system is designed for two primary roles: administrators and barbers. Administrators oversee the<br>"
                + "                                entire operation, including reservations, services, and sales, while barbers use the platform to view<br>"
                + "                                their assigned queues and update the progress of appointments.</html>");
    }//GEN-LAST:event_faq2ActionPerformed

    private void faq3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faq3ActionPerformed
        JOptionPane.showMessageDialog(null, "<html>The application is built using Java (JDK 17 or later) and Java Swing with NetBeans for the graphical<br>"
                + "                                interface. It relies on MySQL for data management, connected through JDBC, and is styled with a macOS-inspired<br>"
                + "                                design to emphasize minimalism and clarity.</html>");
    }//GEN-LAST:event_faq3ActionPerformed

    private void faq4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faq4ActionPerformed
        JOptionPane.showMessageDialog(null, "<html>To install the system, users must set up Java JDK 17 or later, MySQL, and NetBeans or another Java IDE.<br>"
                + "                                After cloning the repository, the provided database schema should be imported into MySQL. Once the database<br>"
                + "                                is configured and credentials are updated in the connection file, the application can be built and run within the IDE.</html>");
    }//GEN-LAST:event_faq4ActionPerformed

    private void faq5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faq5ActionPerformed
        JOptionPane.showMessageDialog(null, "<html>The system offers administrators a dashboard with key metrics such as bookings, sales, and customer statistics,<br>"
                + "                                along with full management of reservations, services, and queues. Barbers are given a focused interface where they<br>"
                + "                                can view scheduled appointments and update their status in real time.</html>");
    }//GEN-LAST:event_faq5ActionPerformed

    private void faq6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faq6ActionPerformed
        JOptionPane.showMessageDialog(null, "<html>The database is composed of five main tables: users, services, customers, reservations, and sales.<br>"
                + "                                These tablescollectively handle account management, service catalogues, customer records, booking<br>"
                + "                                details, and sales transactions, forming a simple but effective schema for daily barbershop operations.</html>");
    }//GEN-LAST:event_faq6ActionPerformed

    private void faq7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faq7ActionPerformed
        JOptionPane.showMessageDialog(null, "<html>Manila Classico is actively being developed. While the core features are functional, upcoming updates<br>"
                + "                                aim to improve queue filtering, strengthen authentication, and expand service management options.<br>"
                + "                                The project is not yet production-ready but is steadily progressing.</html>");
    }//GEN-LAST:event_faq7ActionPerformed

    private void faq8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faq8ActionPerformed
        JOptionPane.showMessageDialog(null, "<html>Yes. Contributions are encouraged under the MIT license. Developers may submit pull requests, propose<br>"
                + "                                improvements through issues, or adapt the project for their own needs. Collaboration is welcomed to help<br>"
                + "                                expand and refine the system’s capabilities.</html>");
    }//GEN-LAST:event_faq8ActionPerformed
    

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SupportPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton callNowButton;
    private javax.swing.JButton customersButton;
    private javax.swing.JButton dashboardButton;
    private javax.swing.JButton faq1;
    private javax.swing.JButton faq2;
    private javax.swing.JButton faq3;
    private javax.swing.JButton faq4;
    private javax.swing.JButton faq5;
    private javax.swing.JButton faq6;
    private javax.swing.JButton faq7;
    private javax.swing.JButton faq8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton profilesPage;
    private javax.swing.JButton reservationsPage;
    private javax.swing.JButton salesHistoryButton;
    private javax.swing.JButton sendEmailButton;
    private javax.swing.JButton servicesPage;
    private javax.swing.JButton signOutButton;
    private javax.swing.JButton supportButton;
    // End of variables declaration//GEN-END:variables
}
