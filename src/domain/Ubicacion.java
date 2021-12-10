package domain;

public class Ubicacion {

	private double longitud;
	private double latitud;

	public Ubicacion(double longitud, double latitud) {
		this.longitud = longitud;
		this.latitud = latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public double getLatitud() {
		return latitud;
	}
}
