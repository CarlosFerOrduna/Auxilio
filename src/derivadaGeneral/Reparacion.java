package derivadaGeneral;

public class Reparacion {

	private String detalle;
	private double costo;

	public Reparacion(String detalle, double costo) {
		this.detalle = detalle;
		this.costo = costo;
	}

	public String getDetalle() {
		return detalle;
	}

	public double getCosto() {
		return costo;
	}
}
