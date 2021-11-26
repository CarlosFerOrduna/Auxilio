package domain;

public class Problema {

	private String detalle;
	private String tipo;
	
	public Problema(String tipo, String detalle) {
		this.tipo = tipo;
		this.detalle = detalle;
	}
	public String getTipo() {
		return tipo;
	}
	public String getDetalle() {
		return detalle;
	}
}
