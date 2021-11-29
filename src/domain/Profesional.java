package domain;

public class Profesional {

	private String especialidad;
	private String nombre;
	private Integer direccion;
	private String metodoDeFacturacion;

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

	public Integer getDireccion() {
		return direccion;
	}

	public String getMetodoDeFacturacion() {
		return metodoDeFacturacion;
	}
}
