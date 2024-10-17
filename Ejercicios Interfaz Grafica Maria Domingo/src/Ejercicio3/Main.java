/**
 * 
 */
package Ejercicio3;

import Ejercicio3.Listener3;
import Ejercicio3.VentanaPrincipal3;

/**
 * 
 */
public class Main extends VentanaPrincipal3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  VentanaPrincipal3 ventanaPrincipal = new VentanaPrincipal3();
	      
	      Listener3 listener = new Listener3(ventanaPrincipal);
	      
	      ventanaPrincipal.setVisible(true);

		
	}

}
 