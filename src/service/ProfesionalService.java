package service;

import java.util.ArrayList;
import java.util.List;

import domain.Problema;
import domain.Profesional;

public class ProfesionalService {

	List<Profesional> profesionales = new ArrayList<Profesional>();

	public void agregarProfesional(Profesional nuevoProfesional) {
		profesionales.add(nuevoProfesional);
	}

	public void presupuestar(Problema problema) {

	}

	public void aceptarAutoAReparar() {

	}

	public void cobrar() {

	}
}
