package domain;

public class Reparacion {

	private String detalle;
	private double costo;
	private Vehiculo vehiculo;

	public Reparacion(String detalle, double costo, Vehiculo vehiculo) {
		this.detalle = detalle;
		this.costo = costo;
		this.vehiculo = vehiculo;
	}

	public String getDetalle() {
		return detalle;
	}

	public double getCosto() {
		return costo;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}
}
