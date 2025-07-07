import java.awt.*;
public class awt_demo104 extends Frame
{
       public awt_demo104()
       {
        super("Plano cartesiano");
        setSize(300,300);
        setLayout(new GridLayout(3,3));
        Button boton1 = new Button("X");add(boton1);
        Button boton2 = new Button("O");add(boton2);
        Button boton3 = new Button("O");add(boton3);
        Button boton4 = new Button("X"); add(boton4);
        Button boton5 = new Button("X"); add(boton5);
        Button boton6 = new Button("X"); add(boton6);
        Button boton7 = new Button("O"); add(boton7);
        Button boton8 = new Button("O"); add(boton8);
        Button boton9 = new Button("O"); add(boton9);
        setVisible(true);
       }
       public static void main(String[] args)
       {
        awt_demo104 f = new awt_demo104();
       }
}