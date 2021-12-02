package domain;

public class Vehiculo {

	private String modelo;
	private String marca;
	private String patente;

	public Vehiculo(String marca, String modelo, String patente) {
		this.marca = marca;
		this.modelo = modelo;
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
