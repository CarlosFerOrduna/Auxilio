package derivadaEspecialidad;

import base.Especialidad;
import derivadaProblema.ProblemaComplejo;

public class Lavadero extends Especialidad{

	public Lavadero(ProblemaComplejo orientacionReparacion) {
		this.orientacionReparacion = orientacionReparacion;
	}
	public ProblemaComplejo getOrientacionReparacion() {
		return orientacionReparacion;
	}
}
