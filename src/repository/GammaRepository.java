package repository;

import java.util.ArrayList;
import java.util.List;

import derivadaGeneral.Gamma;

public class GammaRepository {

	List<Gamma> gammas = new ArrayList<Gamma>();
	
	public void agregarGamma(Gamma nuevaGamma) {
		gammas.add(nuevaGamma);
	}
	public void quitarGamma(Gamma gammaQueSeVa) {
		gammas.remove(gammaQueSeVa);
	}
	
}
