package domain;

public class Reparacion {

	private String detalle;
	private Double costo;

	public Reparacion(String detalle, Double costo) {
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
