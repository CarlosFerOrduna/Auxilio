package domain;

import java.util.List;

public class Vehiculo {

	private String modelo;
	private String marca;
	private String patente;
	private List<Reparacion> reparacionesRealizadas;
	private List<Problema> problemasReportados;

	public Vehiculo(String marca, String modelo, String patente) {
		this.marca = marca;
		this.modelo = modelo;
		this.patente = patente;
	}

	public String getModelo() {
		return modelo;
	}

	public String getMarca() {
		return marca;
	}

	public String getPatente() {
		return patente;
	}

	public List<Reparacion> getReparacionesRealizadas() {
		return reparacionesRealizadas;
	}

	public void setReparacionRealizada(Reparacion reparacion) {
		reparacionesRealizadas.add(reparacion);
	}

	public List<Problema> getProblemasReportados() {
		return problemasReportados;
	}

	public void setProblemaAReportar(Problema problema) {
		problemasReportados.add(problema);
	}

}
