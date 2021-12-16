package domain;

public class Problema {

	private String detalle;
	private String tipo;
	private Vehiculo vehiculo;

	public Problema(String tipo, String detalle, Vehiculo vehiculo) {
		this.tipo = tipo;
		this.detalle = detalle;
		this.vehiculo = vehiculo;
	}

	public String getTipo() {
		return tipo;
	}

	public String getDetalle() {
		return detalle;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}
}
