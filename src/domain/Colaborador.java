package domain;

public class Colaborador {

	private Vehiculo vehiculo;
	private String nombre;
	private Integer dni;
	private String ubicacion = "Estoy aca";
	private String metodoDeFacturacion;

	public Colaborador(String nombre, Integer dni) {
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

	public String getMetodoDeFactura() {
		return metodoDeFacturacion;
	}

}
