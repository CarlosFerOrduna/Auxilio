package domain;

public class Profesional {

	private String especialidad;
	private String nombre;
	private Ubicacion ubicacion;
	private double cuenta;

	public Profesional(String nombre, String especialidad, Ubicacion ubicacion) {
		this.nombre = nombre;
		this.especialidad = especialidad;
		this.ubicacion = ubicacion;
	}

	public String getNombre() {
		return nombre;
	}

	public String getEspecialidad() {
		return especialidad;
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
}
