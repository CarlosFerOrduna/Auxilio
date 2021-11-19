package repository;

import java.util.ArrayList;
import java.util.List;

import derivadaGeneral.Problema;

public class ProblemaRepository {

	List<Problema> problemas = new ArrayList<Problema>();

	public void agregarProblema(Problema nuevoProblema) {
		problemas.add(nuevoProblema);
	}

	public void quitarProblema(Problema problemaQueSeVa) {
		problemas.remove(problemaQueSeVa);
	}

	public List<Problema> obtenerLista() {
		return problemas;
	}
}
