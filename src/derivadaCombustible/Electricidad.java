package derivadaCombustible;

import base.Combustible;

public class Electricidad extends Combustible {
	public Electricidad(Double costo) {
		this.costo = costo;
	}

	public double getcosto() {
		return costo;
	}

}
