/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package manila.classico.v2;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author theojohnsosa
 */
public class ReservationsData {
    private static final DefaultTableModel model = new DefaultTableModel(
        new Object[]{"Full Name", "Contact", "Service", "Barber", "Date", "Time", "Payment Method", "Total"}, 0
    );

    public static void addReservation(String fullName, String contact, String service,
                                      String barber, String date, String time,
                                      String paymentMethod, String total) {
        model.addRow(new Object[]{fullName, contact, service, barber, date, time, paymentMethod, total});
    }

    public static DefaultTableModel getModel() {
        return model;
    }
}
