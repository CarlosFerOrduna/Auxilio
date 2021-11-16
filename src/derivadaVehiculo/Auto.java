package derivadaVehiculo;

import base.Vehiculo;
import derivadaGeneral.Combustible;
import derivadaGeneral.Marca;
import derivadaGeneral.Modelo;

public class Auto extends Vehiculo {

	public Auto(Modelo modelo, Marca marca, int version, Combustible combustible) {
		this.modelo = modelo;
		this.marca = marca;
		this.version = version;
		this.combustible = combustible;
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

}
