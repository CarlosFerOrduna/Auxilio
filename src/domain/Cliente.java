package domain;

public class Cliente {

	private Vehiculo vehiculo;
	private String nombre;
	private String ubicacion = "Estoy aca";

	public Cliente(String nombre, Vehiculo vehiculo) {

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

}
