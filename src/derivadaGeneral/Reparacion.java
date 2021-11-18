package derivadaGeneral;

import derivadaProblema.ProblemaComplejo;

public class Reparacion {

	private Double costo;
	private ProblemaComplejo problemaReparado;
	
	public Reparacion(Double costo, ProblemaComplejo problemaReparado) {
		this.costo = costo;
		this.problemaReparado = problemaReparado;
	}
	public Double getCosto() {
		return costo;
	}
	public ProblemaComplejo getProblemaReparado() {
		return problemaReparado;
	}
}
