/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicas.gui;

import com.toedter.calendar.JCalendar;
import javax.swing.*;
import java.awt.*;

public class RegistroAlumno extends JFrame {
    public RegistroAlumno() {
        setTitle("Registro Alumno");
        setSize(400, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(8, 2));

        // 1-5 JLabel
        JLabel lblNombre = new JLabel("Nombre:");
        JLabel lblApellidos = new JLabel("Apellidos:");
        JLabel lblTelefono = new JLabel("Teléfono:");
        JLabel lblDireccion = new JLabel("Dirección:");
        JLabel lblFecha = new JLabel("Fecha Nacimiento:");

        // 6-9 JTextField
        JTextField txtNombre = new JTextField();
        JTextField txtApellidos = new JTextField();
        JTextField txtTelefono = new JTextField();
        JTextField txtDireccion = new JTextField();

        // 10 JCalendar
        JCalendar calendario = new JCalendar();

        // 13-14 JRadioButton
        JLabel lblGenero = new JLabel("Género:");
        JRadioButton rbF = new JRadioButton("F");
        JRadioButton rbM = new JRadioButton("M");
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(rbF);
        grupo.add(rbM);

        panel.add(lblNombre); panel.add(txtNombre);
        panel.add(lblApellidos); panel.add(txtApellidos);
        panel.add(lblTelefono); panel.add(txtTelefono);
        panel.add(lblDireccion); panel.add(txtDireccion);
        panel.add(lblFecha); panel.add(calendario);
        panel.add(lblGenero); panel.add(rbF);
        panel.add(new JLabel("")); panel.add(rbM);

        add(panel, BorderLayout.CENTER);
    }
}
