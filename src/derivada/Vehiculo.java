package derivada;

public class Vehiculo {

	private String modelo;
	private String marca;
	private int version;
	private String combustible;

	public Vehiculo(String modelo, String marca, int version, String combustible) {
		this.modelo = modelo;
		this.marca = marca;
		this.version = version;
		this.combustible = combustible;
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

	public String getCombustible() {
		return combustible;
	}
}
