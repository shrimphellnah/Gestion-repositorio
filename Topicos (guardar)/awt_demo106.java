package aaaa;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;


public class awt_demo106 extends Frame implements ActionListener {
    private Button selectedButton = null;
    private Color originalColor = null;
    private Map<Button, Color> originalColorsMap = new HashMap<>();

    public awt_demo106() {
        super("Plano cartesiano");
        setSize(300, 300);
        setLayout(new GridLayout(8, 8));

        // Restaurar los colores originales de los botones
        originalColor = Color.WHITE;

        // Agregar los botones al GridLayout principal con los textos correspondientes
        Color white = Color.WHITE;
        Color black = Color.BLACK;
        Color whiteText = Color.WHITE;

        add(createButton("Torre A8", white, black));
        add(createButton("Caballo B8", black, white));
        add(createButton("Alfil C8", white, black));
        add(createButton("Reyna D8", black, white));
        add(createButton("Rey E8", white, black));
        add(createButton("Alfil F8", black, white));
        add(createButton("Caballo G8", white, black));
        add(createButton("Torre H8", black, white));

        add(createButton("Peon A7", black, white));
        add(createButton("Peon B7", white, black));
        add(createButton("Peon C7", black, white));
        add(createButton("Peon D7", white, black));
        add(createButton("Peon E7", black, white));
        add(createButton("Peon F7", white, black));
        add(createButton("Peon G7", black, white));
        add(createButton("Peon H7", white, black));

        add(createButton("", white, white));
        add(createButton("", black, white));
        add(createButton("", white, white));
        add(createButton("", black, white));
        add(createButton("", white, white));
        add(createButton("", black, white));
        add(createButton("", white, white));
        add(createButton("", black, white));

        add(createButton("", black, white));
        add(createButton("", white, white));
        add(createButton("", black, white));
        add(createButton("", white, white));
        add(createButton("", black, white));
        add(createButton("", white, white));
        add(createButton("", black, white));
        add(createButton("", white, white));

        add(createButton("", white, white));
        add(createButton("", black, white));
        add(createButton("", white, white));
        add(createButton("", black, white));
        add(createButton("", white, white));
        add(createButton("", black, white));
        add(createButton("", white, white));
        add(createButton("", black, white));

        add(createButton("", black, white));
        add(createButton("", white, white));
        add(createButton("", black, white));
        add(createButton("", white, white));
        add(createButton("", black, white));
        add(createButton("", white, white));
        add(createButton("", black, white));
        add(createButton("", white, white));

        add(createButton("Peon A2", white, black));
        add(createButton("Peon B2", black, white));
        add(createButton("Peon C2", white, black));
        add(createButton("Peon D2", black, white));
        add(createButton("Peon E2", white, black));
        add(createButton("Peon F2", black, white));
        add(createButton("Peon G2", white, black));
        add(createButton("Peon H2", black, white));

        add(createButton("Torre A1", black, white));
        add(createButton("Caballo B1", white, black));
        add(createButton("Alfil C1", black, white));
        add(createButton("Reyna D1", white, black));
        add(createButton("Rey E1", black, white));
        add(createButton("Alfil F1", white, black));
        add(createButton("Caballo G1", black, white));
        add(createButton("Torre H1", white, black));

        setVisible(true);
    }

    private Button createButton(String label, Color background, Color foreground) {
        Button boton = new Button(label);
        boton.setBackground(background);
        boton.setForeground(foreground);
        boton.addActionListener(this);
        originalColorsMap.put(boton, background);
        return boton;
    }

    public void actionPerformed(ActionEvent e) {
        Button clickedButton = (Button) e.getSource();

        if (clickedButton.getLabel().isEmpty() || clickedButton.getBackground() == Color.GREEN) {
            return; // Si no es seleccionable, no se hace nada
        }

        if (selectedButton != null) {
            // Reset the color of the previously selected cell
            selectedButton.setBackground(originalColor);

            // Reset the color of all highlighted buttons
            for (Button button : originalColorsMap.keySet()) {
                if (button.getLabel().isEmpty()) {
                    button.setBackground(originalColorsMap.get(button));
                }
            }
        }

        if (selectedButton == clickedButton) {
            // If the same button is clicked again, set selectedButton to null
            selectedButton = null;
        } else {
            // Set the clicked button to red (selected) and store its original color
            selectedButton = clickedButton;
            originalColor = clickedButton.getBackground();
            clickedButton.setBackground(Color.RED);

            // Highlight empty cells with green
            for (Button button : originalColorsMap.keySet()) {
                if (button != selectedButton && button.getLabel().isEmpty()) {
                    button.setBackground(Color.GREEN);
                }
            }
        }
    }

    public static void main(String[] args) {
        awt_demo106 f = new awt_demo106();
    }
}