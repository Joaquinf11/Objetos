import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.Color;

public class Tabla {
    public static void main(String[] args) {
        // Crear el frame
        JFrame frame = new JFrame("Tabla en Java");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new GridBagLayout()); // Para centrar elementos

        // Crear columnas y datos
        String[] columnas = {"Jugador", "Victorias"};
        Object[][] datos = {
                {"Juan", 25},
                {"Ana", 30},
                {"Luis", 28},
                {"María", 22},
                {"Carlos", 27}
        };

        // Crear el modelo de la tabla
        DefaultTableModel modelo = new DefaultTableModel(datos, columnas) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Todas las celdas no son editables
            }
        };

        // Crear la tabla
        JTable tabla = new JTable(modelo);

        // Ajustar tamaño de las columnas
        tabla.getColumnModel().getColumn(0).setPreferredWidth(300); // Ancho para la columna "Jugador"
        tabla.getColumnModel().getColumn(1).setPreferredWidth(200); // Ancho para la columna "Victorias"

        // Personalizar la tabla
        tabla.setBackground(new Color(199, 86, 195)); // Fondo de la tabla
        tabla.setGridColor(new Color(201, 217, 5));   // Color de las líneas
        tabla.setFont(new Font("Ravie", Font.PLAIN, 26)); // Fuente y tamaño de las celdas
        tabla.setForeground(new Color(201, 217, 5));
        tabla.setRowHeight(50); // Altura de las filas

        // Ajustar grosor de las líneas de la tabla
        tabla.setIntercellSpacing(new Dimension(2, 2)); // Espaciado entre celdas

        // Centrar el contenido de las celdas
        DefaultTableCellRenderer centrado = new DefaultTableCellRenderer();
        centrado.setHorizontalAlignment(SwingConstants.CENTER);
        tabla.setDefaultRenderer(Object.class, centrado);

        // Personalizar encabezado
        tabla.getTableHeader().setFont(new Font("Arial", Font.BOLD, 30)); // Fuente del encabezado
        tabla.getTableHeader().setReorderingAllowed(false); // Evitar reordenar columnas
        tabla.getTableHeader().setBackground(new Color(201, 217, 5)); // Fondo del encabezado
        tabla.getTableHeader().setForeground(new Color(50, 50, 50));  // Color del texto del encabezado

        // Evitar que se puedan seleccionar celdas
        tabla.setRowSelectionAllowed(false);
        tabla.setColumnSelectionAllowed(false);

        // Panel para encabezado y tabla
        JPanel panelTabla = new JPanel();
        panelTabla.setLayout(new BorderLayout());
        panelTabla.add(tabla.getTableHeader(), BorderLayout.NORTH); // Encabezado
        panelTabla.add(tabla, BorderLayout.CENTER); // Tabla
        panelTabla.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Margen alrededor

        // Centrar todo el contenido
        frame.add(panelTabla, new GridBagConstraints());

        // Hacer visible el frame
        frame.setVisible(true);
    }
}