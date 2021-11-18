package derivadaEspecialidad;

import base.Especialidad;
import derivadaProblema.ProblemaComplejo;

public class AlineacionBalanceo extends Especialidad{

	public AlineacionBalanceo(ProblemaComplejo orientacionReparacion) {
		this.orientacionReparacion = orientacionReparacion;
	}
	public ProblemaComplejo getOrientacionReparacion() {
		return orientacionReparacion;
	}
}
