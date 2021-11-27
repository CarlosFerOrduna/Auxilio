package domain;

public class Vehiculo {

	private String modelo;
	private String marca;
	private String patente;
	
	public Vehiculo(String modelo, String marca, String patente) {
		this.modelo = modelo;
		this.marca = marca;
		this.patente = patente;
	}

	public String getModelo() {
		return modelo;
	}

	public String getMarca() {
		return marca;
	}
	public String getPatente() {
		return patente;
	}

}
