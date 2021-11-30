package service;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import domain.Cliente;
import domain.Colaborador;
import domain.Problema;
import domain.Profesional;
import domain.Reparacion;
import domain.Vehiculo;

public class ClienteService {

	List<Cliente> clientes = new ArrayList<Cliente>();

	public Cliente crearCliente() {

		String nombre;
		Integer dni;

		nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre", "Crear cliente",
				JOptionPane.INFORMATION_MESSAGE);
		dni = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Ingrese su dni", "Crear cliente", JOptionPane.INFORMATION_MESSAGE));

		clientes.add(new Cliente(nombre, dni));

		return new Cliente(nombre, dni);

	}

	public String pedirAyuda(Cliente cliente, Problema problema, List<Colaborador> colaboradorCercano) {

		Integer ubicacionCliente;

		if (problema.getTipo().equalsIgnoreCase("Simple")) {

			for (Colaborador colaborador : colaboradorCercano) {

				ubicacionCliente = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su ubicacion actual",
						"Buscar colaborador cercano", JOptionPane.INFORMATION_MESSAGE));

				cliente.setUbicacion(ubicacionCliente);

				if (colaborador.getUbicacion() == cliente.getUbicacion()) {

					JOptionPane.showMessageDialog(null,
							"El colaborador mas cercano a ti es " + colaborador.getNombre());

					JOptionPane.showMessageDialog(null,
							cliente.getVehiculo().getMarca() + " " + cliente.getVehiculo().getModelo() + " "
									+ problema.getDetalle() + " " + cliente.getNombre() + " " + cliente.getUbicacion(),
							"Se enviara el siguiente mensaje al colaborador " + colaborador.getNombre(),
							JOptionPane.INFORMATION_MESSAGE);

					return cliente.getVehiculo().getMarca() + cliente.getVehiculo().getModelo() + problema
							+ cliente.getNombre() + cliente.getUbicacion();

				} else {

					for (Colaborador colaborador1 : colaboradorCercano) {

						if (cliente.getUbicacion() < colaborador.getUbicacion()
								&& colaborador.getUbicacion() < colaborador1.getUbicacion()
								&& colaborador.getDni() != colaborador1.getDni()
								|| cliente.getUbicacion() > colaborador.getUbicacion()
										&& colaborador.getUbicacion() > colaborador1.getUbicacion()
										&& colaborador.getDni() != colaborador1.getDni()) {

							JOptionPane.showMessageDialog(null,
									"El colaborador mas cercano a ti es " + colaborador.getNombre());

							JOptionPane.showMessageDialog(null,
									cliente.getVehiculo().getMarca() + " " + cliente.getVehiculo().getModelo() + " "
											+ problema.getDetalle() + " " + cliente.getNombre() + " "
											+ cliente.getUbicacion(),
									"Se enviara el siguiente mensaje al colaborador " + colaborador.getNombre(),
									JOptionPane.INFORMATION_MESSAGE);

							return cliente.getVehiculo().getMarca() + cliente.getVehiculo().getModelo() + problema
									+ cliente.getNombre() + cliente.getUbicacion();
						} else {
							JOptionPane.showMessageDialog(null,
									"El colaborador mas cercano a ti es " + colaborador1.getNombre());

							JOptionPane.showMessageDialog(null,
									cliente.getVehiculo().getMarca() + " " + cliente.getVehiculo().getModelo() + " "
											+ problema.getDetalle() + " " + cliente.getNombre() + " "
											+ cliente.getUbicacion(),
									"Se enviara el siguiente mensaje al colaborador " + colaborador1.getNombre(),
									JOptionPane.INFORMATION_MESSAGE);

							return cliente.getVehiculo().getMarca() + " " + cliente.getVehiculo().getModelo() + " "
									+ problema.getDetalle() + " " + cliente.getNombre() + " " + cliente.getUbicacion();
						}
					}
				}
			}
		}

		JOptionPane.showMessageDialog(null, "Ese tipo de problemas es para profesionales", "Seleccion",
				JOptionPane.INFORMATION_MESSAGE);

		return null;

	}

	public String enviarVehiculoProfesional(Cliente cliente, Problema problema, Profesional profesional) {

		if (problema.getTipo().equalsIgnoreCase("complejo")) {

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

	public String pagarProfesional(Cliente cliente, Reparacion reparacion, Profesional profesional) {
		
		return reparacion.getCosto() + cliente.getMedioDePago() + profesional.getMetodoDeFacturacion();
		
	}

	public String pagarColaborador(Cliente cliente, Reparacion reparacionAPagar, Colaborador colaborador) {
		return reparacionAPagar.getCosto() + cliente.getMedioDePago() + colaborador.getMetodoDeFactura();
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

	public void asociarVehiculo(Cliente cliente, Vehiculo vehiculo) {

		cliente.setVehiculo(vehiculo);
	}
}
