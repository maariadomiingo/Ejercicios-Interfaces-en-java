package Ejercicio1;

import java.awt.*;
import javax.swing.*;

public class VentanaPrincipal extends JFrame {
    private JTextField escribir;
    private JTextField respuesta;
    private JButton btnComprobar;
    
    public JTextField getEscribir() {
        return escribir;
    }

    public void setEscribir(JTextField escribir) {
        this.escribir = escribir;
    }

    public JTextField getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(JTextField respuesta) {
        this.respuesta = respuesta;
    }

    public JButton getBtnComprobar() {
        return btnComprobar;
    }

    public void setBtnComprobar(JButton btnComprobar) {
        this.btnComprobar = btnComprobar;
    }

    public VentanaPrincipal() {
        getContentPane().setLayout(null);
        
        escribir = new JTextField();
        escribir.setBounds(147, 74, 112, 36);
        escribir.setBackground(new Color(192, 192, 192));
        getContentPane().add(escribir);
        escribir.setColumns(10);
        
        JLabel lblText = new JLabel("Introduce un número:");
        
        
        lblText.setBackground(new Color(192, 192, 192));
        lblText.setBounds(104, 39, 196, 25);
        lblText.setFont(new Font("Tahoma", Font.PLAIN, 20));
        getContentPane().add(lblText);
        
        
        
        // Corregir la creación del botón "Comprobar" para inicializar la variable de instancia
        btnComprobar = new JButton("Comprobar");
        btnComprobar.setBackground(new Color(192, 192, 192));
        btnComprobar.setToolTipText("");
        btnComprobar.setBounds(147, 133, 112, 36);
        getContentPane().add(btnComprobar);
        
        respuesta = new JTextField();
        respuesta.setColumns(10);
        respuesta.setBackground(Color.LIGHT_GRAY);
        respuesta.setBounds(147, 194, 112, 36);
        getContentPane().add(respuesta);
        
      //tamaño y posicion de la ventana
		setSize(600, 400);
		setLocationRelativeTo(null);
    }
}
