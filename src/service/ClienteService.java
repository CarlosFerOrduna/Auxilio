package service;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import domain.Cliente;
import domain.Colaborador;
import domain.Problema;
import domain.Profesional;
import domain.Ubicacion;
import domain.Vehiculo;

public class ClienteService {

	private List<Cliente> clientes = new ArrayList<Cliente>();

	public void crearCliente() {

		String nombre;
		Integer dni;

		nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre", "Crear cliente",
				JOptionPane.INFORMATION_MESSAGE);
		dni = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Ingrese su dni", "Crear cliente", JOptionPane.INFORMATION_MESSAGE));

		clientes.add(new Cliente(nombre, dni));

	}

	public String pedirAyuda(Cliente cliente, Problema problema, Colaborador colaborador) {

		if (problema.getTipo().equalsIgnoreCase("Simple")) {

			JOptionPane.showMessageDialog(null,
					"Mi vehiculo marca " + cliente.getVehiculo().getMarca() + " modelo "
							+ cliente.getVehiculo().getModelo() + ", " + problema.getDetalle() + ", mi nombre es "
							+ cliente.getNombre(),
					"Se enviara el siguiente mensaje al colaborador " + colaborador.getNombre(),
					JOptionPane.INFORMATION_MESSAGE);

			return "Mi vehiculo marca " + cliente.getVehiculo().getMarca() + " modelo "
					+ cliente.getVehiculo().getModelo() + ", " + problema.getDetalle() + ", mi nombre es "
					+ cliente.getNombre();

		} else {
			JOptionPane.showMessageDialog(null, "Ese tipo de problemas es para profesionales", "Seleccion",
					JOptionPane.INFORMATION_MESSAGE);

		}

		return null;

	}

	public String enviarVehiculoProfesional(Cliente cliente, Problema problema, Profesional profesional) {

		if (problema.getTipo().equalsIgnoreCase("Complejo")) {

			JOptionPane.showMessageDialog(null,
					cliente.getNombre() + " " + cliente.getVehiculo().getMarca() + " "
							+ cliente.getVehiculo().getModelo() + " " + problema.getDetalle(),
					"Se enviara el siguiente mensaje al profesional " + profesional.getNombre(),
					JOptionPane.INFORMATION_MESSAGE);

			return cliente.getNombre() + " " + cliente.getVehiculo().getMarca() + " "
					+ cliente.getVehiculo().getModelo() + " " + problema.getDetalle();

		}

		JOptionPane.showMessageDialog(null, "Ese tipo de problemas es para colaboradores", "Seleccion",
				JOptionPane.INFORMATION_MESSAGE);

		return null;
	}

	public String pagarProfesional(Cliente cliente, double montoPagar, Profesional profesioanl) {

		cliente.setCuenta(cliente.getCuenta() - montoPagar);
		profesioanl.setCuenta(montoPagar);

		JOptionPane.showMessageDialog(null,
				"Usted le ha enviado el monto de " + montoPagar + " al profesional " + profesioanl.getNombre(),
				"Pagar profesional", JOptionPane.INFORMATION_MESSAGE);

		return "Usted le ha enviado el monto de " + montoPagar + " al profesional " + profesioanl.getNombre();
	}

	public String pagarColaborador(Cliente cliente, double montoPagar, Colaborador colaborador) {

		cliente.setCuenta(cliente.getCuenta() - montoPagar);
		colaborador.setCuenta(montoPagar);

		JOptionPane.showMessageDialog(null,
				"Usted le ha enviado el monto de " + montoPagar + " al colaborador " + colaborador.getNombre(),
				"Pagar colaborador", JOptionPane.INFORMATION_MESSAGE);

		return "Usted le ha enviado el monto de " + montoPagar + " al profesional " + colaborador.getNombre();
	}

	public Ubicacion darUbicacion(Cliente cliente) {

		double longitud;
		double latitud;

		longitud = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese su longitud", "Ubicacion cliente",
				JOptionPane.INFORMATION_MESSAGE));

		latitud = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese su latitud", "Ubicacion cliente",
				JOptionPane.INFORMATION_MESSAGE));

		cliente.setUbicacion(new Ubicacion(longitud, latitud));

		return new Ubicacion(longitud, latitud);

	}

	public Cliente buscarCliente() {

		String[] opciones = { "Buscar por dni", "Buscar por nombre" };

		int decision;

		decision = JOptionPane.showOptionDialog(null, "Como quiere buscar al cliente", "Buscar cliente", 0,
				JOptionPane.INFORMATION_MESSAGE, null, opciones, 0);

		if (decision == 0) {

			Integer dni;

			dni = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el dni del cliente que busca",
					"Buscar cliente", JOptionPane.INFORMATION_MESSAGE));

			for (Cliente cliente : clientes) {

				if (cliente.getDni() == dni) {

					JOptionPane.showInternalMessageDialog(null, "El cliente seleccionado es " + cliente.getNombre(),
							"Buscar cliente", JOptionPane.INFORMATION_MESSAGE);

					return cliente;

				}
			}

		} else {

			String nombre;

			nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del cliente que busca", "Buscar cliente",
					JOptionPane.INFORMATION_MESSAGE);

			for (Cliente cliente : clientes) {

				if (cliente.getNombre().equalsIgnoreCase(nombre)) {

					JOptionPane.showInternalMessageDialog(null, "El cliente seleccionado es " + cliente.getNombre(),
							"Buscar cliente", JOptionPane.INFORMATION_MESSAGE);

					return cliente;

				}
			}
		}

		return null;
	}

	public Cliente asociarVehiculo(Cliente cliente, Vehiculo vehiculo) {

		cliente.setVehiculo(vehiculo);

		return cliente;
	}
}
