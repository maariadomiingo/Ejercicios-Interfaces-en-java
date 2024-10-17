package Ejercicio3;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;

public class VentanaPrincipal3 extends JFrame {
	private JTextField txtEntrada;
	private JTextField txtSalida;
	 private JButton btnComprobar;
	 ;
	public JTextField getTxtEntrada() {
		return txtEntrada;
	}

	public void setTxtEntrada(JTextField txtEntrada) {
		this.txtEntrada = txtEntrada;
	}

	public JTextField getTxtSalida() {
		return txtSalida;
	}

	public void setTxtSalida(JTextField txtSalida) {
		this.txtSalida = txtSalida;
	}

	public JButton getBtnComprobar() {
		return btnComprobar;
	}

	public void setBtnComprobar(JButton btnComprobar) {
		this.btnComprobar = btnComprobar;
	}

	public VentanaPrincipal3() throws HeadlessException {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Introduce un número de 3 cifras");
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 18));
		lblNewLabel.setBounds(54, 56, 330, 19);
		getContentPane().add(lblNewLabel);
		
		txtEntrada = new JTextField();
		txtEntrada.setBackground(new Color(255, 255, 128));
		txtEntrada.setBounds(24, 133, 96, 19);
		getContentPane().add(txtEntrada);
		txtEntrada.setColumns(10);
		
		 btnComprobar = new JButton("Comprobar");
		btnComprobar.setBackground(new Color(255, 255, 0));
		btnComprobar.setBounds(151, 124, 108, 36);
		getContentPane().add(btnComprobar);
		
		txtSalida = new JTextField();
		txtSalida.setColumns(10);
		txtSalida.setBackground(new Color(255, 255, 128));
		txtSalida.setBounds(292, 133, 268, 19);
		getContentPane().add(txtSalida);
		
		JLabel lblParaComprobarSi = new JLabel("para comprobar si es capicúa");
		lblParaComprobarSi.setFont(new Font("Stencil", Font.PLAIN, 16));
		lblParaComprobarSi.setBounds(85, 73, 268, 30);
		getContentPane().add(lblParaComprobarSi);
		// TODO Auto-generated constructor stub
		
		 
	      //tamaño y posicion de la ventana
		setSize(600, 400);
		setLocationRelativeTo(null);
	}

}