package Ejercicio1;

public class Main {
    public static void main(String[] args) {
    	
        VentanaPrincipal ventana = new VentanaPrincipal();
        
        ListenerBoton listeners = new ListenerBoton(ventana);
        
        ventana.setVisible(true);
    }
}
					
							
