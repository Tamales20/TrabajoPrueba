/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2;

/**
 *
 * @author MrEnsaladaZ
 */

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import com.toedter.calendar.JCalendar;

public class Practica2 extends JFrame {

    public Practica2() {
        setTitle("Registro");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menú");
        JMenuItem menuDatos = new JMenuItem("Datos");
        JMenuItem menuProveedor = new JMenuItem("Proveedor");
        JMenuItem menuInformacion = new JMenuItem("Información");
        menu.add(menuDatos);
        menu.add(menuProveedor);
        menu.add(menuInformacion);
        menuBar.add(menu);
        setJMenuBar(menuBar);

        JPanel mainPanel = new JPanel(new BorderLayout());

        JPanel panelIzquierda = new JPanel();
        panelIzquierda.setLayout(new BoxLayout(panelIzquierda, BoxLayout.Y_AXIS));

        JPanel panelDatos = new JPanel(new GridLayout(5, 2, 5, 5));
        panelDatos.setBorder(BorderFactory.createTitledBorder("Datos"));

        panelDatos.add(new JLabel("Producto:"));
        JComboBox<String> comboProducto = new JComboBox<>(new String[]{"Producto A", "Producto B", "Producto C"});
        panelDatos.add(comboProducto);

        panelDatos.add(new JLabel("Cantidad:"));
        JComboBox<String> comboCantidad = new JComboBox<>(new String[]{"1", "2", "3", "4", "5"});
        panelDatos.add(comboCantidad);

        panelDatos.add(new JLabel("Precio:"));
        JTextField txtPrecio = new JTextField();
        panelDatos.add(txtPrecio);

        panelDatos.add(new JLabel("Existencia:"));
        JTextField txtExistencia = new JTextField();
        panelDatos.add(txtExistencia);

        panelDatos.add(new JLabel("Descripción:"));
        JTextField txtDescripcion = new JTextField();
        panelDatos.add(txtDescripcion);

        JPanel panelProveedor = new JPanel(new GridLayout(3, 2, 5, 5));
        panelProveedor.setBorder(BorderFactory.createTitledBorder("Proveedor"));

        panelProveedor.add(new JLabel("Clave:"));
        JTextField txtClave = new JTextField();
        panelProveedor.add(txtClave);

        panelProveedor.add(new JLabel("Fecha Pedido:"));
        JCalendar calendar = new JCalendar();
        panelProveedor.add(calendar);

        panelProveedor.add(new JLabel("Producto:"));
        JComboBox<String> comboProveedorProd = new JComboBox<>(new String[]{"Producto X", "Producto Y", "Producto Z"});
        panelProveedor.add(comboProveedorProd);

        panelIzquierda.add(panelDatos);
        panelIzquierda.add(panelProveedor);

        JPanel panelInfo = new JPanel(new BorderLayout());
        panelInfo.setBorder(BorderFactory.createTitledBorder("Información"));

        JPanel panelClave = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelClave.add(new JLabel("Clave:"));
        JTextField txtClaveInfo = new JTextField(15);
        panelClave.add(txtClaveInfo);
        panelInfo.add(panelClave, BorderLayout.NORTH);

String[] columnas = {"Clave", "Producto", "Cantidad", "Precio", "Estado"};
Object[][] datosEjemplo = {
        {"001", "Producto A", "2", "50.00", "Disponible"},
        {"002", "Producto B", "5", "120.00", "Agotado"},
        {"003", "Producto C", "1", "30.00", "Disponible"},
        {"004", "Producto D", "10", "200.00", "Pedido"},
        {"005", "Producto E", "3", "75.00", "Disponible"},
};

DefaultTableModel model = new DefaultTableModel(datosEjemplo, columnas);
JTable tabla = new JTable(model);

JScrollPane scrollPane = new JScrollPane(tabla,
        JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
        JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

scrollPane.setPreferredSize(new Dimension(400, 150));

panelInfo.add(scrollPane, BorderLayout.CENTER);


        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton btnNuevo = new JButton("Nuevo");
        JButton btnGuardar = new JButton("Guardar");
        JButton btnBuscar = new JButton("Buscar");

        panelBotones.add(btnNuevo);
        panelBotones.add(btnGuardar);
        panelBotones.add(btnBuscar);

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panelIzquierda, panelInfo);
        splitPane.setDividerLocation(350);

        mainPanel.add(splitPane, BorderLayout.CENTER);
        mainPanel.add(panelBotones, BorderLayout.SOUTH);

        add(mainPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Practica2().setVisible(true);
        });
    }
}
