/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicas.gui;


import javax.swing.*;
import java.awt.*;

public class RegistroDescripcion extends JFrame {
    public RegistroDescripcion() {
        setTitle("Registro Descripción");
        setSize(400, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout());

        JLabel lblDescripcion = new JLabel("Descripción:");
        JTextField txtDescripcion = new JTextField(20);
        JButton btnNuevo = new JButton("Nuevo");
        JButton btnAgregar = new JButton("Agregar");

        JTextArea area = new JTextArea();
        JScrollPane scroll = new JScrollPane(area);

        JPanel panelTop = new JPanel(new GridLayout(2,2));
        panelTop.add(lblDescripcion);
        panelTop.add(txtDescripcion);
        panelTop.add(btnNuevo);
        panelTop.add(btnAgregar);

        panel.add(panelTop, BorderLayout.NORTH);
        panel.add(scroll, BorderLayout.CENTER);

        add(panel);
    }
}
