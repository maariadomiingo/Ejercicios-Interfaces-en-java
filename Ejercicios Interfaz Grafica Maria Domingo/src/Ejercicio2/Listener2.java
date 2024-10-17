package Ejercicio2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.http.WebSocket.Listener;

import javax.swing.JOptionPane;

import Ejercicio2.VentanaPrincipal2;

public class Listener2 implements Listener {

		// TODO Auto-generated constructor stub
		
		private VentanaPrincipal2 ventana;
		
		
		public Listener2(VentanaPrincipal2 ventana){
			this.ventana = ventana;
			this.ventana.getBtnCalcular().addActionListener(new ActionListener() {
		            
		            public void actionPerformed(ActionEvent e) {
		                comprobarResultados();
		            }
		        });
		    }
		
		public void comprobarResultados() {
		    try {
		        String leerA = ventana.getTxtA().getText();
		        int numeroA = Integer.parseInt(leerA);

		        String leerB = ventana.getTxtB().getText(); 
		        int numeroB = Integer.parseInt(leerB);

		        String leerC = ventana.getTxtC().getText(); 
		        int numeroC = Integer.parseInt(leerC);

		        double resultadoRaiz = numeroB * numeroB - 4 * numeroA * numeroC;

		        if (resultadoRaiz > 0) {
		            double raiz1 = (-numeroB + Math.sqrt(resultadoRaiz)) / (2 * numeroA);
		            double raiz2 = (-numeroB - Math.sqrt(resultadoRaiz)) / (2 * numeroA);
		            ventana.getTxtResultado().setText("los resultados son: " + raiz1 + " y " + raiz2);
		        } else if (resultadoRaiz == 0) {
		            double raiz = -numeroB / (2 * numeroA);
		            ventana.getTxtResultado().setText("Tiene solo una solucion: " + raiz);
		        } else {
		            ventana.getTxtResultado().setText("La ecuación no tiene solución");
		        }

		    } catch (NumberFormatException ex) {
		        JOptionPane.showMessageDialog(ventana, "introduce un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
		    }
		}
}