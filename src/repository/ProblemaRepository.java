package repository;

import java.util.ArrayList;
import java.util.List;

import domain.Problema;

public class ProblemaRepository {

	List<Problema> problemas = new ArrayList<Problema>();

	public void agregarProblema(Problema nuevoProblema) {
		problemas.add(nuevoProblema);
	}

}
