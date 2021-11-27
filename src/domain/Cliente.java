package domain;

public class Cliente {

	private Vehiculo vehiculo;
	private String nombre;
	private String ubicacion = "Estoy aca";
	private String medioDePago;
	private Integer dni;

	public Cliente(String nombre, Integer dni) {
		this.nombre = nombre;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}
	public Integer getDni() {
		return dni;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public String getMedioDePago() {
		return medioDePago;
	}

}
