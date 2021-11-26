package domain;

public class Combustible {

	private double costo;
	private String nombre;
	
	public Combustible(String nombre, double costo) {
		this.nombre = nombre;
		this.costo = costo;
	}
	public String getNombre() {
		return nombre;
	}
	public double getCosto() {
		return costo;
	}
}
