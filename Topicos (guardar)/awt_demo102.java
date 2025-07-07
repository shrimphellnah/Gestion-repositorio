import java.awt.*;

public class awt_demo102 extends Frame {
    public awt_demo102() {
        super("Ejemplo de Frame");
        setSize(200, 200);

        Button botonAceptar = new Button("Aceptar");
        add(botonAceptar);

        Button botonCancelar = new Button("Cancelar");
        add(botonCancelar);

        // Establecer el color de fondo (Color.YELLOW)
        setBackground(Color.YELLOW);

        // Hacer la ventana visible
        setVisible(true);
    }

    public static void main(String[] args) {
        awt_demo102 f = new awt_demo102();
    }
}
