package domain;

public class Colaborador {

	private Vehiculo vehiculo;
	private String nombre;
	private Integer dni;
	private Integer ubicacion;
	private String metodoDeFacturacion;

	public Colaborador(String nombre, Integer dni, Integer ubicacion) {
		this.nombre = nombre;
		this.dni = dni;
		this.ubicacion = ubicacion;
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

	public String getMetodoDeFactura() {
		return metodoDeFacturacion;
	}

	public void setUbicacion(Integer ubicacion) {
		this.ubicacion = ubicacion;

	}

}
