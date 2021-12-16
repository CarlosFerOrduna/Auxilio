package service;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import domain.Problema;
import domain.Vehiculo;

public class ProblemaService {

	private List<Problema> problemas = new ArrayList<Problema>();

	public Problema crearProblema(Vehiculo vehiculo) {

		String descripcion;
		int decicion;

		String[] opciones = { "Simple", "Complejo" };

		decicion = JOptionPane.showOptionDialog(null, "Elija el tipo de problema", "Seleccion", 0,
				JOptionPane.QUESTION_MESSAGE, null, opciones, 0);

		descripcion = JOptionPane.showInputDialog(null, "Ingrese una descripcion del problema", "Crear problema",
				JOptionPane.INFORMATION_MESSAGE);

		problemas.add(new Problema(opciones[decicion], descripcion, vehiculo));

		vehiculo.setProblemaAReportar(new Problema(opciones[decicion], descripcion, vehiculo));

		return new Problema(opciones[decicion], descripcion, vehiculo);
	}

}
