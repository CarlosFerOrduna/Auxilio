package domain;

public class Colaborador {

	private String nombre;
	private Integer dni;
	private Ubicacion ubicacion;
	private double cuenta;

	public Colaborador(String nombre, Integer dni, Ubicacion ubicacion) {
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

	public Ubicacion getUbicacion() {
		return ubicacion;
	}

	public double getCuenta() {
		return cuenta;
	}

	public void setCuenta(double cuenta) {
		this.cuenta = cuenta;
	}

	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;

	}

}
