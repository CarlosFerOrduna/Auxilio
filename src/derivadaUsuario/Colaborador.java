package derivadaUsuario;

import base.Usuario;
import derivadaGeneral.Valoracion;
import derivadaGeneral.Vehiculo;
import derivadaProblema.ProblemaSimple;

public class Colaborador extends Usuario {

	private Vehiculo vehiculo;

	public Colaborador(String nombre, Vehiculo vehiculo) {
		this.nombre = nombre;
		this.vehiculo = vehiculo;
	}

	@Override
	protected String getNombre() {
		return nombre;
	}

	@Override
	protected String getUbicacion() {
		return ubicacion;
	}

	@Override
	protected Valoracion getValoracion() {
		return valoracion;
	}

	@Override
	protected void setValoracion() {
		super.valoracion = valoracion;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public String brindarAyuda(ProblemaSimple problema) {

		return this.ubicacion;
	}

}
