package service;

import java.util.ArrayList;
import java.util.List;

import javax.security.auth.kerberos.KerberosCredMessage;
import javax.swing.JOptionPane;

import domain.Colaborador;
import domain.Reparacion;
import domain.Ubicacion;

public class ColaboradorService {

	List<Colaborador> colaboradores = new ArrayList<Colaborador>();

	public Colaborador crearColaborador() {

		String nombre;
		Integer dni;
		double latitud;
		double longitud;

		nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre", "Crear colaborador",
				JOptionPane.INFORMATION_MESSAGE);
		dni = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su dni", "Crear colaborador",
				JOptionPane.INFORMATION_MESSAGE));
		longitud = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese su longitud con valor nomerico",
				"Crear colaborador", JOptionPane.INFORMATION_MESSAGE));

		latitud = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese su latitud con valor nomerico",
				"Crear colaborador", JOptionPane.INFORMATION_MESSAGE));

		colaboradores.add(new Colaborador(nombre, dni, new Ubicacion(longitud, latitud)));

		return new Colaborador(nombre, dni, new Ubicacion(longitud, latitud));
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

	public Colaborador buscarColaboradorCercano(Ubicacion ubicacionCercana) {

		double distancia;
		double guardarDistanciaMenor = 0;

		for (Colaborador colaborador : colaboradores) {

			distancia = Math
					.sqrt(Math.pow((colaborador.getUbicacion().getLongitud() - ubicacionCercana.getLongitud()), 2)
							+ Math.pow((colaborador.getUbicacion().getLatitud() - ubicacionCercana.getLatitud()), 2));

			if (distancia <= guardarDistanciaMenor) {

				guardarDistanciaMenor = distancia;

				return colaborador;
			}
		}
		return null;

	}
}
