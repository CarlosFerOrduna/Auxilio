package derivadaCombustible;

import base.Combustible;

public class Biodiesel extends Combustible {
	public Biodiesel(Double costo) {
		this.costo = costo;
	}

	public double getcosto() {
		return costo;
	}

}
