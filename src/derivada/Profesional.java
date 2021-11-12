package derivada;

public class Profesional {

	private String nombre;
	private String especialidad;
	private String ubicacion;

	public Profesional(String nombre, String especialidad, String ubicacion) {
		this.nombre = nombre;
		this.especialidad = especialidad;
		this.ubicacion = ubicacion;
	}

	public String getNombre() {
		return nombre;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public double presupuestar(Usuario cliente, int indexProblema) {

		if (cliente.enviarProblemaTaller(indexProblema) == cliente.enviarProblemaTaller(0)) {
			return 2000;
		} else if (cliente.enviarProblemaTaller(indexProblema) == cliente.enviarProblemaTaller(1)) {
			return 2800;
		} else if (cliente.enviarProblemaTaller(indexProblema) == cliente.enviarProblemaTaller(2)) {
			return 2900;
		} else if (cliente.enviarProblemaTaller(indexProblema) == cliente.enviarProblemaTaller(3)) {
			return 3000;
		} else if (cliente.enviarProblemaTaller(indexProblema) == cliente.enviarProblemaTaller(4)) {
			return 10000;
		} else if (cliente.enviarProblemaTaller(indexProblema) == cliente.enviarProblemaTaller(5)) {
			return 1000;
		} else {
			return 0;
		}

	}

	public String repararVehiculo(Usuario cliente, int indexProblema) {

		return "Tu vehiculo ya esta listo, " + cliente.enviarProblemaTaller(indexProblema) + ", total a pagar "
				+ presupuestar(cliente, indexProblema);
	}
}
