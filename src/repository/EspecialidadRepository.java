package repository;

import java.util.ArrayList;
import java.util.List;

import base.Especialidad;

public class EspecialidadRepository {

	List<Especialidad> especialidades = new ArrayList<Especialidad>(); 
	
	public void agregarEspecialidad(Especialidad nuevaEspecialidad) {
		especialidades.add(nuevaEspecialidad);
	}
	public void quitarEspecialidad(Especialidad especialidadQueSeVa) {
		especialidades.remove(especialidadQueSeVa);
	}
}
