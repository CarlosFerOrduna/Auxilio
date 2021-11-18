package derivadaGamma;

import derivadaGeneral.Gama;

public class Media extends Gama {

	public Media(double largoMaximoDelVehiculo, double largoMinimoDelVehiculo) {
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
