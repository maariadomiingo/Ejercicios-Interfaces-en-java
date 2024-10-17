package Ejercicio5;

import java.awt.event.*;
import javax.swing.*;

public class listener5 implements ActionListener {
    private VentanaPrincipal5 ventana;

    public listener5(VentanaPrincipal5 ventana) {
        this.ventana = ventana;
        this.ventana.getBtnGenerar().addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int max = Integer.parseInt(ventana.getTxtNumero().getText());
            int numeroPar = (int) (Math.random() * (max / 2)) * 2;
            ventana.getTxtResultado().setText("Número par: " + numeroPar);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Introduce un número válido.");
        }
    }
}

