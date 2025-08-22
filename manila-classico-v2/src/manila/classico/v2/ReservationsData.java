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
    private static DefaultTableModel model = new DefaultTableModel(
        new Object[]{"Full Name", "Contact", "Service", "Barber", "Date", "Time"}, 0
    );

    public static void addReservation(String fullName, String contact, String service,
                                      String barber, String date, String time) {
        model.addRow(new Object[]{fullName, contact, service, barber, date, time});
    }

    public static DefaultTableModel getModel() {
        return model;
    }
}
