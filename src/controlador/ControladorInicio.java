package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import Ventanas.Juego;

public class ControladorInicio implements ActionListener{
	private JFrame ventanaActual;

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getActionCommand().equals("JUGAR")){
			ControladorVentanaJuego cI= new ControladorVentanaJuego ();
			Juego i=new Juego(cI);
			i.setVisible(true);
			this.ventanaActual.dispose();
			i.setVisible(true);
		}
	}
	
	public void setVentanaActual(JFrame ventana){
		this.ventanaActual=ventana;
	}

}
