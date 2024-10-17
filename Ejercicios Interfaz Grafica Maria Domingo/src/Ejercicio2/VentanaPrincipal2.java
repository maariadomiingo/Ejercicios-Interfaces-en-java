package Ejercicio2;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class VentanaPrincipal2 extends JFrame {
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JTextField txtResultado;
	 private JButton btnCalcular;
	 
	public JButton getBtnCalcular() {
		return btnCalcular;
	}

	public void setBtnCalcular(JButton btnCalcular) {
		this.btnCalcular = btnCalcular;
	}

	public JTextField getTxtA() {
		return txtA;
	}

	public void setTxtA(JTextField txtA) {
		this.txtA = txtA;
	}

	public JTextField getTxtB() {
		return txtB;
	}

	public void setTxtB(JTextField txtB) {
		this.txtB = txtB;
	}

	public JTextField getTxtC() {
		return txtC;
	}

	public void setTxtC(JTextField txtC) {
		this.txtC = txtC;
	}

	public JTextField getTxtResultado() {
		return txtResultado;
	}

	public void setTxtResultado(JTextField txtResultado) {
		this.txtResultado = txtResultado;
	}

	public VentanaPrincipal2() throws HeadlessException {
		getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("Introduce 3 números para realizar una ecuación de segundo grado");
		lblTitulo.setForeground(new Color(0, 0, 0));
		lblTitulo.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		lblTitulo.setBounds(10, 22, 486, 35);
		getContentPane().add(lblTitulo);
		
		txtA = new JTextField();
		txtA.setBackground(new Color(128, 255, 255));
		txtA.setBounds(29, 89, 96, 19);
		getContentPane().add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setBackground(new Color(128, 255, 255));
		txtB.setBounds(163, 89, 96, 19);
		getContentPane().add(txtB);
		txtB.setColumns(10);
		
		txtC = new JTextField();
		txtC.setBackground(new Color(128, 255, 255));
		txtC.setBounds(298, 89, 96, 19);
		getContentPane().add(txtC);
		txtC.setColumns(10);
		
		txtResultado = new JTextField();
		txtResultado.setText("=");
		txtResultado.setBackground(new Color(128, 255, 255));
		txtResultado.setBounds(29, 195, 365, 19);
		getContentPane().add(txtResultado);
		txtResultado.setColumns(10);
		
		   btnCalcular = new JButton("Calcular"); 
		    btnCalcular.setBackground(new Color(255, 255, 255));
		    btnCalcular.setToolTipText("");
		    btnCalcular.setBounds(163, 137, 96, 21);
		    getContentPane().add(btnCalcular);
		// TODO Auto-generated constructor stub
		    
		      //tamaño y posicion de la ventana
			setSize(600, 400);
			setLocationRelativeTo(null);
	}

}
