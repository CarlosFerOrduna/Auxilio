package derivadaCombustible;

import base.Combustible;

public class Gas extends Combustible {
	public Gas(Double costo) {
		this.costo = costo;
	}

	public double getcosto() {
		return costo;
	}

}
