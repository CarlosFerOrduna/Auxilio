package derivadaEspecialidad;

import base.Especialidad;
import derivadaProblema.ProblemaComplejo;

public class Electronica extends Especialidad{

	public Electronica(ProblemaComplejo orientacionReparacion) {
		this.orientacionReparacion = orientacionReparacion;
	}
	public ProblemaComplejo getOrientacionReparacion() {
		return orientacionReparacion;
	}
}
