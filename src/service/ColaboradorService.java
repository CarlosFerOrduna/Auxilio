package service;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import domain.Colaborador;
import domain.Reparacion;
import domain.Ubicacion;

public class ColaboradorService {

	private List<Colaborador> colaboradores = new ArrayList<Colaborador>();

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

			dni = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el dni del colaborador que busca",
					"Buscar colaborador", JOptionPane.INFORMATION_MESSAGE));

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

	public double brindarAyuda(String mensajeDeAyuda, Reparacion reparacion) {

		double montoACobrar;

		montoACobrar = Double
				.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el monto a cobrar por la reparacion",
						"Monto a cobrar por la reparacion", JOptionPane.INFORMATION_MESSAGE));

		return montoACobrar;
	}

	public Colaborador buscarColaboradorCercano(Ubicacion ubicacionActualCliente) {

		double distancia;
		double distanciaMenor = 0;
		Colaborador colaboradorCercano = null;

		for (int i = 0; i < colaboradores.size(); i++) {

			distancia = Math.sqrt(Math
					.pow((colaboradores.get(i).getUbicacion().getLongitud() - ubicacionActualCliente.getLongitud()), 2)
					+ Math.pow((colaboradores.get(i).getUbicacion().getLatitud() - ubicacionActualCliente.getLatitud()),
							2));

			if (i == 0) {

				distanciaMenor = distancia;
				colaboradorCercano = colaboradores.get(0);
			} else {
				if (distancia < distanciaMenor) {
					distanciaMenor = distancia;
					colaboradorCercano = colaboradores.get(i);
				}
			}
		}

		return colaboradorCercano;

	}
}
