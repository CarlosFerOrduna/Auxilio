package derivada;

import problema.ProblemaComplejo;
import problema.ProblemaSimple;

public class Usuario {

	private String nombre;
	private String ubicacion;
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
	public String pedirAyuda(Vehiculo vehiculo) {
		return vehiculo.reportarProblemaSimple() + ubicacion;
	}
	public ProblemaComplejo pedirSerrvicio(Vehiculo vehiculo) {
		return vehiculo.reportarProblemaComplejo();
	}
	public double pagar() {
		double formaDePago = 0;
		
		return formaDePago;
	}
}
