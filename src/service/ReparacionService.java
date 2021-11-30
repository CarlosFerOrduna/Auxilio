package service;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import domain.Reparacion;

public class ReparacionService {
	List<Reparacion> reparaciones = new ArrayList<Reparacion>();

	public void agregarReparacion(Reparacion nuevaReparacion) {

		String detalle;
		Double costo;

		detalle = JOptionPane.showInputDialog(null, "Ingrese un detalle de la reparacion realizada", "Crear reparacion",
				JOptionPane.INFORMATION_MESSAGE);

		costo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el costo de la reparacion",
				"Crear reparacion", JOptionPane.INFORMATION_MESSAGE));

		reparaciones.add(nuevaReparacion);
	}

	public List<Reparacion> verLista() {
		return reparaciones;
	}

}
