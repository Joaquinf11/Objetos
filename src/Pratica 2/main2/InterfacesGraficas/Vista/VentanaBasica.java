package InterfacesGraficas.Vista;

import javax.swing.*;
import java.awt.*;

public class VentanaBasica {
    private JFrame frame;

    public VentanaBasica(){
        construirVentana();
    }

    public void construirVentana(){
        frame= new JFrame("Ventana Basica");
        Container panelPrincipal= frame.getContentPane(); //panel contenedero de la ventana

        JLabel etiqueta= new JLabel("Hola Mundo desde Swing");
        JButton boton1= new JButton("Boton 1");
        JButton boton2= new JButton("Boton 2");
        JButton boton3= new JButton("Boton 3");
        JButton boton4= new JButton("Boton 4");

//        panelPrincipal.add(etiqueta);
//        panelPrincipal.add(boton1);
//        panelPrincipal.add(boton2);
//        panelPrincipal.add(boton3);
//        panelPrincipal.add(boton4);

      //  frame.pack(); // se acomoda al contenido que tiene adentro
        frame.setBounds(100,100,400,400); //le doy el tamaño a la ventana de un rectangulo

        // frame.setLayout(new FlowLayout());
        //frame.setLayout(new GridLayout());
        frame.setLayout(new BorderLayout()); // solo para este hay que agregar los botones despues para definir donde van
        panelPrincipal.add(etiqueta,BorderLayout.NORTH);
        panelPrincipal.add(boton1,BorderLayout.WEST);
        panelPrincipal.add(boton2,BorderLayout.CENTER);
        panelPrincipal.add(boton3,BorderLayout.SOUTH);
        panelPrincipal.add(boton4,BorderLayout.EAST);

        frame.setVisible(true);
    }
}
