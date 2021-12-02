package domain;

public class Reparacion {

	private String detalle;
	private Integer costo;

	public Reparacion(String detalle, Integer costo) {
		this.detalle = detalle;
		this.costo = costo;
	}

	public String getDetalle() {
		return detalle;
	}

	public Integer getCosto() {
		return costo;
	}
}
