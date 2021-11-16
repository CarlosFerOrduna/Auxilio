package repository;

import java.util.ArrayList;
import java.util.List;

import derivadaGeneral.Repuesto;

public class RepuestoRepository {

	List<Repuesto> repuestos = new ArrayList<Repuesto>();
	
	public void agregarRepuesto(Repuesto nuevoRepuesto) {
		repuestos.add(nuevoRepuesto);
	}
	public void quitarRepuesto(Repuesto repuestoQueSeVa) {
		repuestos.remove(repuestoQueSeVa);
	}
}
