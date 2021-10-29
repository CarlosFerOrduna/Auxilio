package derivada;

import java.util.ArrayList;
import java.util.List;

import costo.CostoServicio;
import problema.ProblemaComplejo;

public class Profesional {

	private int id;
	private String ubicacion;
	private String especialidad;
	private String valoracion;

	public Profesional(int id, String ubicacion, String especialidad) {
		this.id = id;
		this.ubicacion = ubicacion;
		this.especialidad = especialidad;
	}

	public String getUbicacion() {
		return this.ubicacion;
	}

	public int getId() {
		return this.id;
	}

	public String getEspecialidad() {
		return this.especialidad;
	}

	public String getValoracion() {
		return this.valoracion;
	}

	public String detalleServicio(ProblemaComplejo problema) {
		ProblemaComplejo solucion = null;
		CostoServicio posibleFactura = null;

		String mensaje = "El costo es " + posibleFactura + "la tarea a realizar es " + solucion;

		return mensaje;
	}

	public CostoServicio cobroServicio(Usuario servicio) {
		CostoServicio factura = null;

		return factura;
	}

	public void setValoracion(String valoracion) {
		this.valoracion = valoracion;
	}
	public List baseDeDatos(int id, Profesional profesional) {
		
		List<Profesional> profesionales = new ArrayList<Profesional>();
		
		profesionales.add(id, profesional);
		
		return profesionales;
	}

}
