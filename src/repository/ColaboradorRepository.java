package repository;

import java.util.ArrayList;
import java.util.List;

import domain.Colaborador;

public class ColaboradorRepository {

	List<Colaborador> colaboradores = new ArrayList<Colaborador>();
	
	public void agregarColaborador(Colaborador nuevoColaborador) {
		colaboradores.add(nuevoColaborador);
	}
	public List<Colaborador> verArray(){
		return colaboradores;
	}
}
