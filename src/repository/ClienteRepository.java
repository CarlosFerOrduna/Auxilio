package repository;

import java.util.ArrayList;
import java.util.List;

import domain.Cliente;

public class ClienteRepository {

	List<Cliente> clientes = new ArrayList<Cliente>();

	public void agregarCliente(Cliente nuevoCliente) {
		clientes.add(nuevoCliente);
	}

}
