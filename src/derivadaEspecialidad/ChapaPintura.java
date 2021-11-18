package derivadaEspecialidad;

import base.Especialidad;
import derivadaProblema.ProblemaComplejo;

public class ChapaPintura extends Especialidad{

	public ChapaPintura(ProblemaComplejo orientacionReparacion) {
		this.orientacionReparacion = orientacionReparacion;
	}
	public ProblemaComplejo getOrientacionReparacion() {
		return orientacionReparacion;
	}
}
