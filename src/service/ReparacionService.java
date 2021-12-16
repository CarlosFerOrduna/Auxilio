package service;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import domain.Reparacion;
import domain.Vehiculo;

public class ReparacionService {

	private List<Reparacion> reparaciones = new ArrayList<Reparacion>();

	public Reparacion crearReparacion(Vehiculo vehiculo) {

		String detalle;
		double costo;

		detalle = JOptionPane.showInputDialog(null, "Ingrese un detalle de la reparacion realizada", "Crear reparacion",
				JOptionPane.INFORMATION_MESSAGE);

		costo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el costo de la reparacion",
				"Crear reparacion", JOptionPane.INFORMATION_MESSAGE));

		reparaciones.add(new Reparacion(detalle, costo, vehiculo));

		return new Reparacion(detalle, costo, vehiculo);
	}

	public List<Reparacion> verLista() {
		return reparaciones;
	}

}
