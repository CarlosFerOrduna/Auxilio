package derivada;

import problema.ProblemaComplejo;
import problema.ProblemaSimple;

public class Vehiculo {

	private String modelo;
	private String marca;
	private int version;
	private String problemaComplejo;
	private String problemaSimple;

	public Vehiculo(String modelo, String marca, int version) {
		this.modelo = modelo;
		this.marca = marca;
		this.version = version;
	}

	public String getMoledo() {
		return modelo;
	}

	public String getMarca() {
		return marca;
	}

	public int getVersion() {
		return version;
	}

	public ProblemaSimple reportarProblemaSimple() {
		ProblemaSimple problema = new ProblemaSimple();

		return problema;
	}

	public ProblemaComplejo reportarProblemaComplejo() {
		ProblemaComplejo problema = new ProblemaComplejo();

		return problema;
	}
}
