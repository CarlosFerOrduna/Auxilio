package service;

import javax.swing.JOptionPane;

import domain.Cliente;
import domain.Colaborador;
import domain.Reparacion;
import repository.ColaboradorRepository;

public class ColaboradorService {

	ColaboradorRepository colaboradores = new ColaboradorRepository();

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

		colaboradores.agregarColaborador(new Colaborador(nombre, dni, ubicacion));

		return new Colaborador(nombre, dni, ubicacion);
	}

	public Colaborador buscarColaboradorPorNombre() {
		String nombre;

		nombre = JOptionPane.showInputDialog("Ingrese el nombre del colaborador que busca");

		for (Colaborador colaborador : colaboradores.verLista()) {
			if (colaborador.getNombre().equalsIgnoreCase(nombre)) {

				JOptionPane.showMessageDialog(null, colaborador);

				return colaborador;
			}
		}
		return null;
	}

	public Colaborador buscarColaboradorPorDni() {
		Integer dni;

		dni = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dni del colaborador que busca"));

		for (Colaborador colaborador : colaboradores.verLista()) {
			if (colaborador.getDni() == dni) {

				JOptionPane.showInternalMessageDialog(null, colaborador);

				return colaborador;
			}
		}
		return null;
	}

	public String brindarAyuda(String mensajeDeAuxilio, Colaborador colaborador) {
		return colaborador.getUbicacion() + colaborador.getNombre();
	}

	public String cobrar(Cliente cliente, Reparacion reparacion, Colaborador colaborador) {
		return cliente.getMedioDePago() + reparacion.getCosto() + colaborador.getMetodoDeFactura();
	}

	public Colaborador colaboradoresCercaDeColaborador() {

		int decicion;

		String[] opciones = { "Buscar por nombre", "Buscar por dni" };

		decicion = JOptionPane.showOptionDialog(null, "Seleccione el metodo de busqueda", "Busqueda", 0,
				JOptionPane.QUESTION_MESSAGE, null, opciones, 0);

		if (decicion == 0) {
			String nombre;

			nombre = JOptionPane.showInputDialog("Ingrese el nombre del colaborador que esta buscando");

			for (Colaborador colaboradorElegido : colaboradores.verLista()) {

				if (colaboradorElegido.getNombre().equalsIgnoreCase(nombre)) {

					JOptionPane.showMessageDialog(null, "Usted a seleccionado a: " + colaboradorElegido.getNombre());

					for (Colaborador colaboradorBuscado : colaboradores.verLista()) {

						if (colaboradorBuscado.getUbicacion() == colaboradorElegido.getUbicacion()
								&& colaboradorBuscado.getDni() != colaboradorElegido.getDni()) {

							JOptionPane.showMessageDialog(null, "El colaborador mas cercano a "
									+ colaboradorElegido.getNombre() + " es " + colaboradorBuscado.getNombre());

							return colaboradorBuscado;

						} else if (colaboradorBuscado.getUbicacion() != colaboradorElegido.getUbicacion()) {

							for (Colaborador colaboradorComparador : colaboradores.verLista()) {

								if (colaboradorElegido.getUbicacion() < colaboradorBuscado.getUbicacion()
										&& colaboradorBuscado.getUbicacion() < colaboradorComparador.getUbicacion()
										|| colaboradorElegido.getUbicacion() > colaboradorBuscado.getUbicacion()
												&& colaboradorBuscado.getUbicacion() > colaboradorComparador
														.getUbicacion()
												&& colaboradorBuscado.getDni() != colaboradorComparador.getDni()
												&& colaboradorComparador.getDni() != colaboradorElegido.getDni()) {

									JOptionPane.showMessageDialog(null, "El colaborador mas cercano a "
											+ colaboradorElegido.getNombre() + " es " + colaboradorBuscado.getNombre());

									return colaboradorBuscado;

								} else if (colaboradorElegido.getUbicacion() < colaboradorComparador.getUbicacion()
										&& colaboradorComparador.getUbicacion() < colaboradorBuscado.getUbicacion()
										|| colaboradorElegido.getUbicacion() > colaboradorComparador.getUbicacion()
												&& colaboradorComparador.getUbicacion() > colaboradorBuscado
														.getUbicacion()
												&& colaboradorBuscado.getDni() != colaboradorComparador.getDni()
												&& colaboradorComparador.getDni() != colaboradorElegido.getDni()) {

									JOptionPane.showMessageDialog(null,
											"El colaborador mas cerca de " + colaboradorElegido.getNombre() + " es "
													+ colaboradorComparador.getNombre());

									return colaboradorComparador;

								}

							}

						}
					}
				} else {

					JOptionPane.showMessageDialog(null, "No contamos con un colaborador llamado " + nombre);

				}

			}

		} else {

			int dni;

			dni = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dni del colaborador que busca"));

			for (Colaborador colaboradorElegido : colaboradores.verLista()) {

				if (colaboradorElegido.getDni() == dni) {

					JOptionPane.showMessageDialog(null,
							"El colaborador que usted a elegido es " + colaboradorElegido.getNombre());

					for (Colaborador colaboradorBuscado : colaboradores.verLista()) {

						if (colaboradorElegido.getUbicacion() == colaboradorElegido.getUbicacion()
								&& colaboradorElegido.getDni() != colaboradorBuscado.getDni()) {
							JOptionPane.showMessageDialog(null, "El colaborador mas cercano a "
									+ colaboradorElegido.getNombre() + " es " + colaboradorBuscado.getNombre());

						} else {

							for (Colaborador colaboradorComparador : colaboradores.verLista()) {

								if (colaboradorElegido.getUbicacion() < colaboradorBuscado.getUbicacion()
										&& colaboradorBuscado.getUbicacion() < colaboradorComparador.getUbicacion()
										|| colaboradorElegido.getUbicacion() > colaboradorBuscado.getUbicacion()
												&& colaboradorBuscado.getUbicacion() > colaboradorComparador
														.getUbicacion()
												&& colaboradorBuscado.getDni() != colaboradorComparador.getDni()
												&& colaboradorComparador.getDni() != colaboradorElegido.getDni()) {

									JOptionPane.showMessageDialog(null, "El colaborador mas cercano a "
											+ colaboradorElegido.getNombre() + " es " + colaboradorBuscado.getNombre());

									return colaboradorBuscado;

								} else if (colaboradorElegido.getUbicacion() < colaboradorComparador.getUbicacion()
										&& colaboradorComparador.getUbicacion() < colaboradorBuscado.getUbicacion()
										|| colaboradorElegido.getUbicacion() > colaboradorComparador.getUbicacion()
												&& colaboradorComparador.getUbicacion() > colaboradorBuscado
														.getUbicacion()
												&& colaboradorBuscado.getDni() != colaboradorComparador.getDni()
												&& colaboradorComparador.getDni() != colaboradorElegido.getDni()) {

									JOptionPane.showMessageDialog(null,
											"El colaborador mas cerca a " + colaboradorElegido.getNombre() + " es "
													+ colaboradorComparador.getNombre());

									return colaboradorComparador;

								}
							}

						}

					}

				} else {

					JOptionPane.showMessageDialog(null, "No contamos con un colaborador con dni " + dni);

				}
			}
		}
		return null;
	}

}
