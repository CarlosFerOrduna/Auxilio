package service;

import javax.swing.JOptionPane;

import domain.Cliente;
import domain.Colaborador;
import domain.Problema;
import domain.Profesional;
import domain.Reparacion;
import domain.Vehiculo;
import repository.ClienteRepository;

public class ClienteService {

	ClienteRepository clientes = new ClienteRepository();

	public void crearCliente() {

		String nombre;
		Integer dni;

		nombre = JOptionPane.showInputDialog("Ingrese su nombre");
		dni = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su dni"));

		clientes.agregarCliente(new Cliente(nombre, dni));

	}

	public String pedirAyuda() {

		ColaboradorService colaborador = new ColaboradorService();
		ProblemaService problema = new ProblemaService();
		
		String nombre;
		Integer dni;

		int decicion;

		String[] opciones = { "Buscar por nombre", "Buscar por dni" };

		decicion = JOptionPane.showOptionDialog(null, "Seleccione la forma de buscar al cliente que necesita ayuda",
				"Seleccion", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, 0);

		if (decicion == 0) {

			nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente");

			for (Cliente cliente : clientes.verArray()) {

				if (cliente.getNombre().equalsIgnoreCase(nombre)) {

					JOptionPane.showMessageDialog(null, "El cliente que a seleccionado es " + cliente.getNombre());
					
					problema.crearProblema();
					
					colaborador.colaboradoresCercaDeColaborador();

				} else {

					JOptionPane.showMessageDialog(null, "Lo sentimos, no contamos con un cliente con el nombre " + nombre);

				}

			}

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

	public String pagarColaboradir(Cliente clienteQuePaga, Reparacion reparacionAPagar, Colaborador colaborador) {
		return reparacionAPagar.getCosto() + clienteQuePaga.getMedioDePago() + colaborador.getMetodoDeFactura();
	}

	public Cliente buscarClientePorNombre() {

		String nombre;

		nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente que busca");

		for (Cliente cliente : clientes.verArray()) {
			if (cliente.getNombre().equalsIgnoreCase(nombre)) {

				JOptionPane.showInternalMessageDialog(null, cliente);

				return cliente;
			}
		}

		return null;
	}

	public Cliente buscarClientePorDni() {

		Integer dni;

		dni = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dni del cliente que busca"));

		for (Cliente cliente : clientes.verArray()) {
			if (cliente.getDni() == dni) {

				JOptionPane.showInternalMessageDialog(null, cliente);

				return cliente;
			}
		}
		return null;
	}

	public void asociarVehiculo(Vehiculo vehiculo) {

		int decicion;

		String[] opciones = { "Buscar por nombre", "Buscar por dni" };

		decicion = JOptionPane.showOptionDialog(null, "Diganos por favor a que cliente quiere asociar ese vehiculo",
				"Busqueda cliente", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, 0);

		if (decicion == 0) {
			String nombre;

			nombre = JOptionPane.showInputDialog("Ingrese su nombre");

			for (Cliente cliente : clientes.verArray()) {

				if (cliente.getNombre().equalsIgnoreCase(nombre)) {

					JOptionPane.showMessageDialog(null,
							"Se a asociado al cliente " + cliente + " el vehiculo " + vehiculo);

				} else {

					JOptionPane.showMessageDialog(null, "Lo sentimo, pero ese cliente no existe");

				}
			}
		} else {

			Integer dni;

			dni = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su dni"));

			for (Cliente cliente : clientes.verArray()) {

				if (cliente.getDni() == dni) {

					JOptionPane.showMessageDialog(null,
							"Se a asociado al cliente " + cliente + " el vehiculo " + vehiculo);

					cliente.setVehiculo(vehiculo);

				} else {

					JOptionPane.showMessageDialog(null, "Lo sentimo, pero ese cliente no existe");

				}
			}
		}

	}
}
