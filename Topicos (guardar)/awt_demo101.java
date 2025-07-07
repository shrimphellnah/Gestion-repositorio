import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class awt_demo101 extends Frame implements WindowListener {
    private Random rand;

    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    public void windowOpened(WindowEvent e) {
        System.out.println(":) :)");
    }

    public void windowClosed(WindowEvent e) {
        System.out.println(":( :(");
    }

    public void windowIconified(WindowEvent e) {
        System.out.println(":P :P");
    }

    public void windowDeiconified(WindowEvent e) {
        System.out.println(">) ");
    }

    public void windowActivated(WindowEvent e) {
    }

    public void windowDeactivated(WindowEvent e) {
        setBackground(getRandomColor());
    }

    public awt_demo101() {
        super("Ejemplo de Frame");
        setSize(400, 300);
        setBackground(Color.RED);
        addWindowListener(this);
        rand = new Random();
        setVisible(true);
    }

    private Color getRandomColor() {
        int red = rand.nextInt(256);
        int green = rand.nextInt(256);
        int blue = rand.nextInt(256);
        return new Color(red, green, blue);
    }

    public static void main(String[] args) {
        awt_demo101 f = new awt_demo101();
    }
}
