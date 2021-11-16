package derivadaGeneral;

public class Combustible {

	private String nombre;
	private Costo costo;
	
	public Combustible(String nombre, Costo costo) {
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
