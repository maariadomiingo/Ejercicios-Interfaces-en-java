/**
 * 
 */
package Ejercicio2;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import Ejercicio2.Listener2;
import Ejercicio2.VentanaPrincipal2;

/**
 * 
 */
public class Main extends VentanaPrincipal2 {

    public static void main(String[] args) {
	
	  VentanaPrincipal2 ventanaPrincipal = new VentanaPrincipal2();
      
      Listener2 listener = new Listener2(ventanaPrincipal);
      
      ventanaPrincipal.setVisible(true);

    }
}
