package Ejercicio3;


import java.awt.event.*;
import java.net.http.WebSocket.Listener;
import javax.swing.*;
import Ejercicio3.VentanaPrincipal3;

public class Listener3 implements Listener {

	
	private VentanaPrincipal3 ventana;
	
	public Listener3(VentanaPrincipal3 ventana) {
		this.ventana = ventana;
		this.ventana.getBtnComprobar().addActionListener(new ActionListener() {
	            
	            public void actionPerformed(ActionEvent e) {
	                comprobarCapicua();
	            }
	        });
	    }
	
	public void comprobarCapicua() {
	    String leerEntrada = ventana.getTxtEntrada().getText();
	    
	    try {
	        int numero = Integer.parseInt(leerEntrada);
	        if (esCapicua(numero)) {
	            ventana.getTxtSalida().setText("Es un número capicúa");
	        } else {
	            ventana.getTxtSalida().setText("No es un número capicúa");
	        }
	    } catch (NumberFormatException e) {
	        ventana.getTxtSalida().setText("Entrada inválida");
	    }
	}

	private boolean esCapicua(int numero) {
	    int original = numero;
	    int reverso = 0;

	    while (numero != 0) {
	        int digito = numero % 10;
	        reverso = reverso * 10 + digito;
	        numero /= 10;
	    }

	    return original == reverso;
	}
	
	

}
