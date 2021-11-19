package derivadaGeneral;

public class Especialidad {

	private String nombre;
	private AreaDeTrabajo areaDeTrabajo;

	public Especialidad(String nombre, AreaDeTrabajo areaDeTrabajo) {
		this.nombre = nombre;
		this.areaDeTrabajo = areaDeTrabajo;
	}

	public AreaDeTrabajo getOrientacionReparacion() {
		return areaDeTrabajo;
	}

	public String getNombre() {
		return nombre;
	}
}
