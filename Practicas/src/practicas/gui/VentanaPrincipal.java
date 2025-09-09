/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicas.gui;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {
    public VentanaPrincipal() {
        setTitle("Menú Principal");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton btnAlumno = new JButton("Registro Alumno");
        JButton btnMenu = new JButton("Menú Opciones");
        JButton btnDescripcion = new JButton("Registro Descripción");

        btnAlumno.addActionListener(e -> new RegistroAlumno().setVisible(true));
        btnMenu.addActionListener(e -> new MenuOpciones().setVisible(true));
        btnDescripcion.addActionListener(e -> new RegistroDescripcion().setVisible(true));

        setLayout(new GridLayout(3, 1));
        add(btnAlumno);
        add(btnMenu);
        add(btnDescripcion);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new VentanaPrincipal().setVisible(true));
    }
}
