package Ventanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import controlador.ControladorVentanaJuego;

public class Juego extends JPanel {
private ControladorVentanaJuego cI;
	

	public Juego(ControladorVentanaJuego cI) {
		this.cI=cI;
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 219, 430, 70);
		add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Color de pelo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(20, 11, 89, 16);
		panel.add(btnNewButton);

	}
}
