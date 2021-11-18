package derivadaVehiculo;

import base.Combustible;
import base.Vehiculo;
import derivadaGeneral.Gama;
import derivadaGeneral.Marca;
import derivadaGeneral.Modelo;

public class Auto extends Vehiculo {

	private Gama gama;
	
	public Auto(Modelo modelo, Marca marca, int version, Combustible combustible, Gama gama) {
		this.modelo = modelo;
		this.marca = marca;
		this.version = version;
		this.combustible = combustible;
		this.gama = gama;
	}

	@Override
	public Modelo getModelo() {
		return modelo;
	}

	@Override
	public Marca getMarca() {
		return marca;
	}

	@Override
	public int getVersion() {
		return version;
	}

	@Override
	public Combustible getCombustible() {
		return combustible;
	}

	public Gama getGama() {
		return gama;
	}
}
