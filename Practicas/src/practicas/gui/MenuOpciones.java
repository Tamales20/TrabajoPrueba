/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicas.gui;


import javax.swing.*;

public class MenuOpciones extends JFrame {
    public MenuOpciones() {
        setTitle("Menú Opciones");
        setSize(400, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JMenuBar menuBar = new JMenuBar();

        JMenu menu1 = new JMenu("Menu1");
        JMenu menu2 = new JMenu("Menu2");
        JMenu menuSalir = new JMenu("Salir");

        JMenuItem opcion1 = new JMenuItem("Opcion1");
        JMenuItem opcion2 = new JMenuItem("Opcion2");
        JMenuItem opcion3 = new JMenuItem("Opcion3");

        menu1.add(opcion1);
        menu1.add(opcion2);
        menu2.add(opcion3);

        opcion1.addActionListener(e -> JOptionPane.showMessageDialog(this, "Elegiste Opción1"));
        opcion2.addActionListener(e -> JOptionPane.showMessageDialog(this, "Elegiste Opción2"));
        opcion3.addActionListener(e -> JOptionPane.showMessageDialog(this, "Elegiste Opción3"));

        menuSalir.addMenuListener(new javax.swing.event.MenuListener() {
            @Override public void menuSelected(javax.swing.event.MenuEvent e) { dispose(); }
            @Override public void menuDeselected(javax.swing.event.MenuEvent e) {}
            @Override public void menuCanceled(javax.swing.event.MenuEvent e) {}
        });

        menuBar.add(menu1);
        menuBar.add(menu2);
        menuBar.add(menuSalir);

        setJMenuBar(menuBar);
    }
}
