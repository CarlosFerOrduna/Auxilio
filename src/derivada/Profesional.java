package derivada;

import problema.ProblemaComplejo;

public class Profesional {

	private String nombre;
	private String especialidad;
	private String ubicacion;

	public Profesional(String nombre, String especialidad, String ubicacion) {
		this.nombre = nombre;
		this.especialidad = especialidad;
		this.ubicacion = ubicacion;
	}

	public String getNombre() {
		return nombre;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public double facturar(ProblemaComplejo problemaAFacturar, Usuario vehiculoDelUsuaio) {

//		si el problema es este y tu auto es este te cobro lo siguiente, en base a los que otros cobran.

		return 0;
	}
}
