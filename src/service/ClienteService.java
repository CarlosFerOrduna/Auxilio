package service;

import javax.swing.JOptionPane;

import domain.Cliente;
import domain.Colaborador;
import domain.Problema;
import domain.Profesional;
import domain.Reparacion;
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

	public String pedirAyuda(Cliente clienteEnProblemas, Problema problema) {

		if (problema.getTipo().equalsIgnoreCase("simple")) {
			return clienteEnProblemas.getVehiculo() + problema.getDetalle() + clienteEnProblemas.getUbicacion();
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
}
