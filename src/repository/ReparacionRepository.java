package repository;

import java.util.ArrayList;
import java.util.List;

import derivadaProblema.ProblemaComplejo;

public class ReparacionRepository {

	List<ProblemaComplejo> historialDeReparaciones = new ArrayList<ProblemaComplejo>();
	
	public void agregarReparacion(ProblemaComplejo nuevaReparacion) {
		historialDeReparaciones.add(nuevaReparacion);
	}
	
}