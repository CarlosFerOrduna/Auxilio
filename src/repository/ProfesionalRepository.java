package repository;

import java.util.ArrayList;
import java.util.List;

import domain.Profesional;

public class ProfesionalRepository {

	List<Profesional> profesionales = new ArrayList<Profesional>();
	
	public void agregarProfesional(Profesional nuevoProfesional) {
		profesionales.add(nuevoProfesional);
	}
	
}
