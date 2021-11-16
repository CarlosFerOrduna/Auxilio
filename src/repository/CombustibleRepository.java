package repository;

import java.util.ArrayList;
import java.util.List;

import derivadaGeneral.Combustible;

public class CombustibleRepository {
	
	List<Combustible> combustibles = new ArrayList<Combustible>();
	
	public void agregarCombustible(Combustible nuevoCombustible) {
		combustibles.add(nuevoCombustible);
	}
	public void quitarCombustible(Combustible combustibleQueSeVa) {
		combustibles.remove(combustibleQueSeVa);
	}
}
