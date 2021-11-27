package service;

import java.util.ArrayList;
import java.util.List;

import domain.Cliente;

public class ClienteService {

	List<Cliente> clientes = new ArrayList<Cliente>();

	public void agregarCliente(Cliente nuevoCliente) {
		clientes.add(nuevoCliente);
	}

	public void pedirAyuda() {

	}

	public void enviarVehiculoProfesional() {

	}

	public void pagar(Cliente clienteQuePaga) {

	}

	public Cliente buscarClientePorNombre(String nombre) {
		for (Cliente cliente : clientes) {
			if (cliente.getNombre().equalsIgnoreCase(nombre)) {
				return cliente;
			}
		}

		return null;
	}

	public Cliente buscarClientePorDni(Integer dni) {
		for (Cliente cliente : clientes) {
			if (cliente.getDni() == dni) {
				return cliente;
			}
		}

		return null;
	}
}
