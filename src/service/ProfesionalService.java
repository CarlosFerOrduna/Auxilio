package service;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import domain.Cliente;
import domain.Profesional;
import domain.Reparacion;
import domain.Ubicacion;

public class ProfesionalService {

	private List<Profesional> profesionales = new ArrayList<Profesional>();

	public Profesional crearProfesional() {

		String nombre;
		String especialidad;
		double longitud;
		double latitud;

		nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre", "Crear profesional",
				JOptionPane.INFORMATION_MESSAGE);
		especialidad = JOptionPane.showInputDialog(null, "Ingrese su especialidad", "Crear cliente",
				JOptionPane.INFORMATION_MESSAGE);
		longitud = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese su longitud", "Crear profesional",
				JOptionPane.INFORMATION_MESSAGE));
		latitud = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese su latitud", "Crear profesional",
				JOptionPane.INFORMATION_MESSAGE));

		profesionales.add(new Profesional(nombre, especialidad, new Ubicacion(longitud, latitud)));

		return new Profesional(nombre, especialidad, new Ubicacion(longitud, latitud));
	}

	public String presupuestar(String mensajeCliente, Reparacion reparacion, Cliente cliente) {

		JOptionPane.showMessageDialog(null,
				"Se enviara el siguiente mensaje al cliente " + cliente.getNombre() + "\n"
						+ "Detalle de la reparacion: " + reparacion.getDetalle() + ", Costo de la reparacion: "
						+ reparacion.getCosto(),
				"Presupuestar", JOptionPane.INFORMATION_MESSAGE);

		return reparacion.getDetalle() + " " + reparacion.getCosto();

	}

	public Profesional buscarProfesional() {

		String[] opciones = { "Buscar por nombre", "Buscar por ubicacion", "Buscar por especialidad" };

		int decision;

		decision = JOptionPane.showOptionDialog(null, "¿Como desea buscar?", "Bucar profesional", 0,
				JOptionPane.INFORMATION_MESSAGE, null, opciones, 0);

		if (decision == 0) {

			String nombre;

			nombre = JOptionPane.showInputDialog("Ingrese el nombre del profesional que busca");

			for (Profesional profesional : profesionales) {

				if (profesional.getNombre().equalsIgnoreCase(nombre)) {

					JOptionPane.showMessageDialog(null, "El profesional elegido es " + profesional,
							"Buscar profesional", JOptionPane.INFORMATION_MESSAGE);

					return profesional;
				}

			}

		} else if (decision == 1) {

			double longitud;
			double latitud;

			longitud = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese su longitud", "Buscar profesional",
					JOptionPane.INFORMATION_MESSAGE));
			latitud = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese su latitud", "Buscar profesional",
					JOptionPane.INFORMATION_MESSAGE));

			double distancia;
			double distanciaMenor = 0;
			Profesional profesionalCercano = null;

			for (int i = 0; i < profesionales.size(); i++) {

				distancia = Math.sqrt(Math.pow((profesionales.get(i).getUbicacion().getLongitud() - longitud), 2)
						+ Math.pow((profesionales.get(i).getUbicacion().getLatitud() - latitud), 2));

				if (i == 0) {

					distanciaMenor = distancia;
					profesionalCercano = profesionales.get(0);

				} else {

					if (distancia < distanciaMenor) {

						distanciaMenor = distancia;
						profesionalCercano = profesionales.get(i);
					}

				}

			}

			JOptionPane.showMessageDialog(null, "El profesional mas cercano a usted es " + profesionalCercano,
					"Buscar profesional", JOptionPane.INFORMATION_MESSAGE);

			return profesionalCercano;

		} else {

			String especialidad;

			especialidad = JOptionPane.showInputDialog("Ingrese la especialidad que busca");

			for (Profesional profesional : profesionales) {

				if (profesional.getEspecialidad().equalsIgnoreCase(especialidad)) {

					JOptionPane.showInternalMessageDialog(null, "El profesional elegido es " + profesional,
							"Buscar profesional", JOptionPane.INFORMATION_MESSAGE);

					return profesional;
				}
			}

		}
		return null;
	}

	public double reparar(String mensajeCliente, Reparacion reparacion, Cliente cliente) {

		JOptionPane.showMessageDialog(null,
				"Se enviara el siguiente mensaje al cliente " + cliente.getNombre() + "\n"
						+ "Detalle de la reparacion: " + reparacion.getDetalle() + ", Costo de la reparacion: "
						+ reparacion.getCosto(),
				"Reparar", JOptionPane.INFORMATION_MESSAGE);

		return reparacion.getCosto();
	}

}
