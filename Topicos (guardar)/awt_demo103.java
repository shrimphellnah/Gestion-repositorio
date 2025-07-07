import java.awt.*;
public class awt_demo103 extends Frame
{
 public awt_demo103()
 {
  super("Ejemplo de Frame");setSize(300,300);
  setLayout(new FlowLayout());
  Button boton = new Button("Aceptar"); add(boton);
  Button boton1 = new Button("Cancelar");add(boton1);
  Button boton2 = new Button("push the red botton");add(boton2);
  Button boton3 = new Button("Peligro no presionar");add(boton3);
  boton3.setBackground(Color.GREEN);
  setBackground(Color.yellow);
  setVisible(true);
 }
 public static void main(String[] args)
   {
      awt_demo103 f = new awt_demo103();
   }
}