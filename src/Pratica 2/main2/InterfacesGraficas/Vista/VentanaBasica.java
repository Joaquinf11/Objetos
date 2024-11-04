package InterfacesGraficas.Vista;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class VentanaBasica {
    private JFrame frame;

    public VentanaBasica(){
        construirVentana();
    }

    public void construirVentana(){
        frame= new JFrame("Ventana Basica");
        Container panelPrincipal= frame.getContentPane(); //panel contenedero de la ventana

        JLabel etiqueta= new JLabel("Hola Mundo desde Swing");
        JButton boton1= new JButton("Agregar");
        JButton boton2= new JButton("Borrar");
        JButton boton3= new JButton("Modificar");
        JButton boton4= new JButton("Salir");
        JButton botonCentral= new JButton("CENTRO");
        JLabel estado= new JLabel("Aca esta el estado de la aplicacion");


//        panelPrincipal.add(etiqueta);
//        panelPrincipal.add(boton1);
//        panelPrincipal.add(boton2);
//        panelPrincipal.add(boton3);
//        panelPrincipal.add(boton4);

      //  frame.pack(); // se acomoda al contenido que tiene adentro
        frame.setBounds(100,100,400,400); //le doy el tamaño a la ventana de un rectangulo


        JPanel borde = new JPanel(new FlowLayout());
        JPanel panelMenu = new JPanel(new GridLayout(4,1));
        panelMenu.add(boton1,0,0);
        panelMenu.add(boton2,1,0);
        panelMenu.add(boton3,2,0);
        panelMenu.add(boton4,3,0);
        borde.add(panelMenu);
        // frame.setLayout(new FlowLayout());
        //frame.setLayout(new GridLayout());
        panelPrincipal.setLayout(new BorderLayout()); // solo para este hay que agregar los botones despues para definir donde van
        panelPrincipal.add(etiqueta,BorderLayout.NORTH);
        panelPrincipal.add(borde,BorderLayout.WEST);
        panelPrincipal.add(botonCentral, BorderLayout.CENTER);
        panelPrincipal.add(estado,BorderLayout.SOUTH);

        JMenuBar menuBar= new JMenuBar();
        frame.setJMenuBar(menuBar);
        JMenu archivo= new JMenu("Archivo");
        JMenu ver= new JMenu("Ver");
        JMenuItem salir = new JMenuItem("salir");
        archivo.add(salir);
        menuBar.add(archivo);
        menuBar.add(ver);

        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Salinedo desde el menu");
                System.exit(0);
            }
        });

        boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Salinedo desde el boton");
                System.exit(0);
            }
        });

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }
}
