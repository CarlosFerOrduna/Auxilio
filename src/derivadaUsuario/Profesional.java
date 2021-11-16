package derivadaUsuario;

import base.Usuario;
import derivadaGeneral.Especialidad;
import derivadaGeneral.Valoracion;
import derivadaProblema.ProblemaComplejo;

public class Profesional extends Usuario {

	private Especialidad especialidad;

	public Profesional(String nombre, Especialidad especialidad, String ubicacion) {
		this.nombre = nombre;
		this.especialidad = especialidad;
		this.ubicacion = ubicacion;
	}

	@Override
	protected Valoracion getValoracion() {
		return valoracion;
	}

	@Override
	protected void setValoracion() {
		super.valoracion = valoracion;
	}

	public String getNombre() {
		return nombre;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public String presupuestar(ProblemaComplejo problema) {
		// dependiendo la falla paso un presupuesto
		return null;
	}

	public String repararVehiculo(Cliente cliente, int indexProblema) {
		// no se si esta bien este metodo
		return null;
	}
}
