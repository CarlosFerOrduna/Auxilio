package derivadaEspecialidad;

import base.Especialidad;
import derivadaProblema.ProblemaComplejo;

public class Gomeria extends Especialidad{

	public Gomeria(ProblemaComplejo orientacionReparacion) {
		this.orientacionReparacion = orientacionReparacion;
	}
	public ProblemaComplejo getOrientacionReparacion() {
		return orientacionReparacion;
	}
}
