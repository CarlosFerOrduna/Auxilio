package domain;

public class Profesional {

	private Especialidad especialidad;
	private String nombre;
	private String ubicacion = "Estoy aca";

	public Profesional(String nombre, Especialidad especialidad, String ubicacion) {
		this.nombre = nombre;
		this.especialidad = especialidad;
		this.ubicacion = ubicacion;
	}

	public String getNombre() {
		return nombre;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public String getUbicacion() {
		return ubicacion;
	}

}
