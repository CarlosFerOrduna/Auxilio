package derivadaGeneral;

public class Valoracion {

	private String mensaje;
	private double puntaje;

	public Valoracion(String mensaje, double puntaje) {
		this.mensaje = mensaje;
		this.puntaje = puntaje;
	}
	public String getMensaje() {
		return mensaje;
	}
	public double getPuntaje() {
		return puntaje;
	}
}
