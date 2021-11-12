package derivada;

import service.ServiceFallasParaColaborador;

public class Colaborador {

	private String nombre;
	private String ubicacion = "Estoy yendo";
	private String valoracion;
	private Vehiculo vehiculo;

	public Colaborador(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public String getValoracion() {
		return valoracion;
	}

	public void setValoracion(String valoracion) {
		this.valoracion = valoracion;
	}

	public String brindarAyuda(String problema) {

		return this.ubicacion;
	}

	public String enviarProblemaTaller(int index) {
		return ServiceFallasParaColaborador.elegirProblemaDeLaLista(index) + "" + vehiculo;
	}

	public double pagar() {
		double formaDePago = 0;

		return formaDePago;
	}
}
