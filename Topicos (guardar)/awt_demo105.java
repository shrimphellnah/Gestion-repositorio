import java.awt.*;
import java.awt.event.*;

public class awt_demo105 extends Frame {
    public awt_demo105() {
        super("Frame con BorderLayout");
        setSize(400, 400);
        setLayout(new BorderLayout());

        Panel pWest = new Panel(new GridLayout(3, 1));
        Choice opciones = new Choice();
        opciones.add("Opcion 1");
        opciones.add("Opcion 2");
        opciones.add("Opcion 3");
        pWest.add(opciones);
        add(pWest, BorderLayout.WEST);

        Panel pCenter = new Panel(new FlowLayout());
        CheckboxGroup checkboxGroup = new CheckboxGroup();
        Checkbox opcion1 = new Checkbox("Opcion A", checkboxGroup, false);
        Checkbox opcion2 = new Checkbox("Opcion B", checkboxGroup, false);
        pCenter.add(opcion1);
        pCenter.add(opcion2);
        add(pCenter, BorderLayout.CENTER);

        add(new Button("Norte"), BorderLayout.NORTH);
        add(new Button("Este"), BorderLayout.EAST);

        setBackground(Color.GREEN);

        Button boton3 = new Button("Salir");
        boton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(boton3, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        awt_demo105 f = new awt_demo105();
    }
}


