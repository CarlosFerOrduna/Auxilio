package service;

import java.util.ArrayList;
import java.util.List;

import javax.security.auth.kerberos.KerberosCredMessage;
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

					JOptionPane.showMessageDialog(null, "El colaborador que buscas es " + colaborador.getNombre(),
							"Busqueda colaborador", JOptionPane.INFORMATION_MESSAGE);

					return colaborador;
				}
			}
		} else {

			Integer dni;

			dni = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dni del colaborador que busca"));

			for (Colaborador colaborador : colaboradores) {

				if (colaborador.getDni() == dni) {

					JOptionPane.showInternalMessageDialog(null,
							"El colaborador que buscas es " + colaborador.getNombre(), "Busqueda de colaborador",
							JOptionPane.INFORMATION_MESSAGE);

					return colaborador;
				}
			}
		}
		return null;
	}

	public Integer brindarAyuda(String mensajeDeAyuda, Reparacion reparacion) {

		Integer montoACobrar;

		montoACobrar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto a cobrar por la reparacion"));

		return montoACobrar;
	}

	public Colaborador buscarColaboradorCercano(Integer ubicacionCercana) {

		for (Colaborador colaborador : colaboradores) {

			if (colaborador.getUbicacion() == ubicacionCercana) {

				System.out.println("El colaborador es " + colaborador);

				return colaborador;
			} else {

				for (Colaborador colaborador2 : colaboradores) {
					if (colaborador.getDni() != colaborador2.getDni()) {
						if (colaborador.getUbicacion() <= colaborador2.getUbicacion()) {

							System.out.println("De la validacion el colaborador es " + colaborador.getNombre());

							return colaborador;
						} else {
							System.out.println("Del else salio " + colaborador.getNombre());
							return colaborador2;
						}
					}
				}
			}
		}
		return null;

	}
}
