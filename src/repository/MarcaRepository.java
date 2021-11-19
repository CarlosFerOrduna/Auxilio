package repository;

import java.util.ArrayList;
import java.util.List;

import derivadaGeneral.Marca;

public class MarcaRepository {

	List<Marca> marcas = new ArrayList<Marca>();

	public void agregarMarca(Marca nuevaMarca) {
		marcas.add(nuevaMarca);
	}

	public void quitarMarca(Marca marcaQueSeVa) {
		marcas.remove(marcaQueSeVa);
	}

	public List<Marca> getLista() {
		return marcas;
	}
}
