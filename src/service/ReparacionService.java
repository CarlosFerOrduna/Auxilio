package service;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import domain.Reparacion;

public class ReparacionService {
	List<Reparacion> reparaciones = new ArrayList<Reparacion>();

	public Reparacion crearReparacion() {

		String detalle;
		Integer costo;

		detalle = JOptionPane.showInputDialog(null, "Ingrese un detalle de la reparacion realizada", "Crear reparacion",
				JOptionPane.INFORMATION_MESSAGE);

		costo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el costo de la reparacion",
				"Crear reparacion", JOptionPane.INFORMATION_MESSAGE));

		reparaciones.add(new Reparacion(detalle, costo));

		return new Reparacion(detalle, costo);
	}

	public List<Reparacion> verLista() {
		return reparaciones;
	}

}
