package repository;

import java.util.ArrayList;
import java.util.List;

import derivadaGeneral.Modelo;

public class ModeloRepository {

	List<Modelo> modelos = new ArrayList<Modelo>();
	
	public void agregarModelo(Modelo nuevoModelo) {
		modelos.add(nuevoModelo);
	}
	public void quitarModelo(Modelo modeloQueSeVa) {
		modelos.remove(modeloQueSeVa);
	}
}
