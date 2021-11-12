package service;

import java.util.ArrayList;
import java.util.List;

public class ServiceFallasParaTaller {

	static List<String> fallas = new ArrayList<String>();

	public static String elegirProblemaDeLaLista(int index) {
		fallas.add("Cambio tren delantero");
		fallas.add("Cambio de amortiguadores");
		fallas.add("Cambio de cubiertas");
		fallas.add("Cambio de distribucion");
		fallas.add("Cambio de embriague");
		fallas.add("Cambio de inyeccion");

		return fallas.get(index);
	}
}
