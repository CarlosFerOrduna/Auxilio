package derivadaGeneral;

public class Repuesto {

	private String nombre;
	private Double costo;
	
	public Repuesto(String nombre, Double costo) {
		this.nombre = nombre;
		this.costo = costo;
	}
	public String getNombre() {
		return nombre;
	}
	public Double getCosto() {
		return costo;
	}
}
