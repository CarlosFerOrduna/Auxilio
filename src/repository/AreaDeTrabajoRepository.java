package repository;

import java.util.ArrayList;
import java.util.List;

import derivadaGeneral.AreaDeTrabajo;

public class AreaDeTrabajoRepository {

	List<AreaDeTrabajo> areas = new ArrayList<AreaDeTrabajo>();
	
	public void agregarArea(AreaDeTrabajo nuevaArea) {
		areas.add(nuevaArea);
	}
	public void quitarArea(AreaDeTrabajo areaQueSeVa) {
		areas.remove(areaQueSeVa);
	}
	public List<AreaDeTrabajo> obtenerLista(){
		return areas;
	}
	
}
