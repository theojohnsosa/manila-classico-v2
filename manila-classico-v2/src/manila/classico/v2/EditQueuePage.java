package manila.classico.v2;

import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class EditQueuePage extends javax.swing.JFrame {
    
    private BookReservationsPage bookPage;

    public EditQueuePage() {
        initComponents();
        
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
           public void mouseEntered(java.awt.event.MouseEvent evt) {
               searchButton.setBackground(new java.awt.Color(114, 74, 49));
           }
           
           public void mouseExited(java.awt.event.MouseEvent evt) {
               searchButton.setBackground(new java.awt.Color(164, 145, 129));
           } 
        });
        
        searchTextField.addMouseListener(new java.awt.event.MouseAdapter() {
           public void mouseEntered(java.awt.event.MouseEvent evt) {
               searchTextField.setBackground(new java.awt.Color(239, 239, 239));
           }
           
           public void mouseExited(java.awt.event.MouseEvent evt) {
               searchTextField.setBackground(new java.awt.Color(253, 253, 254));
           } 
        });
        
        addQueueButton.addMouseListener(new java.awt.event.MouseAdapter() {
           public void mouseEntered(java.awt.event.MouseEvent evt) {
               addQueueButton.setBackground(new java.awt.Color(239, 239, 239));
           }
           
           public void mouseExited(java.awt.event.MouseEvent evt) {
               addQueueButton.setBackground(new java.awt.Color(253, 253, 254));
           } 
        });
        
        editQueueEntryButton.addMouseListener(new java.awt.event.MouseAdapter() {
           public void mouseEntered(java.awt.event.MouseEvent evt) {
               editQueueEntryButton.setBackground(new java.awt.Color(239, 239, 239));
           }
           
           public void mouseExited(java.awt.event.MouseEvent evt) {
               editQueueEntryButton.setBackground(new java.awt.Color(253, 253, 254));
           } 
        });
        
        removeFromQueueButton.addMouseListener(new java.awt.event.MouseAdapter() {
           public void mouseEntered(java.awt.event.MouseEvent evt) {
               removeFromQueueButton.setBackground(new java.awt.Color(239, 239, 239));
           }
           
           public void mouseExited(java.awt.event.MouseEvent evt) {
               removeFromQueueButton.setBackground(new java.awt.Color(253, 253, 254));
           } 
        });
    }
    
    public EditQueuePage(BookReservationsPage bookPage) {
        initComponents();
        this.bookPage = bookPage;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        reservationsTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        addQueueButton = new javax.swing.JButton();
        editQueueEntryButton = new javax.swing.JButton();
        removeFromQueueButton = new javax.swing.JButton();
        searchTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(253, 253, 254));

        backButton.setBackground(new java.awt.Color(253, 253, 254));
        backButton.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        backButton.setForeground(new java.awt.Color(0, 0, 0));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-left-arrow-20.png"))); // NOI18N
        backButton.setText("Back to Reservations");
        backButton.setBorder(null);
        backButton.setFocusPainted(false);
        backButton.setFocusable(false);
        backButton.setOpaque(true);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        reservationsTable.setBackground(new java.awt.Color(253, 253, 254));
        reservationsTable.setFont(new java.awt.Font("SF Pro Display", 0, 13)); // NOI18N
        reservationsTable.setForeground(new java.awt.Color(0, 0, 0));
        reservationsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(reservationsTable);

        jLabel5.setFont(new java.awt.Font("SF Pro Display", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Upcoming Reservations");

        addQueueButton.setBackground(new java.awt.Color(164, 145, 129));
        addQueueButton.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        addQueueButton.setForeground(new java.awt.Color(255, 255, 255));
        addQueueButton.setText("Add Queue");
        addQueueButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addQueueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addQueueButtonActionPerformed(evt);
            }
        });

        editQueueEntryButton.setBackground(new java.awt.Color(164, 145, 129));
        editQueueEntryButton.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        editQueueEntryButton.setForeground(new java.awt.Color(255, 255, 255));
        editQueueEntryButton.setText("Edit Queue Entry");
        editQueueEntryButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        editQueueEntryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editQueueEntryButtonActionPerformed(evt);
            }
        });

        removeFromQueueButton.setBackground(new java.awt.Color(164, 145, 129));
        removeFromQueueButton.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        removeFromQueueButton.setForeground(new java.awt.Color(255, 255, 255));
        removeFromQueueButton.setText("Remove from Queue");
        removeFromQueueButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        searchTextField.setBackground(new java.awt.Color(253, 253, 254));
        searchTextField.setFont(new java.awt.Font("SF Pro Display", 1, 16)); // NOI18N
        searchTextField.setForeground(new java.awt.Color(154, 164, 177));
        searchTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(154, 164, 177), 1, true));
        searchTextField.setOpaque(true);

        searchButton.setBackground(new java.awt.Color(164, 145, 129));
        searchButton.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-search-20.png"))); // NOI18N
        searchButton.setText("Search");
        searchButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(backButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(addQueueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editQueueEntryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(removeFromQueueButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(backButton)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addQueueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editQueueEntryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeFromQueueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
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
        ReservationsPage reservationsPage = new ReservationsPage();
        reservationsPage.setLocationRelativeTo(null);
        reservationsPage.setResizable(false);
        reservationsPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String query = searchTextField.getText().trim();
        DefaultTableModel model = (DefaultTableModel) reservationsTable.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        reservationsTable.setRowSorter(sorter);

        if (query.isEmpty()) {
            sorter.setRowFilter(null);
        } else {
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + query));
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void addQueueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addQueueButtonActionPerformed
        AddQueuePage addQueuePage = new AddQueuePage();
        addQueuePage.setLocationRelativeTo(null);
        addQueuePage.setResizable(false);
        addQueuePage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addQueueButtonActionPerformed

    private void editQueueEntryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editQueueEntryButtonActionPerformed
        EditQueueEntryPage editQueueEntryPage = new EditQueueEntryPage();
        editQueueEntryPage.setLocationRelativeTo(null);
        editQueueEntryPage.setResizable(false);
        editQueueEntryPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_editQueueEntryButtonActionPerformed
    
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
                new EditQueuePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addQueueButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton editQueueEntryButton;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removeFromQueueButton;
    private javax.swing.JTable reservationsTable;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchTextField;
    // End of variables declaration//GEN-END:variables
}
