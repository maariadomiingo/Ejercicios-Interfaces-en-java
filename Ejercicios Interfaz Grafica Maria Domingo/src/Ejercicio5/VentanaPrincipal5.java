package Ejercicio5;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

public class VentanaPrincipal5 extends JFrame {
    private JTextField txtNumero;
    private JButton btnGenerar;
    private JTextField txtResultado;

    public VentanaPrincipal5() {
        getContentPane().setLayout(null);

        JLabel lblNumero = new JLabel("Introduce un número:");
        lblNumero.setBounds(114, 20, 175, 17);
        lblNumero.setFont(new Font("Tahoma", Font.PLAIN, 14));
        getContentPane().add(lblNumero);

        txtNumero = new JTextField();
        txtNumero.setBounds(124, 47, 100, 20);
        getContentPane().add(txtNumero);
        txtNumero.setColumns(10);

        btnGenerar = new JButton("Generar número par");
        btnGenerar.setBounds(82, 85, 200, 30);
        getContentPane().add(btnGenerar);

        JLabel lblResultado = new JLabel("Resultado:");
        lblResultado.setBounds(40, 125, 80, 17);
        lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 14));
        getContentPane().add(lblResultado);

        txtResultado = new JTextField();
        txtResultado.setBounds(124, 125, 100, 20);
        getContentPane().add(txtResultado);
        txtResultado.setColumns(10);

        setTitle("Generador de números pares");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public JTextField getTxtNumero() {
        return txtNumero;
    }

    public JButton getBtnGenerar() {
        return btnGenerar;
    }

    public JTextField getTxtResultado() {
        return txtResultado;
    }
}
