package derivadaGeneral;

import base.Gama;

public class Vehiculo {

	private Modelo modelo;
	private Marca marca;
	private int version;
	private Combustible combustible;

	public Vehiculo(Modelo modelo, Marca marca, int version, Combustible combustible) {
		this.modelo = modelo;
		this.marca = marca;
		this.version = version;
		this.combustible = combustible;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public Marca getMarca() {
		return marca;
	}

	public int getVersion() {
		return version;
	}

	public Combustible getCombustible() {
		return combustible;
	}

	public Gama getGama() {
		return gama;
	}
}
