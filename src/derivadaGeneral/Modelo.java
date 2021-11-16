package derivadaGeneral;

public class Modelo {

	private String nombre;
	private String target;
	
	public Modelo(String nombre, String target) {
		this.nombre = nombre;
		this.target = target;
	}
	public String getNombre() {
		return nombre;
	}
	public String getTarget() {
		return target;
	}
}
