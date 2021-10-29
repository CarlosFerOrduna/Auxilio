package derivada;

import java.util.ArrayList;
import java.util.List;

import problema.ProblemaComplejo;

public class Vehiculo {

	private int id;
	private String modelo;
	private String marca;
	private String version;
	private int anio;
	private String tipo;

	public Vehiculo(int id, String modelo, String marca, String version, int anio, String tipo) {
		this.id = id;
		this.modelo = modelo;
		this.marca = marca;
		this.version = version;
		this.anio = anio;
		this.tipo = tipo;
	}

	public double getId() {
		return this.id;
	}

	public ProblemaComplejo historialDeReparaciones(int id, ProblemaComplejo reparacion) {

		ProblemaComplejo historial = null;

		List<ProblemaComplejo> reparaciones = new ArrayList<ProblemaComplejo>();

		reparaciones.add(id, reparacion);

		for (ProblemaComplejo historialFor : reparaciones) {
			historial = historialFor;
		}
		return historial;
	}
}
