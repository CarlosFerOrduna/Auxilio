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
	public List baseDeDatos(int id, Vehiculo vehiculo) {
		
		List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		
		vehiculos.add(id, vehiculo);
		
		return vehiculos;
	}

	public List historialDeReparaciones(int id, ProblemaComplejo reparacion) {

		List<ProblemaComplejo> reparaciones = new ArrayList<ProblemaComplejo>();

		reparaciones.add(id, reparacion);

		return reparaciones;
	}
}
