package derivadaCombustible;

import base.Combustible;

public class Nafta extends Combustible {
	public Nafta(Double costo) {
		this.costo = costo;
	}

	public double getcosto() {
		return costo;
	}

}
