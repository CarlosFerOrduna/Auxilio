package domain;

public class Colaborador {

	private String nombre;
	private Integer dni;
	private Integer ubicacion;
	private Integer cuenta;

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

	public Integer getCuenta() {
		return cuenta;
	}

	public void setCuenta(Integer cuenta) {
		this.cuenta = cuenta;
	}

	public void setUbicacion(Integer ubicacion) {
		this.ubicacion = ubicacion;

	}

}
