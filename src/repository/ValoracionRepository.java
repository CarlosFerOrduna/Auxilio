package repository;

import java.util.ArrayList;
import java.util.List;

import derivadaGeneral.Valoracion;

public class ValoracionRepository {

	List<Valoracion> valoraciones = new ArrayList<Valoracion>();
	
	public void agregarValoracion(Valoracion nuevaValoracion) {
		valoraciones.add(nuevaValoracion);
	}
	public void quitarValoracion(Valoracion valoracionQueSeVa) {
		valoraciones.remove(valoracionQueSeVa);
	}
}
