package service;

import java.util.ArrayList;
import java.util.List;

public class ServiceFallasParaColaborador {

	static List<String> fallas = new ArrayList<String>();

	public static String elegirProblemaDeLaLista(int index) {
		fallas.add("Pinche");
		fallas.add("Me quede sin bateria");
		fallas.add("Mi auto no enciende");
		fallas.add("Se me quemo una luz");
		fallas.add("Estoy encajado");
		fallas.add("Me quede sin agua/aceite");
		fallas.add("Me quede sin combustible");

		return fallas.get(index);
	}

}
