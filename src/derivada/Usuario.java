package derivada;

import service.ServiceFallasParaColaborador;
import service.ServiceFallasParaTaller;

public class Usuario {

	private String nombre;
	private String ubicacion = "Estoy aca";
	private Vehiculo vehiculo;
	private String valoracion;

	public Usuario(String nombre, Vehiculo vehiculo) {

		this.nombre = nombre;
		this.vehiculo = vehiculo;

	}

	public String getNombre() {
		return nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public String getValoracion() {
		return valoracion;
	}

	public void setValoracion(String valoracion) {
		this.valoracion = valoracion;
	}

	public String pedirAyuda(int index) {
		return ubicacion + vehiculo + ServiceFallasParaColaborador.elegirProblemaDeLaLista(index);
	}

	public String enviarProblemaTaller(int index) {
		return ServiceFallasParaTaller.elegirProblemaDeLaLista(index) + "" + vehiculo;
	}

	public double pagar(Profesional reparaMiVehiculo) {

		double formaDePago = 0;

		return formaDePago;
	}
}
