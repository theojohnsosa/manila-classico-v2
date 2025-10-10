package manila.classico.v2;
import java.util.Random;
import java.text.DecimalFormat;

public class ReceiptPage extends javax.swing.JFrame {
   
    public ReceiptPage() {
        initComponents();

        Reservation reservation = ReservationsData.getLastAddedReservation();
        if (reservation == null) return;

        int receiptNumber = new Random().nextInt(1000000000) + 1;
        receiptTextField.setText(String.valueOf(receiptNumber));

        double totalVal = parseAmount(reservation.getTotalAmount());
        double renderedPayment = parseAmount(reservation.getPaymentRendered());

        double change = 0;
        if ("Cash".equalsIgnoreCase(reservation.getPaymentMethod()) && renderedPayment > totalVal) {
            change = renderedPayment - totalVal;
        }

        dateTextField.setText(reservation.getDate());
        cashierTextField.setText("admin");
        customerTextField.setText(reservation.getFullName());
        serviceTextField.setText(reservation.getService());
        barberTextField.setText(reservation.getBarber());
        paymentMethodTextField.setText(reservation.getPaymentMethod());
        totalAmountTextField1.setText(formatCurrency(totalVal));
        amountRenderedTextField.setText(formatCurrency(renderedPayment));
        changeTextField.setText(formatCurrency(change));
    }
    
    private double parseAmount(String amount) {
        return Double.parseDouble(amount.replace("₱", "").trim());
    }

    private String formatCurrency(double amount) {
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        decimalFormat.setPositivePrefix("₱");
        return decimalFormat.format(amount);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lineOne = new javax.swing.JLabel();
        receiptNo = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        cashierName = new javax.swing.JLabel();
        customerName = new javax.swing.JLabel();
        Services = new javax.swing.JLabel();
        lineTwo = new javax.swing.JLabel();
        totalAmount = new javax.swing.JLabel();
        paymentMethod = new javax.swing.JLabel();
        amountRendered = new javax.swing.JLabel();
        Barber = new javax.swing.JLabel();
        lineThree = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        receiptTextField = new javax.swing.JTextField();
        dateTextField = new javax.swing.JTextField();
        cashierTextField = new javax.swing.JTextField();
        customerTextField = new javax.swing.JTextField();
        serviceTextField = new javax.swing.JTextField();
        changeTextField = new javax.swing.JTextField();
        paymentMethodTextField = new javax.swing.JTextField();
        amountRenderedTextField = new javax.swing.JTextField();
        barberTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        totalAmount1 = new javax.swing.JLabel();
        totalAmountTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(114, 74, 49));
        jLabel1.setText("Manila Classico");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        lineOne.setText("––––––––––––––––––––––––––––––––––––––––––––––––––");
        jPanel1.add(lineOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 350, -1));

        receiptNo.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        receiptNo.setForeground(new java.awt.Color(0, 0, 0));
        receiptNo.setText("Receipt No:");
        jPanel1.add(receiptNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 20));

        Date.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        Date.setForeground(new java.awt.Color(0, 0, 0));
        Date.setText("Date:");
        jPanel1.add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        cashierName.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        cashierName.setForeground(new java.awt.Color(0, 0, 0));
        cashierName.setText("Cashier:");
        jPanel1.add(cashierName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, 20));

        customerName.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        customerName.setForeground(new java.awt.Color(0, 0, 0));
        customerName.setText("Customer:");
        customerName.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(customerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        Services.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        Services.setForeground(new java.awt.Color(0, 0, 0));
        Services.setText("Services:");
        jPanel1.add(Services, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        lineTwo.setText("––––––––––––––––––––––––––––––––––––––––––––––––––");
        jPanel1.add(lineTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 350, -1));

        totalAmount.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        totalAmount.setForeground(new java.awt.Color(0, 0, 0));
        totalAmount.setText("Change:");
        jPanel1.add(totalAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        paymentMethod.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        paymentMethod.setForeground(new java.awt.Color(0, 0, 0));
        paymentMethod.setText("Payment Method:");
        jPanel1.add(paymentMethod, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        amountRendered.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        amountRendered.setForeground(new java.awt.Color(0, 0, 0));
        amountRendered.setText("Amount Rendered: ");
        jPanel1.add(amountRendered, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        Barber.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        Barber.setForeground(new java.awt.Color(0, 0, 0));
        Barber.setText("Barber: ");
        jPanel1.add(Barber, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        lineThree.setText("––––––––––––––––––––––––––––––––––––––––––––––––––");
        jPanel1.add(lineThree, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 350, -1));

        jLabel3.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("<html><div style=\"text-align: center;\">THANK YOU FOR<br>CHOOSING MANILA CLASSICO</div></html>");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 300, -1));

        receiptTextField.setEditable(false);
        receiptTextField.setBackground(new java.awt.Color(255, 255, 255));
        receiptTextField.setFont(new java.awt.Font("SF Pro Display", 0, 13)); // NOI18N
        receiptTextField.setForeground(new java.awt.Color(0, 0, 0));
        receiptTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        receiptTextField.setBorder(null);
        receiptTextField.setFocusable(false);
        jPanel1.add(receiptTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 100, -1));

        dateTextField.setEditable(false);
        dateTextField.setBackground(new java.awt.Color(255, 255, 255));
        dateTextField.setFont(new java.awt.Font("SF Pro Display", 0, 13)); // NOI18N
        dateTextField.setForeground(new java.awt.Color(0, 0, 0));
        dateTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        dateTextField.setBorder(null);
        dateTextField.setFocusable(false);
        jPanel1.add(dateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 100, -1));

        cashierTextField.setEditable(false);
        cashierTextField.setBackground(new java.awt.Color(255, 255, 255));
        cashierTextField.setFont(new java.awt.Font("SF Pro Display", 0, 13)); // NOI18N
        cashierTextField.setForeground(new java.awt.Color(0, 0, 0));
        cashierTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cashierTextField.setBorder(null);
        cashierTextField.setFocusable(false);
        jPanel1.add(cashierTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 100, -1));

        customerTextField.setEditable(false);
        customerTextField.setBackground(new java.awt.Color(255, 255, 255));
        customerTextField.setFont(new java.awt.Font("SF Pro Display", 0, 13)); // NOI18N
        customerTextField.setForeground(new java.awt.Color(0, 0, 0));
        customerTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        customerTextField.setAutoscrolls(false);
        customerTextField.setBorder(null);
        customerTextField.setFocusable(false);
        jPanel1.add(customerTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 100, -1));

        serviceTextField.setEditable(false);
        serviceTextField.setBackground(new java.awt.Color(255, 255, 255));
        serviceTextField.setFont(new java.awt.Font("SF Pro Display", 0, 13)); // NOI18N
        serviceTextField.setForeground(new java.awt.Color(0, 0, 0));
        serviceTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        serviceTextField.setBorder(null);
        serviceTextField.setFocusable(false);
        jPanel1.add(serviceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 240, -1));

        changeTextField.setEditable(false);
        changeTextField.setBackground(new java.awt.Color(255, 255, 255));
        changeTextField.setFont(new java.awt.Font("SF Pro Display", 0, 13)); // NOI18N
        changeTextField.setForeground(new java.awt.Color(0, 0, 0));
        changeTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        changeTextField.setBorder(null);
        changeTextField.setFocusable(false);
        jPanel1.add(changeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 100, -1));

        paymentMethodTextField.setEditable(false);
        paymentMethodTextField.setBackground(new java.awt.Color(255, 255, 255));
        paymentMethodTextField.setFont(new java.awt.Font("SF Pro Display", 0, 13)); // NOI18N
        paymentMethodTextField.setForeground(new java.awt.Color(0, 0, 0));
        paymentMethodTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        paymentMethodTextField.setBorder(null);
        paymentMethodTextField.setFocusable(false);
        jPanel1.add(paymentMethodTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 100, -1));

        amountRenderedTextField.setEditable(false);
        amountRenderedTextField.setBackground(new java.awt.Color(255, 255, 255));
        amountRenderedTextField.setFont(new java.awt.Font("SF Pro Display", 0, 13)); // NOI18N
        amountRenderedTextField.setForeground(new java.awt.Color(0, 0, 0));
        amountRenderedTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        amountRenderedTextField.setBorder(null);
        amountRenderedTextField.setFocusable(false);
        jPanel1.add(amountRenderedTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 100, -1));

        barberTextField.setEditable(false);
        barberTextField.setBackground(new java.awt.Color(255, 255, 255));
        barberTextField.setFont(new java.awt.Font("SF Pro Display", 0, 13)); // NOI18N
        barberTextField.setForeground(new java.awt.Color(0, 0, 0));
        barberTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        barberTextField.setBorder(null);
        barberTextField.setFocusable(false);
        jPanel1.add(barberTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 100, -1));

        jLabel6.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("1234 Metro Manila, Pasay City, Philippines");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("0977 834 9967");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        totalAmount1.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        totalAmount1.setForeground(new java.awt.Color(0, 0, 0));
        totalAmount1.setText("Total Amount: ");
        jPanel1.add(totalAmount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        totalAmountTextField1.setEditable(false);
        totalAmountTextField1.setBackground(new java.awt.Color(255, 255, 255));
        totalAmountTextField1.setFont(new java.awt.Font("SF Pro Display", 0, 13)); // NOI18N
        totalAmountTextField1.setForeground(new java.awt.Color(0, 0, 0));
        totalAmountTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        totalAmountTextField1.setBorder(null);
        totalAmountTextField1.setFocusable(false);
        jPanel1.add(totalAmountTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReceiptPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReceiptPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReceiptPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReceiptPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReceiptPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Barber;
    private javax.swing.JLabel Date;
    private javax.swing.JLabel Services;
    private javax.swing.JLabel amountRendered;
    private javax.swing.JTextField amountRenderedTextField;
    private javax.swing.JTextField barberTextField;
    private javax.swing.JLabel cashierName;
    private javax.swing.JTextField cashierTextField;
    private javax.swing.JTextField changeTextField;
    private javax.swing.JLabel customerName;
    private javax.swing.JTextField customerTextField;
    private javax.swing.JTextField dateTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lineOne;
    private javax.swing.JLabel lineThree;
    private javax.swing.JLabel lineTwo;
    private javax.swing.JLabel paymentMethod;
    private javax.swing.JTextField paymentMethodTextField;
    private javax.swing.JLabel receiptNo;
    private javax.swing.JTextField receiptTextField;
    private javax.swing.JTextField serviceTextField;
    private javax.swing.JLabel totalAmount;
    private javax.swing.JLabel totalAmount1;
    private javax.swing.JTextField totalAmountTextField1;
    // End of variables declaration//GEN-END:variables
}
