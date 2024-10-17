package Ejercicio1;

import java.net.http.WebSocket.Listener;
import java.awt.event.*;
import javax.swing.*;

import Ejercicio1.VentanaPrincipal;

public class ListenerBoton implements Listener {

		private VentanaPrincipal ventana;
	
	
	public ListenerBoton(VentanaPrincipal ventana){
		this.ventana = ventana;
			this.ventana.getBtnComprobar().addActionListener(new ActionListener() {
	            
	            public void actionPerformed(ActionEvent e) {
	                comprobarNumero();
	            }
	        });
	    }
		
		
		private void comprobarNumero() {
		try {
			String leerNum = ventana.getEscribir().getText();
			int numero = Integer.parseInt(leerNum);
			
			  if (numero % 2 == 0) {
	                ventana.getRespuesta().setText("El número es par.");
	            } else {
	                ventana.getRespuesta().setText("El número es impar.");
	            }
	        } catch (NumberFormatException ex) {
	            // Si ocurre un error al convertir el texto a número, mostrar un mensaje de error
	            JOptionPane.showMessageDialog(ventana, "Por favor, introduce un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
	        }
		}
	}

