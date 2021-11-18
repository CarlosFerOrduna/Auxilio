package derivadaGamma;

import derivadaGeneral.Gama;

public class Baja extends Gama {

	public Baja(double largoMaximoDelVehiculo, double largoMinimoDelVehiculo) {
		this.largoMaximoDelVehiculo = largoMaximoDelVehiculo;
		this.largoMinimoDelVehiculo = largoMinimoDelVehiculo;
	}

	@Override
	protected double getLargoMaximo() {
		return largoMaximoDelVehiculo;
	}
	@Override
	protected double getLargoMinimo() {
		return largoMinimoDelVehiculo;
	}
}
