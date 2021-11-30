package repository;

import java.util.ArrayList;
import java.util.List;

import domain.Colaborador;

public class ColaboradorRepository {

	List<Colaborador> colaboradores = new ArrayList<Colaborador>();

	public Colaborador agregarColaborador(Colaborador nuevoColaborador) {

		colaboradores.add(nuevoColaborador);

		return null;
	}

	public List<Colaborador> verLista() {

		return colaboradores;

	}
}
