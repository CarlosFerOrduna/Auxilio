package service;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import domain.Colaborador;
import domain.Reparacion;

public class ColaboradorService {

	List<Colaborador> colaboradores = new ArrayList<Colaborador>();

	public Colaborador crearColaborador() {

		String nombre;
		Integer dni;
		Integer ubicacion;

		nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre", "Crear colaborador",
				JOptionPane.INFORMATION_MESSAGE);
		dni = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su dni", "Crear colaborador",
				JOptionPane.INFORMATION_MESSAGE));
		ubicacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su ubicacion con valor nomerico",
				"Crear colaborador", JOptionPane.INFORMATION_MESSAGE));

		colaboradores.add(new Colaborador(nombre, dni, ubicacion));

		return new Colaborador(nombre, dni, ubicacion);
	}

	public Colaborador buscarColaborador() {

		String[] opciones = { "Buscar por nombre", "Buscar por dni" };

		int decision;

		decision = JOptionPane.showOptionDialog(null, "¿Como desea buscar?", "Buscar colaborador", 0,
				JOptionPane.INFORMATION_MESSAGE, null, opciones, 0);

		if (decision == 0) {

			String nombre;

			nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del colaborador que busca",
					"Buscar colaborador", JOptionPane.INFORMATION_MESSAGE);

			for (Colaborador colaborador : colaboradores) {
				if (colaborador.getNombre().equalsIgnoreCase(nombre)) {

					JOptionPane.showMessageDialog(null, colaborador.getNombre());

					return colaborador;
				}
			}
		} else {
			Integer dni;

			dni = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dni del colaborador que busca"));

			for (Colaborador colaborador : colaboradores) {
				if (colaborador.getDni() == dni) {

					JOptionPane.showInternalMessageDialog(null, colaborador);

					return colaborador;
				}
			}
		}
		return null;
	}

	public Colaborador buscarColaboradorCercano(Integer ubicacionCarcana) {

		for (Colaborador colaborador : colaboradores) {
			if (colaborador.getUbicacion() == ubicacionCarcana) {
				return colaborador;
			} else {
				for (Colaborador colaborador1 : colaboradores) {
					if (ubicacionCarcana < colaborador.getUbicacion()
							&& colaborador.getUbicacion() < colaborador1.getUbicacion()
							&& colaborador.getDni() != colaborador1.getDni()
							|| ubicacionCarcana > colaborador.getUbicacion()
									&& colaborador.getUbicacion() > colaborador1.getUbicacion()
									&& colaborador.getDni() != colaborador1.getDni()) {

						JOptionPane.showMessageDialog(null, "El colaborador cerca es " + colaborador.getNombre(),
								"Colaborador cercano", JOptionPane.INFORMATION_MESSAGE);

						return colaborador;

					} else {

						JOptionPane.showMessageDialog(null, "El colaborador cerca es " + colaborador1.getNombre(),
								"Colaborador cercano", JOptionPane.INFORMATION_MESSAGE);

						return colaborador1;
					}
				}
			}
		}
		return null;

	}

	public String cobrar(String mensajeDeColaborador, Reparacion reparacion) {
		return null;
	}
}
