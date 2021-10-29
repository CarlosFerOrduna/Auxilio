package derivada;

import costo.CostoColaboracion;
import costo.CostoServicio;
import problema.ProblemaComplejo;
import problema.ProblemaSimple;

public abstract class Usuario {

	private int id;
	private String ubicacion;
	private Vehiculo idVehiculo;
	private String valoracion;
	private boolean colaborador;
	private ProblemaSimple problemaSimple;
	private ProblemaComplejo problemaComplejo;

	public Usuario(int id, Vehiculo idVeiculo, boolean colaborador) {
		this.id = id;
		this.idVehiculo = idVeiculo;
		this.colaborador = colaborador;

	}

	public String pedirAyuda(Usuario id, Usuario valoracion) {// hace referencia a casos de mecanica ligera, solamente
																// solucionable por usuario colaboradores
		String mensaje = this.ubicacion + this.problemaSimple + this.idVehiculo;

		return mensaje;
	}

	public CostoColaboracion pagarAyuda(CostoColaboracion pagoColaboracion) {

		return pagoColaboracion;
	}

	public String pedirServicio(Profesional id, Profesional valoracion) {// servicio hace referencia a casos de mecanica
																			// compleja, solamente solucionable por
																			// profesionales

		String servicio = "" + this.problemaComplejo + this.idVehiculo;

		return servicio;
	}

	public CostoServicio pagarServicio(CostoServicio pagoServicio) {

		return pagoServicio;
	}

	public void setValoracion(String valoracion) {
		this.valoracion = valoracion;
	}

	public String valoracionColaborador(String valoracion) {
		return this.valoracion + this.id;
	}

	public String darAyuda(Usuario pedidoDeAyuda) {

		String mensaje = null;

		if (this.colaborador == true) {

			mensaje = "Voy en camino " + this.ubicacion + this.id;

			return mensaje;
		} else {

			mensaje = "No eres un colaborador";

			return mensaje;
		}
	}
}
