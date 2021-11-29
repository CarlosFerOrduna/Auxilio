package service;

import javax.swing.JOptionPane;

import domain.Problema;
import repository.ProblemaRepository;

public class ProblemaService {

	ProblemaRepository problemas = new ProblemaRepository();
	
	public Problema crearProblema() {
		
		String descripcion;
		int decicion;
		
		String[] opciones = {"Simple", "Complejo"};
		
		decicion = JOptionPane.showOptionDialog(null, "Elija el tipo de problema", "Seleccion", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, 0);
		
		descripcion = JOptionPane.showInputDialog("Ingrese una descripcion del problema");
		
		problemas.agregarProblema(new Problema(opciones[decicion], descripcion));
		
		return new Problema(opciones[decicion], descripcion);
	}
}
