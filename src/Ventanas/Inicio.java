package Ventanas;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

import controlador.ControladorInicio;

public class Inicio extends JFrame {
private ControladorInicio cI;
JButton btnJugar;
	/**
	 * Create the panel.
	 */
	public Inicio(ControladorInicio cI) {
		this.cI=cI;
		this.cI.setVentanaActual(this);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JpanelImagen panel_4 = new JpanelImagen();
		getContentPane().add(panel_4,  BorderLayout.CENTER);
		panel_4.setLayout(new GridLayout(4, 3, 0, 0));
		
		JLabel label_0 = new JLabel("");
		panel_4.add(label_0);
		
		JLabel label_1 = new JLabel("");
		panel_4.add(label_1);
		
		JLabel label_2= new JLabel("");
		panel_4.add(label_2);
		
		JLabel label_3= new JLabel("");
		panel_4.add(label_3);
		
		JPanel panel = new JPanel();
		panel_4.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.setOpaque(false);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		panel.add(verticalStrut);
		
		btnJugar = new JButton("Jugar!");
		btnJugar.addActionListener(cI);
		btnJugar.setActionCommand("JUGAR");
		panel.add(btnJugar);
		
		JLabel label_4 = new JLabel("");
		panel_4.add(label_4);
		
		JLabel label_5 = new JLabel("");
		panel_4.add(label_5);
		
		JPanel panel_1 = new JPanel();
		panel_4.add(panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));
		panel_1.setOpaque(false);
		
		Component verticalStrut2 = Box.createVerticalStrut(20);
		panel_1.add(verticalStrut2);
		
		JButton btnNewButton_1 = new JButton("Instrucciones");
		panel_1.add(btnNewButton_1);
		
		
		JLabel label_6= new JLabel("");
		panel_4.add(label_6);
		
		JMenuBar menuBar = new JMenuBar();
		getContentPane().add(menuBar, BorderLayout.NORTH);

	}

}
