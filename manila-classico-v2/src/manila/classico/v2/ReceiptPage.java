/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package manila.classico.v2;
import java.util.Random;
import java.text.DecimalFormat;

public class ReceiptPage extends javax.swing.JFrame {
   
    public ReceiptPage() {
        Reservation reservations = ReservationsData.getLastAddedReservation();
        initComponents();
        
        Random randomNum = new Random();
        int receiptNum = randomNum.nextInt(1000000000)+ 1;
        receiptTextField.setText("" + receiptNum);
        
        if (reservations != null) {
            String date = reservations.getDate();
            String name = reservations.getFullName();
            String service = reservations.getService();
            
            String barber = reservations.getBarber();
            String paymentMethod = reservations.getPaymentMethod();
            String total = reservations.getTotalAmount();
            String paymentRendered = reservations.getPaymentRendered();
            double renderedPayment = Double.parseDouble(paymentRendered);
            DecimalFormat df = new DecimalFormat("###0.0");
            df.setPositivePrefix("₱");
            String formattedAmount = df.format(renderedPayment);
             
            dateTextField.setText(date);
            cashierTextField.setText("admin");
            customerTextField.setText(name);
            serviceTextField.setText(service);
            
            totalAmountTextField.setText(total);
            paymentMethodTextField.setText(paymentMethod);
            amountRenderedTextField.setText(formattedAmount);
            barberTextField.setText(barber);
            
}
        
        
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
        totalAmountTextField = new javax.swing.JTextField();
        paymentMethodTextField = new javax.swing.JTextField();
        amountRenderedTextField = new javax.swing.JTextField();
        barberTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

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
        receiptNo.setText("Receipt No:");
        jPanel1.add(receiptNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 20));

        Date.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        Date.setText("Date:");
        jPanel1.add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        cashierName.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        cashierName.setText("Cashier:");
        jPanel1.add(cashierName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, 20));

        customerName.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        customerName.setText("Customer:");
        customerName.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(customerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        Services.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        Services.setText("Services:");
        jPanel1.add(Services, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        lineTwo.setText("––––––––––––––––––––––––––––––––––––––––––––––––––");
        jPanel1.add(lineTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 350, -1));

        totalAmount.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        totalAmount.setText("Total Amount: ");
        jPanel1.add(totalAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 255, -1, -1));

        paymentMethod.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        paymentMethod.setText("Payment Method:");
        jPanel1.add(paymentMethod, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        amountRendered.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        amountRendered.setText("Amount Rendered: ");
        jPanel1.add(amountRendered, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 305, -1, -1));

        Barber.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        Barber.setText("Barber: ");
        jPanel1.add(Barber, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        lineThree.setText("––––––––––––––––––––––––––––––––––––––––––––––––––");
        jPanel1.add(lineThree, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 350, -1));

        jLabel3.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("<html><div style=\"text-align: center;\">THANK YOU FOR<br>CHOOSING MANILA CLASSICO</div></html>");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 300, -1));

        receiptTextField.setEditable(false);
        receiptTextField.setBackground(new java.awt.Color(255, 255, 255));
        receiptTextField.setFont(new java.awt.Font("SF Pro Display", 0, 13)); // NOI18N
        receiptTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        receiptTextField.setBorder(null);
        receiptTextField.setFocusable(false);
        jPanel1.add(receiptTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 100, -1));

        dateTextField.setEditable(false);
        dateTextField.setBackground(new java.awt.Color(255, 255, 255));
        dateTextField.setFont(new java.awt.Font("SF Pro Display", 0, 13)); // NOI18N
        dateTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        dateTextField.setBorder(null);
        dateTextField.setFocusable(false);
        jPanel1.add(dateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 100, -1));

        cashierTextField.setEditable(false);
        cashierTextField.setBackground(new java.awt.Color(255, 255, 255));
        cashierTextField.setFont(new java.awt.Font("SF Pro Display", 0, 13)); // NOI18N
        cashierTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cashierTextField.setBorder(null);
        cashierTextField.setFocusable(false);
        jPanel1.add(cashierTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 100, -1));

        customerTextField.setEditable(false);
        customerTextField.setBackground(new java.awt.Color(255, 255, 255));
        customerTextField.setFont(new java.awt.Font("SF Pro Display", 0, 13)); // NOI18N
        customerTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        customerTextField.setAutoscrolls(false);
        customerTextField.setBorder(null);
        customerTextField.setFocusable(false);
        jPanel1.add(customerTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 100, -1));

        serviceTextField.setEditable(false);
        serviceTextField.setBackground(new java.awt.Color(255, 255, 255));
        serviceTextField.setFont(new java.awt.Font("SF Pro Display", 0, 13)); // NOI18N
        serviceTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        serviceTextField.setBorder(null);
        serviceTextField.setFocusable(false);
        jPanel1.add(serviceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 240, -1));

        totalAmountTextField.setEditable(false);
        totalAmountTextField.setBackground(new java.awt.Color(255, 255, 255));
        totalAmountTextField.setFont(new java.awt.Font("SF Pro Display", 0, 13)); // NOI18N
        totalAmountTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        totalAmountTextField.setBorder(null);
        totalAmountTextField.setFocusable(false);
        jPanel1.add(totalAmountTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 255, 100, -1));

        paymentMethodTextField.setEditable(false);
        paymentMethodTextField.setBackground(new java.awt.Color(255, 255, 255));
        paymentMethodTextField.setFont(new java.awt.Font("SF Pro Display", 0, 13)); // NOI18N
        paymentMethodTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        paymentMethodTextField.setBorder(null);
        paymentMethodTextField.setFocusable(false);
        jPanel1.add(paymentMethodTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 100, -1));

        amountRenderedTextField.setEditable(false);
        amountRenderedTextField.setBackground(new java.awt.Color(255, 255, 255));
        amountRenderedTextField.setFont(new java.awt.Font("SF Pro Display", 0, 13)); // NOI18N
        amountRenderedTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        amountRenderedTextField.setBorder(null);
        amountRenderedTextField.setFocusable(false);
        jPanel1.add(amountRenderedTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 305, 100, -1));

        barberTextField.setEditable(false);
        barberTextField.setBackground(new java.awt.Color(255, 255, 255));
        barberTextField.setFont(new java.awt.Font("SF Pro Display", 0, 13)); // NOI18N
        barberTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        barberTextField.setBorder(null);
        barberTextField.setFocusable(false);
        jPanel1.add(barberTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 100, -1));

        jLabel6.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        jLabel6.setText("1234 Metro Manila, Pasay City, Philippines");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 1, 13)); // NOI18N
        jLabel2.setText("0977 834 9967");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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

        /* Create and display the form */
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
    private javax.swing.JTextField totalAmountTextField;
    // End of variables declaration//GEN-END:variables
}
