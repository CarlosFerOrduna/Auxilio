package derivadaCombustible;

import base.Combustible;

public class Gasoil extends Combustible {
	public Gasoil(Double costo) {
		this.costo = costo;
	}

	public double getcosto() {
		return costo;
	}

}
