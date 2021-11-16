package derivadaGeneral;

public class Repuesto {

	private String nombre;
	private Costo costo;
	
	public Repuesto(String nombre, Costo costo) {
		this.nombre = nombre;
		this.costo = costo;
	}
	public String getNombre() {
		return nombre;
	}
	public Costo getCosto() {
		return costo;
	}
}
