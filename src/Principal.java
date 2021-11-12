import derivada.Colaborador;
import derivada.Profesional;
import derivada.Usuario;
import derivada.Vehiculo;

public class Principal {

	public static void main(String[] args) {

		Vehiculo auto = new Vehiculo("Corsa", "Chevrolet", 2021, "Nafta");
		Usuario carlos = new Usuario("Carlos", auto);
		Colaborador juanCarlos = new Colaborador("Juan Carlos");		
		Profesional tilin = new Profesional("Tilin", "mecanico", "En tu casa");
		
		System.out.println(carlos.enviarProblemaTaller(0));
		System.out.println(tilin.presupuestar(carlos, 0));
		
	}

}
