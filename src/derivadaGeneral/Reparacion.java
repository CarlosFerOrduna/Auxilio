package derivadaGeneral;

import derivadaProblema.ProblemaComplejo;

public class Reparacion {

	private Costo costo;
	private ProblemaComplejo problemaReparado;
	
	public Reparacion(Costo costo, ProblemaComplejo problemaReparado) {
		this.costo = costo;
		this.problemaReparado = problemaReparado;
	}
	public Costo getCosto() {
		return costo;
	}
	public ProblemaComplejo getProblemaReparado() {
		return problemaReparado;
	}
}
