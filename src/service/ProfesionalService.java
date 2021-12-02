package service;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import domain.Cliente;
import domain.Profesional;
import domain.Reparacion;

public class ProfesionalService {

	List<Profesional> profesionales = new ArrayList<Profesional>();

	public Profesional crearProfesional() {

		String nombre;
		String especialidad;

		nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre", "Crear profesional",
				JOptionPane.INFORMATION_MESSAGE);
		especialidad = JOptionPane.showInputDialog(null, "Ingrese su especialidad", "Crear cliente",
				JOptionPane.INFORMATION_MESSAGE);

		profesionales.add(new Profesional(nombre, especialidad));

		return new Profesional(nombre, especialidad);
	}

	public String presupuestar(String mensajeCliente, Reparacion reparacion, Cliente cliente) {

		JOptionPane.showMessageDialog(null,
				"Detalle de la reparacion: " + reparacion.getDetalle() + ", Costo de la reparacion: "
						+ reparacion.getCosto(),
				"Se enviara el siguiente mensaje al cliente " + cliente.getNombre(), JOptionPane.INFORMATION_MESSAGE);

		return reparacion.getDetalle() + " " + reparacion.getCosto();

	}

	public Profesional buscarProfesional() {

		String[] opciones = { "Buscar por nombre", "Buscar por direccion", "Buscar por especialidad" };

		int decision;

		decision = JOptionPane.showOptionDialog(null, "¿Como desea buscar?", "Bucar profesional", 0,
				JOptionPane.INFORMATION_MESSAGE, null, opciones, 0);

		if (decision == 0) {

			String nombre;

			nombre = JOptionPane.showInputDialog("Ingrese el nombre del profesional que busca");

			for (Profesional profesional : profesionales) {
				if (profesional.getNombre().equalsIgnoreCase(nombre)) {

					JOptionPane.showMessageDialog(null, "El profesional elegido es " + profesional);

					return profesional;
				}
			}
		} else if (decision == 1) {

			String direccion;

			direccion = JOptionPane.showInputDialog(null, "Ingrese la direccion", "Buscar profesional",
					JOptionPane.INFORMATION_MESSAGE);

			for (Profesional profesional : profesionales) {

				if (profesional.getDireccion().equalsIgnoreCase(direccion)) {

					JOptionPane.showMessageDialog(null, "El profesional elegido es " + profesional.getNombre());

					return profesional;
				}
			}

		} else {
			String especialidad;

			especialidad = JOptionPane.showInputDialog("Ingrese la especialidad que busca");

			for (Profesional profesional : profesionales) {
				if (profesional.getEspecialidad().equalsIgnoreCase(especialidad)) {

					JOptionPane.showInternalMessageDialog(null, "El profesional elegido es " + profesional);

					return profesional;
				}
			}

		}
		return null;
	}

}
