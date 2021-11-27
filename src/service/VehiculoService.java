package service;

import java.util.ArrayList;
import java.util.List;

import domain.Vehiculo;

public class VehiculoService {

	List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

	public void agregarVehiculo(Vehiculo nuevoVehiculo) {
		vehiculos.add(nuevoVehiculo);
	}

	public void historialDeReparaciones(String patente) {

	}

	public void buscarVehiculoPorPatente(String patente) {

	}
}
