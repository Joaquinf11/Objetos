package InterfacesGraficas.Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Centro extends JPanel {

    public Centro(VentanaBasica ventanaPadre) {
        this.setLayout(new FlowLayout());
        JButton boton = new JButton("Estoy en el centro");
        JButton boton2 = new JButton("Hola");
        this.add(boton);
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventanaPadre.salirDeLaApp();
            }
        });
        this.add(boton2);
        this.setVisible(true);
    }

    public void salirDeLaApp(){
        System.exit(0);
    }
}
