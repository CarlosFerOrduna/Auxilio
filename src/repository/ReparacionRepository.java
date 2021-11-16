package repository;

import java.util.ArrayList;
import java.util.List;

import derivadaGeneral.Reparacion;

public class ReparacionRepository {

	List<Reparacion> reparaciones = new ArrayList<Reparacion>();

	public void agregarReparacion(Reparacion nuevaReparacion) {
		reparaciones.add(nuevaReparacion);
	}

	public void quitarReparacion(Reparacion reparacionQueSeVa) {
		reparaciones.remove(reparacionQueSeVa);
	}

}