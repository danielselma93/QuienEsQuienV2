import Ventanas.Inicio;
import controlador.ControladorInicio;

public class LanzarVentana {

	public static void main(String[] args) {
		ControladorInicio cI = new ControladorInicio();
		Inicio i= new Inicio (cI);
		i.setVisible(true);
		
	}

}
