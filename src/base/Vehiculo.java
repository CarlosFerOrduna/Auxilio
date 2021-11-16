package base;

import derivadaGeneral.Combustible;
import derivadaGeneral.Marca;
import derivadaGeneral.Modelo;

public abstract class Vehiculo {

	protected Modelo modelo;
	protected Marca marca;
	protected int version;
	protected Combustible combustible;

	protected abstract Modelo getModelo();

	protected abstract Marca getMarca();

	protected abstract int getVersion();

	protected abstract Combustible getCombustible();
}
