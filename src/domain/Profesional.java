package domain;

public class Profesional {

	private String especialidad;
	private String nombre;
	private String direccion;
	private Integer cuenta;

	public Profesional(String nombre, String especialidad) {
		this.nombre = nombre;
		this.especialidad = especialidad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public String getDireccion() {
		return direccion;
	}

	public Integer getCuenta() {
		return cuenta;
	}
	
	public void setCuenta(Integer cuenta) {
		this.cuenta = cuenta;
	}
}
