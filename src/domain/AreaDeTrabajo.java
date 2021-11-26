package domain;

import java.util.List;

public class AreaDeTrabajo {

	private List<Reparacion> trabajosEspecificos;

	public AreaDeTrabajo(List<Reparacion> trabajosEspecificos) {
		this.trabajosEspecificos = trabajosEspecificos;
	}

	public List<Reparacion> getParteDelVehiculo() {
		return trabajosEspecificos;
	}
	
	public void agregaTrabajo(Reparacion nuevoTrabajo) {
		trabajosEspecificos.add(nuevoTrabajo);
	}
	public void quitarTabajo(Reparacion trabajoQueSeVa) {
		trabajosEspecificos.remove(trabajoQueSeVa);
	}
}
