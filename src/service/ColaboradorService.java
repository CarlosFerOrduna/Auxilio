package service;

import java.util.ArrayList;
import java.util.List;

import domain.Colaborador;

public class ColaboradorService {
	
	List<Colaborador> colaboradores = new ArrayList<Colaborador>();

	public void agregarColaborador(Colaborador nuevoColaborador) {
		colaboradores.add(nuevoColaborador);
	}

	public void brindarAyuda() {

	}

	public void cobrar() {

	}
}
