package domain;

public class Cliente {

	private Vehiculo vehiculo;
	private String nombre;
	private Integer ubicacion;
	private Integer saldo;
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

	public Integer getUbicacion() {
		return ubicacion;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public Integer getPago() {
		return saldo;
	}

	public void setPago(Integer saldo) {
		this.saldo = saldo;
	}

	public void setUbicacion(Integer ubicacion) {
		this.ubicacion = ubicacion;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

}
