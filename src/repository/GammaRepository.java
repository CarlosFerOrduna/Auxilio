package repository;

import java.util.ArrayList;
import java.util.List;

import derivadaGeneral.Gama;

public class GammaRepository {

	List<Gama> gammas = new ArrayList<Gama>();
	
	public void agregarGamma(Gama nuevaGamma) {
		gammas.add(nuevaGamma);
	}
	public void quitarGamma(Gama gammaQueSeVa) {
		gammas.remove(gammaQueSeVa);
	}
	
}
