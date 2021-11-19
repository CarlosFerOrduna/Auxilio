package derivadaGeneral;

public class Valoracion {

	private String mensaje;
	private double puntajeEnEstrellas;

	public Valoracion(String mensaje, double puntajeEnEstrellas) {
		this.mensaje = mensaje;
		this.puntajeEnEstrellas = puntajeEnEstrellas;
	}
	public String getMensaje() {
		return mensaje;
	}
	public double getPuntaje() {
		return puntajeEnEstrellas;
	}
}
