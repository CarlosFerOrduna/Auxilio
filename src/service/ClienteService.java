package service;

import javax.swing.JOptionPane;

import domain.Cliente;
import domain.Colaborador;
import domain.Problema;
import domain.Profesional;
import domain.Reparacion;
import domain.Vehiculo;
import repository.ClienteRepository;
import repository.ColaboradorRepository;

public class ClienteService {

	ClienteRepository clientes = new ClienteRepository();

	public Cliente crearCliente() {

		String nombre;
		Integer dni;

		nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre", "Crear cliente",
				JOptionPane.INFORMATION_MESSAGE);
		dni = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Ingrese su dni", "Crear cliente", JOptionPane.INFORMATION_MESSAGE));

		clientes.agregarCliente(new Cliente(nombre, dni));

		return new Cliente(nombre, dni);

	}

	public String pedirAyuda(Problema problema, ColaboradorService colaboradorAlRescate) {

		if (problema.getTipo().equalsIgnoreCase("Simple")) {

			ColaboradorRepository colaboradores = new ColaboradorRepository();

			Integer ubicacionCliente;
			String nombre;
			Integer dni;

			int decicion;

			String[] opciones = { "Buscar por nombre", "Buscar por dni" };

			decicion = JOptionPane.showOptionDialog(null, "Seleccione la forma de buscar al cliente que necesita ayuda",
					"Seleccion", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, 0);

			if (decicion == 0) {

				nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del cliente", "Buscar cliente",
						JOptionPane.INFORMATION_MESSAGE);

				for (Cliente cliente : clientes.verLista()) {

					if (cliente.getNombre().equalsIgnoreCase(nombre)) {

						JOptionPane.showMessageDialog(null, "El cliente que a seleccionado es " + cliente.getNombre(),
								"Buscar cliente", JOptionPane.INFORMATION_MESSAGE);

						ubicacionCliente = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su ubicacion",
								"Buscar cliente", JOptionPane.INFORMATION_MESSAGE));

						cliente.setUbicacion(ubicacionCliente);

						for (Colaborador colaborador : colaboradores.verLista()) {

							if (colaborador.getUbicacion() == cliente.getUbicacion()) {

								JOptionPane.showMessageDialog(null, colaborador.getNombre() + "Esta cerca de ti");

								JOptionPane.showMessageDialog(null,
										cliente.getUbicacion() + cliente.getVehiculo().getMarca() + " "
												+ cliente.getVehiculo().getModelo() + " " + cliente.getNombre() + " "
												+ problema,
										"Se enviara el siguiente mensaje al colaboreador: " + colaborador.getNombre(),
										JOptionPane.INFORMATION_MESSAGE);

								return colaboradorAlRescate.brindarAyuda(cliente.getVehiculo().getMarca()
										+ cliente.getVehiculo().getModelo() + cliente.getNombre() + problema,
										colaborador);

							} else {

								for (Colaborador colaborador2 : colaboradores.verLista()) {

									if (cliente.getUbicacion() < colaborador.getUbicacion()
											&& colaborador.getUbicacion() < colaborador2.getUbicacion()
											|| cliente.getUbicacion() > colaborador.getUbicacion()
													&& colaborador.getUbicacion() > colaborador2.getUbicacion()
													&& colaborador.getDni() != colaborador2.getDni()) {

										JOptionPane.showMessageDialog(null,
												colaborador.getNombre() + " esta cerca de ti", "Buscar colaborador",
												JOptionPane.INFORMATION_MESSAGE);

										JOptionPane.showMessageDialog(null,
												cliente.getVehiculo().getMarca() + " "
														+ cliente.getVehiculo().getModelo() + " " + cliente.getNombre()
														+ " " + problema,
												"Se enviara el siguiente mensaje al colaboreador: "
														+ colaborador.getNombre(),
												JOptionPane.INFORMATION_MESSAGE);

										return colaboradorAlRescate.brindarAyuda(cliente.getVehiculo().getMarca()
												+ cliente.getVehiculo().getModelo() + cliente.getNombre() + problema,
												colaborador);
									} else {

										JOptionPane.showMessageDialog(null,
												colaborador2.getNombre() + "Esta cerca de ti", "Buscar colaborador",
												JOptionPane.INFORMATION_MESSAGE);

										JOptionPane.showMessageDialog(null,
												cliente.getUbicacion() + cliente.getVehiculo().getMarca() + " "
														+ cliente.getVehiculo().getModelo() + " " + cliente.getNombre()
														+ " " + problema,
												"Se enviara el siguiente mensaje al colaboreador: "
														+ colaborador2.getNombre(),
												JOptionPane.INFORMATION_MESSAGE);

										return colaboradorAlRescate.brindarAyuda(cliente.getVehiculo().getMarca()
												+ cliente.getVehiculo().getModelo() + cliente.getNombre() + problema,
												colaborador2);

									}

								}

							}

						}
					} else {

						JOptionPane.showMessageDialog(null,
								"Lo sentimos, no contamos con un cliente con el nombre " + nombre, "Buscar cliente",
								JOptionPane.INFORMATION_MESSAGE);

					}

				}

			} else {

				dni = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el dni del cliente en problemas",
						"Buscar cliente", JOptionPane.INFORMATION_MESSAGE));

				for (Cliente cliente : clientes.verLista()) {

					if (cliente.getDni() == dni) {

						JOptionPane.showMessageDialog(null, "Usted a elegido a " + cliente.getNombre(),
								"Buscar cliente", JOptionPane.INFORMATION_MESSAGE);

						ubicacionCliente = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su ubicacion",
								"Buscar colaborador cerca", JOptionPane.INFORMATION_MESSAGE));

						cliente.setUbicacion(ubicacionCliente);

						for (Colaborador colaborador : colaboradores.verLista()) {

							if (colaborador.getUbicacion() == cliente.getUbicacion()) {

								JOptionPane.showMessageDialog(null, colaborador.getNombre() + "Esta cerca de ti");

								JOptionPane.showMessageDialog(null,
										cliente.getVehiculo().getMarca() + " " + cliente.getVehiculo().getModelo() + " "
												+ cliente.getNombre() + " " + problema,
										"Se enviara el siguiente mensaje al colaboreador: " + colaborador.getNombre(),
										JOptionPane.INFORMATION_MESSAGE);

								return colaboradorAlRescate.brindarAyuda(cliente.getVehiculo().getMarca()
										+ cliente.getVehiculo().getModelo() + cliente.getNombre() + problema,
										colaborador);
							} else {

								for (Colaborador colaborador2 : colaboradores.verLista()) {

									if (cliente.getUbicacion() < colaborador.getUbicacion()
											&& colaborador.getUbicacion() < colaborador2.getUbicacion()
											|| cliente.getUbicacion() > colaborador.getUbicacion()
													&& colaborador.getUbicacion() > colaborador2.getUbicacion()
													&& colaborador.getDni() != colaborador2.getDni()) {

										JOptionPane.showMessageDialog(null,
												colaborador.getNombre() + "Esta cerca de ti", "Buscar colaborador",
												JOptionPane.INFORMATION_MESSAGE);

										JOptionPane.showMessageDialog(null,
												cliente.getVehiculo().getMarca() + " "
														+ cliente.getVehiculo().getModelo() + " " + cliente.getNombre()
														+ " " + problema,
												"Se enviara el siguiente mensaje al colaboreador: "
														+ colaborador.getNombre(),
												JOptionPane.INFORMATION_MESSAGE);

										return colaboradorAlRescate.brindarAyuda(cliente.getVehiculo().getMarca()
												+ cliente.getVehiculo().getModelo() + cliente.getNombre() + problema,
												colaborador);
									} else {
										JOptionPane.showMessageDialog(null,
												colaborador.getNombre() + "Esta cerca de ti", "Buscar colaborador",
												JOptionPane.INFORMATION_MESSAGE);

										JOptionPane.showMessageDialog(null,
												cliente.getVehiculo().getMarca() + " "
														+ cliente.getVehiculo().getModelo() + " " + cliente.getNombre()
														+ " " + problema,
												"Se enviara el siguiente mensaje al colaboreador: "
														+ colaborador2.getNombre(),
												JOptionPane.INFORMATION_MESSAGE);

										return colaboradorAlRescate.brindarAyuda(cliente.getVehiculo().getMarca()
												+ cliente.getVehiculo().getModelo() + cliente.getNombre() + problema,
												colaborador2);
									}

								}

							}
						}

					}

				}
			}

		} else {

			JOptionPane.showMessageDialog(null, "Ese tipo de problemas son para profesionales");

		}

		return null;
	}

	public String enviarVehiculoProfesional(Cliente clienteEnProblemas, Problema problema) {

		if (problema.getTipo().equalsIgnoreCase("complejo")) {

			return clienteEnProblemas.getVehiculo() + problema.getDetalle();

		}

		return null;
	}

	public String pagarProfesional(Cliente clienteQuePaga, Reparacion reparacionAPagar, Profesional profesional) {
		return reparacionAPagar.getCosto() + clienteQuePaga.getMedioDePago() + profesional.getMetodoDeFacturacion();
	}

	public String pagarColaborador(Cliente clienteQuePaga, Reparacion reparacionAPagar, Colaborador colaborador) {
		return reparacionAPagar.getCosto() + clienteQuePaga.getMedioDePago() + colaborador.getMetodoDeFactura();
	}

	public Cliente buscarClientePorNombre() {

		String nombre;

		nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente que busca");

		for (Cliente cliente : clientes.verLista()) {
			if (cliente.getNombre().equalsIgnoreCase(nombre)) {

				JOptionPane.showInternalMessageDialog(null, cliente.getNombre());

				return cliente;
			}
		}

		return null;
	}

	public Cliente buscarClientePorDni() {

		Integer dni;

		dni = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dni del cliente que busca"));

		for (Cliente cliente : clientes.verLista()) {
			if (cliente.getDni() == dni) {

				JOptionPane.showInternalMessageDialog(null, cliente.getNombre());

				return cliente;
			}
		}
		return null;
	}

	public void asociarVehiculo(Cliente cliente, Vehiculo vehiculo) {

		cliente.setVehiculo(vehiculo);
	}
}
