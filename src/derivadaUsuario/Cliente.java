package derivadaUsuario;

import base.Usuario;
import derivadaGeneral.Valoracion;
import derivadaGeneral.Vehiculo;

public class Cliente extends Usuario {

	private Vehiculo vehiculo;

	public Cliente(String nombre, Vehiculo vehiculo) {

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

	public String pedirAyuda(int index) {
		// replantear maquetado
		return null;
	}

	public String enviarProblemaTaller(int index) {
		// replantear maquetado
		return null;
	}

	public double pagar(Profesional reparaMiVehiculo) {

		double formaDePago = 0;

		return formaDePago;
	}

}
