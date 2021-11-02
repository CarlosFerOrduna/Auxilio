package derivada;

import problema.ProblemaComplejo;
import problema.ProblemaSimple;

public class Colaborador {

	private String nombre;
	private String ubicacion;
	private String valoracion;
	
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
	public String brindarAyuda(ProblemaSimple problema, Usuario nombre, Usuario ubicacion) {
		
		return "Estoy yendo" + this.ubicacion;
	}
	public ProblemaComplejo pedirSerrvicio(Vehiculo vehiculo) {
		return vehiculo.reportarProblemaComplejo();
	}
}
